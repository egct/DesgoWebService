/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.controlador.Seguridad;
import ec.com.desgo.modelo.*;
import ec.com.desgo.servicios.WSGestionUsuario;
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
        WSGestionUsuario ws=new WSGestionUsuario();
        
        p.setPNOMBRE_PERSONA("Carlota");
        p.setSNOMBRE_PERSONA("Alexandra");
        p.setPAPELLIDO_PERSONA("C");
        p.setSAPELLIDO_PERSONA("A");
        p.setTELEFONO_PERSONA("022385593");
        p.setCORREO_PERSONA("ca@outlook.es");
        p.setCARGO_PERSONA("root");
        p.setPROFESION_PERSONA("Desarrollador");
        p.setCEDULA_PERSONA("1723953057");
        p.setFOTO_PERSONA("http://lacarpa.com.mx/wp-content/uploads/2019/06/whats-appfoto-perfil.png");
        us.setPersona(p);
        us.setUSUARIO_USUARIO("ca");
        int salt=Seguridad.randomico();
        us.setCONTRASENIA_USUARIO(Seguridad.sha256(salt+"ca"));
        us.setEMPRESA_USUARIO("DESGO");
        us.setSALT_USUARIO(salt);
        tipouser.setNIVEL_TIPOUSUARIO("Administrador");
        us.setTipoUsuario(tipouser);
        System.out.println(">>"+ws.registrarUser(us));
        
    }

    
}
