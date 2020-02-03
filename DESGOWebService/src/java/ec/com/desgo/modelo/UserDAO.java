/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author egct
 */
public class UserDAO implements CRUDUser{
    Conexion conexion;
    
    public UserDAO(){
        conexion = new Conexion();
    }
    
    @Override
    public User login(String user, String pass) {
        User usuario=null;
        Persona persona=null;
        TipoUsuario tipoUsuario=null;
        String tipoU= tipoUsuario(user,pass);
        System.out.println("tipo usuario>"+tipoU);
        Connection accesoDB = conexion.getConexion();
        
        try {
            PreparedStatement ps = accesoDB.prepareStatement("SELECT DISTINCT * FROM `usuario`,`persona`,`tipousuario` WHERE `USUARIO_USUARIO` = ? AND `CONTRASENIA_USUARIO`=? AND `tipousuario`.`NIVEL_TIPOUSUARIO`=? and `persona`.`ID_PERSONA`=`usuario`.`ID_PERSONA`;");
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, tipoU);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               usuario = new User();
               persona = new Persona();
               tipoUsuario = new TipoUsuario();
               usuario.setID_USUARIO(rs.getInt(1));
               usuario.setID_TIPOUSUARIO(rs.getInt(2));
               usuario.setID_PERSONA(rs.getInt(3));
               usuario.setUSUARIO_USUARIO(rs.getString(4));
               usuario.setCONTRASENIA_USUARIO(rs.getString(5));
               usuario.setEMPRESA_USUARIO(rs.getString(6));
               usuario.setSALT_USUARIO(rs.getInt(7));//*****
               persona.setID_PERSONA(rs.getInt(8));
               persona.setPNOMBRE_PERSONA(rs.getString(9));
               persona.setSNOMBRE_PERSONA(rs.getString(10));
               persona.setPAPELLIDO_PERSONA(rs.getString(11));
               persona.setSAPELLIDO_PERSONA(rs.getString(12));
               persona.setTELEFONO_PERSONA(rs.getString(13));
               persona.setCORREO_PERSONA(rs.getString(14));
               persona.setCARGO_PERSONA(rs.getString(15));
               persona.setPROFESION_PERSONA(rs.getString(16));
               persona.setCEDULA_PERSONA(rs.getString(17));
               persona.setFOTO_PERSONA(rs.getString(18));
               usuario.setPersona(persona);
               tipoUsuario.setID_TIPOUSUARIO(rs.getInt(19));
               tipoUsuario.setNIVEL_TIPOUSUARIO(rs.getString(20));
               usuario.setTipoUsuario(tipoUsuario);
               return usuario;
            }
        } catch (Exception e) {
        }
        return usuario;
  
    }

    @Override
    public boolean registrarUser(User us) {
        boolean respuesta=false;
        TipoUsuario tp=new TipoUsuario();
                
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into persona(ID_PERSONA,PNOMBRE_PERSONA,"+
                                                             "SNOMBRE_PERSONA,PAPELLIDO_PERSONA,SAPELLIDO_PERSONA,"+
                                                             "TELEFONO_PERSONA,CORREO_PERSONA,CARGO_PERSONA,PROFESION_PERSONA,CEDULA_PERSONA,FOTO_PERSONA"+
                                                             ") values (null,?,?,?,?,?,?,?,?,?,?)");   
            ps.setString(1, us.getPersona().getPNOMBRE_PERSONA());
            ps.setString(2, us.getPersona().getSNOMBRE_PERSONA());
            ps.setString(3, us.getPersona().getPAPELLIDO_PERSONA());
            ps.setString(4, us.getPersona().getSAPELLIDO_PERSONA());
            ps.setString(5, us.getPersona().getTELEFONO_PERSONA());
            ps.setString(6, us.getPersona().getCORREO_PERSONA());
            ps.setString(7, us.getPersona().getCARGO_PERSONA());
            ps.setString(8, us.getPersona().getPROFESION_PERSONA());
            ps.setString(9, us.getPersona().getCEDULA_PERSONA());
            ps.setString(10, us.getPersona().getFOTO_PERSONA());
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                int idpersona=buscarIdPersona(us.getPersona().getCORREO_PERSONA());    
                System.out.println("US-idtipopersona>"+us.getTipoUsuario().getID_TIPOUSUARIO());
                System.out.println("US-tipo>"+us.getTipoUsuario().getNIVEL_TIPOUSUARIO());

                tp.setNIVEL_TIPOUSUARIO(us.getTipoUsuario().getNIVEL_TIPOUSUARIO());
                tp.setID_TIPOUSUARIO(tipoUsuario(tp.getNIVEL_TIPOUSUARIO()));
                System.out.println("tp-idtipopersona>"+tp.getID_TIPOUSUARIO());
                System.out.println("tp-tipo>"+tp.getNIVEL_TIPOUSUARIO());

                us.setTipoUsuario(tp);
                System.out.println("idpersona>"+idpersona);
                System.out.println("final-idtipopersona>"+us.getTipoUsuario().getID_TIPOUSUARIO());
                System.out.println("final-tipo>"+us.getTipoUsuario().getNIVEL_TIPOUSUARIO());

                int aux=registrarUsuario(us,idpersona);
                
                if(aux>0){
                    respuesta=true;
                }
            }
        } catch (Exception e) {
        }

        return respuesta;
   }
   public int registrarUsuario(User us,int idpersona) {
        int respuesta=-1;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("INSERT INTO `usuario`(`ID_USUARIO`, `ID_TIPOUSUARIO`, `ID_PERSONA`, `USUARIO_USUARIO`, `CONTRASENIA_USUARIO`, `EMPRESA_USUARIO`,`SALT_USUARIO`) VALUES (null,?,?,?,?,?,?)");
            ps.setInt(1, us.getTipoUsuario().getID_TIPOUSUARIO());
            ps.setInt(2, idpersona);
            ps.setString(3, us.getUSUARIO_USUARIO());
            ps.setString(4, us.getCONTRASENIA_USUARIO());
            ps.setString(5, us.getEMPRESA_USUARIO());
            ps.setInt(6, us.getSALT_USUARIO());
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta=rs;
            }
        } catch (Exception e) {
        }

        return respuesta;
   }
   
    public int buscarIdPersona(String correo) {
        int idpersona=-1;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("SELECT ID_PERSONA FROM persona WHERE CORREO_PERSONA = ?");
            ps.setString(1, correo);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               idpersona=rs.getInt(1);
               return idpersona;
            }
        } catch (Exception e) {
        }
        return idpersona;
    }
    
    @Override
    public String tipoUsuario(String user, String pass) {
        TipoUsuario tipoU=null;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("SELECT `tipousuario`.`NIVEL_TIPOUSUARIO` FROM `usuario`,`tipousuario`WHERE `USUARIO_USUARIO` = ? AND `CONTRASENIA_USUARIO`=? AND `tipousuario`.`ID_TIPOUSUARIO`=`usuario`.`ID_TIPOUSUARIO`");
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               tipoU = new TipoUsuario();
               tipoU.setNIVEL_TIPOUSUARIO(rs.getString(1));
               return tipoU.getNIVEL_TIPOUSUARIO();
            }
        } catch (Exception e) {
        }
        return tipoU.getNIVEL_TIPOUSUARIO();
    }
    
    public int tipoUsuario(String tipoUsuario) {
        int tipou=-1;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("SELECT `ID_TIPOUSUARIO` FROM `tipousuario`WHERE `NIVEL_TIPOUSUARIO`=?");
            ps.setString(1, tipoUsuario);
 
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               tipou=rs.getInt(1);
               return tipou;
            }
        } catch (Exception e) {
        }
        return tipou;
    }
    
}
