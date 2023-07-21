
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackPoinSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackPoinSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEACON"/&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackPoinSourceType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum TrackPoinSourceType {

    BEACON,
    GPS,
    MOBILE;

    public String value() {
        return name();
    }

    public static TrackPoinSourceType fromValue(String v) {
        return valueOf(v);
    }

}
