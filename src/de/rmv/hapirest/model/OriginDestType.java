
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
 * <p>Java class for OriginDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element name="mcpData" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainMastAltId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.OriginDestType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "notes",
    "mcpData",
    "message",
    "altId",
    "mainMastAltId",
    "occupancy"
})
public class OriginDestType {

    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> mcpData;
    @XmlElement(name = "Message", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Message> message;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> altId;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> mainMastAltId;
    @XmlElement(name = "Occupancy", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OccupancyType> occupancy;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "extId")
    protected String extId;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected Integer alt;
    @XmlAttribute(name = "routeIdx")
    protected Integer routeIdx;
    @XmlAttribute(name = "prognosisType")
    protected PrognosisType prognosisType;
    @XmlAttribute(name = "time", required = true)
    protected String time;
    @XmlAttribute(name = "date", required = true)
    protected String date;
    @XmlAttribute(name = "tz")
    protected Integer tz;
    @XmlAttribute(name = "scheduledTimeChanged")
    protected Boolean scheduledTimeChanged;
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
    @XmlAttribute(name = "alighting")
    protected Boolean alighting;
    @XmlAttribute(name = "boarding")
    protected Boolean boarding;
    @XmlAttribute(name = "rtAlighting")
    protected Boolean rtAlighting;
    @XmlAttribute(name = "rtBoarding")
    protected Boolean rtBoarding;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "cancelledDeparture")
    protected Boolean cancelledDeparture;
    @XmlAttribute(name = "cancelledArrival")
    protected Boolean cancelledArrival;
    @XmlAttribute(name = "uncertainDelay")
    protected Boolean uncertainDelay;
    @XmlAttribute(name = "additional")
    protected Boolean additional;
    @XmlAttribute(name = "isBorderStop")
    protected Boolean isBorderStop;
    @XmlAttribute(name = "isTurningPoint")
    protected Boolean isTurningPoint;
    @XmlAttribute(name = "hide")
    protected Boolean hide;
    @XmlAttribute(name = "entry")
    protected Boolean entry;
    @XmlAttribute(name = "mcp")
    protected Boolean mcp;
    @XmlAttribute(name = "trainCompositionMarker")
    protected Integer trainCompositionMarker;
    @XmlAttribute(name = "rtCnclDataSourceType")
    protected RealtimeDataSourceType rtCnclDataSourceType;
    @XmlAttribute(name = "psCtxArriveEarlier")
    protected String psCtxArriveEarlier;
    @XmlAttribute(name = "psCtxDepartLater")
    protected String psCtxDepartLater;

    /**
     * Contains a list of notes to be displayed for this location, like attributes or
     * 						footnotes.
     * 					
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
     * Gets the value of the mcpData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mcpData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMcpData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getMcpData() {
        if (mcpData == null) {
            mcpData = new ArrayList<KVType>();
        }
        return this.mcpData;
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
     * Gets the value of the routeIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdx() {
        return routeIdx;
    }

    /**
     * Sets the value of the routeIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdx(Integer value) {
        this.routeIdx = value;
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
     * Gets the value of the alighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlighting() {
        if (alighting == null) {
            return true;
        } else {
            return alighting;
        }
    }

    /**
     * Sets the value of the alighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlighting(Boolean value) {
        this.alighting = value;
    }

    /**
     * Gets the value of the boarding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBoarding() {
        if (boarding == null) {
            return true;
        } else {
            return boarding;
        }
    }

    /**
     * Sets the value of the boarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoarding(Boolean value) {
        this.boarding = value;
    }

    /**
     * Gets the value of the rtAlighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtAlighting() {
        return rtAlighting;
    }

    /**
     * Sets the value of the rtAlighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtAlighting(Boolean value) {
        this.rtAlighting = value;
    }

    /**
     * Gets the value of the rtBoarding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtBoarding() {
        return rtBoarding;
    }

    /**
     * Sets the value of the rtBoarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtBoarding(Boolean value) {
        this.rtBoarding = value;
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
     * Gets the value of the cancelledDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCancelledDeparture() {
        if (cancelledDeparture == null) {
            return false;
        } else {
            return cancelledDeparture;
        }
    }

    /**
     * Sets the value of the cancelledDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledDeparture(Boolean value) {
        this.cancelledDeparture = value;
    }

    /**
     * Gets the value of the cancelledArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCancelledArrival() {
        if (cancelledArrival == null) {
            return false;
        } else {
            return cancelledArrival;
        }
    }

    /**
     * Sets the value of the cancelledArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledArrival(Boolean value) {
        this.cancelledArrival = value;
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

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdditional() {
        if (additional == null) {
            return false;
        } else {
            return additional;
        }
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditional(Boolean value) {
        this.additional = value;
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
     * Gets the value of the hide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHide() {
        if (hide == null) {
            return false;
        } else {
            return hide;
        }
    }

    /**
     * Sets the value of the hide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHide(Boolean value) {
        this.hide = value;
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
     * Gets the value of the mcp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMcp() {
        if (mcp == null) {
            return false;
        } else {
            return mcp;
        }
    }

    /**
     * Sets the value of the mcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMcp(Boolean value) {
        this.mcp = value;
    }

    /**
     * Gets the value of the trainCompositionMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainCompositionMarker() {
        return trainCompositionMarker;
    }

    /**
     * Sets the value of the trainCompositionMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainCompositionMarker(Integer value) {
        this.trainCompositionMarker = value;
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
     * Gets the value of the psCtxArriveEarlier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsCtxArriveEarlier() {
        return psCtxArriveEarlier;
    }

    /**
     * Sets the value of the psCtxArriveEarlier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsCtxArriveEarlier(String value) {
        this.psCtxArriveEarlier = value;
    }

    /**
     * Gets the value of the psCtxDepartLater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsCtxDepartLater() {
        return psCtxDepartLater;
    }

    /**
     * Sets the value of the psCtxDepartLater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsCtxDepartLater(String value) {
        this.psCtxDepartLater = value;
    }

}
