
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}StopLocation"/&gt;
 *           &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}CoordLocation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="scrollCtx" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stopLocationOrCoordLocation",
    "scrollCtx"
})
@XmlRootElement(name = "LocationList", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class LocationList
    extends CommonResponseType
{

    @XmlElements({
        @XmlElement(name = "StopLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = StopLocation.class),
        @XmlElement(name = "CoordLocation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = CoordLocation.class)
    })
    protected List<Object> stopLocationOrCoordLocation;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<String> scrollCtx;

    /**
     * Gets the value of the stopLocationOrCoordLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocationOrCoordLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocationOrCoordLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordLocation }
     * {@link StopLocation }
     * 
     * 
     */
    public List<Object> getStopLocationOrCoordLocation() {
        if (stopLocationOrCoordLocation == null) {
            stopLocationOrCoordLocation = new ArrayList<Object>();
        }
        return this.stopLocationOrCoordLocation;
    }

    /**
     * Gets the value of the scrollCtx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the scrollCtx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrollCtx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScrollCtx() {
        if (scrollCtx == null) {
            scrollCtx = new ArrayList<String>();
        }
        return this.scrollCtx;
    }

}
