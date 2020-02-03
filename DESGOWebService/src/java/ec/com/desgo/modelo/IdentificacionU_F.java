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
public class IdentificacionU_F {
    Integer ID_IULOTE;
    Integer ID_DDPLOTE;
    String CLAVECATASTRALANTIGUO_IULOTE;
    String NUMEROPREDIO_IULOTE;
    String CLAVECATASTRALNUEVO_IULOTE;

    public IdentificacionU_F() {
    }

    public IdentificacionU_F(Integer ID_IULOTE, Integer ID_DDPLOTE, String CLAVECATASTRALANTIGUO_IULOTE, String NUMEROPREDIO_IULOTE, String CLAVECATASTRALNUEVO_IULOTE) {
        this.ID_IULOTE = ID_IULOTE;
        this.ID_DDPLOTE = ID_DDPLOTE;
        this.CLAVECATASTRALANTIGUO_IULOTE = CLAVECATASTRALANTIGUO_IULOTE;
        this.NUMEROPREDIO_IULOTE = NUMEROPREDIO_IULOTE;
        this.CLAVECATASTRALNUEVO_IULOTE = CLAVECATASTRALNUEVO_IULOTE;
    }

    public Integer getID_IULOTE() {
        return ID_IULOTE;
    }

    public void setID_IULOTE(Integer ID_IULOTE) {
        this.ID_IULOTE = ID_IULOTE;
    }

    public Integer getID_DDPLOTE() {
        return ID_DDPLOTE;
    }

    public void setID_DDPLOTE(Integer ID_DDPLOTE) {
        this.ID_DDPLOTE = ID_DDPLOTE;
    }

    public String getCLAVECATASTRALANTIGUO_IULOTE() {
        return CLAVECATASTRALANTIGUO_IULOTE;
    }

    public void setCLAVECATASTRALANTIGUO_IULOTE(String CLAVECATASTRALANTIGUO_IULOTE) {
        this.CLAVECATASTRALANTIGUO_IULOTE = CLAVECATASTRALANTIGUO_IULOTE;
    }

    public String getNUMEROPREDIO_IULOTE() {
        return NUMEROPREDIO_IULOTE;
    }

    public void setNUMEROPREDIO_IULOTE(String NUMEROPREDIO_IULOTE) {
        this.NUMEROPREDIO_IULOTE = NUMEROPREDIO_IULOTE;
    }

    public String getCLAVECATASTRALNUEVO_IULOTE() {
        return CLAVECATASTRALNUEVO_IULOTE;
    }

    public void setCLAVECATASTRALNUEVO_IULOTE(String CLAVECATASTRALNUEVO_IULOTE) {
        this.CLAVECATASTRALNUEVO_IULOTE = CLAVECATASTRALNUEVO_IULOTE;
    }

    
}
