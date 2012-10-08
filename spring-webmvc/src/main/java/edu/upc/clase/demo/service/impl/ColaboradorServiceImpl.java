package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.ColaboradorDao;
import edu.upc.clase.demo.dao.impl.ColaboradorDaoImpl;
import edu.upc.clase.demo.entity.Colaborador;
import edu.upc.clase.demo.service.ColaboradorServices;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@Service
public class ColaboradorServiceImpl implements ColaboradorServices {

    private static Logger log = LoggerFactory.getLogger(ColaboradorDaoImpl.class); 
    
    @Autowired
    private ColaboradorDao colaboradorDao;    
    
        @Override
        public Boolean validarContrasena(String contrasena){
            if(contrasena.length() >= 8){
               log.info("Contraseña valida"); }
            else{ 
                log.info("Ingrese Contraseña Valida");}
            return Boolean.FALSE;
        }
    
        @Override
        public Integer insertar(Colaborador colaborador) {
        if (colaborador.getPassword().length() >= 8) {
            return colaboradorDao.insertar(colaborador);
        }       
        return null;
        }
    
        @Override
        public void actualizar(Colaborador colaborador) {
            log.info("Actualizando usuario");
            colaboradorDao.actualizar(colaborador);
        }

        @Override
        public void eliminar(Colaborador colaborador) {
            log.info("Eliminando usuario");
            colaboradorDao.eliminar(colaborador);
        }

        @Override
        public List<Colaborador> buscarTodos() {
            log.info("Buscando todos los usuarios");
            return colaboradorDao.buscarTodos();
        }

        @Override
        public Colaborador buscarXcodigo(Integer id) {
            log.info("Buscar usuario por Codigo");
            return colaboradorDao.buscarXcodigo(id);
        }

        @Override
        public Boolean validarCorreo(String correo) {
            Pattern carac = null;
            Matcher comp= null;
            carac = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
            comp = carac.matcher(correo);
            if (comp.find())
            { 
                log.info("Correo Valido");
                return true;
            }
            else {log.info("Correo InvalidoValido");}
            return Boolean.TRUE;
        }
        
        @Override
        public Boolean autenticar(String correo,String password) {
            if (validarCorreo(correo))
            {
                Colaborador user = colaboradorDao.buscarCorreo(correo);
                if (user != null && password != null) 
               {
                   return user.getPassword().equals(password);
                   
               }
            }
           return Boolean.TRUE;
        }

        @Override
        public List<Colaborador> buscarPorNombre(String nombre) {
            return colaboradorDao.buscarPorNombre(nombre);
        }    

  

   
}
