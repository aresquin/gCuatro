package edu.upc.clase.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gian
 */
@XmlRootElement
public class Usuarios implements Serializable {
    private Integer nUsuID;
    private String cUsuNombre;
    private String cUsuApePat;
    private String cUsuApeMat;
    private String cUsuSexo;
    private Integer nTDocID;
    private String cUsuNumDocumento;
    private String cUsuEmail;
    private String cUsuTelefono;
    private String cUsuDireccion;
    private Date cUsuFecNacimiento;
    private String cUsuClave;
    private Integer nPerID;
    private String cUsuApelativo;
    private String cUsuRegAutografico;
    private String cUsuSitWeb;
    private String cUsuNumCuenta;
    private Integer nEstID;
    private Date cUsuFecCrea;
    private Integer nUsuCrea;
    private Date cUsuFecModi;
    private Integer nUsuModi;
    
    public Usuarios()
    {
        
    }

    /**
     * @return the nUsuID
     */
    public Integer getnUsuID() {
        return nUsuID;
    }

    /**
     * @param nUsuID the nUsuID to set
     */
    public void setnUsuID(Integer nUsuID) {
        this.nUsuID = nUsuID;
    }

    /**
     * @return the cUsuNombre
     */
    public String getcUsuNombre() {
        return cUsuNombre;
    }

    /**
     * @param cUsuNombre the cUsuNombre to set
     */
    public void setcUsuNombre(String cUsuNombre) {
        this.cUsuNombre = cUsuNombre;
    }

    /**
     * @return the cUsuApePat
     */
    public String getcUsuApePat() {
        return cUsuApePat;
    }

    /**
     * @param cUsuApePat the cUsuApePat to set
     */
    public void setcUsuApePat(String cUsuApePat) {
        this.cUsuApePat = cUsuApePat;
    }

    /**
     * @return the cUsuApeMat
     */
    public String getcUsuApeMat() {
        return cUsuApeMat;
    }

    /**
     * @param cUsuApeMat the cUsuApeMat to set
     */
    public void setcUsuApeMat(String cUsuApeMat) {
        this.cUsuApeMat = cUsuApeMat;
    }

    /**
     * @return the cUsuSexi
     */
    public String getcUsuSexo() {
        return cUsuSexo;
    }

    /**
     * @param cUsuSexo the cUsuSexi to set
     */
    public void setcUsuSexo(String cUsuSexo) {
        this.cUsuSexo = cUsuSexo;
    }

    /**
     * @return the nTDocID
     */
    public Integer getnTDocID() {
        return nTDocID;
    }

    /**
     * @param nTDocID the nTDocID to set
     */
    public void setnTDocID(Integer nTDocID) {
        this.nTDocID = nTDocID;
    }

    /**
     * @return the cUsuNumDocumento
     */
    public String getcUsuNumDocumento() {
        return cUsuNumDocumento;
    }

    /**
     * @param cUsuNumDocumento the cUsuNumDocumento to set
     */
    public void setcUsuNumDocumento(String cUsuNumDocumento) {
        this.cUsuNumDocumento = cUsuNumDocumento;
    }

    /**
     * @return the cUsuEmail
     */
    public String getcUsuEmail() {
        return cUsuEmail;
    }

    /**
     * @param cUsuEmail the cUsuEmail to set
     */
    public void setcUsuEmail(String cUsuEmail) {
        this.cUsuEmail = cUsuEmail;
    }

    /**
     * @return the cUsuTelefono
     */
    public String getcUsuTelefono() {
        return cUsuTelefono;
    }

    /**
     * @param cUsuTelefono the cUsuTelefono to set
     */
    public void setcUsuTelefono(String cUsuTelefono) {
        this.cUsuTelefono = cUsuTelefono;
    }

    /**
     * @return the cUsuDireccion
     */
    public String getcUsuDireccion() {
        return cUsuDireccion;
    }

    /**
     * @param cUsuDireccion the cUsuDireccion to set
     */
    public void setcUsuDireccion(String cUsuDireccion) {
        this.cUsuDireccion = cUsuDireccion;
    }

    /**
     * @return the cUsuFecNacimiento
     */
    public Date getcUsuFecNacimiento() {
        return cUsuFecNacimiento;
    }

    /**
     * @param cUsuFecNacimiento the cUsuFecNacimiento to set
     */
    public void setcUsuFecNacimiento(Date cUsuFecNacimiento) {
        this.cUsuFecNacimiento = cUsuFecNacimiento;
    }

    /**
     * @return the cUsuClave
     */
    public String getcUsuClave() {
        return cUsuClave;
    }

    /**
     * @param cUsuClave the cUsuClave to set
     */
    public void setcUsuClave(String cUsuClave) {
        this.cUsuClave = cUsuClave;
    }

    /**
     * @return the nPerID
     */
    public Integer getnPerID() {
        return nPerID;
    }

    /**
     * @param nPerID the nPerID to set
     */
    public void setnPerID(Integer nPerID) {
        this.nPerID = nPerID;
    }

    /**
     * @return the cUsuApelativo
     */
    public String getcUsuApelativo() {
        return cUsuApelativo;
    }

    /**
     * @param cUsuApelativo the cUsuApelativo to set
     */
    public void setcUsuApelativo(String cUsuApelativo) {
        this.cUsuApelativo = cUsuApelativo;
    }

    /**
     * @return the cUsuRegAutografico
     */
    public String getcUsuRegAutografico() {
        return cUsuRegAutografico;
    }

    /**
     * @param cUsuRegAutografico the cUsuRegAutografico to set
     */
    public void setcUsuRegAutografico(String cUsuRegAutografico) {
        this.cUsuRegAutografico = cUsuRegAutografico;
    }

    /**
     * @return the cUsuSitWeb
     */
    public String getcUsuSitWeb() {
        return cUsuSitWeb;
    }

    /**
     * @param cUsuSitWeb the cUsuSitWeb to set
     */
    public void setcUsuSitWeb(String cUsuSitWeb) {
        this.cUsuSitWeb = cUsuSitWeb;
    }

    /**
     * @return the cUsuNumCuenta
     */
    public String getcUsuNumCuenta() {
        return cUsuNumCuenta;
    }

    /**
     * @param cUsuNumCuenta the cUsuNumCuenta to set
     */
    public void setcUsuNumCuenta(String cUsuNumCuenta) {
        this.cUsuNumCuenta = cUsuNumCuenta;
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
     * @return the cUsuFecCrea
     */
    public Date getcUsuFecCrea() {
        return cUsuFecCrea;
    }

    /**
     * @param cUsuFecCrea the cUsuFecCrea to set
     */
    public void setcUsuFecCrea(Date cUsuFecCrea) {
        this.cUsuFecCrea = cUsuFecCrea;
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
     * @return the cUsuFecModi
     */
    public Date getcUsuFecModi() {
        return cUsuFecModi;
    }

    /**
     * @param cUsuFecModi the cUsuFecModi to set
     */
    public void setcUsuFecModi(Date cUsuFecModi) {
        this.cUsuFecModi = cUsuFecModi;
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

  
    
}