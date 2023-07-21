
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SotContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SotContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calcDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calcTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="journeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="legIdxFootPathConnection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="prevLocRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="curLocRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locRouteIdxFootPathConnection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locMode" type="{http://hacon.de/hafas/proxy/hafas-proxy}SotContextLocModeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SotContextType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "calcDate",
    "calcTime",
    "journeyId",
    "trainName",
    "legIdx",
    "legIdxFootPathConnection",
    "prevLocRouteIdx",
    "curLocRouteIdx",
    "locRouteIdxFootPathConnection",
    "locMode"
})
public class SotContextType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String calcDate;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String calcTime;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String journeyId;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String trainName;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer legIdx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer legIdxFootPathConnection;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer prevLocRouteIdx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer curLocRouteIdx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer locRouteIdxFootPathConnection;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    @XmlSchemaType(name = "string")
    protected SotContextLocModeType locMode;

    /**
     * Gets the value of the calcDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcDate() {
        return calcDate;
    }

    /**
     * Sets the value of the calcDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcDate(String value) {
        this.calcDate = value;
    }

    /**
     * Gets the value of the calcTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcTime() {
        return calcTime;
    }

    /**
     * Sets the value of the calcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcTime(String value) {
        this.calcTime = value;
    }

    /**
     * Gets the value of the journeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyId() {
        return journeyId;
    }

    /**
     * Sets the value of the journeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyId(String value) {
        this.journeyId = value;
    }

    /**
     * Gets the value of the trainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * Sets the value of the trainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainName(String value) {
        this.trainName = value;
    }

    /**
     * Gets the value of the legIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegIdx() {
        return legIdx;
    }

    /**
     * Sets the value of the legIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegIdx(Integer value) {
        this.legIdx = value;
    }

    /**
     * Gets the value of the legIdxFootPathConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegIdxFootPathConnection() {
        return legIdxFootPathConnection;
    }

    /**
     * Sets the value of the legIdxFootPathConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegIdxFootPathConnection(Integer value) {
        this.legIdxFootPathConnection = value;
    }

    /**
     * Gets the value of the prevLocRouteIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrevLocRouteIdx() {
        return prevLocRouteIdx;
    }

    /**
     * Sets the value of the prevLocRouteIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrevLocRouteIdx(Integer value) {
        this.prevLocRouteIdx = value;
    }

    /**
     * Gets the value of the curLocRouteIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurLocRouteIdx() {
        return curLocRouteIdx;
    }

    /**
     * Sets the value of the curLocRouteIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurLocRouteIdx(Integer value) {
        this.curLocRouteIdx = value;
    }

    /**
     * Gets the value of the locRouteIdxFootPathConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocRouteIdxFootPathConnection() {
        return locRouteIdxFootPathConnection;
    }

    /**
     * Sets the value of the locRouteIdxFootPathConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocRouteIdxFootPathConnection(Integer value) {
        this.locRouteIdxFootPathConnection = value;
    }

    /**
     * Gets the value of the locMode property.
     * 
     * @return
     *     possible object is
     *     {@link SotContextLocModeType }
     *     
     */
    public SotContextLocModeType getLocMode() {
        return locMode;
    }

    /**
     * Sets the value of the locMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SotContextLocModeType }
     *     
     */
    public void setLocMode(SotContextLocModeType value) {
        this.locMode = value;
    }

}
