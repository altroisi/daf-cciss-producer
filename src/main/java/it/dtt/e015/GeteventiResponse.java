//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.09.25 alle 05:56:37 PM CEST 
//


package it.dtt.e015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per geteventiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="geteventiResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EVENTI" type="{http://e015.dtt.it/}eventixmlType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geteventiResponse", propOrder = {
    "eventi"
})
public class GeteventiResponse {

    @XmlElement(name = "EVENTI")
    protected EventixmlType eventi;

    /**
     * Recupera il valore della proprietà eventi.
     * 
     * @return
     *     possible object is
     *     {@link EventixmlType }
     *     
     */
    public EventixmlType getEVENTI() {
        return eventi;
    }

    /**
     * Imposta il valore della proprietà eventi.
     * 
     * @param value
     *     allowed object is
     *     {@link EventixmlType }
     *     
     */
    public void setEVENTI(EventixmlType value) {
        this.eventi = value;
    }

}
