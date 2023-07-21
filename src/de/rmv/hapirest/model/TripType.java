
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Origin"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Destination"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element name="Eco" type="{http://hacon.de/hafas/proxy/hafas-proxy}EcoType" minOccurs="0"/&gt;
 *         &lt;element name="EcoCmp" type="{http://hacon.de/hafas/proxy/hafas-proxy}EcoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Freq" type="{http://hacon.de/hafas/proxy/hafas-proxy}FreqType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}LegList"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}TariffResult" minOccurs="0"/&gt;
 *         &lt;element name="calculation" type="{http://hacon.de/hafas/proxy/hafas-proxy}CalculationType" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reliability" type="{http://hacon.de/hafas/proxy/hafas-proxy}ConnectionReliabilityType" minOccurs="0"/&gt;
 *         &lt;element name="TripStatus" type="{http://hacon.de/hafas/proxy/hafas-proxy}TripStatusType" minOccurs="0"/&gt;
 *         &lt;element name="via" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Trip"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "origin",
    "destination",
    "messages",
    "notes",
    "eco",
    "ecoCmp",
    "serviceDays",
    "freq",
    "legList",
    "tariffResult",
    "calculation",
    "occupancy",
    "reliability",
    "tripStatus",
    "via"
})
public class TripType {

    @XmlElement(name = "Origin", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType origin;
    @XmlElement(name = "Destination", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType destination;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "Eco", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected EcoType eco;
    @XmlElement(name = "EcoCmp", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<EcoType> ecoCmp;
    @XmlElement(name = "ServiceDays", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ServiceDays> serviceDays;
    @XmlElement(name = "Freq", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected FreqType freq;
    @XmlElement(name = "LegList", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected LegList legList;
    @XmlElement(name = "TariffResult", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TariffResult tariffResult;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    @XmlSchemaType(name = "string")
    protected CalculationType calculation;
    @XmlElement(name = "Occupancy", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OccupancyType> occupancy;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ConnectionReliabilityType reliability;
    @XmlElement(name = "TripStatus", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TripStatusType tripStatus;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<StopType> via;
    @XmlAttribute(name = "alternative")
    protected Boolean alternative;
    @XmlAttribute(name = "hasAlternative")
    protected Boolean hasAlternative;
    @XmlAttribute(name = "individualChangeTimes")
    protected Boolean individualChangeTimes;
    @XmlAttribute(name = "valid")
    protected Boolean valid;
    @XmlAttribute(name = "idx")
    protected Integer idx;
    @XmlAttribute(name = "tripId")
    protected String tripId;
    @XmlAttribute(name = "ctxRecon")
    protected String ctxRecon;
    @XmlAttribute(name = "duration")
    protected Duration duration;
    @XmlAttribute(name = "rtDuration")
    protected Duration rtDuration;
    @XmlAttribute(name = "return")
    protected Boolean _return;
    @XmlAttribute(name = "ecoUrl")
    protected String ecoUrl;
    @XmlAttribute(name = "checksum")
    protected String checksum;
    @XmlAttribute(name = "transferCount")
    protected Integer transferCount;
    @XmlAttribute(name = "combinedCount")
    protected Integer combinedCount;
    @XmlAttribute(name = "combinedMinDuration")
    protected Duration combinedMinDuration;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setOrigin(OriginDestType value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setDestination(OriginDestType value) {
        this.destination = value;
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
     * Gets the value of the eco property.
     * 
     * @return
     *     possible object is
     *     {@link EcoType }
     *     
     */
    public EcoType getEco() {
        return eco;
    }

    /**
     * Sets the value of the eco property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcoType }
     *     
     */
    public void setEco(EcoType value) {
        this.eco = value;
    }

    /**
     * Gets the value of the ecoCmp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecoCmp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcoCmp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EcoType }
     * 
     * 
     */
    public List<EcoType> getEcoCmp() {
        if (ecoCmp == null) {
            ecoCmp = new ArrayList<EcoType>();
        }
        return this.ecoCmp;
    }

    /**
     * Gets the value of the serviceDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDays }
     * 
     * 
     */
    public List<ServiceDays> getServiceDays() {
        if (serviceDays == null) {
            serviceDays = new ArrayList<ServiceDays>();
        }
        return this.serviceDays;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link FreqType }
     *     
     */
    public FreqType getFreq() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqType }
     *     
     */
    public void setFreq(FreqType value) {
        this.freq = value;
    }

    /**
     * The element LegList contains all legs of the computed trip.
     * 
     * @return
     *     possible object is
     *     {@link LegList }
     *     
     */
    public LegList getLegList() {
        return legList;
    }

    /**
     * Sets the value of the legList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegList }
     *     
     */
    public void setLegList(LegList value) {
        this.legList = value;
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
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationType }
     *     
     */
    public CalculationType getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationType }
     *     
     */
    public void setCalculation(CalculationType value) {
        this.calculation = value;
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
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionReliabilityType }
     *     
     */
    public ConnectionReliabilityType getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionReliabilityType }
     *     
     */
    public void setReliability(ConnectionReliabilityType value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the tripStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TripStatusType }
     *     
     */
    public TripStatusType getTripStatus() {
        return tripStatus;
    }

    /**
     * Sets the value of the tripStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripStatusType }
     *     
     */
    public void setTripStatus(TripStatusType value) {
        this.tripStatus = value;
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
     * {@link StopType }
     * 
     * 
     */
    public List<StopType> getVia() {
        if (via == null) {
            via = new ArrayList<StopType>();
        }
        return this.via;
    }

    /**
     * Gets the value of the alternative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlternative() {
        if (alternative == null) {
            return false;
        } else {
            return alternative;
        }
    }

    /**
     * Sets the value of the alternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternative(Boolean value) {
        this.alternative = value;
    }

    /**
     * Gets the value of the hasAlternative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasAlternative() {
        if (hasAlternative == null) {
            return false;
        } else {
            return hasAlternative;
        }
    }

    /**
     * Sets the value of the hasAlternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAlternative(Boolean value) {
        this.hasAlternative = value;
    }

    /**
     * Gets the value of the individualChangeTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIndividualChangeTimes() {
        if (individualChangeTimes == null) {
            return false;
        } else {
            return individualChangeTimes;
        }
    }

    /**
     * Sets the value of the individualChangeTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndividualChangeTimes(Boolean value) {
        this.individualChangeTimes = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValid() {
        if (valid == null) {
            return true;
        } else {
            return valid;
        }
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the idx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdx(Integer value) {
        this.idx = value;
    }

    /**
     * Gets the value of the tripId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * Sets the value of the tripId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripId(String value) {
        this.tripId = value;
    }

    /**
     * Gets the value of the ctxRecon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtxRecon() {
        return ctxRecon;
    }

    /**
     * Sets the value of the ctxRecon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtxRecon(String value) {
        this.ctxRecon = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the rtDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRtDuration() {
        return rtDuration;
    }

    /**
     * Sets the value of the rtDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRtDuration(Duration value) {
        this.rtDuration = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturn() {
        if (_return == null) {
            return false;
        } else {
            return _return;
        }
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturn(Boolean value) {
        this._return = value;
    }

    /**
     * Gets the value of the ecoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcoUrl() {
        return ecoUrl;
    }

    /**
     * Sets the value of the ecoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcoUrl(String value) {
        this.ecoUrl = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the transferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTransferCount() {
        if (transferCount == null) {
            return  0;
        } else {
            return transferCount;
        }
    }

    /**
     * Sets the value of the transferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferCount(Integer value) {
        this.transferCount = value;
    }

    /**
     * Gets the value of the combinedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCombinedCount() {
        return combinedCount;
    }

    /**
     * Sets the value of the combinedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCombinedCount(Integer value) {
        this.combinedCount = value;
    }

    /**
     * Gets the value of the combinedMinDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCombinedMinDuration() {
        return combinedMinDuration;
    }

    /**
     * Sets the value of the combinedMinDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCombinedMinDuration(Duration value) {
        this.combinedMinDuration = value;
    }

}
