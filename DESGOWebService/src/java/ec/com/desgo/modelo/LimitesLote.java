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
public class LimitesLote {
    Integer ID_LLOTE;	
    String NOMBRECOLINDANTES_LLOTE;
    float AREAESCRITURA_LLOTE;

    public LimitesLote() {
    }

    public LimitesLote(Integer ID_LLOTE, String NOMBRECOLINDANTES_LLOTE, float AREAESCRITURA_LLOTE) {
        this.ID_LLOTE = ID_LLOTE;
        this.NOMBRECOLINDANTES_LLOTE = NOMBRECOLINDANTES_LLOTE;
        this.AREAESCRITURA_LLOTE = AREAESCRITURA_LLOTE;
    }

    public Integer getID_LLOTE() {
        return ID_LLOTE;
    }

    public void setID_LLOTE(Integer ID_LLOTE) {
        this.ID_LLOTE = ID_LLOTE;
    }

    public String getNOMBRECOLINDANTES_LLOTE() {
        return NOMBRECOLINDANTES_LLOTE;
    }

    public void setNOMBRECOLINDANTES_LLOTE(String NOMBRECOLINDANTES_LLOTE) {
        this.NOMBRECOLINDANTES_LLOTE = NOMBRECOLINDANTES_LLOTE;
    }

    public float getAREAESCRITURA_LLOTE() {
        return AREAESCRITURA_LLOTE;
    }

    public void setAREAESCRITURA_LLOTE(float AREAESCRITURA_LLOTE) {
        this.AREAESCRITURA_LLOTE = AREAESCRITURA_LLOTE;
    }
    
     

}
