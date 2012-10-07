package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gian
 */
@XmlRootElement
public class Colaborador implements Serializable {
    
    private Integer id;
    private String nombre;
    private String apepat;
    private String apemat;
    private String correo;
    private String password;
    private Integer umodificador;
    

    public Colaborador() {}
    
    public Colaborador(Integer id, String nombre,String apepat, String apemat, String correo,String password) {
        this.id = id;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat= apemat;
        this.correo = correo;
        this.password = password;
    }

    public Colaborador(String nombre,String apepat, String apemat, String correo, String password) {
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
        this.correo = correo;
        this.password = password;
    }
    
    public Colaborador(String nombre,String apepat, String apemat,String correo) {
        this.nombre = nombre;
        this.apepat = apepat;
        this.correo = correo;
    }

    public Colaborador ( Integer umodificador, Integer ueliminado){
        this.umodificador=umodificador;
        this.id=ueliminado;
    }
           
    public Colaborador(Integer nColId, String correo)
    {
        this.umodificador=nColId;
        this.correo=correo;
    }
    
    
    public Integer getUmodificador() {
        return umodificador;
    }

    public void setUmodificador(Integer umodificador) {
        this.umodificador = umodificador;
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
    public String getApepat() {
        return apepat;
    }

    /**
     * @param ape_pat the ape_pat to set
     */
    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    /**
     * @return the ape_mat
     */
    public String getApemat() {
        return apemat;
    }
    /**
     * @param ape_mat the ape_mat to set
     */
    public void setApemat(String apemat) {
        this.apemat = apemat;
    }
}