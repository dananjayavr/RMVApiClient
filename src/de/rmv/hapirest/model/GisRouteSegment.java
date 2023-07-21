
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
 * <p>Java class for GisRouteSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GisRouteSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element name="Edge" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisEdgeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrafficMessage" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrafficMessageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rType" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisRouteRoadType" /&gt;
 *       &lt;attribute name="rNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="man" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisRouteManoeuvre" /&gt;
 *       &lt;attribute name="manTx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="manTargetName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dirTx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ori" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisRouteOrientation" /&gt;
 *       &lt;attribute name="polyS" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="polyE" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="durS" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisRouteSegment", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "notes",
    "edge",
    "trafficMessage",
    "messages"
})
public class GisRouteSegment {

    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(name = "Edge", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GisEdgeType> edge;
    @XmlElement(name = "TrafficMessage", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TrafficMessageType> trafficMessage;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Messages messages;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "rType")
    protected GisRouteRoadType rType;
    @XmlAttribute(name = "rNum")
    protected String rNum;
    @XmlAttribute(name = "man")
    protected GisRouteManoeuvre man;
    @XmlAttribute(name = "manTx")
    protected String manTx;
    @XmlAttribute(name = "manTargetName")
    protected String manTargetName;
    @XmlAttribute(name = "dirTx")
    protected String dirTx;
    @XmlAttribute(name = "ori")
    protected GisRouteOrientation ori;
    @XmlAttribute(name = "polyS")
    protected Integer polyS;
    @XmlAttribute(name = "polyE")
    protected Integer polyE;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "durS")
    protected Duration durS;

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
     * {@link GisEdgeType }
     * 
     * 
     */
    public List<GisEdgeType> getEdge() {
        if (edge == null) {
            edge = new ArrayList<GisEdgeType>();
        }
        return this.edge;
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
     * Gets the value of the rType property.
     * 
     * @return
     *     possible object is
     *     {@link GisRouteRoadType }
     *     
     */
    public GisRouteRoadType getRType() {
        return rType;
    }

    /**
     * Sets the value of the rType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisRouteRoadType }
     *     
     */
    public void setRType(GisRouteRoadType value) {
        this.rType = value;
    }

    /**
     * Gets the value of the rNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNum() {
        return rNum;
    }

    /**
     * Sets the value of the rNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNum(String value) {
        this.rNum = value;
    }

    /**
     * Gets the value of the man property.
     * 
     * @return
     *     possible object is
     *     {@link GisRouteManoeuvre }
     *     
     */
    public GisRouteManoeuvre getMan() {
        return man;
    }

    /**
     * Sets the value of the man property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisRouteManoeuvre }
     *     
     */
    public void setMan(GisRouteManoeuvre value) {
        this.man = value;
    }

    /**
     * Gets the value of the manTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManTx() {
        return manTx;
    }

    /**
     * Sets the value of the manTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManTx(String value) {
        this.manTx = value;
    }

    /**
     * Gets the value of the manTargetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManTargetName() {
        return manTargetName;
    }

    /**
     * Sets the value of the manTargetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManTargetName(String value) {
        this.manTargetName = value;
    }

    /**
     * Gets the value of the dirTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirTx() {
        return dirTx;
    }

    /**
     * Sets the value of the dirTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirTx(String value) {
        this.dirTx = value;
    }

    /**
     * Gets the value of the ori property.
     * 
     * @return
     *     possible object is
     *     {@link GisRouteOrientation }
     *     
     */
    public GisRouteOrientation getOri() {
        return ori;
    }

    /**
     * Sets the value of the ori property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisRouteOrientation }
     *     
     */
    public void setOri(GisRouteOrientation value) {
        this.ori = value;
    }

    /**
     * Gets the value of the polyS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolyS() {
        return polyS;
    }

    /**
     * Sets the value of the polyS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolyS(Integer value) {
        this.polyS = value;
    }

    /**
     * Gets the value of the polyE property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolyE() {
        return polyE;
    }

    /**
     * Sets the value of the polyE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolyE(Integer value) {
        this.polyE = value;
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
     * Gets the value of the durS property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurS() {
        return durS;
    }

    /**
     * Sets the value of the durS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurS(Duration value) {
        this.durS = value;
    }

}
