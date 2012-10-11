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
public class PasarelaV implements Serializable{
    private Integer idpasarela;
    private String pais;
    private Integer ntarjeta;
    private String fecvencimiento ;
    private Integer codverificacion;
    private String direccion;
    
    public PasarelaV ()
    {}

    public PasarelaV(String pais,Integer ntarj, String fvencimiento, Integer codverif, String direccion)
    {
        this.pais=pais;
        this.ntarjeta=ntarj;
        this.fecvencimiento=fvencimiento;
        this.codverificacion=codverif;
        this.direccion=direccion;
    }
    
    public PasarelaV (Integer ntarjeta)
    {
        this.ntarjeta=ntarjeta;
    }
    
    
    
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

    public String getFecvencimiento() {
        return fecvencimiento;
    }

    public void setFecvencimiento(String fecvencimiento) {
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
