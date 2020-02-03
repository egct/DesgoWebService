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
public class IdentificacionL_F {
    Integer ID_ILLOTE;	
    Integer ID_PRO;
    Integer ID_PRE_ILLOTE;
    Integer ID_COP_ILLOTE;
    Integer ID_DIR_ILLOTE;
    Integer ID_DOC_ILLOTE;
    String FORMAADQUISICION;

    public IdentificacionL_F() {
    }

    public IdentificacionL_F(Integer ID_ILLOTE, Integer ID_PRO, Integer ID_PRE_ILLOTE, Integer ID_COP_ILLOTE, Integer ID_DIR_ILLOTE, Integer ID_DOC_ILLOTE, String FORMAADQUISICION) {
        this.ID_ILLOTE = ID_ILLOTE;
        this.ID_PRO = ID_PRO;
        this.ID_PRE_ILLOTE = ID_PRE_ILLOTE;
        this.ID_COP_ILLOTE = ID_COP_ILLOTE;
        this.ID_DIR_ILLOTE = ID_DIR_ILLOTE;
        this.ID_DOC_ILLOTE = ID_DOC_ILLOTE;
        this.FORMAADQUISICION = FORMAADQUISICION;
    }

    public Integer getID_ILLOTE() {
        return ID_ILLOTE;
    }

    public void setID_ILLOTE(Integer ID_ILLOTE) {
        this.ID_ILLOTE = ID_ILLOTE;
    }

    public Integer getID_PRO() {
        return ID_PRO;
    }

    public void setID_PRO(Integer ID_PRO) {
        this.ID_PRO = ID_PRO;
    }

    public Integer getID_PRE_ILLOTE() {
        return ID_PRE_ILLOTE;
    }

    public void setID_PRE_ILLOTE(Integer ID_PRE_ILLOTE) {
        this.ID_PRE_ILLOTE = ID_PRE_ILLOTE;
    }

    public Integer getID_COP_ILLOTE() {
        return ID_COP_ILLOTE;
    }

    public void setID_COP_ILLOTE(Integer ID_COP_ILLOTE) {
        this.ID_COP_ILLOTE = ID_COP_ILLOTE;
    }

    public Integer getID_DIR_ILLOTE() {
        return ID_DIR_ILLOTE;
    }

    public void setID_DIR_ILLOTE(Integer ID_DIR_ILLOTE) {
        this.ID_DIR_ILLOTE = ID_DIR_ILLOTE;
    }

    public Integer getID_DOC_ILLOTE() {
        return ID_DOC_ILLOTE;
    }

    public void setID_DOC_ILLOTE(Integer ID_DOC_ILLOTE) {
        this.ID_DOC_ILLOTE = ID_DOC_ILLOTE;
    }

    public String getFORMAADQUISICION() {
        return FORMAADQUISICION;
    }

    public void setFORMAADQUISICION(String FORMAADQUISICION) {
        this.FORMAADQUISICION = FORMAADQUISICION;
    }

    
}
