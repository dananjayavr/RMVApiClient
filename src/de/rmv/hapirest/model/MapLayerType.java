
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Map.
 * 
 * <p>Java class for MapLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapLayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extend" type="{http://hacon.de/hafas/proxy/hafas-proxy}Rect" minOccurs="0"/&gt;
 *         &lt;element name="initialBoundingBox" type="{http://hacon.de/hafas/proxy/hafas-proxy}Rect" minOccurs="0"/&gt;
 *         &lt;element name="subdomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="zoomMin" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="zoomMax" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="opacity" type="{http://www.w3.org/2001/XMLSchema}int" default="100" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projection"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="U"/&gt;
 *             &lt;enumeration value="Z"/&gt;
 *             &lt;enumeration value="E"/&gt;
 *             &lt;enumeration value="B"/&gt;
 *             &lt;enumeration value="S"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="selectable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapLayerType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "extend",
    "initialBoundingBox",
    "subdomain"
})
public class MapLayerType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Rect extend;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Rect initialBoundingBox;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> subdomain;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "zoomMin")
    protected Integer zoomMin;
    @XmlAttribute(name = "zoomMax")
    protected Integer zoomMax;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "projection")
    protected String projection;
    @XmlAttribute(name = "attribute")
    protected String attribute;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "show")
    protected Boolean show;
    @XmlAttribute(name = "selectable")
    protected Boolean selectable;

    /**
     * Gets the value of the extend property.
     * 
     * @return
     *     possible object is
     *     {@link Rect }
     *     
     */
    public Rect getExtend() {
        return extend;
    }

    /**
     * Sets the value of the extend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rect }
     *     
     */
    public void setExtend(Rect value) {
        this.extend = value;
    }

    /**
     * Gets the value of the initialBoundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link Rect }
     *     
     */
    public Rect getInitialBoundingBox() {
        return initialBoundingBox;
    }

    /**
     * Sets the value of the initialBoundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rect }
     *     
     */
    public void setInitialBoundingBox(Rect value) {
        this.initialBoundingBox = value;
    }

    /**
     * Gets the value of the subdomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subdomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubdomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubdomain() {
        if (subdomain == null) {
            subdomain = new ArrayList<String>();
        }
        return this.subdomain;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the zoomMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getZoomMin() {
        if (zoomMin == null) {
            return -1;
        } else {
            return zoomMin;
        }
    }

    /**
     * Sets the value of the zoomMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoomMin(Integer value) {
        this.zoomMin = value;
    }

    /**
     * Gets the value of the zoomMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getZoomMax() {
        if (zoomMax == null) {
            return -1;
        } else {
            return zoomMax;
        }
    }

    /**
     * Sets the value of the zoomMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoomMax(Integer value) {
        this.zoomMax = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOpacity() {
        if (opacity == null) {
            return  100;
        } else {
            return opacity;
        }
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpacity(Integer value) {
        this.opacity = value;
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
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShow() {
        if (show == null) {
            return false;
        } else {
            return show;
        }
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow(Boolean value) {
        this.show = value;
    }

    /**
     * Gets the value of the selectable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectable() {
        if (selectable == null) {
            return true;
        } else {
            return selectable;
        }
    }

    /**
     * Sets the value of the selectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectable(Boolean value) {
        this.selectable = value;
    }

}
