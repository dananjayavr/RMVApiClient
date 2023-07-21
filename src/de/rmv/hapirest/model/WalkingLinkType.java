
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WalkingLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalkingLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="from" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location" minOccurs="0"/&gt;
 *         &lt;element name="to" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://hacon.de/hafas/proxy/hafas-proxy}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="extId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalkingLinkType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "from",
    "to",
    "note",
    "message",
    "polylineGroup"
})
public class WalkingLinkType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Location from;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Location to;
    @XmlElement(name = "Note", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Note> note;
    @XmlElement(name = "Message", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Message> message;
    @XmlElement(name = "PolylineGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlAttribute(name = "extId", required = true)
    protected int extId;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setFrom(Location value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setTo(Location value) {
        this.to = value;
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
     * Messages related to that walking link.Gets the value of the message property.
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

    /**
     * Gets the value of the extId property.
     * 
     */
    public int getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     */
    public void setExtId(int value) {
        this.extId = value;
    }

}
