//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.07.06 alle 02:57:45 PM CEST 
//


package it.dtt.ws.ccissexpo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dtt.ws.ccissexpo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RichiestaCcissExpo_QNAME = new QName("http://ccissexpo.ws.dtt.it", "richiestaCcissExpo");
    private final static QName _RispostaCcissExpo_QNAME = new QName("http://ccissexpo.ws.dtt.it", "rispostaCcissExpo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dtt.ws.ccissexpo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeteventiType }
     * 
     */
    public GeteventiType createGeteventiType() {
        return new GeteventiType();
    }

    /**
     * Create an instance of {@link GeteventiResponseType }
     * 
     */
    public GeteventiResponseType createGeteventiResponseType() {
        return new GeteventiResponseType();
    }

    /**
     * Create an instance of {@link MessaggiType }
     * 
     */
    public MessaggiType createMessaggiType() {
        return new MessaggiType();
    }

    /**
     * Create an instance of {@link MessaggioType }
     * 
     */
    public MessaggioType createMessaggioType() {
        return new MessaggioType();
    }

    /**
     * Create an instance of {@link ErroriType }
     * 
     */
    public ErroriType createErroriType() {
        return new ErroriType();
    }

    /**
     * Create an instance of {@link ErroreType }
     * 
     */
    public ErroreType createErroreType() {
        return new ErroreType();
    }

    /**
     * Create an instance of {@link EventixmlType }
     * 
     */
    public EventixmlType createEventixmlType() {
        return new EventixmlType();
    }

    /**
     * Create an instance of {@link NotiziaxmlType }
     * 
     */
    public NotiziaxmlType createNotiziaxmlType() {
        return new NotiziaxmlType();
    }

    /**
     * Create an instance of {@link LocalitaxmlType }
     * 
     */
    public LocalitaxmlType createLocalitaxmlType() {
        return new LocalitaxmlType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeteventiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccissexpo.ws.dtt.it", name = "richiestaCcissExpo")
    public JAXBElement<GeteventiType> createRichiestaCcissExpo(GeteventiType value) {
        return new JAXBElement<GeteventiType>(_RichiestaCcissExpo_QNAME, GeteventiType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeteventiResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccissexpo.ws.dtt.it", name = "rispostaCcissExpo")
    public JAXBElement<GeteventiResponseType> createRispostaCcissExpo(GeteventiResponseType value) {
        return new JAXBElement<GeteventiResponseType>(_RispostaCcissExpo_QNAME, GeteventiResponseType.class, null, value);
    }

}
