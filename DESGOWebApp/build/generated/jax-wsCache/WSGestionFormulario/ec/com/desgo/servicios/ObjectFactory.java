
package ec.com.desgo.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.desgo.servicios package. 
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

    private final static QName _AddEconomia_QNAME = new QName("http://servicios.desgo.com.ec/", "addEconomia");
    private final static QName _AddEconomiaResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "addEconomiaResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios.desgo.com.ec/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "helloResponse");
    private final static QName _TesterAcabados_QNAME = new QName("http://servicios.desgo.com.ec/", "testerAcabados");
    private final static QName _TesterAcabadosResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "testerAcabadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.desgo.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEconomia }
     * 
     */
    public AddEconomia createAddEconomia() {
        return new AddEconomia();
    }

    /**
     * Create an instance of {@link AddEconomiaResponse }
     * 
     */
    public AddEconomiaResponse createAddEconomiaResponse() {
        return new AddEconomiaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TesterAcabados }
     * 
     */
    public TesterAcabados createTesterAcabados() {
        return new TesterAcabados();
    }

    /**
     * Create an instance of {@link TesterAcabadosResponse }
     * 
     */
    public TesterAcabadosResponse createTesterAcabadosResponse() {
        return new TesterAcabadosResponse();
    }

    /**
     * Create an instance of {@link EconomiaLote }
     * 
     */
    public EconomiaLote createEconomiaLote() {
        return new EconomiaLote();
    }

    /**
     * Create an instance of {@link AcabadosEC }
     * 
     */
    public AcabadosEC createAcabadosEC() {
        return new AcabadosEC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEconomia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "addEconomia")
    public JAXBElement<AddEconomia> createAddEconomia(AddEconomia value) {
        return new JAXBElement<AddEconomia>(_AddEconomia_QNAME, AddEconomia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEconomiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "addEconomiaResponse")
    public JAXBElement<AddEconomiaResponse> createAddEconomiaResponse(AddEconomiaResponse value) {
        return new JAXBElement<AddEconomiaResponse>(_AddEconomiaResponse_QNAME, AddEconomiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TesterAcabados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "testerAcabados")
    public JAXBElement<TesterAcabados> createTesterAcabados(TesterAcabados value) {
        return new JAXBElement<TesterAcabados>(_TesterAcabados_QNAME, TesterAcabados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TesterAcabadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "testerAcabadosResponse")
    public JAXBElement<TesterAcabadosResponse> createTesterAcabadosResponse(TesterAcabadosResponse value) {
        return new JAXBElement<TesterAcabadosResponse>(_TesterAcabadosResponse_QNAME, TesterAcabadosResponse.class, null, value);
    }

}
