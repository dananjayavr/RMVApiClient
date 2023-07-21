
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
 * <p>Java class for Leg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Origin"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Destination"/&gt;
 *         &lt;element name="JourneyOrigin" type="{http://hacon.de/hafas/proxy/hafas-proxy}OriginDestType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDestination" type="{http://hacon.de/hafas/proxy/hafas-proxy}OriginDestType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetailRef" minOccurs="0"/&gt;
 *         &lt;element name="Freq" type="{http://hacon.de/hafas/proxy/hafas-proxy}FreqType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}GisRef" minOccurs="0"/&gt;
 *         &lt;element name="GisRoute" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisRouteType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *         &lt;element name="TrafficMessage" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrafficMessageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JourneyStatus" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyStatusType" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CombinedProduct" type="{http://hacon.de/hafas/proxy/hafas-proxy}CombinedProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Polyline" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Stops" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetail" minOccurs="0"/&gt;
 *         &lt;element name="ParallelJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReferencedJourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Leg"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "origin",
    "destination",
    "journeyOrigin",
    "journeyDestination",
    "notes",
    "journeyDetailRef",
    "freq",
    "gisRef",
    "gisRoute",
    "messages",
    "trafficMessage",
    "journeyStatus",
    "product",
    "combinedProduct",
    "polyline",
    "polylineGroup",
    "stops",
    "serviceDays",
    "journeyDetail",
    "parallelJourney",
    "occupancy",
    "referencedJourney"
})
public class Leg {

    @XmlElement(name = "Origin", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected OriginDestType origin;
    @XmlElement(name = "Destination", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected OriginDestType destination;
    @XmlElement(name = "JourneyOrigin", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType journeyOrigin;
    @XmlElement(name = "JourneyDestination", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType journeyDestination;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "JourneyDetailRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyDetailRef journeyDetailRef;
    @XmlElement(name = "Freq", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected FreqType freq;
    @XmlElement(name = "GisRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected GisRef gisRef;
    @XmlElement(name = "GisRoute", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected GisRouteType gisRoute;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlElement(name = "TrafficMessage", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TrafficMessageType> trafficMessage;
    @XmlElement(name = "JourneyStatus", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    @XmlSchemaType(name = "string")
    protected JourneyStatusType journeyStatus;
    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> product;
    @XmlElement(name = "CombinedProduct", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<CombinedProductType> combinedProduct;
    @XmlElement(name = "Polyline", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Polyline polyline;
    @XmlElement(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlElement(name = "Stops", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Stops stops;
    @XmlElement(name = "ServiceDays", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ServiceDays> serviceDays;
    @XmlElement(name = "JourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyDetail journeyDetail;
    @XmlElement(name = "ParallelJourney", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyType> parallelJourney;
    @XmlElement(name = "Occupancy", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OccupancyType> occupancy;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ReferencedJourneyType> referencedJourney;
    @XmlAttribute(name = "idx", required = true)
    protected int idx;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "addName")
    protected String addName;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "type", required = true)
    protected String type;
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
    @XmlAttribute(name = "duration")
    protected Duration duration;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "hide")
    protected Boolean hide;
    @XmlAttribute(name = "psCtxArriveEarlier")
    protected String psCtxArriveEarlier;
    @XmlAttribute(name = "psCtxDepartLater")
    protected String psCtxDepartLater;
    @XmlAttribute(name = "recState")
    protected ReconstructionStateType recState;
    @XmlAttribute(name = "changeAssured")
    protected Boolean changeAssured;
    @XmlAttribute(name = "uncertainDelay")
    protected Boolean uncertainDelay;

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
     * Gets the value of the journeyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Sets the value of the journeyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setJourneyOrigin(OriginDestType value) {
        this.journeyOrigin = value;
    }

    /**
     * Gets the value of the journeyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Sets the value of the journeyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setJourneyDestination(OriginDestType value) {
        this.journeyDestination = value;
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
     * Gets the value of the gisRef property.
     * 
     * @return
     *     possible object is
     *     {@link GisRef }
     *     
     */
    public GisRef getGisRef() {
        return gisRef;
    }

    /**
     * Sets the value of the gisRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisRef }
     *     
     */
    public void setGisRef(GisRef value) {
        this.gisRef = value;
    }

    /**
     * Gets the value of the gisRoute property.
     * 
     * @return
     *     possible object is
     *     {@link GisRouteType }
     *     
     */
    public GisRouteType getGisRoute() {
        return gisRoute;
    }

    /**
     * Sets the value of the gisRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisRouteType }
     *     
     */
    public void setGisRoute(GisRouteType value) {
        this.gisRoute = value;
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
     * Gets the value of the trafficMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trafficMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficMessageType }
     * 
     * 
     */
    public List<TrafficMessageType> getTrafficMessage() {
        if (trafficMessage == null) {
            trafficMessage = new ArrayList<TrafficMessageType>();
        }
        return this.trafficMessage;
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
     * Gets the value of the combinedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the combinedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinedProductType }
     * 
     * 
     */
    public List<CombinedProductType> getCombinedProduct() {
        if (combinedProduct == null) {
            combinedProduct = new ArrayList<CombinedProductType>();
        }
        return this.combinedProduct;
    }

    /**
     * Gets the value of the polyline property.
     * 
     * @return
     *     possible object is
     *     {@link Polyline }
     *     
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * Sets the value of the polyline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polyline }
     *     
     */
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * Gets the value of the polylineGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PolylineGroup }
     *     
     */
    public PolylineGroup getPolylineGroup() {
        return polylineGroup;
    }

    /**
     * Sets the value of the polylineGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolylineGroup }
     *     
     */
    public void setPolylineGroup(PolylineGroup value) {
        this.polylineGroup = value;
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
     * Gets the value of the journeyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDetail }
     *     
     */
    public JourneyDetail getJourneyDetail() {
        return journeyDetail;
    }

    /**
     * Sets the value of the journeyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDetail }
     *     
     */
    public void setJourneyDetail(JourneyDetail value) {
        this.journeyDetail = value;
    }

    /**
     * Gets the value of the parallelJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parallelJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParallelJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyType }
     * 
     * 
     */
    public List<JourneyType> getParallelJourney() {
        if (parallelJourney == null) {
            parallelJourney = new ArrayList<JourneyType>();
        }
        return this.parallelJourney;
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
     * Gets the value of the idx property.
     * 
     */
    public int getIdx() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     */
    public void setIdx(int value) {
        this.idx = value;
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
     * Gets the value of the addName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddName() {
        return addName;
    }

    /**
     * Sets the value of the addName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddName(String value) {
        this.addName = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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

    /**
     * Gets the value of the recState property.
     * 
     * @return
     *     possible object is
     *     {@link ReconstructionStateType }
     *     
     */
    public ReconstructionStateType getRecState() {
        return recState;
    }

    /**
     * Sets the value of the recState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconstructionStateType }
     *     
     */
    public void setRecState(ReconstructionStateType value) {
        this.recState = value;
    }

    /**
     * Gets the value of the changeAssured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeAssured() {
        return changeAssured;
    }

    /**
     * Sets the value of the changeAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeAssured(Boolean value) {
        this.changeAssured = value;
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
