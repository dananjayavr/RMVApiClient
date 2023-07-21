
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Journey" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Messages"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Direction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lineId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineNameShort" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "product",
    "journey",
    "messages",
    "direction"
})
public class LineType {

    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ProductType product;
    @XmlElement(name = "Journey", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyType> journey;
    @XmlElement(name = "Messages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Messages messages;
    @XmlElement(name = "Direction", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Direction> direction;
    @XmlAttribute(name = "lineId", required = true)
    protected String lineId;
    @XmlAttribute(name = "lineName")
    protected String lineName;
    @XmlAttribute(name = "lineNameShort")
    protected String lineNameShort;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the journey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyType }
     * 
     * 
     */
    public List<JourneyType> getJourney() {
        if (journey == null) {
            journey = new ArrayList<JourneyType>();
        }
        return this.journey;
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
     * Gets the value of the direction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction }
     * 
     * 
     */
    public List<Direction> getDirection() {
        if (direction == null) {
            direction = new ArrayList<Direction>();
        }
        return this.direction;
    }

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
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
     * Gets the value of the lineNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNameShort() {
        return lineNameShort;
    }

    /**
     * Sets the value of the lineNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNameShort(String value) {
        this.lineNameShort = value;
    }

}
