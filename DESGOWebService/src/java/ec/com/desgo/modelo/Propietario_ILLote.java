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
public class Propietario_ILLote {
    Integer ID_PRO;
    String TIPOPROPIETARIO_PER;
    String PERSONERIAJURIDICA_PER;

    public Propietario_ILLote() {
    }

    public Propietario_ILLote(Integer ID_PRO, String TIPOPROPIETARIO_PER, String PERSONERIAJURIDICA_PER) {
        this.ID_PRO = ID_PRO;
        this.TIPOPROPIETARIO_PER = TIPOPROPIETARIO_PER;
        this.PERSONERIAJURIDICA_PER = PERSONERIAJURIDICA_PER;
    }

    public Integer getID_PRO() {
        return ID_PRO;
    }

    public void setID_PRO(Integer ID_PRO) {
        this.ID_PRO = ID_PRO;
    }

    public String getTIPOPROPIETARIO_PER() {
        return TIPOPROPIETARIO_PER;
    }

    public void setTIPOPROPIETARIO_PER(String TIPOPROPIETARIO_PER) {
        this.TIPOPROPIETARIO_PER = TIPOPROPIETARIO_PER;
    }

    public String getPERSONERIAJURIDICA_PER() {
        return PERSONERIAJURIDICA_PER;
    }

    public void setPERSONERIAJURIDICA_PER(String PERSONERIAJURIDICA_PER) {
        this.PERSONERIAJURIDICA_PER = PERSONERIAJURIDICA_PER;
    }
    
}
