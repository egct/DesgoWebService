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
public class MejorasLote {
    Integer ID_MLOTE;
    String TIPOOBRA_MLOTE;
    String MATERIALES_MLOTE;
    float AREA_MLOTE;

    public MejorasLote() {
    }

    public MejorasLote(Integer ID_MLOTE, String TIPOOBRA_MLOTE, String MATERIALES_MLOTE, float AREA_MLOTE) {
        this.ID_MLOTE = ID_MLOTE;
        this.TIPOOBRA_MLOTE = TIPOOBRA_MLOTE;
        this.MATERIALES_MLOTE = MATERIALES_MLOTE;
        this.AREA_MLOTE = AREA_MLOTE;
    }

    public Integer getID_MLOTE() {
        return ID_MLOTE;
    }

    public void setID_MLOTE(Integer ID_MLOTE) {
        this.ID_MLOTE = ID_MLOTE;
    }

    public String getTIPOOBRA_MLOTE() {
        return TIPOOBRA_MLOTE;
    }

    public void setTIPOOBRA_MLOTE(String TIPOOBRA_MLOTE) {
        this.TIPOOBRA_MLOTE = TIPOOBRA_MLOTE;
    }

    public String getMATERIALES_MLOTE() {
        return MATERIALES_MLOTE;
    }

    public void setMATERIALES_MLOTE(String MATERIALES_MLOTE) {
        this.MATERIALES_MLOTE = MATERIALES_MLOTE;
    }

    public float getAREA_MLOTE() {
        return AREA_MLOTE;
    }

    public void setAREA_MLOTE(float AREA_MLOTE) {
        this.AREA_MLOTE = AREA_MLOTE;
    }
    

}
