
package de.rmv.hapirest.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}TechnicalMessages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Warnings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="serverVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dialectVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="planRtTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonResponseType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "technicalMessages",
    "warnings"
})
@XmlSeeAlso({
    JourneyDetail.class,
    TripList.class,
    LocationPreselectionResponse.class,
    ReconstructionConvertResponse.class,
    TariffValidation.class,
    GeoFeatureList.class,
    WalkingLinks.class,
    DataInfo.class,
    LineList.class,
    JourneyTrackMatch.class,
    TimetableInfoList.class,
    JourneyList.class,
    HimMessages.class,
    JourneyDetailList.class,
    JourneyDetailGroupList.class,
    DepartureBoard.class,
    ArrivalBoard.class,
    LocationList.class,
    LocationDetails.class,
    Error.class
})
public class CommonResponseType {

    @XmlElement(name = "TechnicalMessages", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected TechnicalMessages technicalMessages;
    @XmlElement(name = "Warnings", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Warnings warnings;
    @XmlAttribute(name = "serverVersion")
    protected String serverVersion;
    @XmlAttribute(name = "dialectVersion")
    protected String dialectVersion;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "planRtTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planRtTs;
    @XmlAttribute(name = "errorCode")
    protected String errorCode;
    @XmlAttribute(name = "errorText")
    protected String errorText;
    @XmlAttribute(name = "requestId")
    protected String requestId;

    /**
     * Gets the value of the technicalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMessages }
     *     
     */
    public TechnicalMessages getTechnicalMessages() {
        return technicalMessages;
    }

    /**
     * Sets the value of the technicalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMessages }
     *     
     */
    public void setTechnicalMessages(TechnicalMessages value) {
        this.technicalMessages = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the serverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * Sets the value of the serverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }

    /**
     * Gets the value of the dialectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialectVersion() {
        return dialectVersion;
    }

    /**
     * Sets the value of the dialectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialectVersion(String value) {
        this.dialectVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the planRtTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanRtTs() {
        return planRtTs;
    }

    /**
     * Sets the value of the planRtTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanRtTs(XMLGregorianCalendar value) {
        this.planRtTs = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
