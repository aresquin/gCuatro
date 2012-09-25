/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.EmprendedorDao;
import edu.upc.clase.demo.entity.Emprendedor;
import java.util.List;
import javax.servlet.jsp.tagext.TryCatchFinally;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 *
 * @author JOEL
 */
public class EmprendedorDaoImpl extends SimpleJdbcDaoSupport implements EmprendedorDao {

    private static Logger log = LoggerFactory.getLogger(EmprendedorDaoImpl.class);

    @Autowired
    public EmprendedorDaoImpl(DataSource dataSource) {
        log.info("Asignando el datasource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Emprendedor objEmp) {
        getJdbcTemplate().update(
                "insert into usuarios1 ( no_usuario, ap_paterno,"
                +" ap_materno , us_sexo, id_documento , nu_documento , us_email"
                + " us_telefono , us_direccion , fe_nacimiento, us_clave ,id_ti_usuario"
                + " sa_apelativo , re_autobiografico , si_web, nu_cuenta, st_usuario"
                + " fe_creacion, us_creacion ) "  //20
                + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", 
                 objEmp.getNo_usuario(),objEmp.getAp_paterno(),objEmp.getAp_materno(),
                 objEmp.getUs_sexo(),objEmp.getId_documento(),objEmp.getNu_documento(),
                 objEmp.getUs_email(),objEmp.getUs_telefono(),objEmp.getUs_direccion(),
                 objEmp.getFe_nacimiento(), objEmp.getUs_clave(),objEmp.getId_ti_usuario(),
                 objEmp.getSa_apelativo(), objEmp.getRe_autobiografico(), objEmp.getSi_web(),
                 objEmp.getNu_cuenta(),objEmp.getSt_usuario(),objEmp.getFe_creacion());           
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public void actualizar(Emprendedor objEmp) {
        if ( objEmp.getId_ti_usuario()== 0 ) 
        {
         getJdbcTemplate().update(
                "update usuarios1 set no_usuario = ?, ap_materno = ?,us_sexo=? "
                + " id_documento = ? , nu_documento = ? , us_email = ? "
                + " us_telefono =? ,us_direccion = ? ,fe_nacimiento = ?, us_clave = ? "
                + " where id_usuario = ? ");   
        }else 
        {
             getJdbcTemplate().update(
                "update usuarios1 set no_usuario = ?, ,sa_apelativo = ? ,ap_materno = ?,us_sexo=? "
                + " id_documento = ? , nu_documento = ? , us_email = ? "
                + " us_telefono =? ,us_direccion = ? ,fe_nacimiento = ?, us_clave = ? "
                + " re_autobiografico = ? , si_web = ? , nu_cuenta = ? "      
                + " where id_usuario = ? ");              
        }
        
    }

    @Override
    public void eliminar(Emprendedor objEmp) {
         getJdbcTemplate().update(
                 "UPDATE usuarios1 Set id_estado = ? where id_usuario=?",
                 objEmp.getId_estado(),objEmp.getId_usuario());
        
    }

    @Override
    public List<Emprendedor> buscarEmprendedor() {
        try {
            return (List<Emprendedor>) getSimpleJdbcTemplate().queryForObject(
                    "SELECT * FROM usuarios1",
                    new BeanPropertyRowMapper<Emprendedor>(Emprendedor.class));
            
        } catch (EmptyResultDataAccessException  e) {
            return null;
        }
    }

    @Override
    public Emprendedor buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
