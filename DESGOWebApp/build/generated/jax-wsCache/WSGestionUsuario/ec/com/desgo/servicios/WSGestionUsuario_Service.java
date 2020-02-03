
package ec.com.desgo.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSGestionUsuario", targetNamespace = "http://servicios.desgo.com.ec/", wsdlLocation = "http://localhost:8080/DESGOWebService/WSGestionUsuario?wsdl")
public class WSGestionUsuario_Service
    extends Service
{

    private final static URL WSGESTIONUSUARIO_WSDL_LOCATION;
    private final static WebServiceException WSGESTIONUSUARIO_EXCEPTION;
    private final static QName WSGESTIONUSUARIO_QNAME = new QName("http://servicios.desgo.com.ec/", "WSGestionUsuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DESGOWebService/WSGestionUsuario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSGESTIONUSUARIO_WSDL_LOCATION = url;
        WSGESTIONUSUARIO_EXCEPTION = e;
    }

    public WSGestionUsuario_Service() {
        super(__getWsdlLocation(), WSGESTIONUSUARIO_QNAME);
    }

    public WSGestionUsuario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSGESTIONUSUARIO_QNAME, features);
    }

    public WSGestionUsuario_Service(URL wsdlLocation) {
        super(wsdlLocation, WSGESTIONUSUARIO_QNAME);
    }

    public WSGestionUsuario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSGESTIONUSUARIO_QNAME, features);
    }

    public WSGestionUsuario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSGestionUsuario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSGestionUsuario
     */
    @WebEndpoint(name = "WSGestionUsuarioPort")
    public WSGestionUsuario getWSGestionUsuarioPort() {
        return super.getPort(new QName("http://servicios.desgo.com.ec/", "WSGestionUsuarioPort"), WSGestionUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSGestionUsuario
     */
    @WebEndpoint(name = "WSGestionUsuarioPort")
    public WSGestionUsuario getWSGestionUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios.desgo.com.ec/", "WSGestionUsuarioPort"), WSGestionUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSGESTIONUSUARIO_EXCEPTION!= null) {
            throw WSGESTIONUSUARIO_EXCEPTION;
        }
        return WSGESTIONUSUARIO_WSDL_LOCATION;
    }

}
