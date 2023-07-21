
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyPathItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPathItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="progressInTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="progressInPercent" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="progressAbs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fromLocationId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="toLocationId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dirGeo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="state" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyPathItemStateType" default="U" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPathItemType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class JourneyPathItemType {

    @XmlAttribute(name = "progressInTime")
    protected Integer progressInTime;
    @XmlAttribute(name = "progressInPercent")
    protected Integer progressInPercent;
    @XmlAttribute(name = "progressAbs")
    protected Integer progressAbs;
    @XmlAttribute(name = "fromLocationId")
    protected String fromLocationId;
    @XmlAttribute(name = "toLocationId")
    protected String toLocationId;
    @XmlAttribute(name = "dirGeo")
    protected Integer dirGeo;
    @XmlAttribute(name = "state")
    protected JourneyPathItemStateType state;

    /**
     * Gets the value of the progressInTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressInTime() {
        return progressInTime;
    }

    /**
     * Sets the value of the progressInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressInTime(Integer value) {
        this.progressInTime = value;
    }

    /**
     * Gets the value of the progressInPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressInPercent() {
        return progressInPercent;
    }

    /**
     * Sets the value of the progressInPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressInPercent(Integer value) {
        this.progressInPercent = value;
    }

    /**
     * Gets the value of the progressAbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressAbs() {
        return progressAbs;
    }

    /**
     * Sets the value of the progressAbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressAbs(Integer value) {
        this.progressAbs = value;
    }

    /**
     * Gets the value of the fromLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromLocationId() {
        return fromLocationId;
    }

    /**
     * Sets the value of the fromLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromLocationId(String value) {
        this.fromLocationId = value;
    }

    /**
     * Gets the value of the toLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLocationId() {
        return toLocationId;
    }

    /**
     * Sets the value of the toLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLocationId(String value) {
        this.toLocationId = value;
    }

    /**
     * Gets the value of the dirGeo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirGeo() {
        return dirGeo;
    }

    /**
     * Sets the value of the dirGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirGeo(Integer value) {
        this.dirGeo = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPathItemStateType }
     *     
     */
    public JourneyPathItemStateType getState() {
        if (state == null) {
            return JourneyPathItemStateType.U;
        } else {
            return state;
        }
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPathItemStateType }
     *     
     */
    public void setState(JourneyPathItemStateType value) {
        this.state = value;
    }

}
