
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
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Arrival" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="stopid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stopExtId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrival",
    "message"
})
@XmlRootElement(name = "ArrivalBoard", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class ArrivalBoard
    extends CommonResponseType
{

    @XmlElement(name = "Arrival", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Arrival> arrival;
    @XmlElement(name = "Message", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Message> message;
    @XmlAttribute(name = "stopid")
    protected String stopid;
    @XmlAttribute(name = "stopExtId")
    protected String stopExtId;

    /**
     * The element Arrival contains all information about a arrival like
     * 									time, date,
     * 									stop/station name,
     * 									track, realtime time, date and track, origin, name and type of the journey. It also
     * 									contains
     * 									a reference to
     * 									journey details.
     * 								Gets the value of the arrival property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrival property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrival().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Arrival }
     * 
     * 
     */
    public List<Arrival> getArrival() {
        if (arrival == null) {
            arrival = new ArrayList<Arrival>();
        }
        return this.arrival;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    /**
     * Gets the value of the stopid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopid() {
        return stopid;
    }

    /**
     * Sets the value of the stopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopid(String value) {
        this.stopid = value;
    }

    /**
     * Gets the value of the stopExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopExtId() {
        return stopExtId;
    }

    /**
     * Sets the value of the stopExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopExtId(String value) {
        this.stopExtId = value;
    }

}
