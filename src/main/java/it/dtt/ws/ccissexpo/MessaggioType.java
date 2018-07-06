//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.07.06 alle 02:57:45 PM CEST 
//


package it.dtt.ws.ccissexpo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MessaggioType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MessaggioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceMessaggio" type="{http://ccissexpo.ws.dtt.it}StringDue"/&gt;
 *         &lt;element name="descrizioneMessaggio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessaggioType", propOrder = {
    "codiceMessaggio",
    "descrizioneMessaggio"
})
public class MessaggioType {

    @XmlElement(required = true)
    protected String codiceMessaggio;
    @XmlElement(required = true)
    protected String descrizioneMessaggio;

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
     * Recupera il valore della proprietà descrizioneMessaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneMessaggio() {
        return descrizioneMessaggio;
    }

    /**
     * Imposta il valore della proprietà descrizioneMessaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneMessaggio(String value) {
        this.descrizioneMessaggio = value;
    }

}
