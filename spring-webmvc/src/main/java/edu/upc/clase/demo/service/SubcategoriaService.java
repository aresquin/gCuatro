/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.Subcategoria;
import java.util.List;

/**
 *
 * @author Megu
 */
public interface SubcategoriaService {
    public Integer insertar (Subcategoria objSubcategoria);
    public void actualizar (Subcategoria objSubcategoria);
    public void eliminar (Subcategoria objCategoria);
    public List<Subcategoria> buscarSubCategoria();
    public Subcategoria buscarPorId(Integer id);
}
