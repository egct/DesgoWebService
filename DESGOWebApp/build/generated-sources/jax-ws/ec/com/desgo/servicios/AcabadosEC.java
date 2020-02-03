
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para acabadosEC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acabadosEC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ELRMINACIONEXCRETAS_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENERGIAELECTRICAP_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_AC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PISO_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PUERTAS_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REVESTIMIENTOCUBIERTA_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REVESTIMIENTOPARED_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPOACABADO_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TUMBADO_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VENTANA_AC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acabadosEC", propOrder = {
    "elrminacionexcretasac",
    "energiaelectricapac",
    "idac",
    "pisoac",
    "puertasac",
    "revestimientocubiertaac",
    "revestimientoparedac",
    "tipoacabadoac",
    "tumbadoac",
    "ventanaac"
})
public class AcabadosEC {

    @XmlElement(name = "ELRMINACIONEXCRETAS_AC")
    protected String elrminacionexcretasac;
    @XmlElement(name = "ENERGIAELECTRICAP_AC")
    protected String energiaelectricapac;
    @XmlElement(name = "ID_AC")
    protected Integer idac;
    @XmlElement(name = "PISO_AC")
    protected String pisoac;
    @XmlElement(name = "PUERTAS_AC")
    protected String puertasac;
    @XmlElement(name = "REVESTIMIENTOCUBIERTA_AC")
    protected String revestimientocubiertaac;
    @XmlElement(name = "REVESTIMIENTOPARED_AC")
    protected String revestimientoparedac;
    @XmlElement(name = "TIPOACABADO_AC")
    protected String tipoacabadoac;
    @XmlElement(name = "TUMBADO_AC")
    protected String tumbadoac;
    @XmlElement(name = "VENTANA_AC")
    protected String ventanaac;

    /**
     * Obtiene el valor de la propiedad elrminacionexcretasac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELRMINACIONEXCRETASAC() {
        return elrminacionexcretasac;
    }

    /**
     * Define el valor de la propiedad elrminacionexcretasac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELRMINACIONEXCRETASAC(String value) {
        this.elrminacionexcretasac = value;
    }

    /**
     * Obtiene el valor de la propiedad energiaelectricapac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENERGIAELECTRICAPAC() {
        return energiaelectricapac;
    }

    /**
     * Define el valor de la propiedad energiaelectricapac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENERGIAELECTRICAPAC(String value) {
        this.energiaelectricapac = value;
    }

    /**
     * Obtiene el valor de la propiedad idac.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDAC() {
        return idac;
    }

    /**
     * Define el valor de la propiedad idac.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDAC(Integer value) {
        this.idac = value;
    }

    /**
     * Obtiene el valor de la propiedad pisoac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISOAC() {
        return pisoac;
    }

    /**
     * Define el valor de la propiedad pisoac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISOAC(String value) {
        this.pisoac = value;
    }

    /**
     * Obtiene el valor de la propiedad puertasac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUERTASAC() {
        return puertasac;
    }

    /**
     * Define el valor de la propiedad puertasac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUERTASAC(String value) {
        this.puertasac = value;
    }

    /**
     * Obtiene el valor de la propiedad revestimientocubiertaac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVESTIMIENTOCUBIERTAAC() {
        return revestimientocubiertaac;
    }

    /**
     * Define el valor de la propiedad revestimientocubiertaac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVESTIMIENTOCUBIERTAAC(String value) {
        this.revestimientocubiertaac = value;
    }

    /**
     * Obtiene el valor de la propiedad revestimientoparedac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVESTIMIENTOPAREDAC() {
        return revestimientoparedac;
    }

    /**
     * Define el valor de la propiedad revestimientoparedac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVESTIMIENTOPAREDAC(String value) {
        this.revestimientoparedac = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoacabadoac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOACABADOAC() {
        return tipoacabadoac;
    }

    /**
     * Define el valor de la propiedad tipoacabadoac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOACABADOAC(String value) {
        this.tipoacabadoac = value;
    }

    /**
     * Obtiene el valor de la propiedad tumbadoac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUMBADOAC() {
        return tumbadoac;
    }

    /**
     * Define el valor de la propiedad tumbadoac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUMBADOAC(String value) {
        this.tumbadoac = value;
    }

    /**
     * Obtiene el valor de la propiedad ventanaac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENTANAAC() {
        return ventanaac;
    }

    /**
     * Define el valor de la propiedad ventanaac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENTANAAC(String value) {
        this.ventanaac = value;
    }

}
