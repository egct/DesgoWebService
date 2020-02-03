/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author egct
 */
@Path("wsgestionusuarioport")
public class WSGestionUsuarioPort {

    private ec.com.desgo.servicios_client.WSGestionUsuario port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WSGestionUsuarioPort
     */
    public WSGestionUsuarioPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method login
     * @param user resource URI parameter
     * @param pass resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ec.com.desgo.servicios_client.User>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("login/")
    public JAXBElement<ec.com.desgo.servicios_client.User> getLogin(@QueryParam("user") String user, @QueryParam("pass") String pass) {
        try {
            // Call Web Service Operation
            if (port != null) {
                ec.com.desgo.servicios_client.User result = port.login(user, pass);
                return new JAXBElement<ec.com.desgo.servicios_client.User>(new QName("http//servicios_client.desgo.com.ec/", "user"), ec.com.desgo.servicios_client.User.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method registrarFormulario
     * @param form resource URI parameter
     * @param user resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<java.lang.Boolean>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("registrarformulario/")
    public JAXBElement<Boolean> postRegistrarFormulario(JAXBElement<ec.com.desgo.servicios_client.Formulario> form, JAXBElement<ec.com.desgo.servicios_client.User> user) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.Boolean result = port.registrarFormulario(form.getValue(), user.getValue());
                return new JAXBElement<java.lang.Boolean>(new QName("http//lang.java/", "boolean"), java.lang.Boolean.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method Validar
     * @param dni resource URI parameter
     * @param pass resource URI parameter
     * @param privilegio resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ec.com.desgo.servicios_client.Empleado>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("validar/")
    public JAXBElement<ec.com.desgo.servicios_client.Empleado> getValidar(@QueryParam("dni") String dni, @QueryParam("pass") String pass, @QueryParam("privilegio") String privilegio) {
        try {
            // Call Web Service Operation
            if (port != null) {
                ec.com.desgo.servicios_client.Empleado result = port.validar(dni, pass, privilegio);
                return new JAXBElement<ec.com.desgo.servicios_client.Empleado>(new QName("http//servicios_client.desgo.com.ec/", "empleado"), ec.com.desgo.servicios_client.Empleado.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method Registrar
     * @param dni resource URI parameter
     * @param pass resource URI parameter
     * @param apellidos resource URI parameter
     * @param nombres resource URI parameter
     * @param privilegio resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("registrar/")
    public String getRegistrar(@QueryParam("dni") String dni, @QueryParam("pass") String pass, @QueryParam("apellidos") String apellidos, @QueryParam("nombres") String nombres, @QueryParam("privilegio") String privilegio) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.registrar(dni, pass, apellidos, nombres, privilegio);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method registrarUser
     * @param user resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<java.lang.Boolean>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("registraruser/")
    public JAXBElement<Boolean> postRegistrarUser(JAXBElement<ec.com.desgo.servicios_client.User> user) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.Boolean result = port.registrarUser(user.getValue());
                return new JAXBElement<java.lang.Boolean>(new QName("http//lang.java/", "boolean"), java.lang.Boolean.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private ec.com.desgo.servicios_client.WSGestionUsuario getPort() {
        try {
            // Call Web Service Operation
            ec.com.desgo.servicios_client.WSGestionUsuario_Service service = new ec.com.desgo.servicios_client.WSGestionUsuario_Service();
            ec.com.desgo.servicios_client.WSGestionUsuario p = service.getWSGestionUsuarioPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
