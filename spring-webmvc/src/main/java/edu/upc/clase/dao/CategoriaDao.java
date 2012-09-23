/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.dao;

import edu.upc.clase.entity.Categoria;

/**
 *
 * @author Juan Yabiku
 */
public interface CategoriaDao {
    public Integer insertar(Categoria categoria);
    public void actualizar(Categoria categoria);
    public void eliminar(Categoria categoria);
    public Categoria buscar(String nombre);
}