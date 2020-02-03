/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.servicios;

import ec.com.desgo.modelo.Acabados_EC;
import ec.com.desgo.modelo.EconomiaLote;
import ec.com.desgo.modelo.EconomiaLoteDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author egct
 */
@WebService(serviceName = "WSGestionFormulario")
public class WSGestionFormulario {

   /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testerAcabados")
    public Acabados_EC testerAcabados(@WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        Acabados_EC aec=new Acabados_EC();
        aec.setELRMINACIONEXCRETAS_AC(tipo+"1");
        aec.setENERGIAELECTRICAP_AC(tipo+"2");
        aec.setID_AC(500);
        aec.setPISO_AC(tipo+"3");
        aec.setPUERTAS_AC(tipo+"4");
        aec.setREVESTIMIENTOCUBIERTA_AC(tipo+"5");
        aec.setREVESTIMIENTOPARED_AC(tipo+"6");
        aec.setTIPOACABADO_AC(tipo+"7");
        aec.setTUMBADO_AC(tipo+"8");
        aec.setVENTANA_AC(tipo+"9");
        
        return aec;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEconomia")
    public Boolean addEconomia(@WebParam(name = "economia") EconomiaLote economia) {
        //TODO write your implementation code here:
        EconomiaLoteDAO economiaLoteDao=new EconomiaLoteDAO();
        
        
        return economiaLoteDao.add(economia);
    }
}
