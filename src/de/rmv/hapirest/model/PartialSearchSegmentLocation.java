
package de.rmv.hapirest.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSearchSegmentLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialSearchSegmentLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}Location"&gt;
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="supplChgTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialSearchSegmentLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class PartialSearchSegmentLocation
    extends Location
{

    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "time")
    protected String time;
    @XmlAttribute(name = "supplChgTime")
    protected BigInteger supplChgTime;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the supplChgTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplChgTime() {
        return supplChgTime;
    }

    /**
     * Sets the value of the supplChgTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplChgTime(BigInteger value) {
        this.supplChgTime = value;
    }

}
