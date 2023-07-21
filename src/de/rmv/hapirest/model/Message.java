
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="affectedProduct" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="affectedJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="edge" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageEdgeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageRegionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="affectedStops" type="{http://hacon.de/hafas/proxy/hafas-proxy}AffectedStopType" minOccurs="0"/&gt;
 *         &lt;element name="validFromStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="validToStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="tags" type="{http://hacon.de/hafas/proxy/hafas-proxy}TagsType" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messageCategory" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messageText" type="{http://hacon.de/hafas/proxy/hafas-proxy}MessageTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="validityDays" type="{http://hacon.de/hafas/proxy/hafas-proxy}ServiceDays" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://hacon.de/hafas/proxy/hafas-proxy}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://hacon.de/hafas/proxy/hafas-proxy}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Message"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "affectedProduct",
    "affectedJourney",
    "edge",
    "region",
    "event",
    "affectedStops",
    "validFromStop",
    "validToStop",
    "tags",
    "channel",
    "messageCategory",
    "messageText",
    "validityDays",
    "note",
    "message"
})
public class Message {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> affectedProduct;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyType> affectedJourney;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageEdgeType> edge;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageRegionType> region;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageEventType> event;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected AffectedStopType affectedStops;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType validFromStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType validToStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TagsType tags;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageChannelType> channel;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageCategoryType> messageCategory;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MessageTextType> messageText;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ServiceDays validityDays;
    @XmlElement(name = "Note", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Note> note;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Message> message;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalId")
    protected String externalId;
    @XmlAttribute(name = "act")
    protected Boolean act;
    @XmlAttribute(name = "head")
    protected String head;
    @XmlAttribute(name = "lead")
    protected String lead;
    @XmlAttribute(name = "text")
    protected String text;
    @XmlAttribute(name = "textInternal")
    protected String textInternal;
    @XmlAttribute(name = "customText")
    protected String customText;
    @XmlAttribute(name = "tckr")
    protected String tckr;
    @XmlAttribute(name = "company")
    protected String company;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "priority")
    protected Integer priority;
    @XmlAttribute(name = "products")
    protected Integer products;
    @XmlAttribute(name = "icon")
    protected String icon;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;
    @XmlAttribute(name = "sTime")
    protected String sTime;
    @XmlAttribute(name = "sDate")
    protected String sDate;
    @XmlAttribute(name = "eTime")
    protected String eTime;
    @XmlAttribute(name = "eDate")
    protected String eDate;
    @XmlAttribute(name = "altStart")
    protected String altStart;
    @XmlAttribute(name = "altEnd")
    protected String altEnd;
    @XmlAttribute(name = "modTime")
    protected String modTime;
    @XmlAttribute(name = "modDate")
    protected String modDate;
    @XmlAttribute(name = "dailyStartingAt")
    protected String dailyStartingAt;
    @XmlAttribute(name = "dailyDuration")
    protected Duration dailyDuration;
    @XmlAttribute(name = "baseType")
    protected MessageBaseType baseType;

    /**
     * Gets the value of the affectedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getAffectedProduct() {
        if (affectedProduct == null) {
            affectedProduct = new ArrayList<ProductType>();
        }
        return this.affectedProduct;
    }

    /**
     * Gets the value of the affectedJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyType }
     * 
     * 
     */
    public List<JourneyType> getAffectedJourney() {
        if (affectedJourney == null) {
            affectedJourney = new ArrayList<JourneyType>();
        }
        return this.affectedJourney;
    }

    /**
     * Gets the value of the edge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the edge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageEdgeType }
     * 
     * 
     */
    public List<MessageEdgeType> getEdge() {
        if (edge == null) {
            edge = new ArrayList<MessageEdgeType>();
        }
        return this.edge;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageRegionType }
     * 
     * 
     */
    public List<MessageRegionType> getRegion() {
        if (region == null) {
            region = new ArrayList<MessageRegionType>();
        }
        return this.region;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageEventType }
     * 
     * 
     */
    public List<MessageEventType> getEvent() {
        if (event == null) {
            event = new ArrayList<MessageEventType>();
        }
        return this.event;
    }

    /**
     * Gets the value of the affectedStops property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopType }
     *     
     */
    public AffectedStopType getAffectedStops() {
        return affectedStops;
    }

    /**
     * Sets the value of the affectedStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopType }
     *     
     */
    public void setAffectedStops(AffectedStopType value) {
        this.affectedStops = value;
    }

