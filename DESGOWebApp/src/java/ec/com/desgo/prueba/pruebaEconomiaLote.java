/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;


import ec.com.desgo.servicios.*;

/**
 *
 * @author egct
 */
public class pruebaEconomiaLote {
    public static void main(String[] args) {
        pruebaEconomiaLote prueba=new pruebaEconomiaLote();
        
        EconomiaLote economiaLote=new EconomiaLote();
        economiaLote.setAVALUOTIERRAELOTE((float)10.5);
        economiaLote.setAVALUOCONELOTE((float)150.45);
        economiaLote.setAVALUOTOTALELOTE((float)160.50);
        prueba.addEconomia(economiaLote);
        
    }

    private static Boolean addEconomia(ec.com.desgo.servicios.EconomiaLote economia) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.addEconomia(economia);
    }
    
}
