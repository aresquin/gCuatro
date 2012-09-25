/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Emprendedor;
import java.util.List;

/**
 *
 * @author JOEL
 */
public interface EmprendedorDao {
    
    public Integer insertar (Emprendedor objEmp);
    public void actualizar (Emprendedor objEmp);
    public void eliminar (Emprendedor objEmp);
    public List<Emprendedor> buscarEmprendedor();
    public Emprendedor buscarPorId(Integer id);
}
