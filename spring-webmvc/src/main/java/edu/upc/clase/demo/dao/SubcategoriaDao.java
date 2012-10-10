/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Subcategoria;
import java.util.List;

/**
 *
 * @author Juan Yabiku
 */
public interface SubcategoriaDao {
    public Integer insertar (Subcategoria objSubcategoria);
    public void actualizar (Subcategoria objSubcategoria);
    public void eliminar (Subcategoria objCategoria);
    public List<Subcategoria> buscarSubCategoria(Integer id);
    public Subcategoria buscarPorId(Integer id);
}
