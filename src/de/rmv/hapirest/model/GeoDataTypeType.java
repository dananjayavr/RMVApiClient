
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoDataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GeoDataTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GeoJSON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeoDataTypeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GeoDataTypeType {


    /**
     * Base64 encoded GeoJson text.
     * 
     */
    @XmlEnumValue("GeoJSON")
    GEO_JSON("GeoJSON");
    private final String value;

    GeoDataTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeoDataTypeType fromValue(String v) {
        for (GeoDataTypeType c: GeoDataTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
