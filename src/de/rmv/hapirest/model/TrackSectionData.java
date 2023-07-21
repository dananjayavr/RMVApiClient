
package de.rmv.hapirest.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackSectionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackSectionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Departure" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *         &lt;element name="Arrival" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReconstructionSectionType" /&gt;
 *       &lt;attribute name="matchTimeSpanBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="matchTimeSpanEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="departureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="departureTimeRt" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="arrivalTimeRt" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="trainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="trainNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="trainCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSectionData", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "departure",
    "arrival"
})
public class TrackSectionData {

    @XmlElement(name = "Departure", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location departure;
    @XmlElement(name = "Arrival", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location arrival;
    @XmlAttribute(name = "type", required = true)
    protected ReconstructionSectionType type;
    @XmlAttribute(name = "matchTimeSpanBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchTimeSpanBegin;
    @XmlAttribute(name = "matchTimeSpanEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchTimeSpanEnd;
    @XmlAttribute(name = "departureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    @XmlAttribute(name = "departureTimeRt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTimeRt;
    @XmlAttribute(name = "arrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "arrivalTimeRt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTimeRt;
    @XmlAttribute(name = "trainName")
    protected String trainName;
    @XmlAttribute(name = "trainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "trainCategory")
    protected String trainCategory;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setDeparture(Location value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setArrival(Location value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReconstructionSectionType }
     *     
     */
    public ReconstructionSectionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconstructionSectionType }
     *     
     */
    public void setType(ReconstructionSectionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the matchTimeSpanBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchTimeSpanBegin() {
        return matchTimeSpanBegin;
    }

    /**
     * Sets the value of the matchTimeSpanBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchTimeSpanBegin(XMLGregorianCalendar value) {
        this.matchTimeSpanBegin = value;
    }

    /**
     * Gets the value of the matchTimeSpanEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchTimeSpanEnd() {
        return matchTimeSpanEnd;
    }

    /**
     * Sets the value of the matchTimeSpanEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchTimeSpanEnd(XMLGregorianCalendar value) {
        this.matchTimeSpanEnd = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the departureTimeRt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTimeRt() {
        return departureTimeRt;
    }

    /**
     * Sets the value of the departureTimeRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTimeRt(XMLGregorianCalendar value) {
        this.departureTimeRt = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the arrivalTimeRt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTimeRt() {
        return arrivalTimeRt;
    }

    /**
     * Sets the value of the arrivalTimeRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTimeRt(XMLGregorianCalendar value) {
        this.arrivalTimeRt = value;
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
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the trainCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCategory() {
        return trainCategory;
    }

    /**
     * Sets the value of the trainCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCategory(String value) {
        this.trainCategory = value;
    }

}
