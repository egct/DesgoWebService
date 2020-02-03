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
public class EconomiaLote {
    Integer ID_ELOTE;
    float AVALUOTIERRA_ELOTE;
    float AVALUOCON_ELOTE;
    float AVALUOTOTAL_ELOTE;

    public EconomiaLote() {
    }

    public EconomiaLote(Integer ID_ELOTE, float AVALUOTIERRA_ELOTE, float AVALUOCON_ELOTE, float AVALUOTOTAL_ELOTE) {
        this.ID_ELOTE = ID_ELOTE;
        this.AVALUOTIERRA_ELOTE = AVALUOTIERRA_ELOTE;
        this.AVALUOCON_ELOTE = AVALUOCON_ELOTE;
        this.AVALUOTOTAL_ELOTE = AVALUOTOTAL_ELOTE;
    }

    public Integer getID_ELOTE() {
        return ID_ELOTE;
    }

    public void setID_ELOTE(Integer ID_ELOTE) {
        this.ID_ELOTE = ID_ELOTE;
    }

    public float getAVALUOTIERRA_ELOTE() {
        return AVALUOTIERRA_ELOTE;
    }

    public void setAVALUOTIERRA_ELOTE(float AVALUOTIERRA_ELOTE) {
        this.AVALUOTIERRA_ELOTE = AVALUOTIERRA_ELOTE;
    }

    public float getAVALUOCON_ELOTE() {
        return AVALUOCON_ELOTE;
    }

    public void setAVALUOCON_ELOTE(float AVALUOCON_ELOTE) {
        this.AVALUOCON_ELOTE = AVALUOCON_ELOTE;
    }

    public float getAVALUOTOTAL_ELOTE() {
        return AVALUOTOTAL_ELOTE;
    }

    public void setAVALUOTOTAL_ELOTE(float AVALUOTOTAL_ELOTE) {
        this.AVALUOTOTAL_ELOTE = AVALUOTOTAL_ELOTE;
    }
    


}
