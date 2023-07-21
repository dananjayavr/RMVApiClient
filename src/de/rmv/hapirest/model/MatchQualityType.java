
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchQualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchQualityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="avgGraphDistance" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="maxGraphDistance" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="avgGraphTimeDistance" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="percentCoverage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="percentTrackCoverage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="percentRealtime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="checkInQuality" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="checkOutQuality" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="spatialMatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="timeSpatialMatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="overallRating" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="activityMatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="vehicleBeaconMatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="spatialStationBeaconMatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchQualityType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class MatchQualityType {

    @XmlAttribute(name = "avgGraphDistance")
    protected Long avgGraphDistance;
    @XmlAttribute(name = "maxGraphDistance")
    protected Long maxGraphDistance;
    @XmlAttribute(name = "avgGraphTimeDistance")
    protected Long avgGraphTimeDistance;
    @XmlAttribute(name = "percentCoverage")
    protected Integer percentCoverage;
    @XmlAttribute(name = "percentTrackCoverage")
    protected Integer percentTrackCoverage;
    @XmlAttribute(name = "percentRealtime")
    protected Integer percentRealtime;
    @XmlAttribute(name = "checkInQuality")
    protected Integer checkInQuality;
    @XmlAttribute(name = "checkOutQuality")
    protected Integer checkOutQuality;
    @XmlAttribute(name = "spatialMatch")
    protected Integer spatialMatch;
    @XmlAttribute(name = "timeSpatialMatch")
    protected Integer timeSpatialMatch;
    @XmlAttribute(name = "overallRating")
    protected Integer overallRating;
    @XmlAttribute(name = "activityMatch")
    protected Integer activityMatch;
    @XmlAttribute(name = "vehicleBeaconMatch")
    protected Integer vehicleBeaconMatch;
    @XmlAttribute(name = "spatialStationBeaconMatch")
    protected Integer spatialStationBeaconMatch;

    /**
     * Gets the value of the avgGraphDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgGraphDistance() {
        return avgGraphDistance;
    }

    /**
     * Sets the value of the avgGraphDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgGraphDistance(Long value) {
        this.avgGraphDistance = value;
    }

    /**
     * Gets the value of the maxGraphDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxGraphDistance() {
        return maxGraphDistance;
    }

    /**
     * Sets the value of the maxGraphDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxGraphDistance(Long value) {
        this.maxGraphDistance = value;
    }

    /**
     * Gets the value of the avgGraphTimeDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgGraphTimeDistance() {
        return avgGraphTimeDistance;
    }

    /**
     * Sets the value of the avgGraphTimeDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgGraphTimeDistance(Long value) {
        this.avgGraphTimeDistance = value;
    }

    /**
     * Gets the value of the percentCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentCoverage() {
        return percentCoverage;
    }

    /**
     * Sets the value of the percentCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentCoverage(Integer value) {
        this.percentCoverage = value;
    }

    /**
     * Gets the value of the percentTrackCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentTrackCoverage() {
        return percentTrackCoverage;
    }

    /**
     * Sets the value of the percentTrackCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentTrackCoverage(Integer value) {
        this.percentTrackCoverage = value;
    }

    /**
     * Gets the value of the percentRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentRealtime() {
        return percentRealtime;
    }

    /**
     * Sets the value of the percentRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentRealtime(Integer value) {
        this.percentRealtime = value;
    }

    /**
     * Gets the value of the checkInQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckInQuality() {
        return checkInQuality;
    }

    /**
     * Sets the value of the checkInQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckInQuality(Integer value) {
        this.checkInQuality = value;
    }

    /**
     * Gets the value of the checkOutQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckOutQuality() {
        return checkOutQuality;
    }

    /**
     * Sets the value of the checkOutQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckOutQuality(Integer value) {
        this.checkOutQuality = value;
    }

    /**
     * Gets the value of the spatialMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpatialMatch() {
        return spatialMatch;
    }

    /**
     * Sets the value of the spatialMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpatialMatch(Integer value) {
        this.spatialMatch = value;
    }

    /**
     * Gets the value of the timeSpatialMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSpatialMatch() {
        return timeSpatialMatch;
    }

    /**
     * Sets the value of the timeSpatialMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSpatialMatch(Integer value) {
        this.timeSpatialMatch = value;
    }

    /**
     * Gets the value of the overallRating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallRating() {
        return overallRating;
    }

    /**
     * Sets the value of the overallRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallRating(Integer value) {
        this.overallRating = value;
    }

    /**
     * Gets the value of the activityMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityMatch() {
        return activityMatch;
    }

    /**
     * Sets the value of the activityMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityMatch(Integer value) {
        this.activityMatch = value;
    }

    /**
     * Gets the value of the vehicleBeaconMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehicleBeaconMatch() {
        return vehicleBeaconMatch;
    }

    /**
     * Sets the value of the vehicleBeaconMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehicleBeaconMatch(Integer value) {
        this.vehicleBeaconMatch = value;
    }

    /**
     * Gets the value of the spatialStationBeaconMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpatialStationBeaconMatch() {
        return spatialStationBeaconMatch;
    }

    /**
     * Sets the value of the spatialStationBeaconMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpatialStationBeaconMatch(Integer value) {
        this.spatialStationBeaconMatch = value;
    }

}
