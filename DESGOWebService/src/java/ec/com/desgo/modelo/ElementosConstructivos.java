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
public class ElementosConstructivos {
    Integer ID_EC;
    Integer ID_EST;
    Integer ID_AC;
    String NB_EC;
    String NP_EC;
    String UC_EC;
    String CUBIERTA_EC;
    String USOCONSTRUCCION_EC;

    public ElementosConstructivos() {
    }

    public ElementosConstructivos(Integer ID_EC, Integer ID_EST, Integer ID_AC, String NB_EC, String NP_EC, String UC_EC, String CUBIERTA_EC, String USOCONSTRUCCION_EC) {
        this.ID_EC = ID_EC;
        this.ID_EST = ID_EST;
        this.ID_AC = ID_AC;
        this.NB_EC = NB_EC;
        this.NP_EC = NP_EC;
        this.UC_EC = UC_EC;
        this.CUBIERTA_EC = CUBIERTA_EC;
        this.USOCONSTRUCCION_EC = USOCONSTRUCCION_EC;
    }

    public Integer getID_EC() {
        return ID_EC;
    }

    public void setID_EC(Integer ID_EC) {
        this.ID_EC = ID_EC;
    }

    public Integer getID_EST() {
        return ID_EST;
    }

    public void setID_EST(Integer ID_EST) {
        this.ID_EST = ID_EST;
    }

    public Integer getID_AC() {
        return ID_AC;
    }

    public void setID_AC(Integer ID_AC) {
        this.ID_AC = ID_AC;
    }

    public String getNB_EC() {
        return NB_EC;
    }

    public void setNB_EC(String NB_EC) {
        this.NB_EC = NB_EC;
    }

    public String getNP_EC() {
        return NP_EC;
    }

    public void setNP_EC(String NP_EC) {
        this.NP_EC = NP_EC;
    }

    public String getUC_EC() {
        return UC_EC;
    }

    public void setUC_EC(String UC_EC) {
        this.UC_EC = UC_EC;
    }

    public String getCUBIERTA_EC() {
        return CUBIERTA_EC;
    }

    public void setCUBIERTA_EC(String CUBIERTA_EC) {
        this.CUBIERTA_EC = CUBIERTA_EC;
    }

    public String getUSOCONSTRUCCION_EC() {
        return USOCONSTRUCCION_EC;
    }

    public void setUSOCONSTRUCCION_EC(String USOCONSTRUCCION_EC) {
        this.USOCONSTRUCCION_EC = USOCONSTRUCCION_EC;
    }
    
    

}
