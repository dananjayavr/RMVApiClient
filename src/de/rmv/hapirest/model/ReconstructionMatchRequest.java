
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
 *         &lt;element name="section" type="{http://hacon.de/hafas/proxy/hafas-proxy}ReconstructionSectionDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="travellerProfile" type="{http://hacon.de/hafas/proxy/hafas-proxy}TravellerProfileType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="useCombinedComparison" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="acceptGaps" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="flagAllNonReachable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="matchCatStrict" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="matchIdNonBlank" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="matchIdStrict" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="matchNumStrict" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="matchRtType" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="allowDummySections" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="enableRtFullSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="enableReplacements" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="withJourneyBoundaryPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="arrL" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="arrU" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="depL" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="depU" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "section",
    "travellerProfile"
})
@XmlRootElement(name = "ReconstructionMatchRequest", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class ReconstructionMatchRequest {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", required = true)
    protected List<ReconstructionSectionDataType> section;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TravellerProfileType travellerProfile;
    @XmlAttribute(name = "useCombinedComparison")
    protected Boolean useCombinedComparison;
    @XmlAttribute(name = "acceptGaps")
    protected Boolean acceptGaps;
    @XmlAttribute(name = "flagAllNonReachable")
    protected Boolean flagAllNonReachable;
    @XmlAttribute(name = "matchCatStrict")
    protected Boolean matchCatStrict;
    @XmlAttribute(name = "matchIdNonBlank")
    protected Boolean matchIdNonBlank;
    @XmlAttribute(name = "matchIdStrict")
    protected Boolean matchIdStrict;
    @XmlAttribute(name = "matchNumStrict")
    protected Boolean matchNumStrict;
    @XmlAttribute(name = "matchRtType")
    protected Boolean matchRtType;
    @XmlAttribute(name = "allowDummySections")
    protected Boolean allowDummySections;
    @XmlAttribute(name = "enableRtFullSearch")
    protected Boolean enableRtFullSearch;
    @XmlAttribute(name = "enableReplacements")
    protected Boolean enableReplacements;
    @XmlAttribute(name = "withJourneyBoundaryPoints")
    protected Boolean withJourneyBoundaryPoints;
    @XmlAttribute(name = "arrL")
    protected Integer arrL;
    @XmlAttribute(name = "arrU")
    protected Integer arrU;
    @XmlAttribute(name = "depL")
    protected Integer depL;
    @XmlAttribute(name = "depU")
    protected Integer depU;

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconstructionSectionDataType }
     * 
     * 
     */
    public List<ReconstructionSectionDataType> getSection() {
        if (section == null) {
            section = new ArrayList<ReconstructionSectionDataType>();
        }
        return this.section;
    }

    /**
     * Gets the value of the travellerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerProfileType }
     *     
     */
    public TravellerProfileType getTravellerProfile() {
        return travellerProfile;
    }

    /**
     * Sets the value of the travellerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerProfileType }
     *     
     */
    public void setTravellerProfile(TravellerProfileType value) {
        this.travellerProfile = value;
    }

    /**
     * Gets the value of the useCombinedComparison property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCombinedComparison() {
        return useCombinedComparison;
    }

    /**
     * Sets the value of the useCombinedComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCombinedComparison(Boolean value) {
        this.useCombinedComparison = value;
    }

    /**
     * Gets the value of the acceptGaps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptGaps() {
        return acceptGaps;
    }

    /**
     * Sets the value of the acceptGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptGaps(Boolean value) {
        this.acceptGaps = value;
    }

    /**
     * Gets the value of the flagAllNonReachable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagAllNonReachable() {
        return flagAllNonReachable;
    }

    /**
     * Sets the value of the flagAllNonReachable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagAllNonReachable(Boolean value) {
        this.flagAllNonReachable = value;
    }

    /**
     * Gets the value of the matchCatStrict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchCatStrict() {
        return matchCatStrict;
    }

    /**
     * Sets the value of the matchCatStrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchCatStrict(Boolean value) {
        this.matchCatStrict = value;
    }

    /**
     * Gets the value of the matchIdNonBlank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchIdNonBlank() {
        return matchIdNonBlank;
    }

    /**
     * Sets the value of the matchIdNonBlank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchIdNonBlank(Boolean value) {
        this.matchIdNonBlank = value;
    }

    /**
     * Gets the value of the matchIdStrict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchIdStrict() {
        return matchIdStrict;
    }

    /**
     * Sets the value of the matchIdStrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchIdStrict(Boolean value) {
        this.matchIdStrict = value;
    }

    /**
     * Gets the value of the matchNumStrict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchNumStrict() {
        return matchNumStrict;
    }

    /**
     * Sets the value of the matchNumStrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchNumStrict(Boolean value) {
        this.matchNumStrict = value;
    }

    /**
     * Gets the value of the matchRtType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchRtType() {
        return matchRtType;
    }

    /**
     * Sets the value of the matchRtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchRtType(Boolean value) {
        this.matchRtType = value;
    }

    /**
     * Gets the value of the allowDummySections property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDummySections() {
        return allowDummySections;
    }

    /**
     * Sets the value of the allowDummySections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDummySections(Boolean value) {
        this.allowDummySections = value;
    }

    /**
     * Gets the value of the enableRtFullSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRtFullSearch() {
        return enableRtFullSearch;
    }

    /**
     * Sets the value of the enableRtFullSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRtFullSearch(Boolean value) {
        this.enableRtFullSearch = value;
    }

    /**
     * Gets the value of the enableReplacements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableReplacements() {
        return enableReplacements;
    }

    /**
     * Sets the value of the enableReplacements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableReplacements(Boolean value) {
        this.enableReplacements = value;
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

    /**
     * Gets the value of the arrL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrL() {
        return arrL;
    }

    /**
     * Sets the value of the arrL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrL(Integer value) {
        this.arrL = value;
    }

    /**
     * Gets the value of the arrU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrU() {
        return arrU;
    }

    /**
     * Sets the value of the arrU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrU(Integer value) {
        this.arrU = value;
    }

    /**
     * Gets the value of the depL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepL() {
        return depL;
    }

    /**
     * Sets the value of the depL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepL(Integer value) {
        this.depL = value;
    }

    /**
     * Gets the value of the depU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepU() {
        return depU;
    }

    /**
     * Sets the value of the depU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepU(Integer value) {
        this.depU = value;
    }

}
