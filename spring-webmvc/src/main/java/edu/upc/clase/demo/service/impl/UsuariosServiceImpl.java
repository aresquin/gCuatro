package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.dao.impl.UsuariosDaoImpl;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    private static Logger log = LoggerFactory.getLogger(UsuariosDaoImpl.class);
    @Autowired
    private UsuariosDao usuariosDao;

    public String ValidarDatos(Usuarios usuarios) {
        String sMsg = "";
        if (usuarios.getcUsuNombre().equals(sMsg)) {
            sMsg = "Debe ingresar un Nombre";
        } else if (usuarios.getcUsuApePat().equals(sMsg)) {
            sMsg = "Debe ingresar un Apellido Paterno";
        } else if (usuarios.getcUsuApeMat().equals(sMsg)) {
            sMsg = "Debe ingresar un Apellido Materno";
        } else if (usuarios.getcUsuSexo().equals(sMsg)) {
            sMsg = "Debe ingresar un Sexo";
        } else if (usuarios.getnTDocID().equals(1)) {
            sMsg = "Debe ingresar un Tipo de Documento";
        } else if (usuarios.getcUsuNumDocumento().equals(sMsg)) {
            sMsg = "Debe ingresar un Numero de Documento";
        } else if (usuarios.getcUsuEmail().equals(sMsg)) {
            sMsg = "Debe ingresar un Correo Electronico";
        } else if (usuarios.getcUsuTelefono().equals(sMsg)) {
            sMsg = "Debe ingresar un Numero de Telefono";
        } else if (usuarios.getcUsuDireccion().equals(sMsg)) {
            sMsg = "Debe ingresar una Direccion";
        } else if (usuarios.getcUsuFecNacimiento().equals(log)) {
            sMsg = "Debe ingresar una Fecha de Nacimiento";
        } else if (usuarios.getcUsuClave().equals(sMsg)) {
            sMsg = "Debe ingresar una clave";
        }
        return sMsg;
    }

    @Override
    public Integer insertar(Usuarios usuarios) {
        String sMsg = ValidarDatos(usuarios);
        if (sMsg.equals(sMsg)) {
            log.info("Registrando un nuevo Usuario");
            return usuariosDao.insertar(usuarios);
        } else {
            log.info(sMsg);
            return 0;
        }

    }

    @Override
    public Usuarios buscarXcodigo(Integer id) {
        log.info("Buscar usuario por id");
        return usuariosDao.buscarXcodigo(id);
    }

    @Override
    public Integer actualizar(Usuarios usuarios) {
        String sMsg = ValidarDatos(usuarios);
        if (sMsg.equals("")) {
            log.info("Actualizando Correctamente");
            return usuariosDao.actualizar(usuarios);
        } else {
            log.info(sMsg);
            return 0;
        } 
    }

    @Override
    public Integer eliminar(Usuarios usuarios) {
        log.info("Eliminando Correctamente");
        return usuariosDao.eliminar(usuarios);
    }

    @Override
    public List<Usuarios> buscarTodos() {
        log.info("Buscando todos los usuarios");
        return usuariosDao.buscarTodos();
    }

    @Override
    public Usuarios buscarApellido(String apepat) {
        log.info("Buscando usuario por apellido");
        return usuariosDao.buscarApellido(apepat);
    }

    @Override
    public Usuarios buscarCorreo(String correo) {
        log.info("Buscando usuario por email");
        return usuariosDao.buscarCorreo(correo);
    }
}
