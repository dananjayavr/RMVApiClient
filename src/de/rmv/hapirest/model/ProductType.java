
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Product context, provides access to internal data. For the product category attributes,
 * 				their
 * 				assignments are defined in the "zugart" file from the raw Hafas plan data.
 * 			
 * 
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="icon" type="{http://hacon.de/hafas/proxy/hafas-proxy}IconType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductStatusType" minOccurs="0"/&gt;
 *         &lt;element name="fromLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *         &lt;element name="toLocation" type="{http://hacon.de/hafas/proxy/hafas-proxy}StopType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cls" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOutS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOutL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="routeIdxFrom" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="routeIdxTo" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="matchId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tarGr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="surcharge" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="outCtrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locTraffic" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shipTraffic" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "icon",
    "status",
    "fromLocation",
    "toLocation"
})
public class ProductType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected IconType icon;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ProductStatusType status;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType fromLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopType toLocation;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "internalName")
    protected String internalName;
    @XmlAttribute(name = "addName")
    protected String addName;
    @XmlAttribute(name = "displayNumber")
    protected String displayNumber;
    @XmlAttribute(name = "num")
    protected String num;
    @XmlAttribute(name = "line")
    protected String line;
    @XmlAttribute(name = "lineId")
    protected String lineId;
    @XmlAttribute(name = "catOut")
    protected String catOut;
    @XmlAttribute(name = "catIn")
    protected String catIn;
    @XmlAttribute(name = "catCode")
    protected String catCode;
    @XmlAttribute(name = "cls")
    protected String cls;
    @XmlAttribute(name = "catOutS")
    protected String catOutS;
    @XmlAttribute(name = "catOutL")
    protected String catOutL;
    @XmlAttribute(name = "operatorCode")
    protected String operatorCode;
    @XmlAttribute(name = "operator")
    protected String operator;
    @XmlAttribute(name = "admin")
    protected String admin;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;
    @XmlAttribute(name = "matchId")
    protected String matchId;
    @XmlAttribute(name = "tarGr")
    protected String tarGr;
    @XmlAttribute(name = "surcharge")
    protected String surcharge;
    @XmlAttribute(name = "outCtrl")
    protected String outCtrl;
    @XmlAttribute(name = "locTraffic")
    protected String locTraffic;
    @XmlAttribute(name = "shipTraffic")
    protected String shipTraffic;

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconType }
     *     
     */
    public IconType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconType }
     *     
     */
    public void setIcon(IconType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatusType }
     *     
     */
    public ProductStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatusType }
     *     
     */
    public void setStatus(ProductStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setFromLocation(StopType value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StopType }
     *     
     */
    public StopType getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopType }
     *     
     */
    public void setToLocation(StopType value) {
        this.toLocation = value;
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
     * Gets the value of the internalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Sets the value of the internalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalName(String value) {
        this.internalName = value;
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
     * Gets the value of the displayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNumber() {
        return displayNumber;
    }

    /**
     * Sets the value of the displayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNumber(String value) {
        this.displayNumber = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the catOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatOut() {
        return catOut;
    }

    /**
     * Sets the value of the catOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatOut(String value) {
        this.catOut = value;
    }

    /**
     * Gets the value of the catIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatIn() {
        return catIn;
    }

    /**
     * Sets the value of the catIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatIn(String value) {
        this.catIn = value;
    }

    /**
     * Gets the value of the catCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatCode() {
        return catCode;
    }

    /**
     * Sets the value of the catCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatCode(String value) {
        this.catCode = value;
    }

    /**
     * Gets the value of the cls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCls() {
        return cls;
    }

    /**
     * Sets the value of the cls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCls(String value) {
        this.cls = value;
    }

    /**
     * Gets the value of the catOutS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatOutS() {
        return catOutS;
    }

    /**
     * Sets the value of the catOutS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatOutS(String value) {
        this.catOutS = value;
    }

    /**
     * Gets the value of the catOutL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatOutL() {
        return catOutL;
    }

    /**
     * Sets the value of the catOutL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatOutL(String value) {
        this.catOutL = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin(String value) {
        this.admin = value;
    }

    /**
     * Gets the value of the routeIdxFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRouteIdxFrom() {
        if (routeIdxFrom == null) {
            return -1;
        } else {
            return routeIdxFrom;
        }
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
    public int getRouteIdxTo() {
        if (routeIdxTo == null) {
            return -1;
        } else {
            return routeIdxTo;
        }
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
     * Gets the value of the matchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchId(String value) {
        this.matchId = value;
    }

    /**
     * Gets the value of the tarGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarGr() {
        return tarGr;
    }

    /**
     * Sets the value of the tarGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarGr(String value) {
        this.tarGr = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the outCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCtrl() {
        return outCtrl;
    }

    /**
     * Sets the value of the outCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCtrl(String value) {
        this.outCtrl = value;
    }

    /**
     * Gets the value of the locTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocTraffic() {
        return locTraffic;
    }

    /**
     * Sets the value of the locTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocTraffic(String value) {
        this.locTraffic = value;
    }

    /**
     * Gets the value of the shipTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTraffic() {
        return shipTraffic;
    }

    /**
     * Sets the value of the shipTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTraffic(String value) {
        this.shipTraffic = value;
    }

}
