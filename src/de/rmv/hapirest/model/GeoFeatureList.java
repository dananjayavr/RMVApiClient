
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence&gt;
 *         &lt;element name="GeoFeature" type="{http://hacon.de/hafas/proxy/hafas-proxy}GeoFeatureType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "geoFeature"
})
@XmlRootElement(name = "GeoFeatureList", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class GeoFeatureList
    extends CommonResponseType
{

    @XmlElement(name = "GeoFeature", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GeoFeatureType> geoFeature;

    /**
     * Gets the value of the geoFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the geoFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoFeatureType }
     * 
     * 
     */
    public List<GeoFeatureType> getGeoFeature() {
        if (geoFeature == null) {
            geoFeature = new ArrayList<GeoFeatureType>();
        }
        return this.geoFeature;
    }

}
