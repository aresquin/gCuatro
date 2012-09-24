/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Yabiku
 */
@XmlRootElement
public class Categoria implements Serializable {
    private Integer id;
    private String nombre;
    private String ruta;
    private Integer estado;
    private Date fe_crea;
    private String us_crea;
    private Date fe_modi;
    private String us_modi;

    public Categoria (String nombre, String ruta, Integer estado, Date fe_crea, String us_crea) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.estado = estado;
        this.fe_crea = fe_crea;
        this.us_crea = us_crea;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFe_crea() {
        return fe_crea;
    }

    public void setFe_crea(Date fe_crea) {
        this.fe_crea = fe_crea;
    }

    public String getUs_crea() {
        return us_crea;
    }

    public void setUs_crea(String us_crea) {
        this.us_crea = us_crea;
    }

    public Date getFe_modi() {
        return fe_modi;
    }

    public void setFe_modi(Date fe_modi) {
        this.fe_modi = fe_modi;
    }

    public String getUs_modi() {
        return us_modi;
    }

    public void setUs_modi(String us_modi) {
        this.us_modi = us_modi;
    }
}
