
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchAlgorithmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MatchAlgorithmType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="RTCM"/&gt;
 *     &lt;enumeration value="INVERSE"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchAlgorithmType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum MatchAlgorithmType {

    AUTO,
    RTCM,
    INVERSE,
    BOTH;

    public String value() {
        return name();
    }

    public static MatchAlgorithmType fromValue(String v) {
        return valueOf(v);
    }

}
