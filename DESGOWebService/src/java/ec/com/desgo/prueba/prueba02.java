/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.*;
import ec.com.desgo.servicios.WSGestionFormulario;
import ec.com.desgo.servicios.WSGestionUsuario;

/**
 *
 * @author egct
 */
public class prueba02 {
    public static void main(String[] args) {
        Acabados_EC aec=new Acabados_EC();
        prueba02 p=new prueba02();
        WSGestionFormulario ws=new WSGestionFormulario();
        aec=ws.testerAcabados("desgo");
        System.out.println("Datos Acabados");
        System.out.println(aec.getELRMINACIONEXCRETAS_AC());
        System.out.println(aec.getENERGIAELECTRICAP_AC());
        System.out.println(aec.getID_AC());
        System.out.println(aec.getPUERTAS_AC());
        System.out.println(aec.getPISO_AC());
        System.out.println(aec.getREVESTIMIENTOCUBIERTA_AC());
        System.out.println(aec.getREVESTIMIENTOPARED_AC());
        System.out.println(aec.getTIPOACABADO_AC());
        System.out.println(aec.getTUMBADO_AC());
        System.out.println(aec.getVENTANA_AC());
        
    }

    
}
