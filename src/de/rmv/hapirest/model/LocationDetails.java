
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}CoordLocation"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stopLocation",
    "coordLocation"
})
@XmlRootElement(name = "LocationDetails", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class LocationDetails
    extends CommonResponseType
{

    @XmlElement(name = "StopLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected StopLocation stopLocation;
    @XmlElement(name = "CoordLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected CoordLocation coordLocation;

    /**
     * Gets the value of the stopLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StopLocation }
     *     
     */
    public StopLocation getStopLocation() {
        return stopLocation;
    }

    /**
     * Sets the value of the stopLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopLocation }
     *     
     */
    public void setStopLocation(StopLocation value) {
        this.stopLocation = value;
    }

    /**
     * Gets the value of the coordLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordLocation }
     *     
     */
    public CoordLocation getCoordLocation() {
        return coordLocation;
    }

    /**
     * Sets the value of the coordLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordLocation }
     *     
     */
    public void setCoordLocation(CoordLocation value) {
        this.coordLocation = value;
    }

}
