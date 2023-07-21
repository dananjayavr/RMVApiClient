
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreselectionNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreselectionNodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hacon.de/hafas/proxy/hafas-proxy}Location"/&gt;
 *         &lt;element name="PreselectionEdge" type="{http://hacon.de/hafas/proxy/hafas-proxy}PreselectionEdgeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreselectionNodeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "id",
    "location",
    "preselectionEdge"
})
public class PreselectionNodeType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String id;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Location location;
    @XmlElement(name = "PreselectionEdge", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PreselectionEdgeType> preselectionEdge;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the preselectionEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preselectionEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreselectionEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreselectionEdgeType }
     * 
     * 
     */
    public List<PreselectionEdgeType> getPreselectionEdge() {
        if (preselectionEdge == null) {
            preselectionEdge = new ArrayList<PreselectionEdgeType>();
        }
        return this.preselectionEdge;
    }

}