    /**
     * Gets the value of the validFromStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getValidFromStop() {
        return validFromStop;
    }

    /**
     * Sets the value of the validFromStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setValidFromStop(StopType value) {
        this.validFromStop = value;
    }

    /**
     * Gets the value of the validToStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getValidToStop() {
        return validToStop;
    }

    /**
     * Sets the value of the validToStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setValidToStop(StopType value) {
        this.validToStop = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link TagsType }
     *     
     */
    public TagsType getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagsType }
     *     
     */
    public void setTags(TagsType value) {
        this.tags = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageChannelType }
     * 
     * 
     */
    public List<MessageChannelType> getChannel() {
        if (channel == null) {
            channel = new ArrayList<MessageChannelType>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the messageCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageCategoryType }
     * 
     * 
     */
    public List<MessageCategoryType> getMessageCategory() {
        if (messageCategory == null) {
            messageCategory = new ArrayList<MessageCategoryType>();
        }
        return this.messageCategory;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageTextType }
     * 
     * 
     */
    public List<MessageTextType> getMessageText() {
        if (messageText == null) {
            messageText = new ArrayList<MessageTextType>();
        }
        return this.messageText;
    }

    /**
     * Gets the value of the validityDays property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDays }
     *     
     */
    public ServiceDays getValidityDays() {
        return validityDays;
    }

    /**
     * Sets the value of the validityDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDays }
     *     
     */
    public void setValidityDays(ServiceDays value) {
        this.validityDays = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAct() {
        if (act == null) {
            return true;
        } else {
            return act;
        }
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAct(Boolean value) {
        this.act = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHead(String value) {
        this.head = value;
    }

    /**
     * Gets the value of the lead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead() {
        return lead;
    }

    /**
     * Sets the value of the lead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead(String value) {
        this.lead = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textInternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextInternal() {
        return textInternal;
    }

    /**
     * Sets the value of the textInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextInternal(String value) {
        this.textInternal = value;
    }

    /**
     * Gets the value of the customText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText() {
        return customText;
    }

    /**
     * Sets the value of the customText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText(String value) {
        this.customText = value;
    }

    /**
     * Gets the value of the tckr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckr() {
        return tckr;
    }

    /**
     * Sets the value of the tckr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckr(String value) {
        this.tckr = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPriority() {
        if (priority == null) {
            return  100;
        } else {
            return priority;
        }
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
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
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the routeIdxFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    /**
     * Sets the value of the routeIdxFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxFrom(Integer value) {
        this.routeIdxFrom = value;
    }

    /**
     * Gets the value of the routeIdxTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    /**
     * Sets the value of the routeIdxTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxTo(Integer value) {
        this.routeIdxTo = value;
    }

    /**
     * Gets the value of the sTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTime() {
        return sTime;
    }

    /**
     * Sets the value of the sTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTime(String value) {
        this.sTime = value;
    }

    /**
     * Gets the value of the sDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDate() {
        return sDate;
    }

    /**
     * Sets the value of the sDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDate(String value) {
        this.sDate = value;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETime() {
        return eTime;
    }

    /**
     * Sets the value of the eTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETime(String value) {
        this.eTime = value;
    }

    /**
     * Gets the value of the eDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDate() {
        return eDate;
    }

    /**
     * Sets the value of the eDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDate(String value) {
        this.eDate = value;
    }

    /**
     * Gets the value of the altStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltStart() {
        return altStart;
    }

    /**
     * Sets the value of the altStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltStart(String value) {
        this.altStart = value;
    }

    /**
     * Gets the value of the altEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEnd() {
        return altEnd;
    }

    /**
     * Sets the value of the altEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEnd(String value) {
        this.altEnd = value;
    }

    /**
     * Gets the value of the modTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModTime() {
        return modTime;
    }

    /**
     * Sets the value of the modTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTime(String value) {
        this.modTime = value;
    }

    /**
     * Gets the value of the modDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModDate() {
        return modDate;
    }

    /**
     * Sets the value of the modDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModDate(String value) {
        this.modDate = value;
    }

    /**
     * Gets the value of the dailyStartingAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyStartingAt() {
        return dailyStartingAt;
    }

    /**
     * Sets the value of the dailyStartingAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyStartingAt(String value) {
        this.dailyStartingAt = value;
    }

    /**
     * Gets the value of the dailyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDailyDuration() {
        return dailyDuration;
    }

    /**
     * Sets the value of the dailyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDailyDuration(Duration value) {
        this.dailyDuration = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageBaseType }
     *     
     */
    public MessageBaseType getBaseType() {
        if (baseType == null) {
            return MessageBaseType.UNDEF;
        } else {
            return baseType;
        }
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageBaseType }
     *     
     */
    public void setBaseType(MessageBaseType value) {
        this.baseType = value;
    }

}
