/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Categoria;
import java.util.List;

/**
 *
 * @author Juan Yabiku
 */
public interface CategoriaDao {
    public Integer insertar (Categoria objCategoria);
    public void actualizar (Categoria objCategoria);
    public void eliminar (Categoria objCategoria);
    public List<Categoria> buscarCategoria();
    public Categoria buscarPorId(Integer id);
}
