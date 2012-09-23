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

/**
 *
 * @author gian
 *
 */


@Service
public class UsuariosServiceImpl implements UsuariosServices {

    private static Logger log = LoggerFactory.getLogger(UsuariosDaoImpl.class);    
    
    @Autowired
    private UsuariosDao usuariosDao;

    @Override
    public Integer insertar(Usuarios usuario) {
        if (usuario.getPassword().length() > 4) {
            log.info("Creando usuario");
            return usuariosDao.insertar(usuario);
        }       
        return null;
    }

//        @Override
//        public void actualizar(Usuario usuario) {
//            log.info("Actualizando usuario");
//            usuarioDao.actualizar(usuario);
//        }
//
//        @Override
//        public void eliminar(Usuario usuario) {
//            log.info("Eliminando usuario");
//            usuarioDao.eliminar(usuario);
//        }
//
//        @Override
//        public List<Usuario> buscarTodos() {
//            log.info("Buscando todos los usuarios");
//            return usuarioDao.buscarTodos();
//        }
//
//        @Override
//        public Usuario buscar(Integer id) {
//            log.info("Buscar usuario por id");
//            return usuarioDao.buscar(id);
//        }
//
//            @Override
//            public Boolean autenticar(String correo,String password) {
//                if (correo.contains("@")) {
//                    Usuario user = usuarioDao.buscar(correo);
//                    if (user != null) {
//                        return user.getPassword().equals(password);
//                    }
//                }
//                return Boolean.FALSE;
//        }
//
//        @Override
//        public List<Usuario> buscarPorNombre(String nombre) {
//            return usuarioDao.buscarPorNombre(nombre);
//        }    

    @Override
    public void actualizar(Usuarios usuarios) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Usuarios usuarios) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuarios> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuarios buscar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuarios> buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean autenticar(String correo, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
