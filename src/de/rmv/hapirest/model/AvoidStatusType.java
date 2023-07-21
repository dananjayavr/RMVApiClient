
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvoidStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AvoidStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NCAVM"/&gt;
 *     &lt;enumeration value="NCAVO"/&gt;
 *     &lt;enumeration value="NPAVM"/&gt;
 *     &lt;enumeration value="NPAVO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvoidStatusType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum AvoidStatusType {

    NCAVM,
    NCAVO,
    NPAVM,
    NPAVO;

    public String value() {
        return name();
    }

    public static AvoidStatusType fromValue(String v) {
        return valueOf(v);
    }

}
