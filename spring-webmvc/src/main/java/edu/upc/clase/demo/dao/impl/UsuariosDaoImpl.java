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
        getJdbcTemplate().update("insert into usuario(cUsuNombre,cUsuApePat,cUsuApeMat,"
                + "cUsuSexo,nTDocID,cUsuNumDocumento,cUsuEmail,cUsuTelefono,cUsuDireccion,"
                + "cUsuFecNacimiento,cUsuClave,nEstID,cUsuFecCrea,nUsuCrea,nPerID)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                usuarios.getcUsuNombre(), usuarios.getcUsuApePat(),usuarios.getcUsuApeMat(),
                usuarios.getcUsuSexo(),usuarios.getnTDocID(),usuarios.getcUsuNumDocumento(),
                usuarios.getcUsuEmail(),usuarios.getcUsuTelefono(),usuarios.getcUsuDireccion(),
                usuarios.getcUsuFecNacimiento(),usuarios.getcUsuClave(),usuarios.getnEstID(),
                usuarios.getcUsuFecCrea(),usuarios.getnUsuCrea(),usuarios.getnPerID());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
  
    }

    //@Override
    public Integer actualizar(Usuarios usuarios) {
       
      return getJdbcTemplate().update("update usuario set cUsuNombre= ? , cUsuApePat = ? ,"
                     + "cUsuApeMat = ? , cUsuSexo = ? , nTDocID = ? ,cUsuNumDocumento = ? ,"
                     + "cUsuEmail = ? ,cUsuTelefono = ? , cUsuDireccion = ? ,"
                     + "cUsuFecNacimiento = ? ,cUsuClave = ? ,nUsuModi = ?,cUsuFecModi = ? "
                     + "where nUsuID = ?",
                usuarios.getcUsuNombre(), usuarios.getcUsuApePat(),usuarios.getcUsuApeMat(),
                usuarios.getcUsuSexo(),usuarios.getnTDocID(),usuarios.getcUsuNumDocumento(),
                usuarios.getcUsuEmail(),usuarios.getcUsuTelefono(),usuarios.getcUsuDireccion(),
                usuarios.getcUsuFecNacimiento(),usuarios.getcUsuClave(),usuarios.getnUsuModi(),
                usuarios.getcUsuFecModi(),usuarios.getnUsuID());         
    }   

    @Override
    public Integer eliminar(Usuarios usuarios) {
        return getJdbcTemplate().update("update usuario set nEstID = ?,"
                + " nUsuModi=?,cUsuFecModi=? where nUsuID =?",
                usuarios.getnEstID(),usuarios.getnUsuModi(),
                usuarios.getcUsuFecModi(),usuarios.getnUsuID());        
    }

    //@Override
    public Usuarios buscarApellido(String apepat) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre,apepat,apemat,correo,password from usuarios where apepat=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), apepat);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    //@Override
    public List<Usuarios> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,nombre,apepat,apemat,correo from usuarios",
                new BeanPropertyRowMapper<Usuarios>(Usuarios.class));
    }

    //@Override
    public Usuarios buscarCorreo(String correo) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre,apepat,apemat, correo,password from usuarios where correo=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), correo);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    //@Override
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
    
    // @Override
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


    
