
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViaStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ViaStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXR"/&gt;
 *     &lt;enumeration value="NER"/&gt;
 *     &lt;enumeration value="NEXR"/&gt;
 *     &lt;enumeration value="NXR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ViaStatusType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ViaStatusType {

    EXR,
    NER,
    NEXR,
    NXR;

    public String value() {
        return name();
    }

    public static ViaStatusType fromValue(String v) {
        return valueOf(v);
    }

}
