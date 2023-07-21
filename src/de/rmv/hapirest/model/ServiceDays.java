
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Irregular service days describe a different schedule of days.
 * 
 * <p>Java class for ServiceDays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDays"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="planningPeriodBegin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="planningPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysB" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="routeIdxFrom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="routeIdxTo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDays", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class ServiceDays {

    @XmlAttribute(name = "planningPeriodBegin")
    protected String planningPeriodBegin;
    @XmlAttribute(name = "planningPeriodEnd")
    protected String planningPeriodEnd;
    @XmlAttribute(name = "sDaysR")
    protected String sDaysR;
    @XmlAttribute(name = "sDaysI")
    protected String sDaysI;
    @XmlAttribute(name = "sDaysB")
    protected String sDaysB;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;

    /**
     * Gets the value of the planningPeriodBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningPeriodBegin() {
        return planningPeriodBegin;
    }

    /**
     * Sets the value of the planningPeriodBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningPeriodBegin(String value) {
        this.planningPeriodBegin = value;
    }

    /**
     * Gets the value of the planningPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningPeriodEnd() {
        return planningPeriodEnd;
    }

    /**
     * Sets the value of the planningPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningPeriodEnd(String value) {
        this.planningPeriodEnd = value;
    }

    /**
     * Gets the value of the sDaysR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDaysR() {
        return sDaysR;
    }

    /**
     * Sets the value of the sDaysR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDaysR(String value) {
        this.sDaysR = value;
    }

    /**
     * Gets the value of the sDaysI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDaysI() {
        return sDaysI;
    }

    /**
     * Sets the value of the sDaysI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDaysI(String value) {
        this.sDaysI = value;
    }

    /**
     * Gets the value of the sDaysB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDaysB() {
        return sDaysB;
    }

    /**
     * Sets the value of the sDaysB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDaysB(String value) {
        this.sDaysB = value;
    }

    /**
     * Gets the value of the routeIdxFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
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
    public Integer getRouteIdxTo() {
        return routeIdxTo;
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
