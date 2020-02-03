
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para identificacionLF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identificacionLF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FORMAADQUISICION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_COP_ILLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_DIR_ILLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_DOC_ILLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_ILLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_PRE_ILLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_PRO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificacionLF", propOrder = {
    "formaadquisicion",
    "idcopillote",
    "iddirillote",
    "iddocillote",
    "idillote",
    "idpreillote",
    "idpro"
})
public class IdentificacionLF {

    @XmlElement(name = "FORMAADQUISICION")
    protected String formaadquisicion;
    @XmlElement(name = "ID_COP_ILLOTE")
    protected Integer idcopillote;
    @XmlElement(name = "ID_DIR_ILLOTE")
    protected Integer iddirillote;
    @XmlElement(name = "ID_DOC_ILLOTE")
    protected Integer iddocillote;
    @XmlElement(name = "ID_ILLOTE")
    protected Integer idillote;
    @XmlElement(name = "ID_PRE_ILLOTE")
    protected Integer idpreillote;
    @XmlElement(name = "ID_PRO")
    protected Integer idpro;

    /**
     * Obtiene el valor de la propiedad formaadquisicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMAADQUISICION() {
        return formaadquisicion;
    }

    /**
     * Define el valor de la propiedad formaadquisicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMAADQUISICION(String value) {
        this.formaadquisicion = value;
    }

    /**
     * Obtiene el valor de la propiedad idcopillote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCOPILLOTE() {
        return idcopillote;
    }

    /**
     * Define el valor de la propiedad idcopillote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCOPILLOTE(Integer value) {
        this.idcopillote = value;
    }

    /**
     * Obtiene el valor de la propiedad iddirillote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDIRILLOTE() {
        return iddirillote;
    }

    /**
     * Define el valor de la propiedad iddirillote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDIRILLOTE(Integer value) {
        this.iddirillote = value;
    }

    /**
     * Obtiene el valor de la propiedad iddocillote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDOCILLOTE() {
        return iddocillote;
    }

    /**
     * Define el valor de la propiedad iddocillote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDOCILLOTE(Integer value) {
        this.iddocillote = value;
    }

    /**
     * Obtiene el valor de la propiedad idillote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDILLOTE() {
        return idillote;
    }

    /**
     * Define el valor de la propiedad idillote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDILLOTE(Integer value) {
        this.idillote = value;
    }

    /**
     * Obtiene el valor de la propiedad idpreillote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDPREILLOTE() {
        return idpreillote;
    }

    /**
     * Define el valor de la propiedad idpreillote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDPREILLOTE(Integer value) {
        this.idpreillote = value;
    }

    /**
     * Obtiene el valor de la propiedad idpro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDPRO() {
        return idpro;
    }

    /**
     * Define el valor de la propiedad idpro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDPRO(Integer value) {
        this.idpro = value;
    }

}
