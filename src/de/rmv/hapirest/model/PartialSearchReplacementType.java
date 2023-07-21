
package de.rmv.hapirest.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSearchReplacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialSearchReplacementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ctx" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="8096"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="supplChgTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialSearchReplacementType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class PartialSearchReplacementType {

    @XmlAttribute(name = "ctx", required = true)
    protected String ctx;
    @XmlAttribute(name = "supplChgTime")
    protected BigInteger supplChgTime;

    /**
     * Gets the value of the ctx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtx() {
        return ctx;
    }

    /**
     * Sets the value of the ctx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtx(String value) {
        this.ctx = value;
    }

    /**
     * Gets the value of the supplChgTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplChgTime() {
        return supplChgTime;
    }

    /**
     * Sets the value of the supplChgTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplChgTime(BigInteger value) {
        this.supplChgTime = value;
    }

}
