package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.Usuarios;
import java.util.List;

public interface UsuariosService {
    
    public Integer insertar(Usuarios usuarios);
    public Usuarios buscarXcodigo(Integer id);
    public Integer actualizar(Usuarios usuarios);
    public Integer eliminar(Usuarios usuarios);
    public List<Usuarios> buscarTodos();
    public Usuarios buscarApellido(String apepat);
    public Usuarios buscarCorreo(String correo);
}