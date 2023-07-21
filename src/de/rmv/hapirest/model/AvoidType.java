
package de.rmv.hapirest.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvoidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvoidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" type="{http://hacon.de/hafas/proxy/hafas-proxy}AvoidStatusType" /&gt;
 *       &lt;attribute name="products" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvoidType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "location"
})
public class AvoidType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location location;
    @XmlAttribute(name = "status")
    protected AvoidStatusType status;
    @XmlAttribute(name = "products")
    protected BigInteger products;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AvoidStatusType }
     *     
     */
    public AvoidStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvoidStatusType }
     *     
     */
    public void setStatus(AvoidStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProducts(BigInteger value) {
        this.products = value;
    }

}
