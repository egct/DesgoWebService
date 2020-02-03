
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para identificacionUF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identificacionUF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLAVECATASTRALANTIGUO_IULOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLAVECATASTRALNUEVO_IULOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_IULOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NUMEROPREDIO_IULOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificacionUF", propOrder = {
    "clavecatastralantiguoiulote",
    "clavecatastralnuevoiulote",
    "idddplote",
    "idiulote",
    "numeropredioiulote"
})
public class IdentificacionUF {

    @XmlElement(name = "CLAVECATASTRALANTIGUO_IULOTE")
    protected String clavecatastralantiguoiulote;
    @XmlElement(name = "CLAVECATASTRALNUEVO_IULOTE")
    protected String clavecatastralnuevoiulote;
    @XmlElement(name = "ID_DDPLOTE")
    protected Integer idddplote;
    @XmlElement(name = "ID_IULOTE")
    protected Integer idiulote;
    @XmlElement(name = "NUMEROPREDIO_IULOTE")
    protected String numeropredioiulote;

    /**
     * Obtiene el valor de la propiedad clavecatastralantiguoiulote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECATASTRALANTIGUOIULOTE() {
        return clavecatastralantiguoiulote;
    }

    /**
     * Define el valor de la propiedad clavecatastralantiguoiulote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECATASTRALANTIGUOIULOTE(String value) {
        this.clavecatastralantiguoiulote = value;
    }

    /**
     * Obtiene el valor de la propiedad clavecatastralnuevoiulote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECATASTRALNUEVOIULOTE() {
        return clavecatastralnuevoiulote;
    }

    /**
     * Define el valor de la propiedad clavecatastralnuevoiulote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECATASTRALNUEVOIULOTE(String value) {
        this.clavecatastralnuevoiulote = value;
    }

    /**
     * Obtiene el valor de la propiedad idddplote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDDPLOTE() {
        return idddplote;
    }

    /**
     * Define el valor de la propiedad idddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDDPLOTE(Integer value) {
        this.idddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad idiulote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDIULOTE() {
        return idiulote;
    }

    /**
     * Define el valor de la propiedad idiulote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDIULOTE(Integer value) {
        this.idiulote = value;
    }

    /**
     * Obtiene el valor de la propiedad numeropredioiulote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPREDIOIULOTE() {
        return numeropredioiulote;
    }

    /**
     * Define el valor de la propiedad numeropredioiulote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPREDIOIULOTE(String value) {
        this.numeropredioiulote = value;
    }

}
