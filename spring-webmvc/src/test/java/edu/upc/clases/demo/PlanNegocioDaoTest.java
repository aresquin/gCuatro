/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;
import edu.upc.clase.demo.dao.PlanNegocioDAO;
import edu.upc.clase.demo.entity.PlanNegocio;
import edu.upc.clase.demo.service.PlanNegocioService;
import java.util.Calendar;
import java.util.Date;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Johan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class PlanNegocioDaoTest {
     private static Logger log = LoggerFactory.getLogger(PlanNegocioDaoTest.class);
    
    @Autowired
    PlanNegocioDAO plannegocioDao;

    @Autowired
    PlanNegocioService plannegocioService;
    
    Date fecha = new Date();
    Integer iRes=0;
    Calendar c = Calendar.getInstance();
    
    @Test
    public void testInsertarPlan() {
        //c.getTime()
                
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setCPlaTitulo("Plan1");
       
        objPlan.setnCatID(1);
        objPlan.setCPlaVision("El negocio es prospero.....");
        objPlan.setCPlaTiempo("6 meses");
        objPlan.setNPlaInvTotal(2000.00);        
        objPlan.setCPlaRazon("Razon1");
        objPlan.setNPlaROI(3000.40);
        objPlan.setNPlaNeto(1500.50);
        objPlan.setNPlaPreVenta(4000.00);
        objPlan.setNEstID(1);
        objPlan.setNUsuCrea(1);
        objPlan.setNPlaFecCrea(fecha);
          
        Integer id= plannegocioDao.insertar(objPlan);
        Assert.assertNotNull(id);
    }
      
      
    @Test
    public void testActualizarPlan() {
        iRes=0;
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setNPlaID(1); 
        objPlan.setnCatID(1);
        objPlan.setCPlaVision("El negocio es prospero.....");
        objPlan.setCPlaRazon("Razon1");
        objPlan.setCPlaTiempo("6 meses");
        objPlan.setNPlaInvTotal(2000.00);
        objPlan.setNPlaNeto(1500.50);
        objPlan.setNPlaROI(3000.40);
        objPlan.setNPlaPreVenta(4000.00);
        objPlan.setNEstID(1);
        objPlan.setNUsuModi(1);
        objPlan.setCPlaFecModi(fecha);
          
        iRes= plannegocioDao.actualizar(objPlan);
        Assert.assertEquals(iRes>0, "Datos actualizados correctamente");
    }
    
    @Test
    public void testCambiarEstadoPlan() {
        iRes=0;
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setNPlaID(1); 
        objPlan.setNEstID(0); 
        objPlan.setNUsuModi(1);
        objPlan.setCPlaFecModi(fecha);
          
        iRes= plannegocioDao.cambiarEstado(objPlan);
        Assert.assertEquals(iRes>0, "Cambio estado satisfactorio");
    }  
    
    @Test
    public void testInsertarArchivoAdjunto() {
        
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setNPlaID(1);
       
        objPlan.setCAAdjNombre("Documento de definicion.doc");
        objPlan.setCAAdjExtension("*.DOC");
        objPlan.setNUsuCrea(1);
        objPlan.setNPlaFecCrea(fecha);
          
        Integer id= plannegocioDao.insertarArchivo(objPlan);
        Assert.assertNotNull(id);
    }
    
    @Test
    public void testEliminarArchivoAdjunto() {
        
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setNPlaID(1);
        objPlan.setNAAdjID(1);
        Integer id= plannegocioDao.eliminarArchivo(objPlan);
        Assert.assertNotNull(id);
    }
}
