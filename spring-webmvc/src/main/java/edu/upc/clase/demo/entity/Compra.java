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
@XmlRootElement
public class Compra implements Serializable{
    private Integer idcompra;
    private String numcompra;
    private Date FecCreacion;
    private Date FecModi;
    private double SubTotal;
    private double Igv;
    private double total;
    private Integer usumodi;
    private Integer estado;
    private Integer envio;
    private Integer usuario;
    
    
    public Compra()
   {}

    public Date getFecCreacion() {
        return FecCreacion;
    }

    public void setFecCreacion(Date FecCreacion) {
        this.FecCreacion = FecCreacion;
    }

    public Date getFecModi() {
        return FecModi;
    }

    public void setFecModi(Date FecModi) {
        this.FecModi = FecModi;
    }

    public double getIgv() {
        return Igv;
    }

    public void setIgv(double Igv) {
        this.Igv = Igv;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Integer getEnvio() {
        return envio;
    }

    public void setEnvio(Integer envio) {
        this.envio = envio;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public String getNumcompra() {
        return numcompra;
    }

    public void setNumcompra(String numcompra) {
        this.numcompra = numcompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getUsumodi() {
        return usumodi;
    }

    public void setUsumodi(Integer usumodi) {
        this.usumodi = usumodi;
    }
    
    
}
