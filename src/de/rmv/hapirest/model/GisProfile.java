
package de.rmv.hapirest.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GisProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routerOption" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisProfileType" /&gt;
 *       &lt;attribute name="appliesTo" use="required" type="{http://hacon.de/hafas/proxy/hafas-proxy}ApplyToType" /&gt;
 *       &lt;attribute name="minDist" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="maxDist" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="beeline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisProfile", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "routerOption",
    "attribute"
})
public class GisProfile {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> routerOption;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> attribute;
    @XmlAttribute(name = "type", required = true)
    protected GisProfileType type;
    @XmlAttribute(name = "appliesTo", required = true)
    protected ApplyToType appliesTo;
    @XmlAttribute(name = "minDist")
    protected BigInteger minDist;
    @XmlAttribute(name = "maxDist")
    protected BigInteger maxDist;
    @XmlAttribute(name = "speed")
    protected BigInteger speed;
    @XmlAttribute(name = "beeline")
    protected Boolean beeline;

    /**
     * Gets the value of the routerOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the routerOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouterOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getRouterOption() {
        if (routerOption == null) {
            routerOption = new ArrayList<KVType>();
        }
        return this.routerOption;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<String>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GisProfileType }
     *     
     */
    public GisProfileType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisProfileType }
     *     
     */
    public void setType(GisProfileType value) {
        this.type = value;
    }

    /**
     * Gets the value of the appliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyToType }
     *     
     */
    public ApplyToType getAppliesTo() {
        return appliesTo;
    }

    /**
     * Sets the value of the appliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyToType }
     *     
     */
    public void setAppliesTo(ApplyToType value) {
        this.appliesTo = value;
    }

    /**
     * Gets the value of the minDist property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDist() {
        return minDist;
    }

    /**
     * Sets the value of the minDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDist(BigInteger value) {
        this.minDist = value;
    }

    /**
     * Gets the value of the maxDist property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDist() {
        return maxDist;
    }

    /**
     * Sets the value of the maxDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDist(BigInteger value) {
        this.maxDist = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeed(BigInteger value) {
        this.speed = value;
    }

    /**
     * Gets the value of the beeline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBeeline() {
        if (beeline == null) {
            return false;
        } else {
            return beeline;
        }
    }

    /**
     * Sets the value of the beeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeeline(Boolean value) {
        this.beeline = value;
    }

}
