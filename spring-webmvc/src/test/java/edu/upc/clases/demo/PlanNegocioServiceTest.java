/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.entity.PlanNegocio;
import edu.upc.clase.demo.service.PlanNegocioService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
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
public class PlanNegocioServiceTest {
     private static Logger log = LoggerFactory.getLogger(PlanNegocioServiceTest.class);

    @Autowired
    private PlanNegocioService planNService;
    
    Date fecha = new Date();
    Integer iRes=0;
   
    
     @Test
    public void testActualizarPlan() {
        
        iRes=0;
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setnPlaID(1); 
        objPlan.setnCatID(1);
        objPlan.setcPlaVision("El negocio es prospero.....");
        objPlan.setcPlaRazon("Razon1");
        objPlan.setcPlaTiempo("6 meses");
        objPlan.setnPlaInvTotal(2000.00);
        objPlan.setnPlaNeto(1500.50);
        objPlan.setnPlaROI(3000.40);
        objPlan.setnPlaPreVenta(4000.00);
        objPlan.setnEstID(1);
        objPlan.setnUsuModi(1);
        objPlan.setcPlaFecModi(fecha);
        
        iRes= planNService.actualizar(objPlan);
         Assert.assertNotNull(iRes);
        //Assert.assertTrue( "Datos actualizados correctamente", iRes>0);
    }
    
    @Test
    public void testCambiarEstadoPlan() {
        iRes=0;
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setnPlaID(1); 
        objPlan.setnEstID(0); 
        objPlan.setnUsuModi(1);
        objPlan.setcPlaFecModi(fecha);
          
        iRes= planNService.cambiarEstado(objPlan);
         Assert.assertNotNull(iRes);
        //Assert.assertTrue ( "Cambio estado satisfactorio", iRes>0);
    }  
    
    @Test
    public void testInsertarArchivoAdjunto() {
        
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setnPlaID(1);
       
        objPlan.setcAAdjNombre("Documento de definicion.doc");
        objPlan.setcAAdjExtension("*.DOC");
        objPlan.setnUsuCrea(1);
        objPlan.setcPlaFecCrea(fecha);
          
        Integer id= planNService.insertarArchivo(objPlan);
        Assert.assertNotNull(id);
    }
    
    @Test
    public void testEliminarArchivoAdjunto() {
        
        PlanNegocio objPlan = new PlanNegocio();
        objPlan.setnPlaID(1);
        objPlan.setnAAdjID(1);
        Integer id= planNService.eliminarArchivo(objPlan);
        Assert.assertNotNull(id);
    }
    
    
    
  // @Test 
    public void testListarPlanes()
    {
        PlanNegocio objPlan2 = new PlanNegocio();
        objPlan2.setcPlaTitulo("");
        objPlan2.setnCatID(0);
        objPlan2.setnEstID(-1);
        List<PlanNegocio> objListado=new ArrayList<PlanNegocio>();
                objListado=planNService.buscarPlanNegocio(objPlan2);
        Assert.assertNotNull(objListado);    
    }
    
    @Test 
    public void testListarPlanesXID()
    {
        PlanNegocio objPlan2 =planNService.buscarPorId(1);
        Assert.assertNotNull(objPlan2);    
    }
    
      
    
}
