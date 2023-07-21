
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoFeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="provider" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProviderType" minOccurs="0"/&gt;
 *         &lt;element name="icon" type="{http://hacon.de/hafas/proxy/hafas-proxy}IconType" minOccurs="0"/&gt;
 *         &lt;element name="coordinate" type="{http://hacon.de/hafas/proxy/hafas-proxy}Coordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lines" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geoData" type="{http://hacon.de/hafas/proxy/hafas-proxy}GeoDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://hacon.de/hafas/proxy/hafas-proxy}DateTimeIntervalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://hacon.de/hafas/proxy/hafas-proxy}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="extId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://hacon.de/hafas/proxy/hafas-proxy}GeoFeatureTypeType" /&gt;
 *       &lt;attribute name="subType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoFeatureType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "provider",
    "icon",
    "coordinate",
    "lines",
    "geoData",
    "validity",
    "note"
})
public class GeoFeatureType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ProviderType provider;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected IconType icon;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Coordinate> coordinate;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Polyline> lines;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GeoDataType> geoData;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<DateTimeIntervalType> validity;
    @XmlElement(name = "Note", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Note> note;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "extId")
    @XmlSchemaType(name = "anySimpleType")
    protected String extId;
    @XmlAttribute(name = "type", required = true)
    protected GeoFeatureTypeType type;
    @XmlAttribute(name = "subType")
    @XmlSchemaType(name = "anySimpleType")
    protected String subType;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setProvider(ProviderType value) {
        this.provider = value;
    }

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
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coordinate }
     * 
     * 
     */
    public List<Coordinate> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<Coordinate>();
        }
        return this.coordinate;
    }

    /**
     * Gets the value of the lines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     * 
     * 
     */
    public List<Polyline> getLines() {
        if (lines == null) {
            lines = new ArrayList<Polyline>();
        }
        return this.lines;
    }

    /**
     * Gets the value of the geoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the geoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoDataType }
     * 
     * 
     */
    public List<GeoDataType> getGeoData() {
        if (geoData == null) {
            geoData = new ArrayList<GeoDataType>();
        }
        return this.geoData;
    }

    /**
     * Gets the value of the validity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeIntervalType }
     * 
     * 
     */
    public List<DateTimeIntervalType> getValidity() {
        if (validity == null) {
            validity = new ArrayList<DateTimeIntervalType>();
        }
        return this.validity;
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
     *     {@link GeoFeatureTypeType }
     *     
     */
    public GeoFeatureTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoFeatureTypeType }
     *     
     */
    public void setType(GeoFeatureTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
