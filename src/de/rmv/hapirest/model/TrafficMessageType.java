
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="icon" type="{http://hacon.de/hafas/proxy/hafas-proxy}IconType" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="extId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrafficMessageTypeType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficMessageType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "icon",
    "location",
    "polylineGroup"
})
public class TrafficMessageType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected IconType icon;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopLocation location;
    @XmlElement(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "extId")
    protected String extId;
    @XmlAttribute(name = "type")
    protected TrafficMessageTypeType type;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "desc")
    protected String desc;

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconType }
     *     
     */
    public IconType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconType }
     *     
     */
    public void setIcon(IconType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link StopLocation }
     *     
     */
    public StopLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopLocation }
     *     
     */
    public void setLocation(StopLocation value) {
        this.location = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficMessageTypeType }
     *     
     */
    public TrafficMessageTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficMessageTypeType }
     *     
     */
    public void setType(TrafficMessageTypeType value) {
        this.type = value;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
