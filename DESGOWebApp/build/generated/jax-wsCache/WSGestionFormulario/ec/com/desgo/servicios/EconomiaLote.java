
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para economiaLote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="economiaLote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AVALUOCON_ELOTE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="AVALUOTIERRA_ELOTE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="AVALUOTOTAL_ELOTE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ID_ELOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "economiaLote", propOrder = {
    "avaluoconelote",
    "avaluotierraelote",
    "avaluototalelote",
    "idelote"
})
public class EconomiaLote {

    @XmlElement(name = "AVALUOCON_ELOTE")
    protected float avaluoconelote;
    @XmlElement(name = "AVALUOTIERRA_ELOTE")
    protected float avaluotierraelote;
    @XmlElement(name = "AVALUOTOTAL_ELOTE")
    protected float avaluototalelote;
    @XmlElement(name = "ID_ELOTE")
    protected Integer idelote;

    /**
     * Obtiene el valor de la propiedad avaluoconelote.
     * 
     */
    public float getAVALUOCONELOTE() {
        return avaluoconelote;
    }

    /**
     * Define el valor de la propiedad avaluoconelote.
     * 
     */
    public void setAVALUOCONELOTE(float value) {
        this.avaluoconelote = value;
    }

    /**
     * Obtiene el valor de la propiedad avaluotierraelote.
     * 
     */
    public float getAVALUOTIERRAELOTE() {
        return avaluotierraelote;
    }

    /**
     * Define el valor de la propiedad avaluotierraelote.
     * 
     */
    public void setAVALUOTIERRAELOTE(float value) {
        this.avaluotierraelote = value;
    }

    /**
     * Obtiene el valor de la propiedad avaluototalelote.
     * 
     */
    public float getAVALUOTOTALELOTE() {
        return avaluototalelote;
    }

    /**
     * Define el valor de la propiedad avaluototalelote.
     * 
     */
    public void setAVALUOTOTALELOTE(float value) {
        this.avaluototalelote = value;
    }

    /**
     * Obtiene el valor de la propiedad idelote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDELOTE() {
        return idelote;
    }

    /**
     * Define el valor de la propiedad idelote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDELOTE(Integer value) {
        this.idelote = value;
    }

}
