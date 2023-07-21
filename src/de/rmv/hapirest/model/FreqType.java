
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Alternatives for this leg by plan.
 * 
 * <p>Java class for FreqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journey" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="waitMinimum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="waitMaximum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="alternativeCount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "journey"
})
public class FreqType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyType> journey;
    @XmlAttribute(name = "waitMinimum")
    protected Integer waitMinimum;
    @XmlAttribute(name = "waitMaximum")
    protected Integer waitMaximum;
    @XmlAttribute(name = "alternativeCount")
    protected Integer alternativeCount;

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
     * Gets the value of the waitMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitMinimum() {
        return waitMinimum;
    }

    /**
     * Sets the value of the waitMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitMinimum(Integer value) {
        this.waitMinimum = value;
    }

    /**
     * Gets the value of the waitMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitMaximum() {
        return waitMaximum;
    }

    /**
     * Sets the value of the waitMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitMaximum(Integer value) {
        this.waitMaximum = value;
    }

    /**
     * Gets the value of the alternativeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternativeCount() {
        return alternativeCount;
    }

    /**
     * Sets the value of the alternativeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternativeCount(Integer value) {
        this.alternativeCount = value;
    }

}
