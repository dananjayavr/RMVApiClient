
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageEdgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageEdgeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="eStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="polyline" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element name="iconCoordinate" type="{http://hacon.de/hafas/proxy/hafas-proxy}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="messageRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageEdgeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "sStop",
    "eStop",
    "polyline",
    "polylineGroup",
    "iconCoordinate",
    "messageRef"
})
public class MessageEdgeType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType sStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType eStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Polyline> polyline;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Coordinate iconCoordinate;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = Integer.class)
    protected List<Integer> messageRef;
    @XmlAttribute(name = "direction")
    protected Integer direction;

    /**
     * Gets the value of the sStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getSStop() {
        return sStop;
    }

    /**
     * Sets the value of the sStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setSStop(StopType value) {
        this.sStop = value;
    }

    /**
     * Gets the value of the eStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getEStop() {
        return eStop;
    }

    /**
     * Sets the value of the eStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setEStop(StopType value) {
        this.eStop = value;
    }

    /**
     * Gets the value of the polyline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polyline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolyline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     * 
     * 
     */
    public List<Polyline> getPolyline() {
        if (polyline == null) {
            polyline = new ArrayList<Polyline>();
        }
        return this.polyline;
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
     * Gets the value of the iconCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getIconCoordinate() {
        return iconCoordinate;
    }

    /**
     * Sets the value of the iconCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setIconCoordinate(Coordinate value) {
        this.iconCoordinate = value;
    }

    /**
     * Gets the value of the messageRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMessageRef() {
        if (messageRef == null) {
            messageRef = new ArrayList<Integer>();
        }
        return this.messageRef;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDirection() {
        if (direction == null) {
            return  0;
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

}
