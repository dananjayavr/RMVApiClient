
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Operator info.
 * 
 * <p>Java class for OperatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administration" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "administration"
})
public class OperatorType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> administration;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "nameS")
    protected String nameS;
    @XmlAttribute(name = "nameN")
    protected String nameN;
    @XmlAttribute(name = "nameL")
    protected String nameL;
    @XmlAttribute(name = "addName")
    protected String addName;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the administration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the administration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdministration() {
        if (administration == null) {
            administration = new ArrayList<String>();
        }
        return this.administration;
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

    /**
     * Gets the value of the nameN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameN() {
        return nameN;
    }

    /**
     * Sets the value of the nameN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameN(String value) {
        this.nameN = value;
    }

    /**
     * Gets the value of the nameL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameL() {
        return nameL;
    }

    /**
     * Sets the value of the nameL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameL(String value) {
        this.nameL = value;
    }

    /**
     * Gets the value of the addName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddName() {
        return addName;
    }

    /**
     * Sets the value of the addName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddName(String value) {
        this.addName = value;
    }

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

}
