
package de.rmv.hapirest.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}LocationNotes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productAtStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}TariffResult" minOccurs="0"/&gt;
 *         &lt;element name="links" type="{http://hacon.de/hafas/proxy/hafas-proxy}ResourceLinks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainMastAltId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timezoneOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="equivalentStopLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entryPointLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.StopLocation"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "locationNotes",
    "message",
    "productAtStop",
    "tariffResult",
    "links",
    "altId",
    "mainMastAltId",
    "timezoneOffset",
    "equivalentStopLocation",
    "entryPointLocation"
})
public class StopLocation {

    @XmlElement(name = "LocationNotes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected LocationNotes locationNotes;
    @XmlElement(name = "Message", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Message> message;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> productAtStop;
    @XmlElement(name = "TariffResult", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TariffResult tariffResult;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ResourceLinks> links;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> altId;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> mainMastAltId;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer timezoneOffset;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<StopLocation> equivalentStopLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<StopLocation> entryPointLocation;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "extId", required = true)
    protected String extId;
    @XmlAttribute(name = "hasMainMast")
    protected Boolean hasMainMast;
    @XmlAttribute(name = "mainMastId")
    protected String mainMastId;
    @XmlAttribute(name = "mainMastExtId")
    protected String mainMastExtId;
    @XmlAttribute(name = "mainMastLon")
    protected BigDecimal mainMastLon;
    @XmlAttribute(name = "mainMastLat")
    protected BigDecimal mainMastLat;
    @XmlAttribute(name = "mainMastAlt")
    protected Integer mainMastAlt;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "defName")
    protected String defName;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected Integer alt;
    @XmlAttribute(name = "track")
    protected String track;
    @XmlAttribute(name = "trackHidden")
    protected Boolean trackHidden;
    @XmlAttribute(name = "weight")
    protected Integer weight;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "products")
    protected Integer products;
    @XmlAttribute(name = "meta")
    protected Boolean meta;
    @XmlAttribute(name = "refinable")
    protected Boolean refinable;
    @XmlAttribute(name = "matchValue")
    protected Integer matchValue;
    @XmlAttribute(name = "entry")
    protected Boolean entry;

    /**
     * Contains a list of notes to be displayed for this location, like attributes or
     * 						footnotes.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link LocationNotes }
     *     
     */
    public LocationNotes getLocationNotes() {
        return locationNotes;
    }

    /**
     * Sets the value of the locationNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationNotes }
     *     
     */
    public void setLocationNotes(LocationNotes value) {
        this.locationNotes = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    /**
     * Gets the value of the productAtStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productAtStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAtStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProductAtStop() {
        if (productAtStop == null) {
            productAtStop = new ArrayList<ProductType>();
        }
        return this.productAtStop;
    }

    /**
     * Gets the value of the tariffResult property.
     * 
     * @return
     *     possible object is
     *     {@link TariffResult }
     *     
     */
    public TariffResult getTariffResult() {
        return tariffResult;
    }

    /**
     * Sets the value of the tariffResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffResult }
     *     
     */
    public void setTariffResult(TariffResult value) {
        this.tariffResult = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceLinks }
     * 
     * 
     */
    public List<ResourceLinks> getLinks() {
        if (links == null) {
            links = new ArrayList<ResourceLinks>();
        }
        return this.links;
    }

    /**
     * Gets the value of the altId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the altId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAltId() {
        if (altId == null) {
            altId = new ArrayList<String>();
        }
        return this.altId;
    }

    /**
     * Gets the value of the mainMastAltId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mainMastAltId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainMastAltId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMainMastAltId() {
        if (mainMastAltId == null) {
            mainMastAltId = new ArrayList<String>();
        }
        return this.mainMastAltId;
    }

    /**
     * Gets the value of the timezoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimezoneOffset(Integer value) {
        this.timezoneOffset = value;
    }

    /**
     * Gets the value of the equivalentStopLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentStopLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentStopLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLocation }
     * 
     * 
     */
    public List<StopLocation> getEquivalentStopLocation() {
        if (equivalentStopLocation == null) {
            equivalentStopLocation = new ArrayList<StopLocation>();
        }
        return this.equivalentStopLocation;
    }

    /**
     * Gets the value of the entryPointLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the entryPointLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryPointLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLocation }
     * 
     * 
     */
    public List<StopLocation> getEntryPointLocation() {
        if (entryPointLocation == null) {
            entryPointLocation = new ArrayList<StopLocation>();
        }
        return this.entryPointLocation;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the extId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtId(String value) {
        this.extId = value;
    }

    /**
     * Gets the value of the hasMainMast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMainMast() {
        return hasMainMast;
    }

    /**
     * Sets the value of the hasMainMast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMainMast(Boolean value) {
        this.hasMainMast = value;
    }

    /**
     * Gets the value of the mainMastId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainMastId() {
        return mainMastId;
    }

    /**
     * Sets the value of the mainMastId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainMastId(String value) {
        this.mainMastId = value;
    }

    /**
     * Gets the value of the mainMastExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainMastExtId() {
        return mainMastExtId;
    }

    /**
     * Sets the value of the mainMastExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainMastExtId(String value) {
        this.mainMastExtId = value;
    }

    /**
     * Gets the value of the mainMastLon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMainMastLon() {
        return mainMastLon;
    }

    /**
     * Sets the value of the mainMastLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMainMastLon(BigDecimal value) {
        this.mainMastLon = value;
    }

    /**
     * Gets the value of the mainMastLat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMainMastLat() {
        return mainMastLat;
    }

    /**
     * Sets the value of the mainMastLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMainMastLat(BigDecimal value) {
        this.mainMastLat = value;
    }

    /**
     * Gets the value of the mainMastAlt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainMastAlt() {
        return mainMastAlt;
    }

    /**
     * Sets the value of the mainMastAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainMastAlt(Integer value) {
        this.mainMastAlt = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the defName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefName() {
        return defName;
    }

    /**
     * Sets the value of the defName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefName(String value) {
        this.defName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLon(BigDecimal value) {
        this.lon = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLat(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlt(Integer value) {
        this.alt = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack() {
        return track;
    }

    /**
     * Sets the value of the track property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack(String value) {
        this.track = value;
    }

    /**
     * Gets the value of the trackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTrackHidden() {
        if (trackHidden == null) {
            return false;
        } else {
            return trackHidden;
        }
    }

    /**
     * Sets the value of the trackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackHidden(Boolean value) {
        this.trackHidden = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDist(Integer value) {
        this.dist = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProducts(Integer value) {
        this.products = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMeta() {
        if (meta == null) {
            return false;
        } else {
            return meta;
        }
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeta(Boolean value) {
        this.meta = value;
    }

    /**
     * Gets the value of the refinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRefinable() {
        if (refinable == null) {
            return false;
        } else {
            return refinable;
        }
    }

    /**
     * Sets the value of the refinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefinable(Boolean value) {
        this.refinable = value;
    }

    /**
     * Gets the value of the matchValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchValue() {
        return matchValue;
    }

    /**
     * Sets the value of the matchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchValue(Integer value) {
        this.matchValue = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntry(Boolean value) {
        this.entry = value;
    }

}
