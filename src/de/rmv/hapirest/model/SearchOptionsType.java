
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
 * <p>Java class for SearchOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blocking" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numB" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="numF" type="{http://www.w3.org/2001/XMLSchema}int" default="5" /&gt;
 *       &lt;attribute name="context"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="8096"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="changeTimePercent" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="minChangeTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="maxChangeTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="addChangeTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="maxChanges" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="searchForArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="rtMode" type="{http://hacon.de/hafas/proxy/hafas-proxy}RtModeType" default="SERVER_DEFAULT" /&gt;
 *       &lt;attribute name="unsharp" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="economic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="includeEarlier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="withICTAlternatives" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptionsType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "blocking"
})
public class SearchOptionsType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> blocking;
    @XmlAttribute(name = "numB")
    protected Integer numB;
    @XmlAttribute(name = "numF")
    protected Integer numF;
    @XmlAttribute(name = "context")
    protected String context;
    @XmlAttribute(name = "changeTimePercent")
    protected BigInteger changeTimePercent;
    @XmlAttribute(name = "minChangeTime")
    protected BigInteger minChangeTime;
    @XmlAttribute(name = "maxChangeTime")
    protected BigInteger maxChangeTime;
    @XmlAttribute(name = "addChangeTime")
    protected BigInteger addChangeTime;
    @XmlAttribute(name = "maxChanges")
    protected BigInteger maxChanges;
    @XmlAttribute(name = "searchForArrival")
    protected Boolean searchForArrival;
    @XmlAttribute(name = "rtMode")
    protected RtModeType rtMode;
    @XmlAttribute(name = "unsharp")
    protected Boolean unsharp;
    @XmlAttribute(name = "economic")
    protected Boolean economic;
    @XmlAttribute(name = "includeEarlier")
    protected Boolean includeEarlier;
    @XmlAttribute(name = "withICTAlternatives")
    protected Boolean withICTAlternatives;

    /**
     * Gets the value of the blocking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the blocking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlocking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlocking() {
        if (blocking == null) {
            blocking = new ArrayList<String>();
        }
        return this.blocking;
    }

    /**
     * Gets the value of the numB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumB() {
        if (numB == null) {
            return  0;
        } else {
            return numB;
        }
    }

    /**
     * Sets the value of the numB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumB(Integer value) {
        this.numB = value;
    }

    /**
     * Gets the value of the numF property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumF() {
        if (numF == null) {
            return  5;
        } else {
            return numF;
        }
    }

    /**
     * Sets the value of the numF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumF(Integer value) {
        this.numF = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the changeTimePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeTimePercent() {
        return changeTimePercent;
    }

    /**
     * Sets the value of the changeTimePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeTimePercent(BigInteger value) {
        this.changeTimePercent = value;
    }

    /**
     * Gets the value of the minChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinChangeTime() {
        return minChangeTime;
    }

    /**
     * Sets the value of the minChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinChangeTime(BigInteger value) {
        this.minChangeTime = value;
    }

    /**
     * Gets the value of the maxChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChangeTime() {
        return maxChangeTime;
    }

    /**
     * Sets the value of the maxChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChangeTime(BigInteger value) {
        this.maxChangeTime = value;
    }

    /**
     * Gets the value of the addChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddChangeTime() {
        return addChangeTime;
    }

    /**
     * Sets the value of the addChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddChangeTime(BigInteger value) {
        this.addChangeTime = value;
    }

    /**
     * Gets the value of the maxChanges property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChanges() {
        return maxChanges;
    }

    /**
     * Sets the value of the maxChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChanges(BigInteger value) {
        this.maxChanges = value;
    }

    /**
     * Gets the value of the searchForArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSearchForArrival() {
        if (searchForArrival == null) {
            return false;
        } else {
            return searchForArrival;
        }
    }

    /**
     * Sets the value of the searchForArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchForArrival(Boolean value) {
        this.searchForArrival = value;
    }

    /**
     * Gets the value of the rtMode property.
     * 
     * @return
     *     possible object is
     *     {@link RtModeType }
     *     
     */
    public RtModeType getRtMode() {
        if (rtMode == null) {
            return RtModeType.SERVER_DEFAULT;
        } else {
            return rtMode;
        }
    }

    /**
     * Sets the value of the rtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtModeType }
     *     
     */
    public void setRtMode(RtModeType value) {
        this.rtMode = value;
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
     * Gets the value of the includeEarlier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeEarlier() {
        if (includeEarlier == null) {
            return false;
        } else {
            return includeEarlier;
        }
    }

    /**
     * Sets the value of the includeEarlier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEarlier(Boolean value) {
        this.includeEarlier = value;
    }

    /**
     * Gets the value of the withICTAlternatives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWithICTAlternatives() {
        if (withICTAlternatives == null) {
            return false;
        } else {
            return withICTAlternatives;
        }
    }

    /**
     * Sets the value of the withICTAlternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithICTAlternatives(Boolean value) {
        this.withICTAlternatives = value;
    }

}
