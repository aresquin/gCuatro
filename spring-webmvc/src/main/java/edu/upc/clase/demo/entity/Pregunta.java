

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;



import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@XmlRootElement
public class Pregunta implements Serializable {
    
    private int id;
    private String contenido;
    
    public Pregunta() {}
    
    public Pregunta (String contenido){
        
        this.id = id;
        this.contenido = contenido;
    }
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
      public String getContenido() {
        return contenido;
    }

    public void setNombre(String contenido) {
        this.contenido = contenido;
    }
}
 