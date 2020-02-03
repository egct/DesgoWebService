/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class UserService {

    public User login(java.lang.String user, java.lang.String pass){
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.login(user, pass);
    }

    public Boolean registrarUser(ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.registrarUser(user);
    }
    
}
