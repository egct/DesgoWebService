/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.Prueba;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class prueba01 {
   
        
    public static void main(String[] args) {    
        User u=new User();
        prueba01 p=new prueba01();
    
        u=p.login("egct", "egct");   
        System.out.println("datos>"+u.getUSUARIOUSUARIO()+">"+u.getEMPRESAUSUARIO()+">"+u.getCONTRASENIAUSUARIO()+" "+u.getTipoUsuario().getNIVELTIPOUSUARIO());
    }
    
    public User login(java.lang.String user, java.lang.String pass) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.login(user, pass);
    }
    
}
