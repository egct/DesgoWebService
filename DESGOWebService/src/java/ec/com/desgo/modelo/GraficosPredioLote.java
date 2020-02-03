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
public class GraficosPredioLote {
    Integer ID_GPLOTE;
    String PLANOPREDIO_GPLOTE;
    String FOTOGRAFIAFACHADA;

    public GraficosPredioLote() {
    }

    public GraficosPredioLote(Integer ID_GPLOTE, String PLANOPREDIO_GPLOTE, String FOTOGRAFIAFACHADA) {
        this.ID_GPLOTE = ID_GPLOTE;
        this.PLANOPREDIO_GPLOTE = PLANOPREDIO_GPLOTE;
        this.FOTOGRAFIAFACHADA = FOTOGRAFIAFACHADA;
    }

    public Integer getID_GPLOTE() {
        return ID_GPLOTE;
    }

    public void setID_GPLOTE(Integer ID_GPLOTE) {
        this.ID_GPLOTE = ID_GPLOTE;
    }

    public String getPLANOPREDIO_GPLOTE() {
        return PLANOPREDIO_GPLOTE;
    }

    public void setPLANOPREDIO_GPLOTE(String PLANOPREDIO_GPLOTE) {
        this.PLANOPREDIO_GPLOTE = PLANOPREDIO_GPLOTE;
    }

    public String getFOTOGRAFIAFACHADA() {
        return FOTOGRAFIAFACHADA;
    }

    public void setFOTOGRAFIAFACHADA(String FOTOGRAFIAFACHADA) {
        this.FOTOGRAFIAFACHADA = FOTOGRAFIAFACHADA;
    }
    

}
