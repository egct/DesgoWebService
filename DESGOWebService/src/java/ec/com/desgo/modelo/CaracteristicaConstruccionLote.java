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
public class CaracteristicaConstruccionLote {
    Integer ID_CCLOTE;
    Integer ID_PH_CCLOTE;
    Integer ID_CBP_CCLOTE;
    Integer ID_DDB_CCLOTE;

    public CaracteristicaConstruccionLote(Integer ID_CCLOTE, Integer ID_PH_CCLOTE, Integer ID_CBP_CCLOTE, Integer ID_DDB_CCLOTE) {
        this.ID_CCLOTE = ID_CCLOTE;
        this.ID_PH_CCLOTE = ID_PH_CCLOTE;
        this.ID_CBP_CCLOTE = ID_CBP_CCLOTE;
        this.ID_DDB_CCLOTE = ID_DDB_CCLOTE;
    }

    public CaracteristicaConstruccionLote() {
    }

    public Integer getID_CCLOTE() {
        return ID_CCLOTE;
    }

    public void setID_CCLOTE(Integer ID_CCLOTE) {
        this.ID_CCLOTE = ID_CCLOTE;
    }

    public Integer getID_PH_CCLOTE() {
        return ID_PH_CCLOTE;
    }

    public void setID_PH_CCLOTE(Integer ID_PH_CCLOTE) {
        this.ID_PH_CCLOTE = ID_PH_CCLOTE;
    }

    public Integer getID_CBP_CCLOTE() {
        return ID_CBP_CCLOTE;
    }

    public void setID_CBP_CCLOTE(Integer ID_CBP_CCLOTE) {
        this.ID_CBP_CCLOTE = ID_CBP_CCLOTE;
    }

    public Integer getID_DDB_CCLOTE() {
        return ID_DDB_CCLOTE;
    }

    public void setID_DDB_CCLOTE(Integer ID_DDB_CCLOTE) {
        this.ID_DDB_CCLOTE = ID_DDB_CCLOTE;
    }
    
    

}
