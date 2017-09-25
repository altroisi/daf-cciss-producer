//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.09.25 alle 05:56:37 PM CEST 
//


package it.dtt.e015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per localitaxmlType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="localitaxmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prov" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lng" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localitaxmlType")
public class LocalitaxmlType {

    @XmlAttribute(name = "tipo")
    protected String tipo;
    @XmlAttribute(name = "locid")
    protected String locid;
    @XmlAttribute(name = "prov")
    protected String prov;
    @XmlAttribute(name = "reg")
    protected String reg;
    @XmlAttribute(name = "lng")
    protected String lng;
    @XmlAttribute(name = "lat")
    protected String lat;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà locid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocid() {
        return locid;
    }

    /**
     * Imposta il valore della proprietà locid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocid(String value) {
        this.locid = value;
    }

    /**
     * Recupera il valore della proprietà prov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProv() {
        return prov;
    }

    /**
     * Imposta il valore della proprietà prov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProv(String value) {
        this.prov = value;
    }

    /**
     * Recupera il valore della proprietà reg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReg() {
        return reg;
    }

    /**
     * Imposta il valore della proprietà reg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReg(String value) {
        this.reg = value;
    }

    /**
     * Recupera il valore della proprietà lng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLng() {
        return lng;
    }

    /**
     * Imposta il valore della proprietà lng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLng(String value) {
        this.lng = value;
    }

    /**
     * Recupera il valore della proprietà lat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Imposta il valore della proprietà lat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
