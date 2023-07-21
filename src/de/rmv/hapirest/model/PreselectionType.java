
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreselectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreselectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gisProfile" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisProfile"/&gt;
 *         &lt;element name="node" type="{http://hacon.de/hafas/proxy/hafas-proxy}PreselectionNodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreselectionType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "gisProfile",
    "node"
})
public class PreselectionType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected GisProfile gisProfile;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PreselectionNodeType> node;

    /**
     * Gets the value of the gisProfile property.
     * 
     * @return
     *     possible object is
     *     {@link GisProfile }
     *     
     */
    public GisProfile getGisProfile() {
        return gisProfile;
    }

    /**
     * Sets the value of the gisProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisProfile }
     *     
     */
    public void setGisProfile(GisProfile value) {
        this.gisProfile = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreselectionNodeType }
     * 
     * 
     */
    public List<PreselectionNodeType> getNode() {
        if (node == null) {
            node = new ArrayList<PreselectionNodeType>();
        }
        return this.node;
    }

}
