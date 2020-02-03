/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import java.util.Date;

/**
 *
 * @author egct
 */
public class Coopropietarios_ILLote {
    Integer ID_COP_ILLOTE;
    String NAPELLIDOS_COP_ILLOTE;
    String NDIDENTIFICACION_COP_ILLOTE;
    float PORCENTAJE_COP_ILLOTE;
    String ALICUOTA_COP_ILLOTE;
    Date FESCRITURA_COP_ILLOTE;
    Date FINSCRIPCION_COP_ILLOTE;

    public Coopropietarios_ILLote() {
    }

    public Coopropietarios_ILLote(Integer ID_COP_ILLOTE, String NAPELLIDOS_COP_ILLOTE, String NDIDENTIFICACION_COP_ILLOTE, float PORCENTAJE_COP_ILLOTE, String ALICUOTA_COP_ILLOTE, Date FESCRITURA_COP_ILLOTE, Date FINSCRIPCION_COP_ILLOTE) {
        this.ID_COP_ILLOTE = ID_COP_ILLOTE;
        this.NAPELLIDOS_COP_ILLOTE = NAPELLIDOS_COP_ILLOTE;
        this.NDIDENTIFICACION_COP_ILLOTE = NDIDENTIFICACION_COP_ILLOTE;
        this.PORCENTAJE_COP_ILLOTE = PORCENTAJE_COP_ILLOTE;
        this.ALICUOTA_COP_ILLOTE = ALICUOTA_COP_ILLOTE;
        this.FESCRITURA_COP_ILLOTE = FESCRITURA_COP_ILLOTE;
        this.FINSCRIPCION_COP_ILLOTE = FINSCRIPCION_COP_ILLOTE;
    }

    public Integer getID_COP_ILLOTE() {
        return ID_COP_ILLOTE;
    }

    public void setID_COP_ILLOTE(Integer ID_COP_ILLOTE) {
        this.ID_COP_ILLOTE = ID_COP_ILLOTE;
    }

    public String getNAPELLIDOS_COP_ILLOTE() {
        return NAPELLIDOS_COP_ILLOTE;
    }

    public void setNAPELLIDOS_COP_ILLOTE(String NAPELLIDOS_COP_ILLOTE) {
        this.NAPELLIDOS_COP_ILLOTE = NAPELLIDOS_COP_ILLOTE;
    }

    public String getNDIDENTIFICACION_COP_ILLOTE() {
        return NDIDENTIFICACION_COP_ILLOTE;
    }

    public void setNDIDENTIFICACION_COP_ILLOTE(String NDIDENTIFICACION_COP_ILLOTE) {
        this.NDIDENTIFICACION_COP_ILLOTE = NDIDENTIFICACION_COP_ILLOTE;
    }

    public float getPORCENTAJE_COP_ILLOTE() {
        return PORCENTAJE_COP_ILLOTE;
    }

    public void setPORCENTAJE_COP_ILLOTE(float PORCENTAJE_COP_ILLOTE) {
        this.PORCENTAJE_COP_ILLOTE = PORCENTAJE_COP_ILLOTE;
    }

    public String getALICUOTA_COP_ILLOTE() {
        return ALICUOTA_COP_ILLOTE;
    }

    public void setALICUOTA_COP_ILLOTE(String ALICUOTA_COP_ILLOTE) {
        this.ALICUOTA_COP_ILLOTE = ALICUOTA_COP_ILLOTE;
    }

    public Date getFESCRITURA_COP_ILLOTE() {
        return FESCRITURA_COP_ILLOTE;
    }

    public void setFESCRITURA_COP_ILLOTE(Date FESCRITURA_COP_ILLOTE) {
        this.FESCRITURA_COP_ILLOTE = FESCRITURA_COP_ILLOTE;
    }

    public Date getFINSCRIPCION_COP_ILLOTE() {
        return FINSCRIPCION_COP_ILLOTE;
    }

    public void setFINSCRIPCION_COP_ILLOTE(Date FINSCRIPCION_COP_ILLOTE) {
        this.FINSCRIPCION_COP_ILLOTE = FINSCRIPCION_COP_ILLOTE;
    }

    
}
