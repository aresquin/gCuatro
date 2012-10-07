package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Colaborador;
import java.util.List;

public interface ColaboradorDao {
    public Integer insertar(Colaborador usuarios);
    public Colaborador buscarXcodigo(Integer id);
    public void actualizar(Colaborador usuarios);
    public void eliminar(Colaborador usuarios);
    public List<Colaborador> buscarTodos();
    public Colaborador buscarApellido(String apepat);
    public Colaborador buscarCorreo(String correo);
    public List<Colaborador> buscarPorNombre(String nombre);
   
    
}
