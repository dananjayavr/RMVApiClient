
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolylineEncodingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PolylineEncodingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="DLT"/&gt;
 *     &lt;enumeration value="GPA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PolylineEncodingType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum PolylineEncodingType {

    N,
    DLT,
    GPA;

    public String value() {
        return name();
    }

    public static PolylineEncodingType fromValue(String v) {
        return valueOf(v);
    }

}
