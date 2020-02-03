/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.servicios.AcabadosEC;

/**
 *
 * @author egct
 */
public class prueba02 {
    public static void main(String[] args) {
        AcabadosEC aec=new AcabadosEC();
        prueba02 p=new prueba02();
        aec=p.testerAcabados("desgo");
        System.out.println("Datos Acabados");
        System.out.println(aec.getELRMINACIONEXCRETASAC());
        System.out.println(aec.getENERGIAELECTRICAPAC());
        System.out.println(aec.getIDAC());
        System.out.println(aec.getPUERTASAC());
        System.out.println(aec.getPISOAC());
        System.out.println(aec.getREVESTIMIENTOCUBIERTAAC());
        System.out.println(aec.getREVESTIMIENTOPAREDAC());
        System.out.println(aec.getTIPOACABADOAC());
        System.out.println(aec.getTUMBADOAC());
        System.out.println(aec.getVENTANAAC());
        
    }

    public AcabadosEC testerAcabados(java.lang.String tipo) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.testerAcabados(tipo);
    }
    
}
