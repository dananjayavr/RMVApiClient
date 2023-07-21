
package de.rmv.hapirest.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Departure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Departure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetailRef"/&gt;
 *         &lt;element name="JourneyStatus" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ProductAtStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Directions" minOccurs="0"/&gt;
 *         &lt;element name="altId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainMastAltId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Stops" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParallelJourneyRef" type="{http://hacon.de/hafas/proxy/hafas-proxy}ParallelJourneyRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReferencedJourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Departure"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Departure", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "journeyDetailRef",
    "journeyStatus",
    "productAtStop",
    "product",
    "notes",
    "messages",
    "directions",
    "altId",
    "mainMastAltId",
    "stops",
    "occupancy",
    "parallelJourneyRef",
    "referencedJourney"
})
public class Departure {

    @XmlElement(name = "JourneyDetailRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected JourneyDetailRef journeyDetailRef;
    @XmlElement(name = "JourneyStatus", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    @XmlSchemaType(name = "string")
    protected JourneyStatusType journeyStatus;
    @XmlElement(name = "ProductAtStop", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ProductType productAtStop;
    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> product;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlElement(name = "Directions", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Directions directions;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> altId;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> mainMastAltId;
    @XmlElement(name = "Stops", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Stops stops;
    @XmlElement(name = "Occupancy", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OccupancyType> occupancy;
    @XmlElement(name = "ParallelJourneyRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ParallelJourneyRefType> parallelJourneyRef;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ReferencedJourneyType> referencedJourney;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "stop", required = true)
    protected String stop;
    @XmlAttribute(name = "stopid", required = true)
    protected String stopid;
    @XmlAttribute(name = "stopExtId")
    protected String stopExtId;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected Integer alt;
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
    @XmlAttribute(name = "prognosisType")
    protected PrognosisType prognosisType;
    @XmlAttribute(name = "time", required = true)
    protected String time;
    @XmlAttribute(name = "scheduledTimeChanged")
    protected Boolean scheduledTimeChanged;
    @XmlAttribute(name = "date", required = true)
    protected String date;
    @XmlAttribute(name = "tz")
    protected Integer tz;
    @XmlAttribute(name = "track")
    protected String track;
    @XmlAttribute(name = "trackHidden")
    protected Boolean trackHidden;
    @XmlAttribute(name = "rtTime")
    protected String rtTime;
    @XmlAttribute(name = "rtDate")
    protected String rtDate;
    @XmlAttribute(name = "rtTz")
    protected Integer rtTz;
    @XmlAttribute(name = "rtTrack")
    protected String rtTrack;
    @XmlAttribute(name = "rtTrackHidden")
    protected Boolean rtTrackHidden;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "partCancelled")
    protected Boolean partCancelled;
    @XmlAttribute(name = "reachable")
    protected Boolean reachable;
    @XmlAttribute(name = "redirected")
    protected Boolean redirected;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "directionFlag")
    protected String directionFlag;
    @XmlAttribute(name = "directionExtId")
    protected String directionExtId;
    @XmlAttribute(name = "timeAtArrival")
    protected String timeAtArrival;
    @XmlAttribute(name = "dateAtArrival")
    protected String dateAtArrival;
    @XmlAttribute(name = "rtTimeAtArrival")
    protected String rtTimeAtArrival;
    @XmlAttribute(name = "rtDateAtArrival")
    protected String rtDateAtArrival;
    @XmlAttribute(name = "isFastest")
    protected Boolean isFastest;
    @XmlAttribute(name = "isBorderStop")
    protected Boolean isBorderStop;
    @XmlAttribute(name = "isTurningPoint")
    protected Boolean isTurningPoint;
    @XmlAttribute(name = "entry")
    protected Boolean entry;
    @XmlAttribute(name = "rtCnclDataSourceType")
    protected RealtimeDataSourceType rtCnclDataSourceType;
    @XmlAttribute(name = "uncertainDelay")
    protected Boolean uncertainDelay;

    /**
     * Gets the value of the journeyDetailRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDetailRef }
     *     
     */
    public JourneyDetailRef getJourneyDetailRef() {
        return journeyDetailRef;
    }

    /**
     * Sets the value of the journeyDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDetailRef }
     *     
     */
    public void setJourneyDetailRef(JourneyDetailRef value) {
        this.journeyDetailRef = value;
    }

    /**
     * Gets the value of the journeyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyStatusType }
     *     
     */
    public JourneyStatusType getJourneyStatus() {
        return journeyStatus;
    }

    /**
     * Sets the value of the journeyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyStatusType }
     *     
     */
    public void setJourneyStatus(JourneyStatusType value) {
        this.journeyStatus = value;
    }

    /**
     * Gets the value of the productAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductAtStop() {
        return productAtStop;
    }

    /**
     * Sets the value of the productAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductAtStop(ProductType value) {
        this.productAtStop = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link Directions }
     *     
     */
    public Directions getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directions }
     *     
     */
    public void setDirections(Directions value) {
        this.directions = value;
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
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link Stops }
     *     
     */
    public Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stops }
     *     
     */
    public void setStops(Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the occupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupancyType }
     * 
     * 
     */
    public List<OccupancyType> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<OccupancyType>();
        }
        return this.occupancy;
    }

    /**
     * Gets the value of the parallelJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parallelJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParallelJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParallelJourneyRefType }
     * 
     * 
     */
    public List<ParallelJourneyRefType> getParallelJourneyRef() {
        if (parallelJourneyRef == null) {
            parallelJourneyRef = new ArrayList<ParallelJourneyRefType>();
        }
        return this.parallelJourneyRef;
    }

    /**
     * Gets the value of the referencedJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referencedJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedJourneyType }
     * 
     * 
     */
    public List<ReferencedJourneyType> getReferencedJourney() {
        if (referencedJourney == null) {
            referencedJourney = new ArrayList<ReferencedJourneyType>();
        }
        return this.referencedJourney;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStop(String value) {
        this.stop = value;
    }

    /**
     * Gets the value of the stopid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopid() {
        return stopid;
    }

    /**
     * Sets the value of the stopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopid(String value) {
        this.stopid = value;
    }

    /**
     * Gets the value of the stopExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopExtId() {
        return stopExtId;
    }

    /**
     * Sets the value of the stopExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopExtId(String value) {
        this.stopExtId = value;
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
     * Gets the value of the prognosisType property.
     * 
     * @return
     *     possible object is
     *     {@link PrognosisType }
     *     
     */
    public PrognosisType getPrognosisType() {
        return prognosisType;
    }

    /**
     * Sets the value of the prognosisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrognosisType }
     *     
     */
    public void setPrognosisType(PrognosisType value) {
        this.prognosisType = value;
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
     * Gets the value of the scheduledTimeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduledTimeChanged() {
        if (scheduledTimeChanged == null) {
            return false;
        } else {
            return scheduledTimeChanged;
        }
    }

    /**
     * Sets the value of the scheduledTimeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduledTimeChanged(Boolean value) {
        this.scheduledTimeChanged = value;
    }

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
     * Gets the value of the tz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTz() {
        if (tz == null) {
            return  0;
        } else {
            return tz;
        }
    }

    /**
     * Sets the value of the tz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTz(Integer value) {
        this.tz = value;
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
     * Gets the value of the rtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtTime() {
        return rtTime;
    }

    /**
     * Sets the value of the rtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtTime(String value) {
        this.rtTime = value;
    }

    /**
     * Gets the value of the rtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtDate() {
        return rtDate;
    }

    /**
     * Sets the value of the rtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtDate(String value) {
        this.rtDate = value;
    }

    /**
     * Gets the value of the rtTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRtTz() {
        if (rtTz == null) {
            return  0;
        } else {
            return rtTz;
        }
    }

    /**
     * Sets the value of the rtTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtTz(Integer value) {
        this.rtTz = value;
    }

    /**
     * Gets the value of the rtTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtTrack() {
        return rtTrack;
    }

    /**
     * Sets the value of the rtTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtTrack(String value) {
        this.rtTrack = value;
    }

    /**
     * Gets the value of the rtTrackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtTrackHidden() {
        if (rtTrackHidden == null) {
            return false;
        } else {
            return rtTrackHidden;
        }
    }

    /**
     * Sets the value of the rtTrackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtTrackHidden(Boolean value) {
        this.rtTrackHidden = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCancelled() {
        if (cancelled == null) {
            return false;
        } else {
            return cancelled;
        }
    }

    /**
     * Sets the value of the cancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelled(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the partCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPartCancelled() {
        if (partCancelled == null) {
            return false;
        } else {
            return partCancelled;
        }
    }

    /**
     * Sets the value of the partCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartCancelled(Boolean value) {
        this.partCancelled = value;
    }

    /**
     * Gets the value of the reachable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReachable() {
        if (reachable == null) {
            return true;
        } else {
            return reachable;
        }
    }

    /**
     * Sets the value of the reachable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReachable(Boolean value) {
        this.reachable = value;
    }

    /**
     * Gets the value of the redirected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRedirected() {
        if (redirected == null) {
            return false;
        } else {
            return redirected;
        }
    }

    /**
     * Sets the value of the redirected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedirected(Boolean value) {
        this.redirected = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the directionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionFlag() {
        return directionFlag;
    }

    /**
     * Sets the value of the directionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionFlag(String value) {
        this.directionFlag = value;
    }

    /**
     * Gets the value of the directionExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionExtId() {
        return directionExtId;
    }

    /**
     * Sets the value of the directionExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionExtId(String value) {
        this.directionExtId = value;
    }

    /**
     * Gets the value of the timeAtArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAtArrival() {
        return timeAtArrival;
    }

    /**
     * Sets the value of the timeAtArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAtArrival(String value) {
        this.timeAtArrival = value;
    }

    /**
     * Gets the value of the dateAtArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAtArrival() {
        return dateAtArrival;
    }

    /**
     * Sets the value of the dateAtArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAtArrival(String value) {
        this.dateAtArrival = value;
    }

    /**
     * Gets the value of the rtTimeAtArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtTimeAtArrival() {
        return rtTimeAtArrival;
    }

    /**
     * Sets the value of the rtTimeAtArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtTimeAtArrival(String value) {
        this.rtTimeAtArrival = value;
    }

    /**
     * Gets the value of the rtDateAtArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtDateAtArrival() {
        return rtDateAtArrival;
    }

    /**
     * Sets the value of the rtDateAtArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtDateAtArrival(String value) {
        this.rtDateAtArrival = value;
    }

    /**
     * Gets the value of the isFastest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFastest() {
        return isFastest;
    }

    /**
     * Sets the value of the isFastest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFastest(Boolean value) {
        this.isFastest = value;
    }

    /**
     * Gets the value of the isBorderStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsBorderStop() {
        if (isBorderStop == null) {
            return false;
        } else {
            return isBorderStop;
        }
    }

    /**
     * Sets the value of the isBorderStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBorderStop(Boolean value) {
        this.isBorderStop = value;
    }

    /**
     * Gets the value of the isTurningPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsTurningPoint() {
        if (isTurningPoint == null) {
            return false;
        } else {
            return isTurningPoint;
        }
    }

    /**
     * Sets the value of the isTurningPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTurningPoint(Boolean value) {
        this.isTurningPoint = value;
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

    /**
     * Gets the value of the rtCnclDataSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link RealtimeDataSourceType }
     *     
     */
    public RealtimeDataSourceType getRtCnclDataSourceType() {
        return rtCnclDataSourceType;
    }

    /**
     * Sets the value of the rtCnclDataSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtimeDataSourceType }
     *     
     */
    public void setRtCnclDataSourceType(RealtimeDataSourceType value) {
        this.rtCnclDataSourceType = value;
    }

    /**
     * Gets the value of the uncertainDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUncertainDelay() {
        if (uncertainDelay == null) {
            return false;
        } else {
            return uncertainDelay;
        }
    }

    /**
     * Sets the value of the uncertainDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUncertainDelay(Boolean value) {
        this.uncertainDelay = value;
    }

}
