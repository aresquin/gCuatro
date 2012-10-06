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
 * @author examenes
 */
public class pasarela implements Serializable{
    private Integer idpasarela;
    private String pais;
    private Integer ntarjeta;
    private Date fecvencimiento ;
    private Integer codverificacion;
    private String direccion;
    
    public pasarela ()
    {}

    public Integer getCodverificacion() {
        return codverificacion;
    }

    public void setCodverificacion(Integer codverificacion) {
        this.codverificacion = codverificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecvencimiento() {
        return fecvencimiento;
    }

    public void setFecvencimiento(Date fecvencimiento) {
        this.fecvencimiento = fecvencimiento;
    }

    public Integer getIdpasarela() {
        return idpasarela;
    }

    public void setIdpasarela(Integer idpasarela) {
        this.idpasarela = idpasarela;
    }

    public Integer getNtarjeta() {
        return ntarjeta;
    }

    public void setNtarjeta(Integer ntarjeta) {
        this.ntarjeta = ntarjeta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
