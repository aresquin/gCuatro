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
    
   
  

   
}
