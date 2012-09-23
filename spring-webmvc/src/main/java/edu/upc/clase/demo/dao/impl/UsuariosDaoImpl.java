package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.UsuariosDao;
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
 * @author gian
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
                "insert into usuarios (nombre,ape_pat,ape_mat,correo,password) values (?, ?, ?, ?, ?)",
                usuarios.getNombre(), usuarios.getApe_pat(), usuarios.getApe_mat(), usuarios.getCorreo(), usuarios.getPassword());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public void actualizar(Usuarios usuarios) {
        getJdbcTemplate().update(
                "update usuarios set nombre = ?,ape_pat = ?, ape_mat = ?, correo = ? where ape_pat = ?",
                usuarios.getNombre(), usuarios.getApe_pat(), usuarios.getApe_mat(), usuarios.getCorreo(), usuarios.getId());
    }

    @Override
    public void eliminar(Usuarios usuarios) {
        getJdbcTemplate().update(
                "delete from usuarios where id = ?", usuarios.getId());
    }

    @Override
    public Usuarios buscar(Integer ape_pat) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre,ape_pat, ape_mat, correo,password from usuarios where ape_pat=?",
                    new BeanPropertyRowMapper<Usuarios>(Usuarios.class), ape_pat);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Usuarios> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,nombre,correo,password from usuarios",
                new BeanPropertyRowMapper<Usuarios>(Usuarios.class));
    }

    @Override
    public Usuarios buscar(String correo) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, nombre, correo,password from usuarios where correo=?",
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
    public List<Usuarios> buscarPorApellido(String ape_pat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}