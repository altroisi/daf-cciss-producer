//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.09.25 alle 05:56:37 PM CEST 
//


package it.dtt.e015;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dtt.e015 package. 
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

    private final static QName _EVENTI_QNAME = new QName("http://e015.dtt.it/", "EVENTI");
    private final static QName _LOCALITA_QNAME = new QName("http://e015.dtt.it/", "LOCALITA");
    private final static QName _NOTIZIA_QNAME = new QName("http://e015.dtt.it/", "NOTIZIA");
    private final static QName _Geteventi_QNAME = new QName("http://e015.dtt.it/", "geteventi");
    private final static QName _GeteventiResponse_QNAME = new QName("http://e015.dtt.it/", "geteventiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dtt.e015
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventixmlType }
     * 
     */
    public EventixmlType createEventixmlType() {
        return new EventixmlType();
    }

    /**
     * Create an instance of {@link LocalitaxmlType }
     * 
     */
    public LocalitaxmlType createLocalitaxmlType() {
        return new LocalitaxmlType();
    }

    /**
     * Create an instance of {@link NotiziaxmlType }
     * 
     */
    public NotiziaxmlType createNotiziaxmlType() {
        return new NotiziaxmlType();
    }

    /**
     * Create an instance of {@link Geteventi }
     * 
     */
    public Geteventi createGeteventi() {
        return new Geteventi();
    }

    /**
     * Create an instance of {@link GeteventiResponse }
     * 
     */
    public GeteventiResponse createGeteventiResponse() {
        return new GeteventiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventixmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e015.dtt.it/", name = "EVENTI")
    public JAXBElement<EventixmlType> createEVENTI(EventixmlType value) {
        return new JAXBElement<EventixmlType>(_EVENTI_QNAME, EventixmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalitaxmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e015.dtt.it/", name = "LOCALITA")
    public JAXBElement<LocalitaxmlType> createLOCALITA(LocalitaxmlType value) {
        return new JAXBElement<LocalitaxmlType>(_LOCALITA_QNAME, LocalitaxmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotiziaxmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e015.dtt.it/", name = "NOTIZIA")
    public JAXBElement<NotiziaxmlType> createNOTIZIA(NotiziaxmlType value) {
        return new JAXBElement<NotiziaxmlType>(_NOTIZIA_QNAME, NotiziaxmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geteventi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e015.dtt.it/", name = "geteventi")
    public JAXBElement<Geteventi> createGeteventi(Geteventi value) {
        return new JAXBElement<Geteventi>(_Geteventi_QNAME, Geteventi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeteventiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e015.dtt.it/", name = "geteventiResponse")
    public JAXBElement<GeteventiResponse> createGeteventiResponse(GeteventiResponse value) {
        return new JAXBElement<GeteventiResponse>(_GeteventiResponse_QNAME, GeteventiResponse.class, null, value);
    }

}
