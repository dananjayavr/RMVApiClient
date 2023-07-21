
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedStopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "stopLocation"
})
public class AffectedStopType {

    @XmlElement(name = "StopLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected List<StopLocation> stopLocation;

    /**
     * List of stops affected by a message.Gets the value of the stopLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLocation }
     * 
     * 
     */
    public List<StopLocation> getStopLocation() {
        if (stopLocation == null) {
            stopLocation = new ArrayList<StopLocation>();
        }
        return this.stopLocation;
    }

}
