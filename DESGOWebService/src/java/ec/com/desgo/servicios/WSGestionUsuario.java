/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.servicios;

import ec.com.desgo.controlador.Login;
import ec.com.desgo.controlador.Seguridad;
import ec.com.desgo.modelo.Empleado;
import ec.com.desgo.modelo.EmpleadoDAO;
import ec.com.desgo.modelo.Formulario;
import ec.com.desgo.modelo.LoginDAO;
import ec.com.desgo.modelo.User;
import ec.com.desgo.modelo.UserDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author egct
 */
@WebService(serviceName = "WSGestionUsuario")
public class WSGestionUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Validar")
    public Empleado Validar(@WebParam(name = "dni") String dni, @WebParam(name = "pass") String pass, @WebParam(name = "privilegio") String privilegio) {
        EmpleadoDAO emp = new EmpleadoDAO();
        Empleado empleado = emp.verificaUsuario(dni, pass, privilegio);
        return empleado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registrar")
    public String Registrar(@WebParam(name = "dni") String dni, @WebParam(name = "pass") String pass, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "nombres") String nombres, @WebParam(name = "privilegio") String privilegio) {
        EmpleadoDAO emp = new EmpleadoDAO();
        String respuesta = emp.registraUsuario(dni, pass, apellidos, nombres, privilegio);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public User login(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass) {
        
        LoginDAO loginDAO=new LoginDAO();
        
        int salt=loginDAO.salt(user);
        System.out.println("salt>"+salt);
        String hash=Seguridad.sha256(salt+pass);
        System.out.println("hash>"+hash);
        Login valid = loginDAO.validate(user, hash);
        System.out.println("user>"+valid.getUser()+"pass>"+valid.getPwd());        
        UserDAO us = new UserDAO();
        User usuario = us.login(valid.getUser(), valid.getPwd());
        return usuario;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarUser")
    public Boolean registrarUser(@WebParam(name = "user") User user) {
        UserDAO us = new UserDAO();
        
        return us.registrarUser(user);       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarFormulario")
    public Boolean registrarFormulario(@WebParam(name = "form") Formulario form, @WebParam(name = "user") User user) {
        //TODO write your implementation code here:
        return true;
    }



}
