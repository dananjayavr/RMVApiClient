
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="JourneyStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JourneyStatusType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum JourneyStatusType {


    /**
     * Planned: A planned journey. This is also the default value.
     * 
     */
    P,

    /**
     * Replacement: The journey was added as a replacement for a planned journey.
     * 					
     * 
     */
    R,

    /**
     * Additional: The journey is an additional journey to the planned journeys.
     * 					
     * 
     */
    A,

    /**
     * Special: This is a special journey. The exact definition which journeys are
     * 						considered special
     * 						up to the customer.
     * 					
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static JourneyStatusType fromValue(String v) {
        return valueOf(v);
    }

}
