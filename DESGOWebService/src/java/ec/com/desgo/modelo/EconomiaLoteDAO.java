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
public class EconomiaLoteDAO implements CRUDGenerico{
    
    Conexion conexion;

    public EconomiaLoteDAO() {
        conexion= new Conexion();
    }
    
    @Override
    public Boolean add(Object o) {
        boolean respuesta=false;
        EconomiaLote economiaLote=new EconomiaLote();
        economiaLote=(EconomiaLote)o;
        
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into economialote(ID_ELOTE,AVALUOTIERRA_ELOTE,AVALUOCON_ELOTE,AVALUOTOTAL_ELOTE) values (null,?,?,?)");   
            ps.setFloat(1, economiaLote.getAVALUOTIERRA_ELOTE());
            ps.setFloat(2, economiaLote.getAVALUOCON_ELOTE());
            ps.setFloat(3, economiaLote.getAVALUOTOTAL_ELOTE());
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta=true;
            }
        } catch (Exception e) {
        }

        return respuesta;
    }
    
}
