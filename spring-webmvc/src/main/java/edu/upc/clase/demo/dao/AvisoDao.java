package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Aviso;
import java.util.List;

/**
 *
 * @author gian
 */
public interface AvisoDao {
    public Integer insertar(Aviso Aviso);
    public void actualizar(Aviso Aviso);
    public void eliminar(Aviso Aviso);
    public List<Aviso> buscarTodos();
    public Aviso buscarPorId(Integer id);
}
