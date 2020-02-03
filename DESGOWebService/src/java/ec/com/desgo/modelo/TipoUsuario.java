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
public class TipoUsuario {
    Integer ID_TIPOUSUARIO;
    String NIVEL_TIPOUSUARIO;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer ID_TIPOUSUARIO, String NIVEL_TIPOUSUARIO) {
        this.ID_TIPOUSUARIO = ID_TIPOUSUARIO;
        this.NIVEL_TIPOUSUARIO = NIVEL_TIPOUSUARIO;
    }

    public Integer getID_TIPOUSUARIO() {
        return ID_TIPOUSUARIO;
    }

    public void setID_TIPOUSUARIO(Integer ID_TIPOUSUARIO) {
        this.ID_TIPOUSUARIO = ID_TIPOUSUARIO;
    }

    public String getNIVEL_TIPOUSUARIO() {
        return NIVEL_TIPOUSUARIO;
    }

    public void setNIVEL_TIPOUSUARIO(String NIVEL_TIPOUSUARIO) {
        this.NIVEL_TIPOUSUARIO = NIVEL_TIPOUSUARIO;
    }
    
    

}
