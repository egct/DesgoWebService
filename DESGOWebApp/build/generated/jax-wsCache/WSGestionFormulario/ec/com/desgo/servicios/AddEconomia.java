
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addEconomia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addEconomia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="economia" type="{http://servicios.desgo.com.ec/}economiaLote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEconomia", propOrder = {
    "economia"
})
public class AddEconomia {

    protected EconomiaLote economia;

    /**
     * Obtiene el valor de la propiedad economia.
     * 
     * @return
     *     possible object is
     *     {@link EconomiaLote }
     *     
     */
    public EconomiaLote getEconomia() {
        return economia;
    }

    /**
     * Define el valor de la propiedad economia.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomiaLote }
     *     
     */
    public void setEconomia(EconomiaLote value) {
        this.economia = value;
    }

}
