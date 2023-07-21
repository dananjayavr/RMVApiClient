
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CoordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WGS84"/&gt;
 *     &lt;enumeration value="PLANAR"/&gt;
 *     &lt;enumeration value="HAFASGEO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoordType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum CoordType {

    @XmlEnumValue("WGS84")
    WGS_84("WGS84"),
    PLANAR("PLANAR"),
    HAFASGEO("HAFASGEO");
    private final String value;

    CoordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoordType fromValue(String v) {
        for (CoordType c: CoordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
