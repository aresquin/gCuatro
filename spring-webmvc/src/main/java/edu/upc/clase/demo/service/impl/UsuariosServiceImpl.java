package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.dao.impl.UsuariosDaoImpl;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosServices;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@Service
public class UsuariosServiceImpl implements UsuariosServices {

    private static Logger log = LoggerFactory.getLogger(UsuariosDaoImpl.class); 
    
    @Autowired
    private UsuariosDao usuariosDao;    
    
        @Override
        public Boolean validarContrasena(String contrasena){
            if(contrasena.length() > 8){
               log.info("Contraseña valida"); }
            else{ 
                log.info("Ingrese Contraseña Valida");}
            return Boolean.FALSE;
        }
    
        @Override
        public Integer insertar(Usuarios usuarios) {
        if (usuarios.getPassword().length() > 8) {
            return usuariosDao.insertar(usuarios);
        }       
        return null;
        }
    
        @Override
        public void actualizar(Usuarios usuarios) {
            log.info("Actualizando usuario");
            usuariosDao.actualizar(usuarios);
        }

        @Override
        public void eliminar(Usuarios usuarios) {
            log.info("Eliminando usuario");
            usuariosDao.eliminar(usuarios);
        }

        @Override
        public List<Usuarios> buscarTodos() {
            log.info("Buscando todos los usuarios");
            return usuariosDao.buscarTodos();
        }

        @Override
        public Usuarios buscarXcodigo(Integer id) {
            log.info("Buscar usuario por Codigo");
            return usuariosDao.buscarXcodigo(id);
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
            else {log.info("Correo Valido");}
            return Boolean.FALSE;
        }
        
        @Override
        public Boolean autenticar(String correo,String password) {
            if (validarCorreo(correo))
            {
                Usuarios user = usuariosDao.buscarCorreo(correo);
                if (user != null && password != null) 
               {
                   return user.getPassword().equals(password);
                   
               }
            }
           return Boolean.FALSE;
        }

        @Override
        public List<Usuarios> buscarPorNombre(String nombre) {
            return usuariosDao.buscarPorNombre(nombre);
        }    

  

   
}
