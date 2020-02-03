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
public class User {
    Integer ID_USUARIO;
    Integer ID_TIPOUSUARIO;
    Integer ID_PERSONA;
    String USUARIO_USUARIO;
    String CONTRASENIA_USUARIO;
    String EMPRESA_USUARIO;
    Persona persona;
    TipoUsuario tipoUsuario;
    Integer SALT_USUARIO;

    public User() {
    }

    public User(Integer ID_USUARIO, Integer ID_TIPOUSUARIO, Integer ID_PERSONA, String USUARIO_USUARIO, String CONTRASENIA_USUARIO, String EMPRESA_USUARIO, Persona persona, TipoUsuario tipoUsuario, Integer SALT_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
        this.ID_TIPOUSUARIO = ID_TIPOUSUARIO;
        this.ID_PERSONA = ID_PERSONA;
        this.USUARIO_USUARIO = USUARIO_USUARIO;
        this.CONTRASENIA_USUARIO = CONTRASENIA_USUARIO;
        this.EMPRESA_USUARIO = EMPRESA_USUARIO;
        this.persona = persona;
        this.tipoUsuario = tipoUsuario;
        this.SALT_USUARIO = SALT_USUARIO;
    }

    

    public Integer getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(Integer ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public Integer getID_TIPOUSUARIO() {
        return ID_TIPOUSUARIO;
    }

    public void setID_TIPOUSUARIO(Integer ID_TIPOUSUARIO) {
        this.ID_TIPOUSUARIO = ID_TIPOUSUARIO;
    }

    public Integer getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(Integer ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public String getUSUARIO_USUARIO() {
        return USUARIO_USUARIO;
    }

    public void setUSUARIO_USUARIO(String USUARIO_USUARIO) {
        this.USUARIO_USUARIO = USUARIO_USUARIO;
    }

    public String getCONTRASENIA_USUARIO() {
        return CONTRASENIA_USUARIO;
    }

    public void setCONTRASENIA_USUARIO(String CONTRASENIA_USUARIO) {
        this.CONTRASENIA_USUARIO = CONTRASENIA_USUARIO;
    }

    public String getEMPRESA_USUARIO() {
        return EMPRESA_USUARIO;
    }

    public void setEMPRESA_USUARIO(String EMPRESA_USUARIO) {
        this.EMPRESA_USUARIO = EMPRESA_USUARIO;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }   

    public Integer getSALT_USUARIO() {
        return SALT_USUARIO;
    }

    public void setSALT_USUARIO(Integer SALT_USUARIO) {
        this.SALT_USUARIO = SALT_USUARIO;
    }
    
    
}
