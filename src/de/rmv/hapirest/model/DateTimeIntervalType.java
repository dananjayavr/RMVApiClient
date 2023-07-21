
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeIntervalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="sTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeIntervalType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class DateTimeIntervalType {

    @XmlAttribute(name = "sTime")
    protected String sTime;
    @XmlAttribute(name = "sDate")
    protected String sDate;
    @XmlAttribute(name = "eTime")
    protected String eTime;
    @XmlAttribute(name = "eDate")
    protected String eDate;

    /**
     * Gets the value of the sTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTime() {
        return sTime;
    }

    /**
     * Sets the value of the sTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTime(String value) {
        this.sTime = value;
    }

    /**
     * Gets the value of the sDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDate() {
        return sDate;
    }

    /**
     * Sets the value of the sDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDate(String value) {
        this.sDate = value;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETime() {
        return eTime;
    }

    /**
     * Sets the value of the eTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETime(String value) {
        this.eTime = value;
    }

    /**
     * Gets the value of the eDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDate() {
        return eDate;
    }

    /**
     * Sets the value of the eDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDate(String value) {
        this.eDate = value;
    }

}
