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
public class PredioTitulo_ILLote {
    Integer ID_PRE_ILLOTE;
    Boolean REQUIEREPERF_PRE_ILLOTE;
    String ANIOSSINPER_PRE_ILLOTE;
    String ANIOSPOS_PRE_ILLOTE;
    String NOMBREPUEBLO_PRE_ILLOTE;

    public PredioTitulo_ILLote() {
    }

    public PredioTitulo_ILLote(Integer ID_PRE_ILLOTE, Boolean REQUIEREPERF_PRE_ILLOTE, String ANIOSSINPER_PRE_ILLOTE, String ANIOSPOS_PRE_ILLOTE, String NOMBREPUEBLO_PRE_ILLOTE) {
        this.ID_PRE_ILLOTE = ID_PRE_ILLOTE;
        this.REQUIEREPERF_PRE_ILLOTE = REQUIEREPERF_PRE_ILLOTE;
        this.ANIOSSINPER_PRE_ILLOTE = ANIOSSINPER_PRE_ILLOTE;
        this.ANIOSPOS_PRE_ILLOTE = ANIOSPOS_PRE_ILLOTE;
        this.NOMBREPUEBLO_PRE_ILLOTE = NOMBREPUEBLO_PRE_ILLOTE;
    }

    public Integer getID_PRE_ILLOTE() {
        return ID_PRE_ILLOTE;
    }

    public void setID_PRE_ILLOTE(Integer ID_PRE_ILLOTE) {
        this.ID_PRE_ILLOTE = ID_PRE_ILLOTE;
    }

    public Boolean getREQUIEREPERF_PRE_ILLOTE() {
        return REQUIEREPERF_PRE_ILLOTE;
    }

    public void setREQUIEREPERF_PRE_ILLOTE(Boolean REQUIEREPERF_PRE_ILLOTE) {
        this.REQUIEREPERF_PRE_ILLOTE = REQUIEREPERF_PRE_ILLOTE;
    }

    public String getANIOSSINPER_PRE_ILLOTE() {
        return ANIOSSINPER_PRE_ILLOTE;
    }

    public void setANIOSSINPER_PRE_ILLOTE(String ANIOSSINPER_PRE_ILLOTE) {
        this.ANIOSSINPER_PRE_ILLOTE = ANIOSSINPER_PRE_ILLOTE;
    }

    public String getANIOSPOS_PRE_ILLOTE() {
        return ANIOSPOS_PRE_ILLOTE;
    }

    public void setANIOSPOS_PRE_ILLOTE(String ANIOSPOS_PRE_ILLOTE) {
        this.ANIOSPOS_PRE_ILLOTE = ANIOSPOS_PRE_ILLOTE;
    }

    public String getNOMBREPUEBLO_PRE_ILLOTE() {
        return NOMBREPUEBLO_PRE_ILLOTE;
    }

    public void setNOMBREPUEBLO_PRE_ILLOTE(String NOMBREPUEBLO_PRE_ILLOTE) {
        this.NOMBREPUEBLO_PRE_ILLOTE = NOMBREPUEBLO_PRE_ILLOTE;
    }
    
}
