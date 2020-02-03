
package ec.com.desgo.servicios_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formulario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formulario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caracterizacionC_F" type="{http://servicios.desgo.com.ec/}caracterizacionCF" minOccurs="0"/&gt;
 *         &lt;element name="caracterizacionL_F" type="{http://servicios.desgo.com.ec/}caracterizacionLF" minOccurs="0"/&gt;
 *         &lt;element name="economica_F" type="{http://servicios.desgo.com.ec/}economicaF" minOccurs="0"/&gt;
 *         &lt;element name="elementosC_F" type="{http://servicios.desgo.com.ec/}elementosCF" minOccurs="0"/&gt;
 *         &lt;element name="graficosP_F" type="{http://servicios.desgo.com.ec/}graficosPF" minOccurs="0"/&gt;
 *         &lt;element name="identificacionL_F" type="{http://servicios.desgo.com.ec/}identificacionLF" minOccurs="0"/&gt;
 *         &lt;element name="identificacionU_F" type="{http://servicios.desgo.com.ec/}identificacionUF" minOccurs="0"/&gt;
 *         &lt;element name="limites_F" type="{http://servicios.desgo.com.ec/}limitesF" minOccurs="0"/&gt;
 *         &lt;element name="mapa_F" type="{http://servicios.desgo.com.ec/}mapaF" minOccurs="0"/&gt;
 *         &lt;element name="mejora_F" type="{http://servicios.desgo.com.ec/}mejoraF" minOccurs="0"/&gt;
 *         &lt;element name="responsables_F" type="{http://servicios.desgo.com.ec/}responsablesF" minOccurs="0"/&gt;
 *         &lt;element name="vivienda_F" type="{http://servicios.desgo.com.ec/}viviendaF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulario", propOrder = {
    "caracterizacionCF",
    "caracterizacionLF",
    "economicaF",
    "elementosCF",
    "graficosPF",
    "identificacionLF",
    "identificacionUF",
    "limitesF",
    "mapaF",
    "mejoraF",
    "responsablesF",
    "viviendaF"
})
public class Formulario {

    @XmlElement(name = "caracterizacionC_F")
    protected CaracterizacionCF caracterizacionCF;
    @XmlElement(name = "caracterizacionL_F")
    protected CaracterizacionLF caracterizacionLF;
    @XmlElement(name = "economica_F")
    protected EconomicaF economicaF;
    @XmlElement(name = "elementosC_F")
    protected ElementosCF elementosCF;
    @XmlElement(name = "graficosP_F")
    protected GraficosPF graficosPF;
    @XmlElement(name = "identificacionL_F")
    protected IdentificacionLF identificacionLF;
    @XmlElement(name = "identificacionU_F")
    protected IdentificacionUF identificacionUF;
    @XmlElement(name = "limites_F")
    protected LimitesF limitesF;
    @XmlElement(name = "mapa_F")
    protected MapaF mapaF;
    @XmlElement(name = "mejora_F")
    protected MejoraF mejoraF;
    @XmlElement(name = "responsables_F")
    protected ResponsablesF responsablesF;
    @XmlElement(name = "vivienda_F")
    protected ViviendaF viviendaF;

    /**
     * Obtiene el valor de la propiedad caracterizacionCF.
     * 
     * @return
     *     possible object is
     *     {@link CaracterizacionCF }
     *     
     */
    public CaracterizacionCF getCaracterizacionCF() {
        return caracterizacionCF;
    }

    /**
     * Define el valor de la propiedad caracterizacionCF.
     * 
     * @param value
     *     allowed object is
     *     {@link CaracterizacionCF }
     *     
     */
    public void setCaracterizacionCF(CaracterizacionCF value) {
        this.caracterizacionCF = value;
    }

    /**
     * Obtiene el valor de la propiedad caracterizacionLF.
     * 
     * @return
     *     possible object is
     *     {@link CaracterizacionLF }
     *     
     */
    public CaracterizacionLF getCaracterizacionLF() {
        return caracterizacionLF;
    }

    /**
     * Define el valor de la propiedad caracterizacionLF.
     * 
     * @param value
     *     allowed object is
     *     {@link CaracterizacionLF }
     *     
     */
    public void setCaracterizacionLF(CaracterizacionLF value) {
        this.caracterizacionLF = value;
    }

