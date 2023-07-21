
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyPathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPathType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyPathItem" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyPathItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Location" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPathType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "journeyPathItem",
    "location",
    "polylineGroup"
})
public class JourneyPathType {

    @XmlElement(name = "JourneyPathItem", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected List<JourneyPathItemType> journeyPathItem;
    @XmlElement(name = "Location", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<StopType> location;
    @XmlElement(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;

    /**
     * Gets the value of the journeyPathItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the journeyPathItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyPathItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyPathItemType }
     * 
     * 
     */
    public List<JourneyPathItemType> getJourneyPathItem() {
        if (journeyPathItem == null) {
            journeyPathItem = new ArrayList<JourneyPathItemType>();
        }
        return this.journeyPathItem;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopType }
     * 
     * 
     */
    public List<StopType> getLocation() {
        if (location == null) {
            location = new ArrayList<StopType>();
        }
        return this.location;
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

}
