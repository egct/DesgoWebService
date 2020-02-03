
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTRASENIA_USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMPRESA_USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_TIPOUSUARIO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_USUARIO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="persona" type="{http://servicios.desgo.com.ec/}persona" minOccurs="0"/&gt;
 *         &lt;element name="SALT_USUARIO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoUsuario" type="{http://servicios.desgo.com.ec/}tipoUsuario" minOccurs="0"/&gt;
 *         &lt;element name="USUARIO_USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "contraseniausuario",
    "empresausuario",
    "idpersona",
    "idtipousuario",
    "idusuario",
    "persona",
    "saltusuario",
    "tipoUsuario",
    "usuariousuario"
})
public class User {

    @XmlElement(name = "CONTRASENIA_USUARIO")
    protected String contraseniausuario;
    @XmlElement(name = "EMPRESA_USUARIO")
    protected String empresausuario;
    @XmlElement(name = "ID_PERSONA")
    protected Integer idpersona;
    @XmlElement(name = "ID_TIPOUSUARIO")
    protected Integer idtipousuario;
    @XmlElement(name = "ID_USUARIO")
    protected Integer idusuario;
    protected Persona persona;
    @XmlElement(name = "SALT_USUARIO")
    protected Integer saltusuario;
    protected TipoUsuario tipoUsuario;
    @XmlElement(name = "USUARIO_USUARIO")
    protected String usuariousuario;

    /**
     * Obtiene el valor de la propiedad contraseniausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRASENIAUSUARIO() {
        return contraseniausuario;
    }

    /**
     * Define el valor de la propiedad contraseniausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRASENIAUSUARIO(String value) {
        this.contraseniausuario = value;
    }

    /**
     * Obtiene el valor de la propiedad empresausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESAUSUARIO() {
        return empresausuario;
    }

    /**
     * Define el valor de la propiedad empresausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESAUSUARIO(String value) {
        this.empresausuario = value;
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
     * Obtiene el valor de la propiedad idusuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDUSUARIO() {
        return idusuario;
    }

    /**
     * Define el valor de la propiedad idusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDUSUARIO(Integer value) {
        this.idusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
    }

    /**
     * Obtiene el valor de la propiedad saltusuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSALTUSUARIO() {
        return saltusuario;
    }

    /**
     * Define el valor de la propiedad saltusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSALTUSUARIO(Integer value) {
        this.saltusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuario }
     *     
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuario }
     *     
     */
    public void setTipoUsuario(TipoUsuario value) {
        this.tipoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad usuariousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIOUSUARIO() {
        return usuariousuario;
    }

    /**
     * Define el valor de la propiedad usuariousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIOUSUARIO(String value) {
        this.usuariousuario = value;
    }

}
