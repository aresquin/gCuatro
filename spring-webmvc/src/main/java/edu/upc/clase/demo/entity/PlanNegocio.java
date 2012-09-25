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
 * @author Johan
 */

@XmlRootElement
public class PlanNegocio implements Serializable {
   private Integer id_pl_negocio;
   private String ti_pl_negocio;
   private String id_categoria;
   private String vi_negocio;
   private String ra_propuesta;
   private String ti_ejecucion;
   private double in_total;
   private double ma_neto;
   private double pl_roi;
   private double pr_venta;
   private Integer st_pl_negocio;
   private Integer id_usuario;
   private String co_pl_negocio;
   private String id_estado;
   private Date fe_validacion;
   private Date fe_creacion;
   private String us_creacion;
   private Date fe_modificacion;
   private String us_modificacion;

   public PlanNegocio() {}
    /**
     * @return the id_pl_negocio
     */
    public Integer getId_pl_negocio() {
        return id_pl_negocio;
    }

    /**
     * @param id_pl_negocio the id_pl_negocio to set
     */
    public void setId_pl_negocio(Integer id_pl_negocio) {
        this.id_pl_negocio = id_pl_negocio;
    }

    /**
     * @return the ti_pl_negocio
     */
    public String getTi_pl_negocio() {
        return ti_pl_negocio;
    }
    
    
    

    /**
     * @param ti_pl_negocio the ti_pl_negocio to set
     */
    public void setTi_pl_negocio(String ti_pl_negocio) {
        this.ti_pl_negocio = ti_pl_negocio;
    }

    /**
     * @return the id_categoria
     */
    public String getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * @return the vi_negocio
     */
    public String getVi_negocio() {
        return vi_negocio;
    }

    /**
     * @param vi_negocio the vi_negocio to set
     */
    public void setVi_negocio(String vi_negocio) {
        this.vi_negocio = vi_negocio;
    }

    /**
     * @return the ra_propuesta
     */
    public String getRa_propuesta() {
        return ra_propuesta;
    }

    /**
     * @param ra_propuesta the ra_propuesta to set
     */
    public void setRa_propuesta(String ra_propuesta) {
        this.ra_propuesta = ra_propuesta;
    }

    /**
     * @return the ti_ejecucion
     */
    public String getTi_ejecucion() {
        return ti_ejecucion;
    }

    /**
     * @param ti_ejecucion the ti_ejecucion to set
     */
    public void setTi_ejecucion(String ti_ejecucion) {
        this.ti_ejecucion = ti_ejecucion;
    }

    /**
     * @return the in_total
     */
    public double getIn_total() {
        return in_total;
    }

    /**
     * @param in_total the in_total to set
     */
    public void setIn_total(double in_total) {
        this.in_total = in_total;
    }

    /**
     * @return the ma_neto
     */
    public double getMa_neto() {
        return ma_neto;
    }

    /**
     * @param ma_neto the ma_neto to set
     */
    public void setMa_neto(double ma_neto) {
        this.ma_neto = ma_neto;
    }

    /**
     * @return the pl_roi
     */
    public double getPl_roi() {
        return pl_roi;
    }

    /**
     * @param pl_roi the pl_roi to set
     */
    public void setPl_roi(double pl_roi) {
        this.pl_roi = pl_roi;
    }

    /**
     * @return the pr_venta
     */
    public double getPr_venta() {
        return pr_venta;
    }

    /**
     * @param pr_venta the pr_venta to set
     */
    public void setPr_venta(double pr_venta) {
        this.pr_venta = pr_venta;
    }

    /**
     * @return the st_pl_negocio
     */
    public Integer getSt_pl_negocio() {
        return st_pl_negocio;
    }

    /**
     * @param st_pl_negocio the st_pl_negocio to set
     */
    public void setSt_pl_negocio(Integer st_pl_negocio) {
        this.st_pl_negocio = st_pl_negocio;
    }

    /**
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the co_pl_negocio
     */
    public String getCo_pl_negocio() {
        return co_pl_negocio;
    }

    /**
     * @param co_pl_negocio the co_pl_negocio to set
     */
    public void setCo_pl_negocio(String co_pl_negocio) {
        this.co_pl_negocio = co_pl_negocio;
    }

    /**
     * @return the fe_validacion
     */
    public Date getFe_validacion() {
        return fe_validacion;
    }

    /**
     * @param fe_validacion the fe_validacion to set
     */
    public void setFe_validacion(Date fe_validacion) {
        this.fe_validacion = fe_validacion;
    }

    /**
     * @return the fe_creacion
     */
    public Date getFe_creacion() {
        return fe_creacion;
    }

    /**
     * @param fe_creacion the fe_creacion to set
     */
    public void setFe_creacion(Date fe_creacion) {
        this.fe_creacion = fe_creacion;
    }

    /**
     * @return the us_creacion
     */
    public String getUs_creacion() {
        return us_creacion;
    }

    /**
     * @param us_creacion the us_creacion to set
     */
    public void setUs_creacion(String us_creacion) {
        this.us_creacion = us_creacion;
    }

    /**
     * @return the fe_modificacion
     */
    public Date getFe_modificacion() {
        return fe_modificacion;
    }

    /**
     * @param fe_modificacion the fe_modificacion to set
     */
    public void setFe_modificacion(Date fe_modificacion) {
        this.fe_modificacion = fe_modificacion;
    }

    /**
     * @return the us_modificacion
     */
    public String getUs_modificacion() {
        return us_modificacion;
    }

    /**
     * @param us_modificacion the us_modificacion to set
     */
    public void setUs_modificacion(String us_modificacion) {
        this.us_modificacion = us_modificacion;
    }

    /**
     * @return the id_estado
     */
    public String getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(String id_estado) {
        this.id_estado = id_estado;
    }
   
   /**Detalle de plan de negocio*/
     private Integer id_det_plnegocio;
  
  private String id_secuencia;
  private String no_archivo;
  private String ti_archivo;

    /**
     * @return the id_det_plnegocio
     */
    public Integer getId_det_plnegocio() {
        return id_det_plnegocio;
    }

    /**
     * @param id_det_plnegocio the id_det_plnegocio to set
     */
    public void setId_det_plnegocio(Integer id_det_plnegocio) {
        this.id_det_plnegocio = id_det_plnegocio;
    }

    /**
     * @return the id_secuencia
     */
    public String getId_secuencia() {
        return id_secuencia;
    }

    /**
     * @param id_secuencia the id_secuencia to set
     */
    public void setId_secuencia(String id_secuencia) {
        this.id_secuencia = id_secuencia;
    }

    /**
     * @return the no_archivo
     */
    public String getNo_archivo() {
        return no_archivo;
    }

    /**
     * @param no_archivo the no_archivo to set
     */
    public void setNo_archivo(String no_archivo) {
        this.no_archivo = no_archivo;
    }

    /**
     * @return the ti_archivo
     */
    public String getTi_archivo() {
        return ti_archivo;
    }

    /**
     * @param ti_archivo the ti_archivo to set
     */
    public void setTi_archivo(String ti_archivo) {
        this.ti_archivo = ti_archivo;
    }
  
    
   
}
