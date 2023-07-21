
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rectangle structure.
 * 
 * <p>Java class for Rect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="llCrd" type="{http://hacon.de/hafas/proxy/hafas-proxy}Coordinate"/&gt;
 *         &lt;element name="urCrd" type="{http://hacon.de/hafas/proxy/hafas-proxy}Coordinate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rect", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "llCrd",
    "urCrd"
})
public class Rect {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Coordinate llCrd;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected Coordinate urCrd;

    /**
     * Gets the value of the llCrd property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getLlCrd() {
        return llCrd;
    }

    /**
     * Sets the value of the llCrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setLlCrd(Coordinate value) {
        this.llCrd = value;
    }

    /**
     * Gets the value of the urCrd property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getUrCrd() {
        return urCrd;
    }

    /**
     * Sets the value of the urCrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setUrCrd(Coordinate value) {
        this.urCrd = value;
    }

}
