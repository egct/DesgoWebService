
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_TIPOUSUARIO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NIVEL_TIPOUSUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoUsuario", propOrder = {
    "idtipousuario",
    "niveltipousuario"
})
public class TipoUsuario {

    @XmlElement(name = "ID_TIPOUSUARIO")
    protected Integer idtipousuario;
    @XmlElement(name = "NIVEL_TIPOUSUARIO")
    protected String niveltipousuario;

    /**
     * Obtiene el valor de la propiedad idtipousuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDTIPOUSUARIO() {
        return idtipousuario;
    }

    /**
     * Define el valor de la propiedad idtipousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDTIPOUSUARIO(Integer value) {
        this.idtipousuario = value;
    }

    /**
     * Obtiene el valor de la propiedad niveltipousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVELTIPOUSUARIO() {
        return niveltipousuario;
    }

    /**
     * Define el valor de la propiedad niveltipousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVELTIPOUSUARIO(String value) {
        this.niveltipousuario = value;
    }

}
