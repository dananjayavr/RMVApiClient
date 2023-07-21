
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
 * The element Stop contains the name of the stop/station, the route index, the latitude, the
 * 				longitude, the departure time and date, the arrival time and date, the track, the realtime departure
 * 				time and
 * 				date, the realtime arrival time and date and the realtime track.
 * 			
 * 
 * <p>Java class for StopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element name="altId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainMastAltId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Stop"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "notes",
    "altId",
    "mainMastAltId",
    "occupancy"
})
public class StopType {

    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
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
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "extId", required = true)
    protected String extId;
    @XmlAttribute(name = "routeIdx")
    protected Integer routeIdx;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected Integer alt;
    @XmlAttribute(name = "arrPrognosisType")
    protected PrognosisType arrPrognosisType;
    @XmlAttribute(name = "depPrognosisType")
    protected PrognosisType depPrognosisType;
    @XmlAttribute(name = "depTime")
    protected String depTime;
    @XmlAttribute(name = "depDate")
    protected String depDate;
    @XmlAttribute(name = "depTz")
    protected Integer depTz;
    @XmlAttribute(name = "scheduledDepTimeChanged")
    protected Boolean scheduledDepTimeChanged;
    @XmlAttribute(name = "arrTime")
    protected String arrTime;
    @XmlAttribute(name = "arrDate")
    protected String arrDate;
    @XmlAttribute(name = "arrTz")
    protected Integer arrTz;
    @XmlAttribute(name = "scheduledArrTimeChanged")
    protected Boolean scheduledArrTimeChanged;
    @XmlAttribute(name = "passingTime")
    protected String passingTime;
    @XmlAttribute(name = "passingDate")
    protected String passingDate;
    @XmlAttribute(name = "passingTz")
    protected Integer passingTz;
    @XmlAttribute(name = "arrTrack")
    protected String arrTrack;
    @XmlAttribute(name = "arrTrackHidden")
    protected Boolean arrTrackHidden;
    @XmlAttribute(name = "depTrack")
    protected String depTrack;
    @XmlAttribute(name = "depTrackHidden")
    protected Boolean depTrackHidden;
    @XmlAttribute(name = "rtDepTime")
    protected String rtDepTime;
    @XmlAttribute(name = "rtDepDate")
    protected String rtDepDate;
    @XmlAttribute(name = "rtDepTz")
    protected Integer rtDepTz;
    @XmlAttribute(name = "rtArrTime")
    protected String rtArrTime;
    @XmlAttribute(name = "rtArrDate")
    protected String rtArrDate;
    @XmlAttribute(name = "rtArrTz")
    protected Integer rtArrTz;
    @XmlAttribute(name = "rtArrTrack")
    protected String rtArrTrack;
    @XmlAttribute(name = "rtArrTrackHidden")
    protected Boolean rtArrTrackHidden;
    @XmlAttribute(name = "rtDepTrack")
    protected String rtDepTrack;
    @XmlAttribute(name = "rtDepTrackHidden")
    protected Boolean rtDepTrackHidden;
    @XmlAttribute(name = "rtPassingTime")
    protected String rtPassingTime;
    @XmlAttribute(name = "rtPassingDate")
    protected String rtPassingDate;
    @XmlAttribute(name = "rtPassingTz")
    protected Integer rtPassingTz;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "cancelledDeparture")
    protected Boolean cancelledDeparture;
    @XmlAttribute(name = "cancelledArrival")
    protected Boolean cancelledArrival;
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
    @XmlAttribute(name = "additional")
    protected Boolean additional;
    @XmlAttribute(name = "isBorderStop")
    protected Boolean isBorderStop;
    @XmlAttribute(name = "isTurningPoint")
    protected Boolean isTurningPoint;
    @XmlAttribute(name = "arrHide")
    protected Boolean arrHide;
    @XmlAttribute(name = "depHide")
    protected Boolean depHide;
    @XmlAttribute(name = "depDir")
    protected String depDir;
    @XmlAttribute(name = "entry")
    protected Boolean entry;
    @XmlAttribute(name = "rtCnclDataSourceType")
    protected RealtimeDataSourceType rtCnclDataSourceType;
    @XmlAttribute(name = "arrUncertainDelay")
    protected Boolean arrUncertainDelay;
    @XmlAttribute(name = "depUncertainDelay")
    protected Boolean depUncertainDelay;

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
     * Gets the value of the arrPrognosisType property.
     * 
     * @return
     *     possible object is
     *     {@link PrognosisType }
     *     
     */
    public PrognosisType getArrPrognosisType() {
        return arrPrognosisType;
    }

    /**
     * Sets the value of the arrPrognosisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrognosisType }
     *     
     */
    public void setArrPrognosisType(PrognosisType value) {
        this.arrPrognosisType = value;
    }

    /**
     * Gets the value of the depPrognosisType property.
     * 
     * @return
     *     possible object is
     *     {@link PrognosisType }
     *     
     */
    public PrognosisType getDepPrognosisType() {
        return depPrognosisType;
    }

    /**
     * Sets the value of the depPrognosisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrognosisType }
     *     
     */
    public void setDepPrognosisType(PrognosisType value) {
        this.depPrognosisType = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepDate(String value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the depTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDepTz() {
        if (depTz == null) {
            return  0;
        } else {
            return depTz;
        }
    }

    /**
     * Sets the value of the depTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepTz(Integer value) {
        this.depTz = value;
    }

    /**
     * Gets the value of the scheduledDepTimeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduledDepTimeChanged() {
        if (scheduledDepTimeChanged == null) {
            return false;
        } else {
            return scheduledDepTimeChanged;
        }
    }

    /**
     * Sets the value of the scheduledDepTimeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduledDepTimeChanged(Boolean value) {
        this.scheduledDepTimeChanged = value;
    }

    /**
     * Gets the value of the arrTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTime() {
        return arrTime;
    }

    /**
     * Sets the value of the arrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTime(String value) {
        this.arrTime = value;
    }

    /**
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrDate(String value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the arrTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getArrTz() {
        if (arrTz == null) {
            return  0;
        } else {
            return arrTz;
        }
    }

    /**
     * Sets the value of the arrTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrTz(Integer value) {
        this.arrTz = value;
    }

    /**
     * Gets the value of the scheduledArrTimeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduledArrTimeChanged() {
        if (scheduledArrTimeChanged == null) {
            return false;
        } else {
            return scheduledArrTimeChanged;
        }
    }

    /**
     * Sets the value of the scheduledArrTimeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduledArrTimeChanged(Boolean value) {
        this.scheduledArrTimeChanged = value;
    }

    /**
     * Gets the value of the passingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassingTime() {
        return passingTime;
    }

    /**
     * Sets the value of the passingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassingTime(String value) {
        this.passingTime = value;
    }

    /**
     * Gets the value of the passingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassingDate() {
        return passingDate;
    }

    /**
     * Sets the value of the passingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassingDate(String value) {
        this.passingDate = value;
    }

    /**
     * Gets the value of the passingTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPassingTz() {
        if (passingTz == null) {
            return  0;
        } else {
            return passingTz;
        }
    }

    /**
     * Sets the value of the passingTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassingTz(Integer value) {
        this.passingTz = value;
    }

    /**
     * Gets the value of the arrTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTrack() {
        return arrTrack;
    }

    /**
     * Sets the value of the arrTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTrack(String value) {
        this.arrTrack = value;
    }

    /**
     * Gets the value of the arrTrackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArrTrackHidden() {
        if (arrTrackHidden == null) {
            return false;
        } else {
            return arrTrackHidden;
        }
    }

    /**
     * Sets the value of the arrTrackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrTrackHidden(Boolean value) {
        this.arrTrackHidden = value;
    }

    /**
     * Gets the value of the depTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTrack() {
        return depTrack;
    }

    /**
     * Sets the value of the depTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTrack(String value) {
        this.depTrack = value;
    }

    /**
     * Gets the value of the depTrackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDepTrackHidden() {
        if (depTrackHidden == null) {
            return false;
        } else {
            return depTrackHidden;
        }
    }

    /**
     * Sets the value of the depTrackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepTrackHidden(Boolean value) {
        this.depTrackHidden = value;
    }

    /**
     * Gets the value of the rtDepTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtDepTime() {
        return rtDepTime;
    }

    /**
     * Sets the value of the rtDepTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtDepTime(String value) {
        this.rtDepTime = value;
    }

    /**
     * Gets the value of the rtDepDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtDepDate() {
        return rtDepDate;
    }

    /**
     * Sets the value of the rtDepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtDepDate(String value) {
        this.rtDepDate = value;
    }

    /**
     * Gets the value of the rtDepTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRtDepTz() {
        if (rtDepTz == null) {
            return  0;
        } else {
            return rtDepTz;
        }
    }

    /**
     * Sets the value of the rtDepTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtDepTz(Integer value) {
        this.rtDepTz = value;
    }

    /**
     * Gets the value of the rtArrTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtArrTime() {
        return rtArrTime;
    }

    /**
     * Sets the value of the rtArrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtArrTime(String value) {
        this.rtArrTime = value;
    }

    /**
     * Gets the value of the rtArrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtArrDate() {
        return rtArrDate;
    }

    /**
     * Sets the value of the rtArrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtArrDate(String value) {
        this.rtArrDate = value;
    }

    /**
     * Gets the value of the rtArrTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRtArrTz() {
        if (rtArrTz == null) {
            return  0;
        } else {
            return rtArrTz;
        }
    }

    /**
     * Sets the value of the rtArrTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtArrTz(Integer value) {
        this.rtArrTz = value;
    }

    /**
     * Gets the value of the rtArrTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtArrTrack() {
        return rtArrTrack;
    }

    /**
     * Sets the value of the rtArrTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtArrTrack(String value) {
        this.rtArrTrack = value;
    }

    /**
     * Gets the value of the rtArrTrackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtArrTrackHidden() {
        if (rtArrTrackHidden == null) {
            return false;
        } else {
            return rtArrTrackHidden;
        }
    }

    /**
     * Sets the value of the rtArrTrackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtArrTrackHidden(Boolean value) {
        this.rtArrTrackHidden = value;
    }

    /**
     * Gets the value of the rtDepTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtDepTrack() {
        return rtDepTrack;
    }

    /**
     * Sets the value of the rtDepTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtDepTrack(String value) {
        this.rtDepTrack = value;
    }

    /**
     * Gets the value of the rtDepTrackHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtDepTrackHidden() {
        if (rtDepTrackHidden == null) {
            return false;
        } else {
            return rtDepTrackHidden;
        }
    }

    /**
     * Sets the value of the rtDepTrackHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtDepTrackHidden(Boolean value) {
        this.rtDepTrackHidden = value;
    }

    /**
     * Gets the value of the rtPassingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtPassingTime() {
        return rtPassingTime;
    }

    /**
     * Sets the value of the rtPassingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtPassingTime(String value) {
        this.rtPassingTime = value;
    }

    /**
     * Gets the value of the rtPassingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtPassingDate() {
        return rtPassingDate;
    }

    /**
     * Sets the value of the rtPassingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtPassingDate(String value) {
        this.rtPassingDate = value;
    }

    /**
     * Gets the value of the rtPassingTz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRtPassingTz() {
        if (rtPassingTz == null) {
            return  0;
        } else {
            return rtPassingTz;
        }
    }

    /**
     * Sets the value of the rtPassingTz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtPassingTz(Integer value) {
        this.rtPassingTz = value;
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
     * Gets the value of the arrHide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArrHide() {
        if (arrHide == null) {
            return false;
        } else {
            return arrHide;
        }
    }

    /**
     * Sets the value of the arrHide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrHide(Boolean value) {
        this.arrHide = value;
    }

    /**
     * Gets the value of the depHide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDepHide() {
        if (depHide == null) {
            return false;
        } else {
            return depHide;
        }
    }

    /**
     * Sets the value of the depHide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepHide(Boolean value) {
        this.depHide = value;
    }

    /**
     * Gets the value of the depDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepDir() {
        return depDir;
    }

    /**
     * Sets the value of the depDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepDir(String value) {
        this.depDir = value;
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
     * Gets the value of the arrUncertainDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArrUncertainDelay() {
        if (arrUncertainDelay == null) {
            return false;
        } else {
            return arrUncertainDelay;
        }
    }

    /**
     * Sets the value of the arrUncertainDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrUncertainDelay(Boolean value) {
        this.arrUncertainDelay = value;
    }

    /**
     * Gets the value of the depUncertainDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDepUncertainDelay() {
        if (depUncertainDelay == null) {
            return false;
        } else {
            return depUncertainDelay;
        }
    }

    /**
     * Sets the value of the depUncertainDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepUncertainDelay(Boolean value) {
        this.depUncertainDelay = value;
    }

}
