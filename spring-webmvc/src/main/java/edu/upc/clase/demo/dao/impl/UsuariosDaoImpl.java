package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.entity.Usuario;
import edu.upc.clase.demo.entity.Usuarios;
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
public class UsuariosDaoImpl extends SimpleJdbcDaoSupport implements UsuariosDao {

    private static Logger log = LoggerFactory.getLogger(UsuariosDaoImpl.class);

    @Autowired
    public UsuariosDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Usuarios usuarios) {

        getJdbcTemplate().update(
        "insert into usuarios(nombre,apepat,apemat,correo,password) values (?, ?, ?, ?, ?)",
                usuarios.getNombre(), usuarios.getApepat(), usuarios.getApemat(), usuarios.getCorreo(), usuarios.getPassword());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public void actualizar(Usuarios usuarios) {
        getJdbcTemplate().update(
                "update usuarios set nombre = ?,apepat = ?, apemat = ?, correo = ? where apepat = ?",
                  usuarios.getNombre(), usuarios.getApepat(), usuarios.getApemat(), usuarios.getCorreo(), usuarios.getId());
    }   

    @Override
    public void eliminar(Usuarios usuarios) {
        getJdbcTemplate().update(
                "delete from usuarios where id = ?", usuarios.getId());
    }

    @Override
    public Usuarios buscarApellido(String apepat) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre,apepat,apemat,correo,password from usuarios where apepat=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), apepat);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Usuarios> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,nombre,apepat,apemat,correo from usuarios",
                new BeanPropertyRowMapper<Usuarios>(Usuarios.class));
    }

    @Override
    public Usuarios buscarCorreo(String correo) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre,apepat,apemat, correo,password from usuarios where correo=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), correo);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Usuarios> buscarPorNombre(String nombre) {
        try {
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("nombre","%"+nombre+"%");
            return getSimpleJdbcTemplate().query(
                    "select * from usuarios where nombre like :nombre",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class),parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    
     @Override
    public Usuarios buscarXcodigo(Integer id) {
        try {
             return getSimpleJdbcTemplate().queryForObject(
                    "select nombre,apepat,apemat,correo,password from usuarios where id=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    

  
}


    
