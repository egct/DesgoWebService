/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import java.util.List;
import ec.com.desgo.modelo.UserService;
import ec.com.desgo.controlador.Servlet;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class Prueba {

    public static void main(String[] args) {
        UserService customer = new UserService();
        User o=new User();
        System.out.println("uno> "+o.getIDUSUARIO()+"--"+o.getUSUARIOUSUARIO()+"--"+o.getCONTRASENIAUSUARIO()+"--"+o.getEMPRESAUSUARIO());
        
        try{
            o=customer.login("egct1","egct");
            System.out.println("aqui> "+o.getIDUSUARIO()+"--"+o.getUSUARIOUSUARIO()+"--"+o.getCONTRASENIAUSUARIO()+"--"+o.getEMPRESAUSUARIO());
            
        }catch(Exception e){
            System.out.println("null"+o.getIDUSUARIO());
            System.out.println("e"+e);
        }
    }
}
