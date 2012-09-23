package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Usuarios;
import java.util.List;

/**
 *
 * @author gian
 */
public interface UsuariosDao {
    public Integer insertar(Usuarios usuarios);
    public void actualizar(Usuarios usuarios);
    public void eliminar(Usuarios usuarios);
    public List<Usuarios> buscarTodos();
    public Usuarios buscar(Integer id);
    public Usuarios buscar(String correo);
    public List<Usuarios> buscarPorNombre(String nombre);
    public List<Usuarios> buscarPorApellido(String ape_pat);
}
