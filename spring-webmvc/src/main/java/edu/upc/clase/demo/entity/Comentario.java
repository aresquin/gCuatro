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
 * @author carlos
 */@XmlRootElement
public class Comentario implements Serializable {
     
       private Integer nComID;
    private String cComDescripcion;
    private Integer nPlaID;
    private Integer nUsuID;
    private Date cComFecCrea;
   
    public Comentario() {
    }
     public Comentario(Integer nComID, String cComDescripcion, Integer nPlaID, Integer nUsuID) {
        this.nComID = nComID;
        this.cComDescripcion = cComDescripcion;
        this.nPlaID = nPlaID;
        this.nUsuID = nUsuID;
    }
    public Comentario(String cComDescripcion, Integer nPlaID, Integer nUsuID) {
        this.cComDescripcion = cComDescripcion;
        this.nPlaID = nPlaID;
        this.nUsuID = nUsuID;
    }

    public String getcComDescripcion() {
        return cComDescripcion;
    }

    public void setcComDescripcion(String cComDescripcion) {
        this.cComDescripcion = cComDescripcion;
    }

    public Date getcComFecCrea() {
        return cComFecCrea;
    }

    public void setcComFecCrea(Date cComFecCrea) {
        this.cComFecCrea = cComFecCrea;
    }

    public Integer getnComID() {
        return nComID;
    }

    public void setnComID(Integer nComID) {
        this.nComID = nComID;
    }

    public Integer getnPlaID() {
        return nPlaID;
    }

    public void setnPlaID(Integer nPlaID) {
        this.nPlaID = nPlaID;
    }

    public Integer getnUsuID() {
        return nUsuID;
    }

    public void setnUsuID(Integer nUsuID) {
        this.nUsuID = nUsuID;
    }
  
    
}
