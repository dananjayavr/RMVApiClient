
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialTripSearchSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialTripSearchSettingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="partialSearchReplacement" type="{http://hacon.de/hafas/proxy/hafas-proxy}PartialSearchReplacementType"/&gt;
 *         &lt;element name="partialSearchSegment" type="{http://hacon.de/hafas/proxy/hafas-proxy}PartialSearchSegmentType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialTripSearchSettingsType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "partialSearchReplacement",
    "partialSearchSegment"
})
public class PartialTripSearchSettingsType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PartialSearchReplacementType partialSearchReplacement;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PartialSearchSegmentType partialSearchSegment;

    /**
     * Gets the value of the partialSearchReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSearchReplacementType }
     *     
     */
    public PartialSearchReplacementType getPartialSearchReplacement() {
        return partialSearchReplacement;
    }

    /**
     * Sets the value of the partialSearchReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSearchReplacementType }
     *     
     */
    public void setPartialSearchReplacement(PartialSearchReplacementType value) {
        this.partialSearchReplacement = value;
    }

    /**
     * Gets the value of the partialSearchSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSearchSegmentType }
     *     
     */
    public PartialSearchSegmentType getPartialSearchSegment() {
        return partialSearchSegment;
    }

    /**
     * Sets the value of the partialSearchSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSearchSegmentType }
     *     
     */
    public void setPartialSearchSegment(PartialSearchSegmentType value) {
        this.partialSearchSegment = value;
    }

}
