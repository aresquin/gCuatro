/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;
import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosServices;
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
    Integer iRes=0;
    Calendar c = Calendar.getInstance();
  
   
 
    //@Test
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

    
    
   // @Test
   // public void testBuscarXcodigo() {
    ////    System.out.println("buscarXcodigo");
     //   Integer id = null;
     //   UsuariosDao instance = new UsuariosDaoImpl();
      //  Usuarios expResult = null;
     //   Usuarios result = instance.buscarXcodigo(id);
      //  assertEquals(expResult, result);
     
       // fail("The test case is a prototype.");
   // }

    
    
    
    //@Test
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

  /*
    @Test
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        UsuariosDao instance = new UsuariosDaoImpl();
        List expResult = null;
        List result = instance.buscarTodos();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testBuscarApellido() {
        System.out.println("buscarApellido");
        String apepat = "";
        UsuariosDao instance = new UsuariosDaoImpl();
        Usuarios expResult = null;
        Usuarios result = instance.buscarApellido(apepat);
        assertEquals(expResult, result);
    
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testBuscarCorreo() {
        System.out.println("buscarCorreo");
        String correo = "";
        UsuariosDao instance = new UsuariosDaoImpl();
        Usuarios expResult = null;
        Usuarios result = instance.buscarCorreo(correo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
   @Test
    public void testBuscarPorNombre() {
        System.out.println("buscarPorNombre");
        String nombre = "";
        UsuariosDao instance = new UsuariosDaoImpl();
        List expResult = null;
        List result = instance.buscarPorNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   */
    
    
}
