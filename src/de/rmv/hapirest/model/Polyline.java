
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Polyline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Polyline"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crd" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="delta" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dim" type="{http://www.w3.org/2001/XMLSchema}int" default="2" /&gt;
 *       &lt;attribute name="type" type="{http://hacon.de/hafas/proxy/hafas-proxy}CoordType" default="WGS84" /&gt;
 *       &lt;attribute name="crdEncYX" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdEncZ" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdEncS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polyline", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "crd"
})
public class Polyline {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = Double.class)
    protected List<Double> crd;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "delta", required = true)
    protected boolean delta;
    @XmlAttribute(name = "dim")
    protected Integer dim;
    @XmlAttribute(name = "type")
    protected CoordType type;
    @XmlAttribute(name = "crdEncYX")
    protected String crdEncYX;
    @XmlAttribute(name = "crdEncZ")
    protected String crdEncZ;
    @XmlAttribute(name = "crdEncS")
    protected String crdEncS;

    /**
     * Gets the value of the crd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCrd() {
        if (crd == null) {
            crd = new ArrayList<Double>();
        }
        return this.crd;
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
     * Gets the value of the delta property.
     * 
     */
    public boolean isDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     */
    public void setDelta(boolean value) {
        this.delta = value;
    }

    /**
     * Gets the value of the dim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDim() {
        if (dim == null) {
            return  2;
        } else {
            return dim;
        }
    }

    /**
     * Sets the value of the dim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDim(Integer value) {
        this.dim = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CoordType }
     *     
     */
    public CoordType getType() {
        if (type == null) {
            return CoordType.WGS_84;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordType }
     *     
     */
    public void setType(CoordType value) {
        this.type = value;
    }

    /**
     * Gets the value of the crdEncYX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdEncYX() {
        return crdEncYX;
    }

    /**
     * Sets the value of the crdEncYX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdEncYX(String value) {
        this.crdEncYX = value;
    }

    /**
     * Gets the value of the crdEncZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdEncZ() {
        return crdEncZ;
    }

    /**
     * Sets the value of the crdEncZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdEncZ(String value) {
        this.crdEncZ = value;
    }

    /**
     * Gets the value of the crdEncS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdEncS() {
        return crdEncS;
    }

    /**
     * Sets the value of the crdEncS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdEncS(String value) {
        this.crdEncS = value;
    }

}
