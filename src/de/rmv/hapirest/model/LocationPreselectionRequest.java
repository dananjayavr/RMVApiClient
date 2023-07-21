
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *         &lt;element name="gisProfile" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mode" type="{http://hacon.de/hafas/proxy/hafas-proxy}LocationPreselectionModeType" default="ESTIMATE" /&gt;
 *       &lt;attribute name="strategy" type="{http://hacon.de/hafas/proxy/hafas-proxy}LocationPreselectionStrategyType" default="ONE_TO_N_SELECTION" /&gt;
 *       &lt;attribute name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "referenceLocation",
    "gisProfile"
})
@XmlRootElement(name = "LocationPreselectionRequest", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class LocationPreselectionRequest {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location referenceLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GisProfile> gisProfile;
    @XmlAttribute(name = "mode")
    protected LocationPreselectionModeType mode;
    @XmlAttribute(name = "strategy")
    protected LocationPreselectionStrategyType strategy;
    @XmlAttribute(name = "datetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;

    /**
     * Gets the value of the referenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setReferenceLocation(Location value) {
        this.referenceLocation = value;
    }

    /**
     * Gets the value of the gisProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gisProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGisProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GisProfile }
     * 
     * 
     */
    public List<GisProfile> getGisProfile() {
        if (gisProfile == null) {
            gisProfile = new ArrayList<GisProfile>();
        }
        return this.gisProfile;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationPreselectionModeType }
     *     
     */
    public LocationPreselectionModeType getMode() {
        if (mode == null) {
            return LocationPreselectionModeType.ESTIMATE;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationPreselectionModeType }
     *     
     */
    public void setMode(LocationPreselectionModeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link LocationPreselectionStrategyType }
     *     
     */
    public LocationPreselectionStrategyType getStrategy() {
        if (strategy == null) {
            return LocationPreselectionStrategyType.ONE_TO_N_SELECTION;
        } else {
            return strategy;
        }
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationPreselectionStrategyType }
     *     
     */
    public void setStrategy(LocationPreselectionStrategyType value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetime(XMLGregorianCalendar value) {
        this.datetime = value;
    }

}
