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
        objPlan.setTi_pl_negocio("Plan1");
       
//        objPlan.setId_categoria("000001");
//        objPlan.setVi_negocio("El negocio es prospero.....");
//        objPlan.setTi_ejecucion("6 meses");
//        objPlan.setRa_propuesta("poner dinero en la bolsa");
//        objPlan.setIn_total(2000.00);
//        objPlan.setMa_neto(1500.50);
//        objPlan.setPl_roi(3000.40);
//        objPlan.setPr_venta(4000.00);
//        objPlan.setId_estado("1");
        objPlan.setUs_creacion("ADMIN");
        objPlan.setFe_creacion(fecha);
          
        Integer id= plannegocioDao.insertar(objPlan);
        Assert.assertNotNull(id);
    }
      
//      
//    @Test
//    public void testActualizarPlan() {
//        iRes=0;
//        PlanNegocio objPlan = new PlanNegocio();
//        objPlan.setId_pl_negocio(1); 
//        objPlan.setTi_pl_negocio("Plan2");
//        objPlan.setVi_negocio("El negocio consta de prestar servicios a terceros");
//        //objPlan.setId_categoria("000001");
////        objPlan.setTi_ejecucion("6 meses");
////        objPlan.setRa_propuesta("poner dinero en la bolsa");
////        objPlan.setIn_total(2000.00);
////        objPlan.setMa_neto(1500.50);
////        objPlan.setPl_roi(3000.40);
////        objPlan.setPr_venta(4000.00);
////        objPlan.setId_estado("1");
//        objPlan.setUs_modificacion("ADMIN");
//        objPlan.setFe_modificacion(fecha);
//          
//        iRes= plannegocioDao.actualizar(objPlan);
//        Assert.assertEquals(iRes>0, "Datos actualizados correctamente");
//    }
    
//    @Test
//    public void testCambiarEstadoPlan() {
//        iRes=0;
//        PlanNegocio objPlan = new PlanNegocio();
//        objPlan.setId_pl_negocio(1); 
//        objPlan.setId_estado("0"); 
//        objPlan.setUs_modificacion("ADMIN");
//        objPlan.setFe_modificacion(fecha);
//          
//        iRes= plannegocioDao.cambiarEstado(objPlan);
//        Assert.assertEquals(iRes>0, "Datos eliminados correctamente");
//    }  
}
