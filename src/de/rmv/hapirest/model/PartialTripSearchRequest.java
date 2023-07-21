
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ctx"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8096"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="psSettings" type="{http://hacon.de/hafas/proxy/hafas-proxy}PartialTripSearchSettingsType"/&gt;
 *         &lt;element name="via" type="{http://hacon.de/hafas/proxy/hafas-proxy}ViaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avoid" type="{http://hacon.de/hafas/proxy/hafas-proxy}AvoidType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gisProfile" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filters" type="{http://hacon.de/hafas/proxy/hafas-proxy}TripSearchFilterType"/&gt;
 *         &lt;element name="searchOptions" type="{http://hacon.de/hafas/proxy/hafas-proxy}SearchOptionsType"/&gt;
 *         &lt;element name="outputControl" type="{http://hacon.de/hafas/proxy/hafas-proxy}OutputControlType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ctx",
    "psSettings",
    "via",
    "avoid",
    "gisProfile",
    "filters",
    "searchOptions",
    "outputControl"
})
@XmlRootElement(name = "PartialTripSearchRequest", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class PartialTripSearchRequest {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected String ctx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected PartialTripSearchSettingsType psSettings;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ViaType> via;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<AvoidType> avoid;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GisProfile> gisProfile;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected TripSearchFilterType filters;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected SearchOptionsType searchOptions;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected OutputControlType outputControl;

    /**
     * Gets the value of the ctx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtx() {
        return ctx;
    }

    /**
     * Sets the value of the ctx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtx(String value) {
        this.ctx = value;
    }

    /**
     * Gets the value of the psSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PartialTripSearchSettingsType }
     *     
     */
    public PartialTripSearchSettingsType getPsSettings() {
        return psSettings;
    }

    /**
     * Sets the value of the psSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialTripSearchSettingsType }
     *     
     */
    public void setPsSettings(PartialTripSearchSettingsType value) {
        this.psSettings = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViaType }
     * 
     * 
     */
    public List<ViaType> getVia() {
        if (via == null) {
            via = new ArrayList<ViaType>();
        }
        return this.via;
    }

    /**
     * Gets the value of the avoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the avoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvoidType }
     * 
     * 
     */
    public List<AvoidType> getAvoid() {
        if (avoid == null) {
            avoid = new ArrayList<AvoidType>();
        }
        return this.avoid;
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
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link TripSearchFilterType }
     *     
     */
    public TripSearchFilterType getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripSearchFilterType }
     *     
     */
    public void setFilters(TripSearchFilterType value) {
        this.filters = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptionsType }
     *     
     */
    public SearchOptionsType getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptionsType }
     *     
     */
    public void setSearchOptions(SearchOptionsType value) {
        this.searchOptions = value;
    }

    /**
     * Gets the value of the outputControl property.
     * 
     * @return
     *     possible object is
     *     {@link OutputControlType }
     *     
     */
    public OutputControlType getOutputControl() {
        return outputControl;
    }

    /**
     * Sets the value of the outputControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputControlType }
     *     
     */
    public void setOutputControl(OutputControlType value) {
        this.outputControl = value;
    }

}
