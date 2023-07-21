
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyPathItemStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="JourneyPathItemStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JourneyPathItemStateType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum JourneyPathItemStateType {


    /**
     * Undefined
     * 
     */
    U,

    /**
     * Journey is before relevant segement.
     * 
     */
    B,

    /**
     * Journey is on relevant segement.
     * 
     */
    O,

    /**
     * Journey is after relevant segement.
     * 
     */
    A;

    public String value() {
        return name();
    }

    public static JourneyPathItemStateType fromValue(String v) {
        return valueOf(v);
    }

}
