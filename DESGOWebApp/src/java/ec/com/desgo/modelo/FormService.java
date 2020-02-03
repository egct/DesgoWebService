/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

/**
 *
 * @author egct
 */
public class FormService {

    public Boolean registrarFormulario(ec.com.desgo.servicios.Formulario form, ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.registrarFormulario(form, user);
    }
    
}
