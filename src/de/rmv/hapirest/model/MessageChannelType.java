
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://hacon.de/hafas/proxy/hafas-proxy}UrlLinkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="validFromTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validFromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validToTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validToDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageChannelType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "name",
    "url"
})
public class MessageChannelType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String name;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<UrlLinkType> url;
    @XmlAttribute(name = "validFromTime")
    protected String validFromTime;
    @XmlAttribute(name = "validFromDate")
    protected String validFromDate;
    @XmlAttribute(name = "validToTime")
    protected String validToTime;
    @XmlAttribute(name = "validToDate")
    protected String validToDate;

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
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLinkType }
     * 
     * 
     */
    public List<UrlLinkType> getUrl() {
        if (url == null) {
            url = new ArrayList<UrlLinkType>();
        }
        return this.url;
    }

    /**
     * Gets the value of the validFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFromTime() {
        return validFromTime;
    }

    /**
     * Sets the value of the validFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFromTime(String value) {
        this.validFromTime = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFromDate(String value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidToTime() {
        return validToTime;
    }

    /**
     * Sets the value of the validToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidToTime(String value) {
        this.validToTime = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidToDate(String value) {
        this.validToDate = value;
    }

}
