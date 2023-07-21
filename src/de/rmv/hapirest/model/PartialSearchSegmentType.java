
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSearchSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialSearchSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}PartialSearchSegmentLocation"/&gt;
 *         &lt;element name="endLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}PartialSearchSegmentLocation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialSearchSegmentType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "beginLocation",
    "endLocation"
})
public class PartialSearchSegmentType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected PartialSearchSegmentLocation beginLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected PartialSearchSegmentLocation endLocation;

    /**
     * Gets the value of the beginLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSearchSegmentLocation }
     *     
     */
    public PartialSearchSegmentLocation getBeginLocation() {
        return beginLocation;
    }

    /**
     * Sets the value of the beginLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSearchSegmentLocation }
     *     
     */
    public void setBeginLocation(PartialSearchSegmentLocation value) {
        this.beginLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSearchSegmentLocation }
     *     
     */
    public PartialSearchSegmentLocation getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSearchSegmentLocation }
     *     
     */
    public void setEndLocation(PartialSearchSegmentLocation value) {
        this.endLocation = value;
    }

}
