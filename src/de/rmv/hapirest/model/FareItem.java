
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}ticket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="param" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalContent" type="{http://hacon.de/hafas/proxy/hafas-proxy}ExternalContentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="cur" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shpCtx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fromLeg" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="toLeg" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket",
    "param",
    "externalContent"
})
@XmlRootElement(name = "fareItem", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class FareItem {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Ticket> ticket;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> param;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ExternalContentType externalContent;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "desc")
    protected String desc;
    @XmlAttribute(name = "price")
    protected Integer price;
    @XmlAttribute(name = "cur")
    protected String cur;
    @XmlAttribute(name = "shpCtx")
    protected String shpCtx;
    @XmlAttribute(name = "fromLeg")
    protected Integer fromLeg;
    @XmlAttribute(name = "toLeg")
    protected Integer toLeg;

    /**
     * Gets the value of the ticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticket }
     * 
     * 
     */
    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Ticket>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getParam() {
        if (param == null) {
            param = new ArrayList<KVType>();
        }
        return this.param;
    }

    /**
     * Gets the value of the externalContent property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalContentType }
     *     
     */
    public ExternalContentType getExternalContent() {
        return externalContent;
    }

    /**
     * Sets the value of the externalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalContentType }
     *     
     */
    public void setExternalContent(ExternalContentType value) {
        this.externalContent = value;
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

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrice() {
        if (price == null) {
            return  0;
        } else {
            return price;
        }
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCur(String value) {
        this.cur = value;
    }

    /**
     * Gets the value of the shpCtx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShpCtx() {
        return shpCtx;
    }

    /**
     * Sets the value of the shpCtx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShpCtx(String value) {
        this.shpCtx = value;
    }

    /**
     * Gets the value of the fromLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromLeg() {
        return fromLeg;
    }

    /**
     * Sets the value of the fromLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromLeg(Integer value) {
        this.fromLeg = value;
    }

    /**
     * Gets the value of the toLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToLeg() {
        return toLeg;
    }

    /**
     * Sets the value of the toLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToLeg(Integer value) {
        this.toLeg = value;
    }

}
