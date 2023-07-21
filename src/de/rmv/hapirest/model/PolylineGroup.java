
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolylineGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolylineGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polylineDesc" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineDesc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="coordType" type="{http://hacon.de/hafas/proxy/hafas-proxy}CoordType" default="WGS84" /&gt;
 *       &lt;attribute name="layerName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "polylineDesc"
})
public class PolylineGroup {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PolylineDesc> polylineDesc;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "coordType")
    protected CoordType coordType;
    @XmlAttribute(name = "layerName")
    protected String layerName;

    /**
     * Gets the value of the polylineDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polylineDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylineDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolylineDesc }
     * 
     * 
     */
    public List<PolylineDesc> getPolylineDesc() {
        if (polylineDesc == null) {
            polylineDesc = new ArrayList<PolylineDesc>();
        }
        return this.polylineDesc;
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
     * Gets the value of the coordType property.
     * 
     * @return
     *     possible object is
     *     {@link CoordType }
     *     
     */
    public CoordType getCoordType() {
        if (coordType == null) {
            return CoordType.WGS_84;
        } else {
            return coordType;
        }
    }

    /**
     * Sets the value of the coordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordType }
     *     
     */
    public void setCoordType(CoordType value) {
        this.coordType = value;
    }

    /**
     * Gets the value of the layerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerName() {
        return layerName;
    }

    /**
     * Sets the value of the layerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerName(String value) {
        this.layerName = value;
    }

}
