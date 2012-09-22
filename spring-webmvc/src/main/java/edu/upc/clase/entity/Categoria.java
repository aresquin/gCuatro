/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.entity;

/**
 *
 * @author Juan Yabiku
 */
public class Categoria {
    private String codigo;
    private String nombre;
    private String ruta;
    private String fcrea;
    private String ucrea;
    private String fmodifica;
    private String umodifica;
    
    public Categoria (String codigo, String nombre, String ruta, String fcrea, String ucrea, String fmodifica, String umodifica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ruta = ruta;
        this.fcrea = fcrea;
        this.ucrea = ucrea;
        this.fmodifica = fmodifica;
        this.umodifica = umodifica;
    }

    public Categoria (String codigo, String nombre, String ruta, String fcrea, String ucrea) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ruta = ruta;
        this.fcrea = fcrea;
        this.ucrea = ucrea;
    }

    public Categoria (String codigo, String nombre, String fcrea, String ucrea) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fcrea = fcrea;
        this.ucrea = ucrea;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getFcrea() {
        return fcrea;
    }

    public void setFcrea(String fcrea) {
        this.fcrea = fcrea;
    }

    public String getUcrea() {
        return ucrea;
    }

    public void setUcrea(String ucrea) {
        this.ucrea = ucrea;
    }

    public String getFmodifica() {
        return fmodifica;
    }

    public void setFmodifica(String fmodifica) {
        this.fmodifica = fmodifica;
    }

    public String getUmodifica() {
        return umodifica;
    }

    public void setUmodifica(String umodifica) {
        this.umodifica = umodifica;
    }
}
