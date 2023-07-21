
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="poly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="polyEnc" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineEncodingType" /&gt;
 *       &lt;attribute name="passlist" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="showPassingPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ivOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ivInclude" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="eco" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ecoCmp" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ecoParams"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="baim" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="withJourneyBoundaryPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputControlType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class OutputControlType {

    @XmlAttribute(name = "poly")
    protected Boolean poly;
    @XmlAttribute(name = "polyEnc")
    protected PolylineEncodingType polyEnc;
    @XmlAttribute(name = "passlist")
    protected Boolean passlist;
    @XmlAttribute(name = "showPassingPoints")
    protected Boolean showPassingPoints;
    @XmlAttribute(name = "ivOnly")
    protected Boolean ivOnly;
    @XmlAttribute(name = "ivInclude")
    protected Boolean ivInclude;
    @XmlAttribute(name = "eco")
    protected Boolean eco;
    @XmlAttribute(name = "ecoCmp")
    protected Boolean ecoCmp;
    @XmlAttribute(name = "ecoParams")
    protected String ecoParams;
    @XmlAttribute(name = "baim")
    protected Boolean baim;
    @XmlAttribute(name = "withJourneyBoundaryPoints")
    protected Boolean withJourneyBoundaryPoints;

    /**
     * Gets the value of the poly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPoly() {
        if (poly == null) {
            return false;
        } else {
            return poly;
        }
    }

    /**
     * Sets the value of the poly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoly(Boolean value) {
        this.poly = value;
    }

    /**
     * Gets the value of the polyEnc property.
     * 
     * @return
     *     possible object is
     *     {@link PolylineEncodingType }
     *     
     */
    public PolylineEncodingType getPolyEnc() {
        return polyEnc;
    }

    /**
     * Sets the value of the polyEnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolylineEncodingType }
     *     
     */
    public void setPolyEnc(PolylineEncodingType value) {
        this.polyEnc = value;
    }

    /**
     * Gets the value of the passlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPasslist() {
        if (passlist == null) {
            return false;
        } else {
            return passlist;
        }
    }

    /**
     * Sets the value of the passlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasslist(Boolean value) {
        this.passlist = value;
    }

    /**
     * Gets the value of the showPassingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowPassingPoints() {
        if (showPassingPoints == null) {
            return false;
        } else {
            return showPassingPoints;
        }
    }

    /**
     * Sets the value of the showPassingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPassingPoints(Boolean value) {
        this.showPassingPoints = value;
    }

    /**
     * Gets the value of the ivOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIvOnly() {
        if (ivOnly == null) {
            return false;
        } else {
            return ivOnly;
        }
    }

    /**
     * Sets the value of the ivOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIvOnly(Boolean value) {
        this.ivOnly = value;
    }

    /**
     * Gets the value of the ivInclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIvInclude() {
        if (ivInclude == null) {
            return false;
        } else {
            return ivInclude;
        }
    }

    /**
     * Sets the value of the ivInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIvInclude(Boolean value) {
        this.ivInclude = value;
    }

    /**
     * Gets the value of the eco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEco() {
        if (eco == null) {
            return false;
        } else {
            return eco;
        }
    }

    /**
     * Sets the value of the eco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEco(Boolean value) {
        this.eco = value;
    }

    /**
     * Gets the value of the ecoCmp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEcoCmp() {
        if (ecoCmp == null) {
            return false;
        } else {
            return ecoCmp;
        }
    }

    /**
     * Sets the value of the ecoCmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEcoCmp(Boolean value) {
        this.ecoCmp = value;
    }

    /**
     * Gets the value of the ecoParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcoParams() {
        return ecoParams;
    }

    /**
     * Sets the value of the ecoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcoParams(String value) {
        this.ecoParams = value;
    }

    /**
     * Gets the value of the baim property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBaim() {
        if (baim == null) {
            return false;
        } else {
            return baim;
        }
    }

    /**
     * Sets the value of the baim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaim(Boolean value) {
        this.baim = value;
    }

    /**
     * Gets the value of the withJourneyBoundaryPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWithJourneyBoundaryPoints() {
        if (withJourneyBoundaryPoints == null) {
            return false;
        } else {
            return withJourneyBoundaryPoints;
        }
    }

    /**
     * Sets the value of the withJourneyBoundaryPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithJourneyBoundaryPoints(Boolean value) {
        this.withJourneyBoundaryPoints = value;
    }

}
