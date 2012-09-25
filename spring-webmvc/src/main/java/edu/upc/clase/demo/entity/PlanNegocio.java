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
   private Date nPlaFecCrea;
   private Integer nUsuCrea;
   private Date cPlaFecModi;
   private Integer nUsuModi;

   public PlanNegocio() {}
    /**
     * @return the nPlaID
     */
    public Integer getNPlaID() {
        return nPlaID;
    }

    /**
     * @param nPlaID the nPlaID to set
     */
    public void setNPlaID(Integer nPlaID) {
        this.nPlaID = nPlaID;
    }

    /**
     * @return the cPlaTitulo
     */
    public String getCPlaTitulo() {
        return cPlaTitulo;
    }
    
    
    

    /**
     * @param cPlaTitulo the cPlaTitulo to set
     */
    public void setCPlaTitulo(String cPlaTitulo) {
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
    public String getCPlaVision() {
        return cPlaVision;
    }

    /**
     * @param cPlaVision the cPlaVision to set
     */
    public void setCPlaVision(String cPlaVision) {
        this.cPlaVision = cPlaVision;
    }

    /**
     * @return the cPlaRazon
     */
    public String getCPlaRazon() {
        return cPlaRazon;
    }

    /**
     * @param cPlaRazon the cPlaRazon to set
     */
    public void setCPlaRazon(String cPlaRazon) {
        this.cPlaRazon = cPlaRazon;
    }

    /**
     * @return the cPlaTiempo
     */
    public String getCPlaTiempo() {
        return cPlaTiempo;
    }

    /**
     * @param cPlaTiempo the cPlaTiempo to set
     */
    public void setCPlaTiempo(String cPlaTiempo) {
        this.cPlaTiempo = cPlaTiempo;
    }

    /**
     * @return the nPlaTotal
     */
    public double getNPlaInvTotal() {
        return nPlaInvTotal;
    }

    /**
     * @param nPlaTotal the nPlaTotal to set
     */
    public void setNPlaInvTotal(double nPlaInvTotal) {
        this.nPlaInvTotal = nPlaInvTotal;
    }

    /**
     * @return the nPlaNeto
     */
    public double getNPlaNeto() {
        return nPlaNeto;
    }

    /**
     * @param nPlaNeto the nPlaNeto to set
     */
    public void setNPlaNeto(double nPlaNeto) {
        this.nPlaNeto = nPlaNeto;
    }

    /**
     * @return the nPlaROI
     */
    public double getNPlaROI() {
        return nPlaROI;
    }

    /**
     * @param nPlaROI the nPlaROI to set
     */
    public void setNPlaROI(double nPlaROI) {
        this.nPlaROI = nPlaROI;
    }

    /**
     * @return the nPlaPreVenta
     */
    public double getNPlaPreVenta() {
        return nPlaPreVenta;
    }

    /**
     * @param nPlaPreVenta the nPlaPreVenta to set
     */
    public void setNPlaPreVenta(double nPlaPreVenta) {
        this.nPlaPreVenta = nPlaPreVenta;
    }

    /**
     * @return the nEstID
     */
    public Integer getNEstID() {
        return nEstID;
    }

    /**
     * @param nEstID the nEstID to set
     */
    public void setNEstID(Integer nEstID) {
        this.nEstID = nEstID;
    }
    /**
     * @return the cPlaFecVal
     */
    public Date getCPlaFecVal() {
        return cPlaFecVal;
    }

    /**
     * @param cPlaFecVal the cPlaFecVal to set
     */
    public void setCPlaFecVal(Date cPlaFecVal) {
        this.cPlaFecVal = cPlaFecVal;
    }

    /**
     * @return the nPlaFecCrea
     */
    public Date getNPlaFecCrea() {
        return nPlaFecCrea;
    }

    /**
     * @param nPlaFecCrea the nPlaFecCrea to set
     */
    public void setNPlaFecCrea(Date nPlaFecCrea) {
        this.nPlaFecCrea = nPlaFecCrea;
    }

    /**
     * @return the nUsuCrea
     */
    public Integer getNUsuCrea() {
        return nUsuCrea;
    }

    /**
     * @param nUsuCrea the nUsuCrea to set
     */
    public void setNUsuCrea(Integer nUsuCrea) {
        this.nUsuCrea = nUsuCrea;
    }

    /**
     * @return the cPlaFecModi
     */
    public Date getCPlaFecModi() {
        return cPlaFecModi;
    }

    /**
     * @param cPlaFecModi the cPlaFecModi to set
     */
    public void setCPlaFecModi(Date cPlaFecModi) {
        this.cPlaFecModi = cPlaFecModi;
    }

    /**
     * @return the nUsuModi
     */
    public Integer getNUsuModi() {
        return nUsuModi;
    }

    /**
     * @param nUsuModi the nUsuModi to set
     */
    public void setNUsuModi(Integer nUsuModi) {
        this.nUsuModi = nUsuModi;
    }

      
   /**Detalle de plan de negocio*/
     private Integer nAAdjID;
  
    private Integer nAAdjSecuencia;
    private String cAAdjNombre;
    private String cAAdjExtension;

    private String cAAdjFecCrea;

    /**
     * @return the nAAdjID
     */
    public Integer getNAAdjID() {
        return nAAdjID;
    }

    /**
     * @param nAAdjID the nAAdjID to set
     */
    public void setNAAdjID(Integer nAAdjID) {
        this.nAAdjID = nAAdjID;
    }

    /**
     * @return the nAAdjSecuencia
     */
    public Integer getNAAdjSecuencia() {
        return nAAdjSecuencia;
    }

    /**
     * @param nAAdjSecuencia the nAAdjSecuencia to set
     */
    public void setNAAdjSecuencia(Integer nAAdjSecuencia) {
        this.nAAdjSecuencia = nAAdjSecuencia;
    }

    /**
     * @return the cAAdjNombre
     */
    public String getCAAdjNombre() {
        return cAAdjNombre;
    }

    /**
     * @param cAAdjNombre the cAAdjNombre to set
     */
    public void setCAAdjNombre(String cAAdjNombre) {
        this.cAAdjNombre = cAAdjNombre;
    }

    /**
     * @return the cAAdjExtension
     */
    public String getCAAdjExtension() {
        return cAAdjExtension;
    }

    /**
     * @param cAAdjExtension the cAAdjExtension to set
     */
    public void setCAAdjExtension(String cAAdjExtension) {
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