    /**
     * Obtiene el valor de la propiedad economicaF.
     * 
     * @return
     *     possible object is
     *     {@link EconomicaF }
     *     
     */
    public EconomicaF getEconomicaF() {
        return economicaF;
    }

    /**
     * Define el valor de la propiedad economicaF.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicaF }
     *     
     */
    public void setEconomicaF(EconomicaF value) {
        this.economicaF = value;
    }

    /**
     * Obtiene el valor de la propiedad elementosCF.
     * 
     * @return
     *     possible object is
     *     {@link ElementosCF }
     *     
     */
    public ElementosCF getElementosCF() {
        return elementosCF;
    }

    /**
     * Define el valor de la propiedad elementosCF.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementosCF }
     *     
     */
    public void setElementosCF(ElementosCF value) {
        this.elementosCF = value;
    }

    /**
     * Obtiene el valor de la propiedad graficosPF.
     * 
     * @return
     *     possible object is
     *     {@link GraficosPF }
     *     
     */
    public GraficosPF getGraficosPF() {
        return graficosPF;
    }

    /**
     * Define el valor de la propiedad graficosPF.
     * 
     * @param value
     *     allowed object is
     *     {@link GraficosPF }
     *     
     */
    public void setGraficosPF(GraficosPF value) {
        this.graficosPF = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionLF.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionLF }
     *     
     */
    public IdentificacionLF getIdentificacionLF() {
        return identificacionLF;
    }

    /**
     * Define el valor de la propiedad identificacionLF.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionLF }
     *     
     */
    public void setIdentificacionLF(IdentificacionLF value) {
        this.identificacionLF = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionUF.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionUF }
     *     
     */
    public IdentificacionUF getIdentificacionUF() {
        return identificacionUF;
    }

    /**
     * Define el valor de la propiedad identificacionUF.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionUF }
     *     
     */
    public void setIdentificacionUF(IdentificacionUF value) {
        this.identificacionUF = value;
    }

    /**
     * Obtiene el valor de la propiedad limitesF.
     * 
     * @return
     *     possible object is
     *     {@link LimitesF }
     *     
     */
    public LimitesF getLimitesF() {
        return limitesF;
    }

    /**
     * Define el valor de la propiedad limitesF.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitesF }
     *     
     */
    public void setLimitesF(LimitesF value) {
        this.limitesF = value;
    }

    /**
     * Obtiene el valor de la propiedad mapaF.
     * 
     * @return
     *     possible object is
     *     {@link MapaF }
     *     
     */
    public MapaF getMapaF() {
        return mapaF;
    }

    /**
     * Define el valor de la propiedad mapaF.
     * 
     * @param value
     *     allowed object is
     *     {@link MapaF }
     *     
     */
    public void setMapaF(MapaF value) {
        this.mapaF = value;
    }

    /**
     * Obtiene el valor de la propiedad mejoraF.
     * 
     * @return
     *     possible object is
     *     {@link MejoraF }
     *     
     */
    public MejoraF getMejoraF() {
        return mejoraF;
    }

    /**
     * Define el valor de la propiedad mejoraF.
     * 
     * @param value
     *     allowed object is
     *     {@link MejoraF }
     *     
     */
    public void setMejoraF(MejoraF value) {
        this.mejoraF = value;
    }

    /**
     * Obtiene el valor de la propiedad responsablesF.
     * 
     * @return
     *     possible object is
     *     {@link ResponsablesF }
     *     
     */
    public ResponsablesF getResponsablesF() {
        return responsablesF;
    }

    /**
     * Define el valor de la propiedad responsablesF.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsablesF }
     *     
     */
    public void setResponsablesF(ResponsablesF value) {
        this.responsablesF = value;
    }

    /**
     * Obtiene el valor de la propiedad viviendaF.
     * 
     * @return
     *     possible object is
     *     {@link ViviendaF }
     *     
     */
    public ViviendaF getViviendaF() {
        return viviendaF;
    }

    /**
     * Define el valor de la propiedad viviendaF.
     * 
     * @param value
     *     allowed object is
     *     {@link ViviendaF }
     *     
     */
    public void setViviendaF(ViviendaF value) {
        this.viviendaF = value;
    }

}
