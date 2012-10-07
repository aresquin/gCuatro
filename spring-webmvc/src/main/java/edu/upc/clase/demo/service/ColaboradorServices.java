package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.Colaborador;
import java.util.List;

public interface ColaboradorServices 
{
    public Integer insertar(Colaborador usuarios);
    public void actualizar(Colaborador usuarios);
    public void eliminar(Colaborador usuarios);
    public List<Colaborador> buscarTodos();
    public Colaborador buscarXcodigo(Integer id);
    public List<Colaborador> buscarPorNombre(String nombre);
    public Boolean autenticar(String correo,String password);  
    public Boolean validarCorreo(String correo);
    public Boolean validarContrasena(String contrasena);
}