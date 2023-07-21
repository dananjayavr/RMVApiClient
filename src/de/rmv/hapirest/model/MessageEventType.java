
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="eStop" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="sectionNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageEventType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "sStop",
    "eStop",
    "sectionNum"
})
public class MessageEventType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType sStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType eStop;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> sectionNum;
    @XmlAttribute(name = "sTime")
    protected String sTime;
    @XmlAttribute(name = "sDate")
    protected String sDate;
    @XmlAttribute(name = "eTime")
    protected String eTime;
    @XmlAttribute(name = "eDate")
    protected String eDate;
    @XmlAttribute(name = "current")
    protected Boolean current;

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
     * Gets the value of the sectionNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sectionNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSectionNum() {
        if (sectionNum == null) {
            sectionNum = new ArrayList<String>();
        }
        return this.sectionNum;
    }

    /**
     * Gets the value of the sTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTime() {
        return sTime;
    }

    /**
     * Sets the value of the sTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTime(String value) {
        this.sTime = value;
    }

    /**
     * Gets the value of the sDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDate() {
        return sDate;
    }

    /**
     * Sets the value of the sDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDate(String value) {
        this.sDate = value;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETime() {
        return eTime;
    }

    /**
     * Sets the value of the eTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETime(String value) {
        this.eTime = value;
    }

    /**
     * Gets the value of the eDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDate() {
        return eDate;
    }

    /**
     * Sets the value of the eDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDate(String value) {
        this.eDate = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCurrent() {
        if (current == null) {
            return false;
        } else {
            return current;
        }
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

}
