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
public class Categoria implements Serializable {
    private Integer nCatID;
    private String cCatNombre;
    private String sCatRutaImagen;
    private Integer nEstID;
    private Date cCatFecCrea;
    private Integer nUsuCrea;
    private Date cCatFecModi;
    private Integer nUsuModi;

    public Categoria() {
    }
    
    public Categoria(String cCatNombre, String sCatRutaImagen, Integer nUsuCrea) {
        this.cCatNombre = cCatNombre;
        this.sCatRutaImagen = sCatRutaImagen;
        this.nUsuCrea = nUsuCrea;
    }

    public Categoria(Integer nUsuModi, Integer nCatID) {
        this.nUsuModi = nUsuModi;
        this.nCatID = nCatID;
    }
    
    public Integer getnCatID() {
        return nCatID;
    }

    public void setnCatID(Integer nCatID) {
        this.nCatID = nCatID;
    }

    public String getcCatNombre() {
        return cCatNombre;
    }

    public void setcCatNombre(String cCatNombre) {
        this.cCatNombre = cCatNombre;
    }

    public String getsCatRutaImagen() {
        return sCatRutaImagen;
    }

    public void setsCatRutaImagen(String sCatRutaImagen) {
        this.sCatRutaImagen = sCatRutaImagen;
    }

    public Integer getnEstID() {
        return nEstID;
    }

    public void setnEstID(Integer nEstID) {
        this.nEstID = nEstID;
    }

    public Date getcCatFecCrea() {
        return cCatFecCrea;
    }

    public void setcCatFecCrea(Date cCatFecCrea) {
        this.cCatFecCrea = cCatFecCrea;
    }

    public Integer getnUsuCrea() {
        return nUsuCrea;
    }

    public void setnUsuCrea(Integer nUsuCrea) {
        this.nUsuCrea = nUsuCrea;
    }

    public Date getcCatFecModi() {
        return cCatFecModi;
    }

    public void setcCatFecModi(Date cCatFecModi) {
        this.cCatFecModi = cCatFecModi;
    }

    public Integer getnUsuModi() {
        return nUsuModi;
    }

    public void setnUsuModi(Integer nUsuModi) {
        this.nUsuModi = nUsuModi;
    }
}
