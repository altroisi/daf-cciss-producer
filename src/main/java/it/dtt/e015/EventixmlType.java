//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.09.25 alle 05:56:37 PM CEST 
//


package it.dtt.e015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per eventixmlType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="eventixmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NOTIZIA" type="{http://e015.dtt.it/}notiziaxmlType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CodiceMessaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventixmlType", propOrder = {
    "notizia",
    "codiceMessaggio",
    "descrizione"
})
public class EventixmlType {

    @XmlElement(name = "NOTIZIA")
    protected List<NotiziaxmlType> notizia;
    @XmlElement(name = "CodiceMessaggio")
    protected String codiceMessaggio;
    @XmlElement(name = "Descrizione")
    protected String descrizione;

    /**
     * Gets the value of the notizia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notizia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOTIZIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotiziaxmlType }
     * 
     * 
     */
    public List<NotiziaxmlType> getNOTIZIA() {
        if (notizia == null) {
            notizia = new ArrayList<NotiziaxmlType>();
        }
        return this.notizia;
    }

    /**
     * Recupera il valore della proprietà codiceMessaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceMessaggio() {
        return codiceMessaggio;
    }

    /**
     * Imposta il valore della proprietà codiceMessaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceMessaggio(String value) {
        this.codiceMessaggio = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

}
