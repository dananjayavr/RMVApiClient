
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
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlRootElement(name = "JourneyDetailGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class JourneyDetailGroup {

    @XmlElement(name = "JourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyDetail> journeyDetail;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameS")
    protected String nameS;

    /**
     * Gets the value of the journeyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the journeyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyDetail }
     * 
     * 
     */
    public List<JourneyDetail> getJourneyDetail() {
        if (journeyDetail == null) {
            journeyDetail = new ArrayList<JourneyDetail>();
        }
        return this.journeyDetail;
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
     * Gets the value of the nameS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameS() {
        return nameS;
    }

    /**
     * Sets the value of the nameS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameS(String value) {
        this.nameS = value;
    }

}
