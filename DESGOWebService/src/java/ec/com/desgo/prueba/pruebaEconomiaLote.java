/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.servicios.WSGestionFormulario;
import ec.com.desgo.modelo.*;

/**
 *
 * @author egct
 */
public class pruebaEconomiaLote {
    public static void main(String[] args) {
        pruebaEconomiaLote prueba=new pruebaEconomiaLote();
        WSGestionFormulario ws=new WSGestionFormulario();
        
        EconomiaLote economiaLote=new EconomiaLote();
        economiaLote.setAVALUOTIERRA_ELOTE((float)1.5);
        economiaLote.setAVALUOCON_ELOTE((float)150.45);
        economiaLote.setAVALUOTOTAL_ELOTE((float)151.50);
        ws.addEconomia(economiaLote);
        
    }
}
