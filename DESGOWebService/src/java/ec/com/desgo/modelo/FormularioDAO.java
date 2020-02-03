/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author egct
 */
public class FormularioDAO implements CRUDFormulario{
    Conexion conexion;
    
    public FormularioDAO(){
        conexion = new Conexion();
    }
    

    @Override
    public boolean registrarFormulario(User us, Formulario form) {
        Boolean respuesta=false;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into empleado(dni,pass,apellidos,nombres,privilegio) values (?,?,?,?,?)");
//            ps.setString(1, dni);
//            ps.setString(2, pass);
//            ps.setString(3, apellidos);
//            ps.setString(4, nombres);
//            ps.setString(5, privilegio);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta=true;
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
    
}
