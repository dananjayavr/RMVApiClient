
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EcoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="co2" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="co2f" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="part" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="part10" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="partV" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="nmhc" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="nox" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="prime" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="primef" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="so2" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="ubp" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="PUT" /&gt;
 *       &lt;attribute name="nmvoc" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="ubp13" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="co2el" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="primeEnergy" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="rating" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcoType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class EcoType {

    @XmlAttribute(name = "co2")
    protected Double co2;
    @XmlAttribute(name = "co2f")
    protected Double co2F;
    @XmlAttribute(name = "part")
    protected Double part;
    @XmlAttribute(name = "part10")
    protected Double part10;
    @XmlAttribute(name = "partV")
    protected Double partV;
    @XmlAttribute(name = "nmhc")
    protected Double nmhc;
    @XmlAttribute(name = "nox")
    protected Double nox;
    @XmlAttribute(name = "prime")
    protected Double prime;
    @XmlAttribute(name = "primef")
    protected Double primef;
    @XmlAttribute(name = "so2")
    protected Double so2;
    @XmlAttribute(name = "ubp")
    protected Double ubp;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "nmvoc")
    protected Double nmvoc;
    @XmlAttribute(name = "ubp13")
    protected Double ubp13;
    @XmlAttribute(name = "co2el")
    protected Double co2El;
    @XmlAttribute(name = "primeEnergy")
    protected Double primeEnergy;
    @XmlAttribute(name = "rating")
    protected Integer rating;

    /**
     * Gets the value of the co2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCo2() {
        return co2;
    }

    /**
     * Sets the value of the co2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCo2(Double value) {
        this.co2 = value;
    }

    /**
     * Gets the value of the co2F property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCo2F() {
        return co2F;
    }

    /**
     * Sets the value of the co2F property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCo2F(Double value) {
        this.co2F = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPart(Double value) {
        this.part = value;
    }

    /**
     * Gets the value of the part10 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPart10() {
        return part10;
    }

    /**
     * Sets the value of the part10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPart10(Double value) {
        this.part10 = value;
    }

    /**
     * Gets the value of the partV property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartV() {
        return partV;
    }

    /**
     * Sets the value of the partV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartV(Double value) {
        this.partV = value;
    }

    /**
     * Gets the value of the nmhc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNmhc() {
        return nmhc;
    }

    /**
     * Sets the value of the nmhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNmhc(Double value) {
        this.nmhc = value;
    }

    /**
     * Gets the value of the nox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNox() {
        return nox;
    }

    /**
     * Sets the value of the nox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNox(Double value) {
        this.nox = value;
    }

    /**
     * Gets the value of the prime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrime() {
        return prime;
    }

    /**
     * Sets the value of the prime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrime(Double value) {
        this.prime = value;
    }

    /**
     * Gets the value of the primef property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimef() {
        return primef;
    }

    /**
     * Sets the value of the primef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimef(Double value) {
        this.primef = value;
    }

    /**
     * Gets the value of the so2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSo2() {
        return so2;
    }

    /**
     * Sets the value of the so2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSo2(Double value) {
        this.so2 = value;
    }

    /**
     * Gets the value of the ubp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUbp() {
        return ubp;
    }

    /**
     * Sets the value of the ubp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUbp(Double value) {
        this.ubp = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDist() {
        if (dist == null) {
            return -1;
        } else {
            return dist;
        }
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDist(Integer value) {
        this.dist = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "PUT";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the nmvoc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNmvoc() {
        return nmvoc;
    }

    /**
     * Sets the value of the nmvoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNmvoc(Double value) {
        this.nmvoc = value;
    }

    /**
     * Gets the value of the ubp13 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUbp13() {
        return ubp13;
    }

    /**
     * Sets the value of the ubp13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUbp13(Double value) {
        this.ubp13 = value;
    }

    /**
     * Gets the value of the co2El property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCo2El() {
        return co2El;
    }

    /**
     * Sets the value of the co2El property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCo2El(Double value) {
        this.co2El = value;
    }

    /**
     * Gets the value of the primeEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimeEnergy() {
        return primeEnergy;
    }

    /**
     * Sets the value of the primeEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimeEnergy(Double value) {
        this.primeEnergy = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRating(Integer value) {
        this.rating = value;
    }

}
