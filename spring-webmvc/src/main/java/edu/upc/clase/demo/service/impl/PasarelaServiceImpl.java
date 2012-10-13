package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.dao.impl.PasarelaDaoImpl;
import edu.upc.clase.demo.entity.PasarelaV;
import edu.upc.clase.demo.service.PasarelaService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Aresquin
 */
@Service
public class PasarelaServiceImpl implements PasarelaService {

    private static Logger log = LoggerFactory.getLogger(PasarelaServiceImpl.class); 
    
    @Autowired
    private PasarelaDao pasarelaDao;    
    
      @Override
        public boolean ValidarLongTarjeta(Integer numtarjeta){
       // PasarelaV pasarela = new PasarelaV ();
       boolean longi = false;    
         if(numtarjeta.toString().length()==5)
            {
              log.info("Numero Tarjeta Valido");              
              longi =true;}
         else{
             log.info("Numero Tarjeta Invalida");
             longi = false;}
      return longi;
        }
}
        
       
    


