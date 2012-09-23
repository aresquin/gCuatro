package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gian
 */
@XmlRootElement
public class Usuarios implements Serializable {
    
    private Integer id;
    private String nombre;
    private String ape_pat;
    private String ape_mat;
    private String correo;
    private String password;

    public Usuarios() {}
    
    public Usuarios(Integer id, String nombre,String ape_pat, String ape_mat, String correo,String password) {
        this.id = id;
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat= ape_mat;
        this.correo = correo;
        this.password = password;
    }

    public Usuarios(String nombre,String ape_pat, String ape_mat, String correo, String password) {
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat = ape_mat;
        this.correo = correo;
        this.password = password;
    }
    
    public Usuarios(String nombre,String ape_pat, String ape_mat,String correo) {
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.correo = correo;
    }
    
    

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    /**
     * @return the ape_pat
     */
    public String getApe_pat() {
        return ape_pat;
    }

    /**
     * @param ape_pat the ape_pat to set
     */
    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    /**
     * @return the ape_mat
     */
    public String getApe_mat() {
        return ape_mat;
    }

    /**
     * @param ape_mat the ape_mat to set
     */
    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }
}