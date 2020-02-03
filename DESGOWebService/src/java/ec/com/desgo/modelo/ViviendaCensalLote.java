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
public class ViviendaCensalLote {
   Integer ID_VCLOTE;
   Integer ID_DDU_VCLOTE;
   Integer ID_INV_VCLOTE;
   String CODIGOUNIDAD_VCLOTE;
   String OBSERVACION_VCLOTE;

    public ViviendaCensalLote() {
    }

    public ViviendaCensalLote(Integer ID_VCLOTE, Integer ID_DDU_VCLOTE, Integer ID_INV_VCLOTE, String CODIGOUNIDAD_VCLOTE, String OBSERVACION_VCLOTE) {
        this.ID_VCLOTE = ID_VCLOTE;
        this.ID_DDU_VCLOTE = ID_DDU_VCLOTE;
        this.ID_INV_VCLOTE = ID_INV_VCLOTE;
        this.CODIGOUNIDAD_VCLOTE = CODIGOUNIDAD_VCLOTE;
        this.OBSERVACION_VCLOTE = OBSERVACION_VCLOTE;
    }

    public Integer getID_VCLOTE() {
        return ID_VCLOTE;
    }

    public void setID_VCLOTE(Integer ID_VCLOTE) {
        this.ID_VCLOTE = ID_VCLOTE;
    }

    public Integer getID_DDU_VCLOTE() {
        return ID_DDU_VCLOTE;
    }

    public void setID_DDU_VCLOTE(Integer ID_DDU_VCLOTE) {
        this.ID_DDU_VCLOTE = ID_DDU_VCLOTE;
    }

    public Integer getID_INV_VCLOTE() {
        return ID_INV_VCLOTE;
    }

    public void setID_INV_VCLOTE(Integer ID_INV_VCLOTE) {
        this.ID_INV_VCLOTE = ID_INV_VCLOTE;
    }

    public String getCODIGOUNIDAD_VCLOTE() {
        return CODIGOUNIDAD_VCLOTE;
    }

    public void setCODIGOUNIDAD_VCLOTE(String CODIGOUNIDAD_VCLOTE) {
        this.CODIGOUNIDAD_VCLOTE = CODIGOUNIDAD_VCLOTE;
    }

    public String getOBSERVACION_VCLOTE() {
        return OBSERVACION_VCLOTE;
    }

    public void setOBSERVACION_VCLOTE(String OBSERVACION_VCLOTE) {
        this.OBSERVACION_VCLOTE = OBSERVACION_VCLOTE;
    }
   

 
}
