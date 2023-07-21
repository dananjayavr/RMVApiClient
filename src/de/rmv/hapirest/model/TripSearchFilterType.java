
package de.rmv.hapirest.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripSearchFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripSearchFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="products" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="gisProducts"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="operators"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="categories"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="attributes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="sattributes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lines"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lineIds"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="avoidPaths"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="512"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mobilityProfile"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="512"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="trainFilter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1024"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="groupFilter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="512"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="bikeCarriage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="bikeCarriageType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="SINGLEBIKES"/&gt;
 *             &lt;enumeration value="SMALLGROUPS"/&gt;
 *             &lt;enumeration value="LARGEGROUPS"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="sleepingCar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="couchetteCoach" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripSearchFilterType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class TripSearchFilterType {

    @XmlAttribute(name = "products")
    protected BigInteger products;
    @XmlAttribute(name = "gisProducts")
    protected String gisProducts;
    @XmlAttribute(name = "operators")
    protected String operators;
    @XmlAttribute(name = "categories")
    protected String categories;
    @XmlAttribute(name = "attributes")
    protected String attributes;
    @XmlAttribute(name = "sattributes")
    protected String sattributes;
    @XmlAttribute(name = "lines")
    protected String lines;
    @XmlAttribute(name = "lineIds")
    protected String lineIds;
    @XmlAttribute(name = "avoidPaths")
    protected String avoidPaths;
    @XmlAttribute(name = "mobilityProfile")
    protected String mobilityProfile;
    @XmlAttribute(name = "trainFilter")
    protected String trainFilter;
    @XmlAttribute(name = "groupFilter")
    protected String groupFilter;
    @XmlAttribute(name = "bikeCarriage")
    protected Boolean bikeCarriage;
    @XmlAttribute(name = "bikeCarriageType")
    protected String bikeCarriageType;
    @XmlAttribute(name = "sleepingCar")
    protected Boolean sleepingCar;
    @XmlAttribute(name = "couchetteCoach")
    protected Boolean couchetteCoach;

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProducts(BigInteger value) {
        this.products = value;
    }

    /**
     * Gets the value of the gisProducts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisProducts() {
        return gisProducts;
    }

    /**
     * Sets the value of the gisProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisProducts(String value) {
        this.gisProducts = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperators(String value) {
        this.operators = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategories(String value) {
        this.categories = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the sattributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSattributes() {
        return sattributes;
    }

    /**
     * Sets the value of the sattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSattributes(String value) {
        this.sattributes = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLines(String value) {
        this.lines = value;
    }

    /**
     * Gets the value of the lineIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineIds() {
        return lineIds;
    }

    /**
     * Sets the value of the lineIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineIds(String value) {
        this.lineIds = value;
    }

    /**
     * Gets the value of the avoidPaths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvoidPaths() {
        return avoidPaths;
    }

    /**
     * Sets the value of the avoidPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvoidPaths(String value) {
        this.avoidPaths = value;
    }

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityProfile(String value) {
        this.mobilityProfile = value;
    }

    /**
     * Gets the value of the trainFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainFilter() {
        return trainFilter;
    }

    /**
     * Sets the value of the trainFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainFilter(String value) {
        this.trainFilter = value;
    }

    /**
     * Gets the value of the groupFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupFilter() {
        return groupFilter;
    }

    /**
     * Sets the value of the groupFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupFilter(String value) {
        this.groupFilter = value;
    }

    /**
     * Gets the value of the bikeCarriage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBikeCarriage() {
        if (bikeCarriage == null) {
            return false;
        } else {
            return bikeCarriage;
        }
    }

    /**
     * Sets the value of the bikeCarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBikeCarriage(Boolean value) {
        this.bikeCarriage = value;
    }

    /**
     * Gets the value of the bikeCarriageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBikeCarriageType() {
        return bikeCarriageType;
    }

    /**
     * Sets the value of the bikeCarriageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBikeCarriageType(String value) {
        this.bikeCarriageType = value;
    }

    /**
     * Gets the value of the sleepingCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSleepingCar() {
        if (sleepingCar == null) {
            return false;
        } else {
            return sleepingCar;
        }
    }

    /**
     * Sets the value of the sleepingCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSleepingCar(Boolean value) {
        this.sleepingCar = value;
    }

    /**
     * Gets the value of the couchetteCoach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCouchetteCoach() {
        if (couchetteCoach == null) {
            return false;
        } else {
            return couchetteCoach;
        }
    }

    /**
     * Sets the value of the couchetteCoach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCouchetteCoach(Boolean value) {
        this.couchetteCoach = value;
    }

}
