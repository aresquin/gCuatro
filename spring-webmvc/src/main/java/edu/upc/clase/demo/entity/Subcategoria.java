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
 * @author Juan Yabiku
 */
@XmlRootElement
public class Subcategoria implements Serializable {
    private Integer nSCatID;
    private String cSCatNombre;
    private Integer nCatID;
    private Date cSCatFecCrea;
    private Integer nUsuCrea;

    public Subcategoria () {
    }
    
    public Subcategoria (String cSCatNombre, Integer nCatID, Integer nUsuCrea) {
        this.cSCatNombre = cSCatNombre;
        this.nCatID = nCatID;
        this.nUsuCrea = nUsuCrea;
    }

    public Subcategoria (Integer nSCatID) {
        this.nSCatID = nSCatID;
    }

    public Integer getnSCatID() {
        return nSCatID;
    }

    public void setnSCatID(Integer nSCatID) {
        this.nSCatID = nSCatID;
    }

    public String getcSCatNombre() {
        return cSCatNombre;
    }

    public void setcSCatNombre(String cSCatNombre) {
        this.cSCatNombre = cSCatNombre;
    }

    public Integer getnCatID() {
        return nCatID;
    }

    public void setnCatID(Integer nCatID) {
        this.nCatID = nCatID;
    }

    public Date getcSCatFecCrea() {
        return cSCatFecCrea;
    }

    public void setcSCatFecCrea(Date cSCatFecCrea) {
        this.cSCatFecCrea = cSCatFecCrea;
    }

    public Integer getnUsuCrea() {
        return nUsuCrea;
    }

    public void setnUsuCrea(Integer nUsuCrea) {
        this.nUsuCrea = nUsuCrea;
    }
}
