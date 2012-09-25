/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.EmprendedorDao;
import edu.upc.clase.demo.entity.Emprendedor;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author JOEL
 */
public class EmprendedorDaoTest {

    private static Logger log = LoggerFactory.getLogger(EmprendedorDaoTest.class);
    @Autowired
    EmprendedorDao emprendedorDao;
    Date fecha = new Date();
    Integer iRes = 0;

    @Test
    public void testInsertarEmprendedor() {
        Emprendedor objEmp = new Emprendedor();
        objEmp.setNo_usuario("Jorge Joel");
        objEmp.setAp_paterno("Tubillas ");
        objEmp.setAp_materno("Injante");
        objEmp.setUs_sexo("1");
        objEmp.setId_documento(1);
        objEmp.setNu_documento("44359928");
        objEmp.setUs_email("r10_tj@hotmail.com");
        objEmp.setUs_telefono("4240890");
        objEmp.setUs_direccion("av brasil 973");
        objEmp.setFe_nacimiento(fecha);
        objEmp.setUs_clave("0120");

        objEmp.setUs_creacion("ADMIN");
        objEmp.setFe_creacion(fecha);
        if ( objEmp.getId_ti_usuario() ==1 ) 
        {
       
            objEmp.setSa_apelativo("Coco");
            objEmp.setRe_autobiografico("Un joven con sueño de llegar al mundial");
            objEmp.setSi_web("http://www.joeltubillas.com");
            
        }
                   
       Integer id = emprendedorDao.insertar(objEmp);
       Assert.assertNotNull(id);
         
    }
}
