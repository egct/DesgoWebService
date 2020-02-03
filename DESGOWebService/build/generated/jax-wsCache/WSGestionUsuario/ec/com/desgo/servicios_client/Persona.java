
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CARGO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEDULA_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CORREO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOTO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PAPELLIDO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNOMBRE_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROFESION_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SAPELLIDO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SNOMBRE_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "cargopersona",
    "cedulapersona",
    "correopersona",
    "fotopersona",
    "idpersona",
    "papellidopersona",
    "pnombrepersona",
    "profesionpersona",
    "sapellidopersona",
    "snombrepersona",
    "telefonopersona"
})
public class Persona {

    @XmlElement(name = "CARGO_PERSONA")
    protected String cargopersona;
    @XmlElement(name = "CEDULA_PERSONA")
    protected String cedulapersona;
    @XmlElement(name = "CORREO_PERSONA")
    protected String correopersona;
    @XmlElement(name = "FOTO_PERSONA")
    protected String fotopersona;
    @XmlElement(name = "ID_PERSONA")
    protected Integer idpersona;
    @XmlElement(name = "PAPELLIDO_PERSONA")
    protected String papellidopersona;
    @XmlElement(name = "PNOMBRE_PERSONA")
    protected String pnombrepersona;
    @XmlElement(name = "PROFESION_PERSONA")
    protected String profesionpersona;
    @XmlElement(name = "SAPELLIDO_PERSONA")
    protected String sapellidopersona;
    @XmlElement(name = "SNOMBRE_PERSONA")
    protected String snombrepersona;
    @XmlElement(name = "TELEFONO_PERSONA")
    protected String telefonopersona;

    /**
     * Obtiene el valor de la propiedad cargopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARGOPERSONA() {
        return cargopersona;
    }

    /**
     * Define el valor de la propiedad cargopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARGOPERSONA(String value) {
        this.cargopersona = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulapersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDULAPERSONA() {
        return cedulapersona;
    }

    /**
     * Define el valor de la propiedad cedulapersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDULAPERSONA(String value) {
        this.cedulapersona = value;
    }

    /**
     * Obtiene el valor de la propiedad correopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORREOPERSONA() {
        return correopersona;
    }

    /**
     * Define el valor de la propiedad correopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORREOPERSONA(String value) {
        this.correopersona = value;
    }

    /**
     * Obtiene el valor de la propiedad fotopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOTOPERSONA() {
        return fotopersona;
    }

    /**
     * Define el valor de la propiedad fotopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOTOPERSONA(String value) {
        this.fotopersona = value;
    }

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDPERSONA(Integer value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad papellidopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAPELLIDOPERSONA() {
        return papellidopersona;
    }

    /**
     * Define el valor de la propiedad papellidopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAPELLIDOPERSONA(String value) {
        this.papellidopersona = value;
    }

    /**
     * Obtiene el valor de la propiedad pnombrepersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNOMBREPERSONA() {
        return pnombrepersona;
    }

    /**
     * Define el valor de la propiedad pnombrepersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNOMBREPERSONA(String value) {
        this.pnombrepersona = value;
    }

    /**
     * Obtiene el valor de la propiedad profesionpersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFESIONPERSONA() {
        return profesionpersona;
    }

    /**
     * Define el valor de la propiedad profesionpersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFESIONPERSONA(String value) {
        this.profesionpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad sapellidopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPELLIDOPERSONA() {
        return sapellidopersona;
    }

    /**
     * Define el valor de la propiedad sapellidopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPELLIDOPERSONA(String value) {
        this.sapellidopersona = value;
    }

    /**
     * Obtiene el valor de la propiedad snombrepersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNOMBREPERSONA() {
        return snombrepersona;
    }

    /**
     * Define el valor de la propiedad snombrepersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNOMBREPERSONA(String value) {
        this.snombrepersona = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonopersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOPERSONA() {
        return telefonopersona;
    }

    /**
     * Define el valor de la propiedad telefonopersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOPERSONA(String value) {
        this.telefonopersona = value;
    }

}
