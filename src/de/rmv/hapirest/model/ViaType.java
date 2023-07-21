
package de.rmv.hapirest.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="waitTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="status" type="{http://hacon.de/hafas/proxy/hafas-proxy}ViaStatusType" /&gt;
 *       &lt;attribute name="products" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="attributes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="512"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="direct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="sleepingCar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="couchetteCoach" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViaType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "location"
})
public class ViaType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location location;
    @XmlAttribute(name = "waitTime")
    protected BigInteger waitTime;
    @XmlAttribute(name = "status")
    protected ViaStatusType status;
    @XmlAttribute(name = "products")
    protected BigInteger products;
    @XmlAttribute(name = "attributes")
    protected String attributes;
    @XmlAttribute(name = "direct")
    protected Boolean direct;
    @XmlAttribute(name = "sleepingCar")
    protected Boolean sleepingCar;
    @XmlAttribute(name = "couchetteCoach")
    protected Boolean couchetteCoach;

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
     * Gets the value of the waitTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitTime() {
        return waitTime;
    }

    /**
     * Sets the value of the waitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitTime(BigInteger value) {
        this.waitTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ViaStatusType }
     *     
     */
    public ViaStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViaStatusType }
     *     
     */
    public void setStatus(ViaStatusType value) {
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

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the direct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirect() {
        if (direct == null) {
            return false;
        } else {
            return direct;
        }
    }

    /**
     * Sets the value of the direct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirect(Boolean value) {
        this.direct = value;
    }

    /**
     * Gets the value of the sleepingCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSleepingCar() {
        if (sleepingCar == null) {
            return false;
        } else {
            return sleepingCar;
        }
    }

    /**
     * Sets the value of the sleepingCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSleepingCar(Boolean value) {
        this.sleepingCar = value;
    }

    /**
     * Gets the value of the couchetteCoach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCouchetteCoach() {
        if (couchetteCoach == null) {
            return false;
        } else {
            return couchetteCoach;
        }
    }

    /**
     * Sets the value of the couchetteCoach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCouchetteCoach(Boolean value) {
        this.couchetteCoach = value;
    }

}
