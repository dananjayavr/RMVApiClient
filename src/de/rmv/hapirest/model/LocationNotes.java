
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}LocationNote" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationNote"
})
@XmlRootElement(name = "LocationNotes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class LocationNotes {

    @XmlElement(name = "LocationNote", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected List<LocationNote> locationNote;

    /**
     * Note to be displayed Gets the value of the locationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationNote }
     * 
     * 
     */
    public List<LocationNote> getLocationNote() {
        if (locationNote == null) {
            locationNote = new ArrayList<LocationNote>();
        }
        return this.locationNote;
    }

}
