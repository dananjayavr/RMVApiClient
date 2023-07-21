
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Trip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Pricing" type="{http://hacon.de/hafas/proxy/hafas-proxy}pricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SotContext" type="{http://hacon.de/hafas/proxy/hafas-proxy}SotContextType" minOccurs="0"/&gt;
 *         &lt;element name="ResultStatus" type="{http://hacon.de/hafas/proxy/hafas-proxy}ResultStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.TripList"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripList", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "trip",
    "pricing",
    "sotContext",
    "resultStatus"
})
public class TripList
    extends CommonResponseType
{

    @XmlElement(name = "Trip", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TripType> trip;
    @XmlElement(name = "Pricing", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PricingType> pricing;
    @XmlElement(name = "SotContext", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected SotContextType sotContext;
    @XmlElement(name = "ResultStatus", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ResultStatusType resultStatus;
    @XmlAttribute(name = "scrB")
    protected String scrB;
    @XmlAttribute(name = "scrF")
    protected String scrF;
    @XmlAttribute(name = "scrReturnB")
    protected String scrReturnB;
    @XmlAttribute(name = "scrReturnF")
    protected String scrReturnF;

    /**
     * Gets the value of the trip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripType }
     * 
     * 
     */
    public List<TripType> getTrip() {
        if (trip == null) {
            trip = new ArrayList<TripType>();
        }
        return this.trip;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingType }
     * 
     * 
     */
    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<PricingType>();
        }
        return this.pricing;
    }

    /**
     * Gets the value of the sotContext property.
     * 
     * @return
     *     possible object is
     *     {@link SotContextType }
     *     
     */
    public SotContextType getSotContext() {
        return sotContext;
    }

    /**
     * Sets the value of the sotContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SotContextType }
     *     
     */
    public void setSotContext(SotContextType value) {
        this.sotContext = value;
    }

    /**
     * Gets the value of the resultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatusType }
     *     
     */
    public ResultStatusType getResultStatus() {
        return resultStatus;
    }

    /**
     * Sets the value of the resultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatusType }
     *     
     */
    public void setResultStatus(ResultStatusType value) {
        this.resultStatus = value;
    }

    /**
     * Gets the value of the scrB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrB() {
        return scrB;
    }

    /**
     * Sets the value of the scrB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrB(String value) {
        this.scrB = value;
    }

    /**
     * Gets the value of the scrF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrF() {
        return scrF;
    }

    /**
     * Sets the value of the scrF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrF(String value) {
        this.scrF = value;
    }

    /**
     * Gets the value of the scrReturnB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrReturnB() {
        return scrReturnB;
    }

    /**
     * Sets the value of the scrReturnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrReturnB(String value) {
        this.scrReturnB = value;
    }

    /**
     * Gets the value of the scrReturnF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrReturnF() {
        return scrReturnF;
    }

    /**
     * Sets the value of the scrReturnF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrReturnF(String value) {
        this.scrReturnF = value;
    }

}
