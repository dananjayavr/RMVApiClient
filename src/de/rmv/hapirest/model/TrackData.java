
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackPoint" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrackPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackSection" type="{http://hacon.de/hafas/proxy/hafas-proxy}TrackSectionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="calcMatchQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackPoint",
    "trackSection"
})
@XmlRootElement(name = "TrackData", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class TrackData {

    @XmlElement(name = "TrackPoint", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TrackPoint> trackPoint;
    @XmlElement(name = "TrackSection", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<TrackSectionData> trackSection;
    @XmlAttribute(name = "algorithm")
    protected String algorithm;
    @XmlAttribute(name = "calcMatchQuality")
    protected Boolean calcMatchQuality;

    /**
     * Gets the value of the trackPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackPoint }
     * 
     * 
     */
    public List<TrackPoint> getTrackPoint() {
        if (trackPoint == null) {
            trackPoint = new ArrayList<TrackPoint>();
        }
        return this.trackPoint;
    }

    /**
     * Gets the value of the trackSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSectionData }
     * 
     * 
     */
    public List<TrackSectionData> getTrackSection() {
        if (trackSection == null) {
            trackSection = new ArrayList<TrackSectionData>();
        }
        return this.trackSection;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the calcMatchQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalcMatchQuality() {
        return calcMatchQuality;
    }

    /**
     * Sets the value of the calcMatchQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalcMatchQuality(Boolean value) {
        this.calcMatchQuality = value;
    }

}
