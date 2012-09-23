/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.service;

import edu.upc.clase.entity.Categoria;
import java.util.List;

/**
 *
 * @author Juan Yabiku
 */
public interface CategoriaService {
    public Integer insertar(Categoria categoria);
    public void actualizar(Categoria categoria);
    public void eliminar(Categoria categoria);
    public List<Categoria> buscarTodos();
    public Categoria buscar(Integer id);
    public List<Categoria> buscarPorNombre(String nombre);
    public Boolean validar(String nombre);    
}