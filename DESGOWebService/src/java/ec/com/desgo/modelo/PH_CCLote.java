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
public class PH_CCLote {
    Integer ID_PH_CCLOTE;
    float ALICUOTA_PH_CCLOTE;
    float AREADECLARADA_PH_CCLOTE;
    String UNIDADMEDIDA_PH_CCLOTE;
    float AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE;

    public PH_CCLote() {
    }

    public PH_CCLote(Integer ID_PH_CCLOTE, float ALICUOTA_PH_CCLOTE, float AREADECLARADA_PH_CCLOTE, String UNIDADMEDIDA_PH_CCLOTE, float AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE) {
        this.ID_PH_CCLOTE = ID_PH_CCLOTE;
        this.ALICUOTA_PH_CCLOTE = ALICUOTA_PH_CCLOTE;
        this.AREADECLARADA_PH_CCLOTE = AREADECLARADA_PH_CCLOTE;
        this.UNIDADMEDIDA_PH_CCLOTE = UNIDADMEDIDA_PH_CCLOTE;
        this.AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE = AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE;
    }

    public Integer getID_PH_CCLOTE() {
        return ID_PH_CCLOTE;
    }

    public void setID_PH_CCLOTE(Integer ID_PH_CCLOTE) {
        this.ID_PH_CCLOTE = ID_PH_CCLOTE;
    }

    public float getALICUOTA_PH_CCLOTE() {
        return ALICUOTA_PH_CCLOTE;
    }

    public void setALICUOTA_PH_CCLOTE(float ALICUOTA_PH_CCLOTE) {
        this.ALICUOTA_PH_CCLOTE = ALICUOTA_PH_CCLOTE;
    }

    public float getAREADECLARADA_PH_CCLOTE() {
        return AREADECLARADA_PH_CCLOTE;
    }

    public void setAREADECLARADA_PH_CCLOTE(float AREADECLARADA_PH_CCLOTE) {
        this.AREADECLARADA_PH_CCLOTE = AREADECLARADA_PH_CCLOTE;
    }

    public String getUNIDADMEDIDA_PH_CCLOTE() {
        return UNIDADMEDIDA_PH_CCLOTE;
    }

    public void setUNIDADMEDIDA_PH_CCLOTE(String UNIDADMEDIDA_PH_CCLOTE) {
        this.UNIDADMEDIDA_PH_CCLOTE = UNIDADMEDIDA_PH_CCLOTE;
    }

    public float getAREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE() {
        return AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE;
    }

    public void setAREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE(float AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE) {
        this.AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE = AREAAUEMENTOCONSTRUCTIVO_PH_CCLOTE;
    }
    
    

}
