/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.entity;

/**
 *
 * @author Juan Yabiku
 */
public class Subcategoria {
    private int codigo;
    private String nombre;
    private String categoria;
    private String fcrea;
    private String ucrea;
    private String fmodifica;
    private String umodifica;

    public Subcategoria (int codigo, String nombre, String categoria, String fcrea, String ucrea, String fmodifica, String umodifica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fcrea = fcrea;
        this.ucrea = ucrea;
        this.fmodifica = fmodifica;
        this.umodifica = umodifica;
    }
    
    public Subcategoria (int codigo, String nombre, String categoria, String fcrea, String ucrea) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fcrea = fcrea;
        this.ucrea = ucrea;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
