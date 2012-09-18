package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author operador
 */
@XmlRootElement
public class Aviso implements Serializable {

    private Integer id;
    private String titulo;
    private String descripcion;

    public Aviso() {
    }

    public Aviso(Integer id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Aviso(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
