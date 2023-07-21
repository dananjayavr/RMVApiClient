
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
 * The element Journey contains all information about a journey like name, direction, lon,
 * 				lat,
 * 				train number and train category. It also contains a reference to journey.
 * 			
 * 
 * <p>Java class for JourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyOrigin" type="{http://hacon.de/hafas/proxy/hafas-proxy}OriginDestType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDestination" type="{http://hacon.de/hafas/proxy/hafas-proxy}OriginDestType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Stops" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetailRef" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://hacon.de/hafas/proxy/hafas-proxy}OccupancyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReferencedJourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JourneyPath" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyPathType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Journey"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "journeyOrigin",
    "journeyDestination",
    "stops",
    "journeyDetailRef",
    "product",
    "notes",
    "messages",
    "occupancy",
    "referencedJourney",
    "journeyPath"
})
public class JourneyType {

    @XmlElement(name = "JourneyOrigin", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType journeyOrigin;
    @XmlElement(name = "JourneyDestination", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected OriginDestType journeyDestination;
    @XmlElement(name = "Stops", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Stops stops;
    @XmlElement(name = "JourneyDetailRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyDetailRef journeyDetailRef;
    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ProductType product;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlElement(name = "Occupancy", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OccupancyType> occupancy;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ReferencedJourneyType> referencedJourney;
    @XmlElement(name = "JourneyPath", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyPathType journeyPath;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "addName")
    protected String addName;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected Integer alt;
    @XmlAttribute(name = "trainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "trainCategory")
    protected String trainCategory;

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
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
     * Gets the value of the journeyPath property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPathType }
     *     
     */
    public JourneyPathType getJourneyPath() {
        return journeyPath;
    }

    /**
     * Sets the value of the journeyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPathType }
     *     
     */
    public void setJourneyPath(JourneyPathType value) {
        this.journeyPath = value;
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
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the trainCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCategory() {
        return trainCategory;
    }

    /**
     * Sets the value of the trainCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCategory(String value) {
        this.trainCategory = value;
    }

}
