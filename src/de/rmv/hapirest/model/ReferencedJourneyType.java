
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencedJourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedJourneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journey" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReferencedJourneyTypeType" /&gt;
 *       &lt;attribute name="origFromIdx" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="origToIdx" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="refFromIdx" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="refToIdx" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedJourneyType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "journey"
})
public class ReferencedJourneyType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyType journey;
    @XmlAttribute(name = "type", required = true)
    protected ReferencedJourneyTypeType type;
    @XmlAttribute(name = "origFromIdx")
    protected Integer origFromIdx;
    @XmlAttribute(name = "origToIdx")
    protected Integer origToIdx;
    @XmlAttribute(name = "refFromIdx")
    protected Integer refFromIdx;
    @XmlAttribute(name = "refToIdx")
    protected Integer refToIdx;

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyType }
     *     
     */
    public JourneyType getJourney() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyType }
     *     
     */
    public void setJourney(JourneyType value) {
        this.journey = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedJourneyTypeType }
     *     
     */
    public ReferencedJourneyTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedJourneyTypeType }
     *     
     */
    public void setType(ReferencedJourneyTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the origFromIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrigFromIdx() {
        return origFromIdx;
    }

    /**
     * Sets the value of the origFromIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrigFromIdx(Integer value) {
        this.origFromIdx = value;
    }

    /**
     * Gets the value of the origToIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrigToIdx() {
        return origToIdx;
    }

    /**
     * Sets the value of the origToIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrigToIdx(Integer value) {
        this.origToIdx = value;
    }

    /**
     * Gets the value of the refFromIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefFromIdx() {
        return refFromIdx;
    }

    /**
     * Sets the value of the refFromIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefFromIdx(Integer value) {
        this.refFromIdx = value;
    }

    /**
     * Gets the value of the refToIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefToIdx() {
        return refToIdx;
    }

    /**
     * Sets the value of the refToIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefToIdx(Integer value) {
        this.refToIdx = value;
    }

}
