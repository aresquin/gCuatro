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

    private Integer nPlaID;
    private String cPlaTitulo;
    private Integer nCatID;
    private String cPlaVision;
    private String cPlaRazon;
    private String cPlaTiempo;
    private double nPlaInvTotal;
    private double nPlaNeto;
    private double nPlaROI;
    private double nPlaPreVenta;
    private Integer nEstID;
    private Date cPlaFecVal;
    private Date cPlaFecCrea;
    private Integer nUsuCrea;
    private Date cPlaFecModi;
    private Integer nUsuModi;

    public PlanNegocio() {
    }

    /**
     * @return the nPlaID
     */
    public Integer getnPlaID() {
        return nPlaID;
    }

    /**
     * @param nPlaID the nPlaID to set
     */
    public void setnPlaID(Integer nPlaID) {
        this.nPlaID = nPlaID;
    }

    /**
     * @return the cPlaTitulo
     */
    public String getcPlaTitulo() {
        return cPlaTitulo;
    }

    /**
     * @param cPlaTitulo the cPlaTitulo to set
     */
    public void setcPlaTitulo(String cPlaTitulo) {
        this.cPlaTitulo = cPlaTitulo;
    }

    /**
     * @return the nCatID
     */
    public Integer getnCatID() {
        return nCatID;
    }

    /**
     * @param nCatID the nCatID to set
     */
    public void setnCatID(Integer nCatID) {
        this.nCatID = nCatID;
    }

    /**
     * @return the cPlaVision
     */
    public String getcPlaVision() {
        return cPlaVision;
    }

    /**
     * @param cPlaVision the cPlaVision to set
     */
    public void setcPlaVision(String cPlaVision) {
        this.cPlaVision = cPlaVision;
    }

    /**
     * @return the cPlaRazon
     */
    public String getcPlaRazon() {
        return cPlaRazon;
    }

    /**
     * @param cPlaRazon the cPlaRazon to set
     */
    public void setcPlaRazon(String cPlaRazon) {
        this.cPlaRazon = cPlaRazon;
    }

    /**
     * @return the cPlaTiempo
     */
    public String getcPlaTiempo() {
        return cPlaTiempo;
    }

    /**
     * @param cPlaTiempo the cPlaTiempo to set
     */
    public void setcPlaTiempo(String cPlaTiempo) {
        this.cPlaTiempo = cPlaTiempo;
    }

    /**
     * @return the nPlaTotal
     */
    public double getnPlaInvTotal() {
        return nPlaInvTotal;
    }

    /**
     * @param nPlaTotal the nPlaTotal to set
     */
    public void setnPlaInvTotal(double nPlaInvTotal) {
        this.nPlaInvTotal = nPlaInvTotal;
    }

    /**
     * @return the nPlaNeto
     */
    public double getnPlaNeto() {
        return nPlaNeto;
    }

    /**
     * @param nPlaNeto the nPlaNeto to set
     */
    public void setnPlaNeto(double nPlaNeto) {
        this.nPlaNeto = nPlaNeto;
    }

    /**
     * @return the nPlaROI
     */
    public double getnPlaROI() {
        return nPlaROI;
    }

    /**
     * @param nPlaROI the nPlaROI to set
     */
    public void setnPlaROI(double nPlaROI) {
        this.nPlaROI = nPlaROI;
    }

    /**
     * @return the nPlaPreVenta
     */
    public double getnPlaPreVenta() {
        return nPlaPreVenta;
    }

    /**
     * @param nPlaPreVenta the nPlaPreVenta to set
     */
    public void setnPlaPreVenta(double nPlaPreVenta) {
        this.nPlaPreVenta = nPlaPreVenta;
    }

    /**
     * @return the nEstID
     */
    public Integer getnEstID() {
        return nEstID;
    }

    /**
     * @param nEstID the nEstID to set
     */
    public void setnEstID(Integer nEstID) {
        this.nEstID = nEstID;
    }

    /**
     * @return the cPlaFecVal
     */
    public Date getcPlaFecVal() {
        return cPlaFecVal;
    }

    /**
     * @param cPlaFecVal the cPlaFecVal to set
     */
    public void setcPlaFecVal(Date cPlaFecVal) {
        this.cPlaFecVal = cPlaFecVal;
    }

    /**
     * @return the cPlaFecCrea
     */
    public Date getcPlaFecCrea() {
        return cPlaFecCrea;
    }

    /**
     * @param cPlaFecCrea the cPlaFecCrea to set
     */
    public void setcPlaFecCrea(Date nPlaFecCrea) {
        this.cPlaFecCrea = nPlaFecCrea;
    }

    /**
     * @return the nUsuCrea
     */
    public Integer getnUsuCrea() {
        return nUsuCrea;
    }

    /**
     * @param nUsuCrea the nUsuCrea to set
     */
    public void setnUsuCrea(Integer nUsuCrea) {
        this.nUsuCrea = nUsuCrea;
    }

    /**
     * @return the cPlaFecModi
     */
    public Date getcPlaFecModi() {
        return cPlaFecModi;
    }

    /**
     * @param cPlaFecModi the cPlaFecModi to set
     */
    public void setcPlaFecModi(Date cPlaFecModi) {
        this.cPlaFecModi = cPlaFecModi;
    }

    /**
     * @return the nUsuModi
     */
    public Integer getnUsuModi() {
        return nUsuModi;
    }

    /**
     * @param nUsuModi the nUsuModi to set
     */
    public void setnUsuModi(Integer nUsuModi) {
        this.nUsuModi = nUsuModi;
    }
    /**
     * Detalle de plan de negocio
     */
    private Integer nAAdjID;
    private Integer nAAdjSecuencia;
    private String cAAdjNombre;
    private String cAAdjExtension;
    private String cAAdjFecCrea;

    /**
     * @return the nAAdjID
     */
    public Integer getnAAdjID() {
        return nAAdjID;
    }

    /**
     * @param nAAdjID the nAAdjID to set
     */
    public void setnAAdjID(Integer nAAdjID) {
        this.nAAdjID = nAAdjID;
    }

    /**
     * @return the nAAdjSecuencia
     */
    public Integer getnAAdjSecuencia() {
        return nAAdjSecuencia;
    }

    /**
     * @param nAAdjSecuencia the nAAdjSecuencia to set
     */
    public void setnAAdjSecuencia(Integer nAAdjSecuencia) {
        this.nAAdjSecuencia = nAAdjSecuencia;
    }

    /**
     * @return the cAAdjNombre
     */
    public String getcAAdjNombre() {
        return cAAdjNombre;
    }

    /**
     * @param cAAdjNombre the cAAdjNombre to set
     */
    public void setcAAdjNombre(String cAAdjNombre) {
        this.cAAdjNombre = cAAdjNombre;
    }

    /**
     * @return the cAAdjExtension
     */
    public String getcAAdjExtension() {
        return cAAdjExtension;
    }

    /**
     * @param cAAdjExtension the cAAdjExtension to set
     */
    public void setcAAdjExtension(String cAAdjExtension) {
        this.cAAdjExtension = cAAdjExtension;
    }

    /**
     * @return the cAAdjFecCrea
     */
    public String getcAAdjFecCrea() {
        return cAAdjFecCrea;
    }

    /**
     * @param cAAdjFecCrea the cAAdjFecCrea to set
     */
    public void setcAAdjFecCrea(String cAAdjFecCrea) {
        this.cAAdjFecCrea = cAAdjFecCrea;
    }
}
