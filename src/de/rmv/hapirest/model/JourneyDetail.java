
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Stops"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Names" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Directions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *         &lt;element name="JourneyStatus" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyStatusType" minOccurs="0"/&gt;
 *         &lt;element name="Polyline" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedJourney" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReferencedJourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastPos" type="{http://hacon.de/hafas/proxy/hafas-proxy}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="lastPosReported" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastPassRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lastPassStopRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rtLastPassRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rtLastPassStopRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParallelJourneyRef" type="{http://hacon.de/hafas/proxy/hafas-proxy}ParallelJourneyRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.JourneyDetail"/&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.JourneyDetailRef"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "stops",
    "names",
    "product",
    "directions",
    "notes",
    "messages",
    "journeyStatus",
    "polyline",
    "polylineGroup",
    "serviceDays",
    "referencedJourney",
    "lastPos",
    "lastPosReported",
    "lastPassRouteIdx",
    "lastPassStopRef",
    "rtLastPassRouteIdx",
    "rtLastPassStopRef",
    "parallelJourneyRef"
})
public class JourneyDetail
    extends CommonResponseType
{

    @XmlElement(name = "Stops", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Stops stops;
    @XmlElement(name = "Names", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Names names;
    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> product;
    @XmlElement(name = "Directions", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Directions directions;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlElement(name = "JourneyStatus", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    @XmlSchemaType(name = "string")
    protected JourneyStatusType journeyStatus;
    @XmlElement(name = "Polyline", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Polyline polyline;
    @XmlElement(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlElement(name = "ServiceDays", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ServiceDays> serviceDays;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ReferencedJourneyType> referencedJourney;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Coordinate lastPos;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPosReported;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer lastPassRouteIdx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer lastPassStopRef;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer rtLastPassRouteIdx;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Integer rtLastPassStopRef;
    @XmlElement(name = "ParallelJourneyRef", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ParallelJourneyRefType> parallelJourneyRef;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "partCancelled")
    protected Boolean partCancelled;
    @XmlAttribute(name = "reachable")
    protected Boolean reachable;
    @XmlAttribute(name = "redirected")
    protected Boolean redirected;
    @XmlAttribute(name = "uncertainDelay")
    protected Boolean uncertainDelay;
    @XmlAttribute(name = "dayOfOperation", required = true)
    protected String dayOfOperation;
    @XmlAttribute(name = "ref", required = true)
    protected String ref;

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
     * Deprecated. Use Product* instead.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link Names }
     *     
     */
    public Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link Names }
     *     
     */
    public void setNames(Names value) {
        this.names = value;
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
     * Contains notes to be displayed for this trip like attributes or
     * 								footnotes.
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
     * Gets the value of the lastPos property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getLastPos() {
        return lastPos;
    }

    /**
     * Sets the value of the lastPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setLastPos(Coordinate value) {
        this.lastPos = value;
    }

    /**
     * Gets the value of the lastPosReported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPosReported() {
        return lastPosReported;
    }

    /**
     * Sets the value of the lastPosReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPosReported(XMLGregorianCalendar value) {
        this.lastPosReported = value;
    }

    /**
     * Gets the value of the lastPassRouteIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPassRouteIdx() {
        return lastPassRouteIdx;
    }

    /**
     * Sets the value of the lastPassRouteIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastPassRouteIdx(Integer value) {
        this.lastPassRouteIdx = value;
    }

    /**
     * Gets the value of the lastPassStopRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPassStopRef() {
        return lastPassStopRef;
    }

    /**
     * Sets the value of the lastPassStopRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastPassStopRef(Integer value) {
        this.lastPassStopRef = value;
    }

    /**
     * Gets the value of the rtLastPassRouteIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRtLastPassRouteIdx() {
        return rtLastPassRouteIdx;
    }

    /**
     * Sets the value of the rtLastPassRouteIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtLastPassRouteIdx(Integer value) {
        this.rtLastPassRouteIdx = value;
    }

    /**
     * Gets the value of the rtLastPassStopRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRtLastPassStopRef() {
        return rtLastPassStopRef;
    }

    /**
     * Sets the value of the rtLastPassStopRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtLastPassStopRef(Integer value) {
        this.rtLastPassStopRef = value;
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
     * Gets the value of the dayOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfOperation() {
        return dayOfOperation;
    }

    /**
     * Sets the value of the dayOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfOperation(String value) {
        this.dayOfOperation = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
