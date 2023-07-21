
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoFeatureTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GeoFeatureTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAFFIC"/&gt;
 *     &lt;enumeration value="SERVICE_AREA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeoFeatureTypeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GeoFeatureTypeType {


    /**
     * Traffic-related GeoFeature.
     * 
     */
    TRAFFIC,

    /**
     * Service area of some provider.
     * 
     */
    SERVICE_AREA;

    public String value() {
        return name();
    }

    public static GeoFeatureTypeType fromValue(String v) {
        return valueOf(v);
    }

}
