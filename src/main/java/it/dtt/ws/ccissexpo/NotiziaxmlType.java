//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.07.06 alle 02:57:45 PM CEST 
//


package it.dtt.ws.ccissexpo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notiziaxmlType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notiziaxmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationDBVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="luogo_punto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localita" type="{http://ccissexpo.ws.dtt.it}localitaxmlType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="direzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomedirezione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iconName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="priorita" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ora" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="versione" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notiziaxmlType", propOrder = {
    "locationDBVersion",
    "luogoPunto",
    "evento",
    "testo",
    "localita",
    "direzione",
    "nomedirezione",
    "tipo",
    "iconName"
})
public class NotiziaxmlType {

    protected String locationDBVersion;
    @XmlElement(name = "luogo_punto")
    protected String luogoPunto;
    protected String evento;
    protected String testo;
    protected List<LocalitaxmlType> localita;
    protected String direzione;
    protected String nomedirezione;
    protected String tipo;
    protected String iconName;
    @XmlAttribute(name = "priorita", namespace = "http://ccissexpo.ws.dtt.it")
    protected String priorita;
    @XmlAttribute(name = "ora", namespace = "http://ccissexpo.ws.dtt.it")
    protected String ora;
    @XmlAttribute(name = "data", namespace = "http://ccissexpo.ws.dtt.it")
    protected String data;
    @XmlAttribute(name = "versione", namespace = "http://ccissexpo.ws.dtt.it")
    protected String versione;
    @XmlAttribute(name = "numero", namespace = "http://ccissexpo.ws.dtt.it")
    protected String numero;

    /**
     * Recupera il valore della proprietà locationDBVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDBVersion() {
        return locationDBVersion;
    }

    /**
     * Imposta il valore della proprietà locationDBVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDBVersion(String value) {
        this.locationDBVersion = value;
    }

    /**
     * Recupera il valore della proprietà luogoPunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuogoPunto() {
        return luogoPunto;
    }

    /**
     * Imposta il valore della proprietà luogoPunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuogoPunto(String value) {
        this.luogoPunto = value;
    }

    /**
     * Recupera il valore della proprietà evento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvento() {
        return evento;
    }

    /**
     * Imposta il valore della proprietà evento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvento(String value) {
        this.evento = value;
    }

    /**
     * Recupera il valore della proprietà testo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Imposta il valore della proprietà testo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesto(String value) {
        this.testo = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localita property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalita().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalitaxmlType }
     * 
     * 
     */
    public List<LocalitaxmlType> getLocalita() {
        if (localita == null) {
            localita = new ArrayList<LocalitaxmlType>();
        }
        return this.localita;
    }

    /**
     * Recupera il valore della proprietà direzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirezione() {
        return direzione;
    }

    /**
     * Imposta il valore della proprietà direzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirezione(String value) {
        this.direzione = value;
    }

    /**
     * Recupera il valore della proprietà nomedirezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomedirezione() {
        return nomedirezione;
    }

    /**
     * Imposta il valore della proprietà nomedirezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomedirezione(String value) {
        this.nomedirezione = value;
    }

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
     * Recupera il valore della proprietà iconName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * Imposta il valore della proprietà iconName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconName(String value) {
        this.iconName = value;
    }

    /**
     * Recupera il valore della proprietà priorita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorita() {
        return priorita;
    }

    /**
     * Imposta il valore della proprietà priorita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorita(String value) {
        this.priorita = value;
    }

    /**
     * Recupera il valore della proprietà ora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOra() {
        return ora;
    }

    /**
     * Imposta il valore della proprietà ora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOra(String value) {
        this.ora = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà versione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        return versione;
    }

    /**
     * Imposta il valore della proprietà versione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

    /**
     * Recupera il valore della proprietà numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
