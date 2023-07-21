
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Note to be displayed
 * 
 * <p>Java class for Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Note"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.Note"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "value"
})
public class Note {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    @XmlSchemaType(name = "anySimpleType")
    protected String key;
    @XmlAttribute(name = "type")
    protected NoteType type;
    @XmlAttribute(name = "priority")
    protected Integer priority;
    @XmlAttribute(name = "url")
    @XmlSchemaType(name = "anySimpleType")
    protected String url;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;
    @XmlAttribute(name = "txtN")
    protected String txtN;
    @XmlAttribute(name = "txtL")
    protected String txtL;
    @XmlAttribute(name = "txtS")
    protected String txtS;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NoteType }
     *     
     */
    public NoteType getType() {
        if (type == null) {
            return NoteType.U;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteType }
     *     
     */
    public void setType(NoteType value) {
        this.type = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPriority() {
        if (priority == null) {
            return  100;
        } else {
            return priority;
        }
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the routeIdxFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    /**
     * Sets the value of the routeIdxFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxFrom(Integer value) {
        this.routeIdxFrom = value;
    }

    /**
     * Gets the value of the routeIdxTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    /**
     * Sets the value of the routeIdxTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteIdxTo(Integer value) {
        this.routeIdxTo = value;
    }

    /**
     * Gets the value of the txtN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtN() {
        return txtN;
    }

    /**
     * Sets the value of the txtN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtN(String value) {
        this.txtN = value;
    }

    /**
     * Gets the value of the txtL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtL() {
        return txtL;
    }

    /**
     * Sets the value of the txtL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtL(String value) {
        this.txtL = value;
    }

    /**
     * Gets the value of the txtS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtS() {
        return txtS;
    }

    /**
     * Sets the value of the txtS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtS(String value) {
        this.txtS = value;
    }

}
