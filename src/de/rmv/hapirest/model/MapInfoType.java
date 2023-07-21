
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Map info structure.
 * 
 * <p>Java class for MapInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseMap" type="{http://hacon.de/hafas/proxy/hafas-proxy}MapLayerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverlayMap" type="{http://hacon.de/hafas/proxy/hafas-proxy}MapLayerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapInfoType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "baseMap",
    "overlayMap"
})
public class MapInfoType {

    @XmlElement(name = "BaseMap", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MapLayerType> baseMap;
    @XmlElement(name = "OverlayMap", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MapLayerType> overlayMap;

    /**
     * Gets the value of the baseMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the baseMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapLayerType }
     * 
     * 
     */
    public List<MapLayerType> getBaseMap() {
        if (baseMap == null) {
            baseMap = new ArrayList<MapLayerType>();
        }
        return this.baseMap;
    }

    /**
     * Gets the value of the overlayMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the overlayMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlayMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapLayerType }
     * 
     * 
     */
    public List<MapLayerType> getOverlayMap() {
        if (overlayMap == null) {
            overlayMap = new ArrayList<MapLayerType>();
        }
        return this.overlayMap;
    }

}
