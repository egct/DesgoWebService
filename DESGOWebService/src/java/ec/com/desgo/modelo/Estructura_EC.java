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
public class Estructura_EC {
    Integer ID_EST;
    String COLUMNAS_EST;
    String VIGA_EST;
    String PARED_EST;
    String ENTREPISO_EST;

    public Estructura_EC() {
    }

    public Estructura_EC(Integer ID_EST, String COLUMNAS_EST, String VIGA_EST, String PARED_EST, String ENTREPISO_EST) {
        this.ID_EST = ID_EST;
        this.COLUMNAS_EST = COLUMNAS_EST;
        this.VIGA_EST = VIGA_EST;
        this.PARED_EST = PARED_EST;
        this.ENTREPISO_EST = ENTREPISO_EST;
    }

    public Integer getID_EST() {
        return ID_EST;
    }

    public void setID_EST(Integer ID_EST) {
        this.ID_EST = ID_EST;
    }

    public String getCOLUMNAS_EST() {
        return COLUMNAS_EST;
    }

    public void setCOLUMNAS_EST(String COLUMNAS_EST) {
        this.COLUMNAS_EST = COLUMNAS_EST;
    }

    public String getVIGA_EST() {
        return VIGA_EST;
    }

    public void setVIGA_EST(String VIGA_EST) {
        this.VIGA_EST = VIGA_EST;
    }

    public String getPARED_EST() {
        return PARED_EST;
    }

    public void setPARED_EST(String PARED_EST) {
        this.PARED_EST = PARED_EST;
    }

    public String getENTREPISO_EST() {
        return ENTREPISO_EST;
    }

    public void setENTREPISO_EST(String ENTREPISO_EST) {
        this.ENTREPISO_EST = ENTREPISO_EST;
    }
    

}
