
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
 * <p>Java class for TrackPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location" minOccurs="0"/&gt;
 *         &lt;element name="Probability" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="seId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="source" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrackPoinSourceType" /&gt;
 *       &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="trainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="product" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackPoint", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "location",
    "probability"
})
public class TrackPoint {

    @XmlElement(name = "Location", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Location location;
    @XmlElement(name = "Probability", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> probability;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "seId")
    protected String seId;
    @XmlAttribute(name = "source")
    protected TrackPoinSourceType source;
    @XmlAttribute(name = "accuracy")
    protected Integer accuracy;
    @XmlAttribute(name = "speed")
    protected Integer speed;
    @XmlAttribute(name = "direction")
    protected Integer direction;
    @XmlAttribute(name = "trainName")
    protected String trainName;
    @XmlAttribute(name = "lineName")
    protected String lineName;
    @XmlAttribute(name = "product")
    protected Integer product;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the probability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getProbability() {
        if (probability == null) {
            probability = new ArrayList<KVType>();
        }
        return this.probability;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the seId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeId() {
        return seId;
    }

    /**
     * Sets the value of the seId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeId(String value) {
        this.seId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link TrackPoinSourceType }
     *     
     */
    public TrackPoinSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPoinSourceType }
     *     
     */
    public void setSource(TrackPoinSourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccuracy(Integer value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(Integer value) {
        this.speed = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
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

    /**
     * Gets the value of the trainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * Sets the value of the trainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainName(String value) {
        this.trainName = value;
    }

    /**
     * Gets the value of the lineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * Sets the value of the lineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineName(String value) {
        this.lineName = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProduct(Integer value) {
        this.product = value;
    }

}
