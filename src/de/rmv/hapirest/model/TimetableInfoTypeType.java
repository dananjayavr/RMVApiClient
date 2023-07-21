
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimetableInfoTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimetableInfoTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="ADR"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimetableInfoTypeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum TimetableInfoTypeType {

    U,
    ST,
    ADR,
    POI;

    public String value() {
        return name();
    }

    public static TimetableInfoTypeType fromValue(String v) {
        return valueOf(v);
    }

}
