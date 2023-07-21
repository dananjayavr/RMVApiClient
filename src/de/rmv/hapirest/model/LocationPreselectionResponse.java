
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationPreselectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationPreselectionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location" minOccurs="0"/&gt;
 *         &lt;element name="preselection" type="{http://hacon.de/hafas/proxy/hafas-proxy}PreselectionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationPreselectionResponse", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "referenceLocation",
    "preselection"
})
public class LocationPreselectionResponse
    extends CommonResponseType
{

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Location referenceLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PreselectionType> preselection;

    /**
     * Gets the value of the referenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setReferenceLocation(Location value) {
        this.referenceLocation = value;
    }

    /**
     * Gets the value of the preselection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preselection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreselection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreselectionType }
     * 
     * 
     */
    public List<PreselectionType> getPreselection() {
        if (preselection == null) {
            preselection = new ArrayList<PreselectionType>();
        }
        return this.preselection;
    }

}
