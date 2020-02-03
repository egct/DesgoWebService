/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ec.com.desgo.modelo.*;
import ec.com.desgo.controlador.*;

/**
 *
 * @author egct
 */
public class LoginDAO {
    Conexion conexion=new Conexion();;
    public Login validate(String user, String password) {
		Connection con = null;
		PreparedStatement ps = null;
                Login login=null;
		try {
			con = conexion.getConexion();
			ps = con.prepareStatement("SELECT `ID_USUARIO`,`USUARIO_USUARIO`,`CONTRASENIA_USUARIO` FROM `usuario` WHERE `USUARIO_USUARIO`=? AND `CONTRASENIA_USUARIO`=?");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
                            login=new Login();
				//result found, means valid inputs
                                login.setId(rs.getInt(1));
                                login.setUser(rs.getString(2));
                                login.setPwd(rs.getString(3));
                                return login;
				
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return login;
		} finally {
			
		}
		return  login;
	}
    public int salt(String user) {
		Connection con = null;
		PreparedStatement ps = null;
                try {
			con =  conexion.getConexion();
			ps = con.prepareStatement("SELECT `SALT_USUARIO` FROM `usuario` WHERE `USUARIO_USUARIO`=?");
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
                     	//result found, means valid inputs
                                return rs.getInt(1);
				
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return -1;
		} finally {
			
		}
		return  -1;
	}
}
