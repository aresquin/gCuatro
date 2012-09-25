package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.Usuarios;
import java.util.List;

public interface UsuariosServices 
{
    public Integer insertar(Usuarios usuarios);
    public void actualizar(Usuarios usuarios);
    public void eliminar(Usuarios usuarios);
    public List<Usuarios> buscarTodos();
    public Usuarios buscarXcodigo(Integer id);
    public List<Usuarios> buscarPorNombre(String nombre);
    public Boolean autenticar(String correo,String password);  
    public Boolean validarCorreo(String correo);
    public Boolean validarContrasena(String contrasena);
}