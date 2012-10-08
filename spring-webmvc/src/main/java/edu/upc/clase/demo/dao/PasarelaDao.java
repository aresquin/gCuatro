/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;


import edu.upc.clase.demo.entity.Pasarela;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface PasarelaDao {
    public Integer insertar(Pasarela pasarela);
    public Pasarela buscarXcodigoCompra(Integer id);
   //public void actualizar(Pasarela pasarela);
    public void eliminar(Pasarela pasarela); 
    public List<Pasarela> buscarTodos();
    public Pasarela buscarDireccion(String Direccion);
    public Pasarela buscarNumTarjeta(Integer ntarjeta);
    
   
}
