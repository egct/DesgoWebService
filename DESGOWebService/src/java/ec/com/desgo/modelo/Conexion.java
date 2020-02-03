/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.desgo.modelo;
import java.sql.*;

public class Conexion {
    public Conexion() {
    }

    public Connection getConexion(){
        Connection con=null;
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /* Obtener la conexion */
	    con = DriverManager.getConnection("jdbc:mysql://node51940-env-9874055.jl.serv.net.mx/:3306/desgodb","root","T8TpvMhSGY");
        }catch(SQLException ex){
        }catch(Exception e){   
        }
        return con;
    } 
}

