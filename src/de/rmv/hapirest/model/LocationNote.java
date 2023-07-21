
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LocationNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationNote"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://hacon.de/hafas/proxy/hafas-proxy}attlist.LocationNote"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationNote", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "value"
})
public class LocationNote {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "type")
    protected NoteType type;
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
