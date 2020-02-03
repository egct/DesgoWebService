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
public class Direccion_DDPLote {
    Integer ID_DLOTE;
    Integer CALLEP_DLOTE;
    Integer NO_DLOTE;
    Integer INTERSECCION_DLOTE;

    public Direccion_DDPLote() {
    }

    public Direccion_DDPLote(Integer ID_DLOTE, Integer CALLEP_DLOTE, Integer NO_DLOTE, Integer INTERSECCION_DLOTE) {
        this.ID_DLOTE = ID_DLOTE;
        this.CALLEP_DLOTE = CALLEP_DLOTE;
        this.NO_DLOTE = NO_DLOTE;
        this.INTERSECCION_DLOTE = INTERSECCION_DLOTE;
    }

    public Integer getID_DLOTE() {
        return ID_DLOTE;
    }

    public void setID_DLOTE(Integer ID_DLOTE) {
        this.ID_DLOTE = ID_DLOTE;
    }

    public Integer getCALLEP_DLOTE() {
        return CALLEP_DLOTE;
    }

    public void setCALLEP_DLOTE(Integer CALLEP_DLOTE) {
        this.CALLEP_DLOTE = CALLEP_DLOTE;
    }

    public Integer getNO_DLOTE() {
        return NO_DLOTE;
    }

    public void setNO_DLOTE(Integer NO_DLOTE) {
        this.NO_DLOTE = NO_DLOTE;
    }

    public Integer getINTERSECCION_DLOTE() {
        return INTERSECCION_DLOTE;
    }

    public void setINTERSECCION_DLOTE(Integer INTERSECCION_DLOTE) {
        this.INTERSECCION_DLOTE = INTERSECCION_DLOTE;
    }
    
}
