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
public interface CRUDUser {
    public String tipoUsuario(String user, String pass);
    public User login(String user, String pass);
    public boolean registrarUser(User us);
}
