
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="detour" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="daily" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="direct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="subOptimalDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="slowDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="economic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="convenient" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="specialtrain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ukNationalRouteingGuideFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="hint" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hintCode" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="unsharp" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="timeDiffCritical" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripStatusType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class TripStatusType {

    @XmlAttribute(name = "detour")
    protected Boolean detour;
    @XmlAttribute(name = "daily")
    protected Boolean daily;
    @XmlAttribute(name = "direct")
    protected Boolean direct;
    @XmlAttribute(name = "subOptimalDirect")
    protected Boolean subOptimalDirect;
    @XmlAttribute(name = "slowDirect")
    protected Boolean slowDirect;
    @XmlAttribute(name = "economic")
    protected Boolean economic;
    @XmlAttribute(name = "convenient")
    protected Boolean convenient;
    @XmlAttribute(name = "specialtrain")
    protected Boolean specialtrain;
    @XmlAttribute(name = "ukNationalRouteingGuideFailure")
    protected Boolean ukNationalRouteingGuideFailure;
    @XmlAttribute(name = "hint")
    protected String hint;
    @XmlAttribute(name = "hintCode")
    protected Integer hintCode;
    @XmlAttribute(name = "unsharp")
    protected Boolean unsharp;
    @XmlAttribute(name = "timeDiffCritical")
    protected Boolean timeDiffCritical;

    /**
     * Gets the value of the detour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDetour() {
        if (detour == null) {
            return false;
        } else {
            return detour;
        }
    }

    /**
     * Sets the value of the detour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetour(Boolean value) {
        this.detour = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDaily() {
        if (daily == null) {
            return false;
        } else {
            return daily;
        }
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaily(Boolean value) {
        this.daily = value;
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
     * Gets the value of the subOptimalDirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSubOptimalDirect() {
        if (subOptimalDirect == null) {
            return false;
        } else {
            return subOptimalDirect;
        }
    }

    /**
     * Sets the value of the subOptimalDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubOptimalDirect(Boolean value) {
        this.subOptimalDirect = value;
    }

    /**
     * Gets the value of the slowDirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSlowDirect() {
        if (slowDirect == null) {
            return false;
        } else {
            return slowDirect;
        }
    }

    /**
     * Sets the value of the slowDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlowDirect(Boolean value) {
        this.slowDirect = value;
    }

    /**
     * Gets the value of the economic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEconomic() {
        if (economic == null) {
            return false;
        } else {
            return economic;
        }
    }

    /**
     * Sets the value of the economic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEconomic(Boolean value) {
        this.economic = value;
    }

    /**
     * Gets the value of the convenient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConvenient() {
        if (convenient == null) {
            return false;
        } else {
            return convenient;
        }
    }

    /**
     * Sets the value of the convenient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvenient(Boolean value) {
        this.convenient = value;
    }

    /**
     * Gets the value of the specialtrain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSpecialtrain() {
        if (specialtrain == null) {
            return false;
        } else {
            return specialtrain;
        }
    }

    /**
     * Sets the value of the specialtrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialtrain(Boolean value) {
        this.specialtrain = value;
    }

    /**
     * Gets the value of the ukNationalRouteingGuideFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUkNationalRouteingGuideFailure() {
        if (ukNationalRouteingGuideFailure == null) {
            return false;
        } else {
            return ukNationalRouteingGuideFailure;
        }
    }

    /**
     * Sets the value of the ukNationalRouteingGuideFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUkNationalRouteingGuideFailure(Boolean value) {
        this.ukNationalRouteingGuideFailure = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Gets the value of the hintCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHintCode() {
        return hintCode;
    }

    /**
     * Sets the value of the hintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHintCode(Integer value) {
        this.hintCode = value;
    }

    /**
     * Gets the value of the unsharp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnsharp() {
        if (unsharp == null) {
            return false;
        } else {
            return unsharp;
        }
    }

    /**
     * Sets the value of the unsharp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsharp(Boolean value) {
        this.unsharp = value;
    }

    /**
     * Gets the value of the timeDiffCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTimeDiffCritical() {
        if (timeDiffCritical == null) {
            return false;
        } else {
            return timeDiffCritical;
        }
    }

    /**
     * Sets the value of the timeDiffCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDiffCritical(Boolean value) {
        this.timeDiffCritical = value;
    }

}
