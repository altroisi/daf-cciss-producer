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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GeteventiResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeteventiResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="EVENTI" type="{http://ccissexpo.ws.dtt.it}eventixmlType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="ERRORI" type="{http://ccissexpo.ws.dtt.it}ErroriType" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGGI" type="{http://ccissexpo.ws.dtt.it}MessaggiType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteventiResponseType", propOrder = {
    "eventi",
    "errori",
    "messaggi"
})
public class GeteventiResponseType {

    @XmlElement(name = "EVENTI")
    protected List<EventixmlType> eventi;
    @XmlElement(name = "ERRORI")
    protected ErroriType errori;
    @XmlElement(name = "MESSAGGI")
    protected MessaggiType messaggi;

    /**
     * Gets the value of the eventi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEVENTI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventixmlType }
     * 
     * 
     */
    public List<EventixmlType> getEVENTI() {
        if (eventi == null) {
            eventi = new ArrayList<EventixmlType>();
        }
        return this.eventi;
    }

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getERRORI() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setERRORI(ErroriType value) {
        this.errori = value;
    }

    /**
     * Recupera il valore della proprietà messaggi.
     * 
     * @return
     *     possible object is
     *     {@link MessaggiType }
     *     
     */
    public MessaggiType getMESSAGGI() {
        return messaggi;
    }

    /**
     * Imposta il valore della proprietà messaggi.
     * 
     * @param value
     *     allowed object is
     *     {@link MessaggiType }
     *     
     */
    public void setMESSAGGI(MessaggiType value) {
        this.messaggi = value;
    }

}
