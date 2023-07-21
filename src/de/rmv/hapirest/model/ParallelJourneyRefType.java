
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information on parallel journeys.
 * 
 * <p>Java class for ParallelJourneyRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParallelJourneyRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="toLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.ParallelJourneyRef"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParallelJourneyRefType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "fromLocation",
    "toLocation"
})
public class ParallelJourneyRefType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType fromLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType toLocation;
    @XmlAttribute(name = "journeyDetailRef")
    protected String journeyDetailRef;
    @XmlAttribute(name = "type")
    protected ParallelJourneyType type;

    /**
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setFromLocation(StopType value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setToLocation(StopType value) {
        this.toLocation = value;
    }

    /**
     * Gets the value of the journeyDetailRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyDetailRef() {
        return journeyDetailRef;
    }

    /**
     * Sets the value of the journeyDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyDetailRef(String value) {
        this.journeyDetailRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ParallelJourneyType }
     *     
     */
    public ParallelJourneyType getType() {
        if (type == null) {
            return ParallelJourneyType.UNDEF;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParallelJourneyType }
     *     
     */
    public void setType(ParallelJourneyType value) {
        this.type = value;
    }

}
