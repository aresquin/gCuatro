/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;


import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class UsuariosDaoTest {

    @Autowired
    UsuariosDao UsuariosDao;
    Date fecha = new Date();
    Integer iRes = 0;
    Calendar c = Calendar.getInstance();

    @Test
    public void testInsertar() {
        Usuarios usuarios = new Usuarios();
        
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240890");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");
        usuarios.setcUsuFecCrea(fecha);
        usuarios.setnUsuCrea(iRes);
        usuarios.setnEstID(iRes);
        usuarios.setnPerID(iRes);

        Integer id = UsuariosDao.insertar(usuarios);
        Assert.assertNotNull(id);

    }

    @Test
    public void testBuscarXcodigo() {

        Usuarios usuarios = new Usuarios();
        
        usuarios.setnUsuID(1);
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240890");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");

        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(-1);
        Assert.assertNotNull(id);
        
        

    }
    
    @Test
    public void testActualizar() {
        iRes = 0;
        Usuarios usuarios = new Usuarios();

        usuarios.setnUsuID(1);
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240896");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");
        usuarios.setnUsuModi(1);
        usuarios.setcUsuFecModi(fecha);

        iRes = UsuariosDao.actualizar(usuarios);
        Assert.assertNotNull(iRes);

    }

    @Test
    public void testEliminar() {

        iRes = 0;
        Usuarios usuarios = new Usuarios();
        usuarios.setnUsuID(1);
        usuarios.setnEstID(0);
        usuarios.setnUsuModi(1);
        usuarios.setcUsuFecModi(fecha);


        iRes = UsuariosDao.eliminar(usuarios);
        Assert.assertNotNull(iRes);
    }

    //@Test
    public void testBuscarApellido() {

        Usuarios usuarios = new Usuarios();

        usuarios.setnUsuID(1);
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240890");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");

        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarApellido(usuarios.getcUsuApePat());
        Assert.assertNotNull(usuarios);


    }
   
     @Test 
     public void testBuscarTodos() {
     
     Usuarios usuarios = new Usuarios();

        usuarios.setnUsuID(1);
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240890");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");
        
        Integer id = UsuariosDao.insertar(usuarios);
        UsuariosDao.buscarTodos();
        Assert.assertNotNull(usuarios);
        
     }
  
   
     @Test 
     public void testBuscarCorreo() {
        Usuarios usuarios = new Usuarios();

        usuarios.setnUsuID(1);
        usuarios.setcUsuNombre("Joel");
        usuarios.setcUsuApePat("Tubillas");
        usuarios.setcUsuApeMat("Injante");
        usuarios.setcUsuSexo("M");
        usuarios.setnTDocID(1);
        usuarios.setcUsuNumDocumento("44359928");
        usuarios.setcUsuEmail("u201216678@upc.edu.pe");
        usuarios.setcUsuTelefono("4240890");
        usuarios.setcUsuDireccion("JesusMaria");
        usuarios.setcUsuFecNacimiento(fecha);
        usuarios.setcUsuClave("1234");
        
        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarCorreo(usuarios.getcUsuEmail());
        Assert.assertNotNull(usuarios);
  }
}
