
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionReliabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionReliabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="original" type="{http://hacon.de/hafas/proxy/hafas-proxy}ConnectionReliabilityValueType" /&gt;
 *       &lt;attribute name="alternative" type="{http://hacon.de/hafas/proxy/hafas-proxy}ConnectionReliabilityValueType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionReliabilityType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class ConnectionReliabilityType {

    @XmlAttribute(name = "original")
    protected ConnectionReliabilityValueType original;
    @XmlAttribute(name = "alternative")
    protected ConnectionReliabilityValueType alternative;

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionReliabilityValueType }
     *     
     */
    public ConnectionReliabilityValueType getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionReliabilityValueType }
     *     
     */
    public void setOriginal(ConnectionReliabilityValueType value) {
        this.original = value;
    }

    /**
     * Gets the value of the alternative property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionReliabilityValueType }
     *     
     */
    public ConnectionReliabilityValueType getAlternative() {
        return alternative;
    }

    /**
     * Sets the value of the alternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionReliabilityValueType }
     *     
     */
    public void setAlternative(ConnectionReliabilityValueType value) {
        this.alternative = value;
    }

}
