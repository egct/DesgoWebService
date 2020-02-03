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
public class CaracterizacionLote {
    Integer ID_CLOTE;
    Integer ID_II_CLOTE;	
    float AREA_CLOTE;
    float DIMENSIONFRENTE_CLOTE;
    String LOCALIZACIONMANZANA_CLOTE;

    public CaracterizacionLote() {
    }

    public CaracterizacionLote(Integer ID_CLOTE, Integer ID_II_CLOTE, float AREA_CLOTE, float DIMENSIONFRENTE_CLOTE, String LOCALIZACIONMANZANA_CLOTE) {
        this.ID_CLOTE = ID_CLOTE;
        this.ID_II_CLOTE = ID_II_CLOTE;
        this.AREA_CLOTE = AREA_CLOTE;
        this.DIMENSIONFRENTE_CLOTE = DIMENSIONFRENTE_CLOTE;
        this.LOCALIZACIONMANZANA_CLOTE = LOCALIZACIONMANZANA_CLOTE;
    }

    public Integer getID_CLOTE() {
        return ID_CLOTE;
    }

    public void setID_CLOTE(Integer ID_CLOTE) {
        this.ID_CLOTE = ID_CLOTE;
    }

    public Integer getID_II_CLOTE() {
        return ID_II_CLOTE;
    }

    public void setID_II_CLOTE(Integer ID_II_CLOTE) {
        this.ID_II_CLOTE = ID_II_CLOTE;
    }

    public float getAREA_CLOTE() {
        return AREA_CLOTE;
    }

    public void setAREA_CLOTE(float AREA_CLOTE) {
        this.AREA_CLOTE = AREA_CLOTE;
    }

    public float getDIMENSIONFRENTE_CLOTE() {
        return DIMENSIONFRENTE_CLOTE;
    }

    public void setDIMENSIONFRENTE_CLOTE(float DIMENSIONFRENTE_CLOTE) {
        this.DIMENSIONFRENTE_CLOTE = DIMENSIONFRENTE_CLOTE;
    }

    public String getLOCALIZACIONMANZANA_CLOTE() {
        return LOCALIZACIONMANZANA_CLOTE;
    }

    public void setLOCALIZACIONMANZANA_CLOTE(String LOCALIZACIONMANZANA_CLOTE) {
        this.LOCALIZACIONMANZANA_CLOTE = LOCALIZACIONMANZANA_CLOTE;
    }
    
    

}
