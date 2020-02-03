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
public class Persona {
    Integer ID_PERSONA;
    String PNOMBRE_PERSONA;
    String SNOMBRE_PERSONA;
    String PAPELLIDO_PERSONA;
    String SAPELLIDO_PERSONA;
    String TELEFONO_PERSONA;
    String CORREO_PERSONA;
    String CARGO_PERSONA;
    String PROFESION_PERSONA;
    String CEDULA_PERSONA;
    String FOTO_PERSONA;

    public Persona() {
    }

    public Persona(Integer ID_PERSONA, String PNOMBRE_PERSONA, String SNOMBRE_PERSONA, String PAPELLIDO_PERSONA, String SAPELLIDO_PERSONA, String TELEFONO_PERSONA, String CORREO_PERSONA, String CARGO_PERSONA, String PROFESION_PERSONA,String CEDULA_PERSONA,String FOTO_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
        this.PNOMBRE_PERSONA = PNOMBRE_PERSONA;
        this.SNOMBRE_PERSONA = SNOMBRE_PERSONA;
        this.PAPELLIDO_PERSONA = PAPELLIDO_PERSONA;
        this.SAPELLIDO_PERSONA = SAPELLIDO_PERSONA;
        this.TELEFONO_PERSONA = TELEFONO_PERSONA;
        this.CORREO_PERSONA = CORREO_PERSONA;
        this.CARGO_PERSONA = CARGO_PERSONA;
        this.PROFESION_PERSONA = PROFESION_PERSONA;
        this.CEDULA_PERSONA = CEDULA_PERSONA;
        this.FOTO_PERSONA = FOTO_PERSONA;
    }

    public Integer getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(Integer ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public String getPNOMBRE_PERSONA() {
        return PNOMBRE_PERSONA;
    }

    public void setPNOMBRE_PERSONA(String PNOMBRE_PERSONA) {
        this.PNOMBRE_PERSONA = PNOMBRE_PERSONA;
    }

    public String getSNOMBRE_PERSONA() {
        return SNOMBRE_PERSONA;
    }

    public void setSNOMBRE_PERSONA(String SNOMBRE_PERSONA) {
        this.SNOMBRE_PERSONA = SNOMBRE_PERSONA;
    }

    public String getPAPELLIDO_PERSONA() {
        return PAPELLIDO_PERSONA;
    }

    public void setPAPELLIDO_PERSONA(String PAPELLIDO_PERSONA) {
        this.PAPELLIDO_PERSONA = PAPELLIDO_PERSONA;
    }

    public String getSAPELLIDO_PERSONA() {
        return SAPELLIDO_PERSONA;
    }

    public void setSAPELLIDO_PERSONA(String SAPELLIDO_PERSONA) {
        this.SAPELLIDO_PERSONA = SAPELLIDO_PERSONA;
    }

    public String getTELEFONO_PERSONA() {
        return TELEFONO_PERSONA;
    }

    public void setTELEFONO_PERSONA(String TELEFONO_PERSONA) {
        this.TELEFONO_PERSONA = TELEFONO_PERSONA;
    }

    public String getCORREO_PERSONA() {
        return CORREO_PERSONA;
    }

    public void setCORREO_PERSONA(String CORREO_PERSONA) {
        this.CORREO_PERSONA = CORREO_PERSONA;
    }

    public String getCARGO_PERSONA() {
        return CARGO_PERSONA;
    }

    public void setCARGO_PERSONA(String CARGO_PERSONA) {
        this.CARGO_PERSONA = CARGO_PERSONA;
    }

    public String getPROFESION_PERSONA() {
        return PROFESION_PERSONA;
    }

    public void setPROFESION_PERSONA(String PROFESION_PERSONA) {
        this.PROFESION_PERSONA = PROFESION_PERSONA;
    }

    public String getCEDULA_PERSONA() {
        return CEDULA_PERSONA;
    }

    public void setCEDULA_PERSONA(String CEDULA_PERSONA) {
        this.CEDULA_PERSONA = CEDULA_PERSONA;
    }
    
    public String getFOTO_PERSONA() {
        return FOTO_PERSONA;
    }

    public void setFOTO_PERSONA(String FOTO_PERSONA) {
        this.FOTO_PERSONA = FOTO_PERSONA;
    }
    
    

}
