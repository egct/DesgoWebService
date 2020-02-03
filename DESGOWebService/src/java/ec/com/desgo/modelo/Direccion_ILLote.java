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
public class Direccion_ILLote {
    Integer ID_DIR_ILLOTE;	
    String PAIS_DIR_ILLOTE;	
    String CIUDAD_DIR_ILLOTE;
    String CALLEP_DIR_ILLOTE;	
    String NO_DIR_ILLOTE;
    String INTERSECCIOM_DIR_ILLOTE;
    String CELULAR_DIR_ILLOTE;	
    String CONVENCIONAL_DIR_ILLOTE;	
    String CORREO;

    public Direccion_ILLote() {
    }

    public Direccion_ILLote(Integer ID_DIR_ILLOTE, String PAIS_DIR_ILLOTE, String CIUDAD_DIR_ILLOTE, String CALLEP_DIR_ILLOTE, String NO_DIR_ILLOTE, String INTERSECCIOM_DIR_ILLOTE, String CELULAR_DIR_ILLOTE, String CONVENCIONAL_DIR_ILLOTE, String CORREO) {
        this.ID_DIR_ILLOTE = ID_DIR_ILLOTE;
        this.PAIS_DIR_ILLOTE = PAIS_DIR_ILLOTE;
        this.CIUDAD_DIR_ILLOTE = CIUDAD_DIR_ILLOTE;
        this.CALLEP_DIR_ILLOTE = CALLEP_DIR_ILLOTE;
        this.NO_DIR_ILLOTE = NO_DIR_ILLOTE;
        this.INTERSECCIOM_DIR_ILLOTE = INTERSECCIOM_DIR_ILLOTE;
        this.CELULAR_DIR_ILLOTE = CELULAR_DIR_ILLOTE;
        this.CONVENCIONAL_DIR_ILLOTE = CONVENCIONAL_DIR_ILLOTE;
        this.CORREO = CORREO;
    }

    public Integer getID_DIR_ILLOTE() {
        return ID_DIR_ILLOTE;
    }

    public void setID_DIR_ILLOTE(Integer ID_DIR_ILLOTE) {
        this.ID_DIR_ILLOTE = ID_DIR_ILLOTE;
    }

    public String getPAIS_DIR_ILLOTE() {
        return PAIS_DIR_ILLOTE;
    }

    public void setPAIS_DIR_ILLOTE(String PAIS_DIR_ILLOTE) {
        this.PAIS_DIR_ILLOTE = PAIS_DIR_ILLOTE;
    }

    public String getCIUDAD_DIR_ILLOTE() {
        return CIUDAD_DIR_ILLOTE;
    }

    public void setCIUDAD_DIR_ILLOTE(String CIUDAD_DIR_ILLOTE) {
        this.CIUDAD_DIR_ILLOTE = CIUDAD_DIR_ILLOTE;
    }

    public String getCALLEP_DIR_ILLOTE() {
        return CALLEP_DIR_ILLOTE;
    }

    public void setCALLEP_DIR_ILLOTE(String CALLEP_DIR_ILLOTE) {
        this.CALLEP_DIR_ILLOTE = CALLEP_DIR_ILLOTE;
    }

    public String getNO_DIR_ILLOTE() {
        return NO_DIR_ILLOTE;
    }

    public void setNO_DIR_ILLOTE(String NO_DIR_ILLOTE) {
        this.NO_DIR_ILLOTE = NO_DIR_ILLOTE;
    }

    public String getINTERSECCIOM_DIR_ILLOTE() {
        return INTERSECCIOM_DIR_ILLOTE;
    }

    public void setINTERSECCIOM_DIR_ILLOTE(String INTERSECCIOM_DIR_ILLOTE) {
        this.INTERSECCIOM_DIR_ILLOTE = INTERSECCIOM_DIR_ILLOTE;
    }

    public String getCELULAR_DIR_ILLOTE() {
        return CELULAR_DIR_ILLOTE;
    }

    public void setCELULAR_DIR_ILLOTE(String CELULAR_DIR_ILLOTE) {
        this.CELULAR_DIR_ILLOTE = CELULAR_DIR_ILLOTE;
    }

    public String getCONVENCIONAL_DIR_ILLOTE() {
        return CONVENCIONAL_DIR_ILLOTE;
    }

    public void setCONVENCIONAL_DIR_ILLOTE(String CONVENCIONAL_DIR_ILLOTE) {
        this.CONVENCIONAL_DIR_ILLOTE = CONVENCIONAL_DIR_ILLOTE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }
    
    

}
