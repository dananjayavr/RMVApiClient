
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Direction"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Direction", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class Direction {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "flag")
    protected String flag;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the routeIdxFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRouteIdxFrom() {
        if (routeIdxFrom == null) {
            return -1;
        } else {
            return routeIdxFrom;
        }
    }

    /**
     * Sets the value of the routeIdxFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxFrom(Integer value) {
        this.routeIdxFrom = value;
    }

    /**
     * Gets the value of the routeIdxTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRouteIdxTo() {
        if (routeIdxTo == null) {
            return -1;
        } else {
            return routeIdxTo;
        }
    }

    /**
     * Sets the value of the routeIdxTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxTo(Integer value) {
        this.routeIdxTo = value;
    }

}
