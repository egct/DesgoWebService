/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.controlador.Seguridad;
import ec.com.desgo.servicios.Persona;
import ec.com.desgo.servicios.TipoUsuario;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class prueba03 {
    public static void main(String[] args) {
        User us=new User();
        Persona p=new Persona();
        TipoUsuario tipouser=new TipoUsuario();
        prueba03 prueba=new prueba03();
        p.setPNOMBREPERSONA("M");
        p.setSNOMBREPERSONA("M");
        p.setPAPELLIDOPERSONA("Cab");
        p.setSAPELLIDOPERSONA("Ari");
        p.setTELEFONOPERSONA("022385593");
        p.setCORREOPERSONA("M@outlook.es");
        p.setCARGOPERSONA("root");
        p.setPROFESIONPERSONA("Desarrollador");
        p.setCEDULAPERSONA("1723953058");
        p.setFOTOPERSONA("http://lacarpa.com.mx/wp-content/uploads/2019/06/whats-appfoto-perfil.png");
        us.setPersona(p);
        us.setUSUARIOUSUARIO("cab");
        int salt=Seguridad.randomico();
        us.setCONTRASENIAUSUARIO(Seguridad.sha256(salt+"ca"));
        us.setEMPRESAUSUARIO("DESGO");
        us.setSALTUSUARIO(salt);        
        tipouser.setNIVELTIPOUSUARIO("Administrador");
        us.setTipoUsuario(tipouser);
        System.out.println(">>"+prueba.registrarUser(us));
        
    }

    public Boolean registrarUser(ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.registrarUser(user);
    }
    
}
