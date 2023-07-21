
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyTrackMatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyTrackMatchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchQuality" type="{http://hacon.de/hafas/proxy/hafas-proxy}MatchQualityType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}TrackMatchJourneyDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Diagnostics" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="algorithm" type="{http://hacon.de/hafas/proxy/hafas-proxy}MatchAlgorithmType" /&gt;
 *       &lt;attribute name="deviation" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyTrackMatchResult", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "matchQuality",
    "trackMatchJourneyDetail",
    "diagnostics"
})
public class JourneyTrackMatchResult {

    @XmlElement(name = "MatchQuality", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected MatchQualityType matchQuality;
    @XmlElement(name = "TrackMatchJourneyDetail", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TrackMatchJourneyDetail> trackMatchJourneyDetail;
    @XmlElement(name = "Diagnostics", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> diagnostics;
    @XmlAttribute(name = "algorithm")
    protected MatchAlgorithmType algorithm;
    @XmlAttribute(name = "deviation")
    protected Long deviation;

    /**
     * Gets the value of the matchQuality property.
     * 
     * @return
     *     possible object is
     *     {@link MatchQualityType }
     *     
     */
    public MatchQualityType getMatchQuality() {
        return matchQuality;
    }

    /**
     * Sets the value of the matchQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchQualityType }
     *     
     */
    public void setMatchQuality(MatchQualityType value) {
        this.matchQuality = value;
    }

    /**
     * Gets the value of the trackMatchJourneyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackMatchJourneyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackMatchJourneyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackMatchJourneyDetail }
     * 
     * 
     */
    public List<TrackMatchJourneyDetail> getTrackMatchJourneyDetail() {
        if (trackMatchJourneyDetail == null) {
            trackMatchJourneyDetail = new ArrayList<TrackMatchJourneyDetail>();
        }
        return this.trackMatchJourneyDetail;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the diagnostics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnostics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getDiagnostics() {
        if (diagnostics == null) {
            diagnostics = new ArrayList<KVType>();
        }
        return this.diagnostics;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link MatchAlgorithmType }
     *     
     */
    public MatchAlgorithmType getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchAlgorithmType }
     *     
     */
    public void setAlgorithm(MatchAlgorithmType value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the deviation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviation() {
        return deviation;
    }

    /**
     * Sets the value of the deviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviation(Long value) {
        this.deviation = value;
    }

}
