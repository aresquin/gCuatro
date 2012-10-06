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
 * @author Aresquin
 */
@XmlRootElement
public class Emprendedor implements Serializable{
    private Integer  id_usuario;
    private String no_usuario;
    private String ap_paterno;
    private String ap_materno;
    private String us_sexo;
    private Integer id_documento;
    private String nu_documento;
    private String  us_email;
    private String id_estado;
    private String us_telefono;
    private String us_direccion;
    private Date  fe_nacimiento;
    private String us_clave;
    private Integer id_ti_usuario;
    private String sa_apelativo;
    private String re_autobiografico;
    private String si_web;
    private Integer nu_cuenta;
    private Integer st_usuario;  // ?
    private Date fe_creacion;
    private String us_creacion;
    private Date fe_modificacion;
    private String us_modificacion;

    /**
     * @return the id_usuario
     */
      public Emprendedor()
   {     
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
     * @return the no_usuario
     */
    public String getNo_usuario() {
        return no_usuario;
    }

    /**
     * @param no_usuario the no_usuario to set
     */
    public void setNo_usuario(String no_usuario) {
        this.no_usuario = no_usuario;
    }

    /**
     * @return the ap_paterno
     */
    public String getAp_paterno() {
        return ap_paterno;
    }

    /**
     * @param ap_paterno the ap_paterno to set
     */
    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    /**
     * @return the ap_materno
     */
    public String getAp_materno() {
        return ap_materno;
    }

    /**
     * @param ap_materno the ap_materno to set
     */
    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    /**
     * @return the us_sexo
     */
    public String getUs_sexo() {
        return us_sexo;
    }

    /**
     * @param us_sexo the us_sexo to set
     */
    public void setUs_sexo(String us_sexo) {
        this.us_sexo = us_sexo;
    }

    /**
     * @return the id_documento
     */
    public Integer getId_documento() {
        return id_documento;
    }

    /**
     * @param id_documento the id_documento to set
     */
    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    /**
     * @return the nu_documento
     */
    public String getNu_documento() {
        return nu_documento;
    }

    /**
     * @param nu_documento the nu_documento to set
     */
    public void setNu_documento(String nu_documento) {
        this.nu_documento = nu_documento;
    }

    /**
     * @return the us_email
     */
    public String getUs_email() {
        return us_email;
    }

    /**
     * @param us_email the us_email to set
     */
    public void setUs_email(String us_email) {
        this.us_email = us_email;
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

    /**
     * @return the us_telefono
     */
    public String getUs_telefono() {
        return us_telefono;
    }

    /**
     * @param us_telefono the us_telefono to set
     */
    public void setUs_telefono(String us_telefono) {
        this.us_telefono = us_telefono;
    }

    /**
     * @return the us_direccion
     */
    public String getUs_direccion() {
        return us_direccion;
    }

    /**
     * @param us_direccion the us_direccion to set
     */
    public void setUs_direccion(String us_direccion) {
        this.us_direccion = us_direccion;
    }

    /**
     * @return the fe_nacimiento
     */
    public Date getFe_nacimiento() {
        return fe_nacimiento;
    }

    /**
     * @param fe_nacimiento the fe_nacimiento to set
     */
    public void setFe_nacimiento(Date fe_nacimiento) {
        this.fe_nacimiento = fe_nacimiento;
    }

    /**
     * @return the us_clave
     */
    public String getUs_clave() {
        return us_clave;
    }

    /**
     * @param us_clave the us_clave to set
     */
    public void setUs_clave(String us_clave) {
        this.us_clave = us_clave;
    }

    /**
     * @return the id_ti_usuario
     */
    public Integer getId_ti_usuario() {
        return id_ti_usuario;
    }

    /**
     * @param id_ti_usuario the id_ti_usuario to set
     */
    public void setId_ti_usuario(Integer id_ti_usuario) {
        this.id_ti_usuario = id_ti_usuario;
    }

    /**
     * @return the sa_apelativo
     */
    public String getSa_apelativo() {
        return sa_apelativo;
    }

    /**
     * @param sa_apelativo the sa_apelativo to set
     */
    public void setSa_apelativo(String sa_apelativo) {
        this.sa_apelativo = sa_apelativo;
    }

    /**
     * @return the re_autobiografico
     */
    public String getRe_autobiografico() {
        return re_autobiografico;
    }

    /**
     * @param re_autobiografico the re_autobiografico to set
     */
    public void setRe_autobiografico(String re_autobiografico) {
        this.re_autobiografico = re_autobiografico;
    }

    /**
     * @return the si_web
     */
    public String getSi_web() {
        return si_web;
    }

    /**
     * @param si_web the si_web to set
     */
    public void setSi_web(String si_web) {
        this.si_web = si_web;
    }

    /**
     * @return the nu_cuenta
     */
    public Integer getNu_cuenta() {
        return nu_cuenta;
    }

    /**
     * @param nu_cuenta the nu_cuenta to set
     */
    public void setNu_cuenta(Integer nu_cuenta) {
        this.nu_cuenta = nu_cuenta;
    }

    /**
     * @return the st_usuario
     */
    public Integer getSt_usuario() {
        return st_usuario;
    }

    /**
     * @param st_usuario the st_usuario to set
     */
    public void setSt_usuario(Integer st_usuario) {
        this.st_usuario = st_usuario;
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
     * @return the id_usuario
     */
   
 
}
