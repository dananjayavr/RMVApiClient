
package de.rmv.hapirest.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="matchTimeSpanBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="matchTimeSpanEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journeyDetail"
})
@XmlRootElement(name = "TrackMatchJourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class TrackMatchJourneyDetail {

    @XmlElement(name = "JourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected JourneyDetail journeyDetail;
    @XmlAttribute(name = "matchTimeSpanBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchTimeSpanBegin;
    @XmlAttribute(name = "matchTimeSpanEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchTimeSpanEnd;

    /**
     * Gets the value of the journeyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDetail }
     *     
     */
    public JourneyDetail getJourneyDetail() {
        return journeyDetail;
    }

    /**
     * Sets the value of the journeyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDetail }
     *     
     */
    public void setJourneyDetail(JourneyDetail value) {
        this.journeyDetail = value;
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

}
