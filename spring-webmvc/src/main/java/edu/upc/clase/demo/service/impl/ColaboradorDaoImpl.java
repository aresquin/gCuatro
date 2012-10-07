package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.ColaboradorDao;
import edu.upc.clase.demo.entity.Usuario;
import edu.upc.clase.demo.entity.Colaborador;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * 
 */
@Repository
public class ColaboradorDaoImpl extends SimpleJdbcDaoSupport implements ColaboradorDao {

    private static Logger log = LoggerFactory.getLogger(ColaboradorDaoImpl.class);

    @Autowired
    public ColaboradorDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Colaborador colaborador) {

        getJdbcTemplate().update(
        "insert into Colaboradores (cColNombre ,cColApePaterno,cColApeMaterno ,cColCorreo ,cColPassword ) values (?, ?, ?, ?, ?)",
                colaborador.getNombre(), colaborador.getApepat(), colaborador.getApemat(), colaborador.getCorreo(), colaborador.getPassword());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void actualizar(Colaborador colaborador) {
        getJdbcTemplate().update(
                "update Colaboradores  set cColNombre  = ?,cColApePaterno = ?, cColApeMaterno = ?, cColCorreo = ? where cColApePaterno = ?",
                  colaborador.getNombre(), colaborador.getApepat(), colaborador.getApemat(), colaborador.getCorreo(), colaborador.getId());
    }   

    @Override
    public void eliminar(Colaborador colaborador) {
        getJdbcTemplate().update(
                "delete from colaboradores where cColCorreo = ?", colaborador.getId());
    }

    @Override
    public Colaborador buscarApellido(String apepat) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select nColId , cColNombre,cColApePaterno ,cColApeMaterno ,cColCorreo ,cColPassword  from colaboradores where cColApePaterno =?",
                    new BeanPropertyRowMapper<Colaborador>(Colaborador.class), apepat);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Colaborador> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select nColId ,cColNombre ,cColApePaterno ,cColApeMaterno ,cColCorreo  from colaboradores",
                new BeanPropertyRowMapper<Colaborador>(Colaborador.class));
    }

    @Override
    public Colaborador buscarCorreo(String correo) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select nColId , cColNombre ,cColApePaterno ,cColApeMaterno , cColCorreo ,cColPassword  from colaboradores where cColCorreo=?",
                    new BeanPropertyRowMapper<Colaborador>(Colaborador.class), correo);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Colaborador> buscarPorNombre(String nombre) {
        try {
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("nombre","%"+nombre+"%");
            return getSimpleJdbcTemplate().query(
                    "select * from Colaboradores  where cColNombre  like :nombre",
                    new BeanPropertyRowMapper<Colaborador>(Colaborador.class),parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    
     @Override
    public Colaborador buscarXcodigo(Integer id) {
        try {
             return getSimpleJdbcTemplate().queryForObject(
                    "select cColNombre ,cColApePaterno ,cColApeMaterno ,cColCorreo ,cColPassword  from Colaboradores  where nColId =?",
                    new BeanPropertyRowMapper<Colaborador>(Colaborador.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    

  
}


    
