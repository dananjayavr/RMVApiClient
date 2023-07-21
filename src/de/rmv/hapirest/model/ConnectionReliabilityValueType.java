
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionReliabilityValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConnectionReliabilityValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GUARANTEED"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="ABORTIVE"/&gt;
 *     &lt;enumeration value="UNDEF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectionReliabilityValueType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ConnectionReliabilityValueType {


    /**
     * Guaranteed to get the user from A to B in time within the scope
     * 
     */
    GUARANTEED,

    /**
     * Likely to get the user from A to B in time within the scope
     * 
     */
    HIGH,

    /**
     * Unlikely to get the user from A to B in time within the scope
     * 
     */
    LOW,

    /**
     * Definitely not going to get the user from A to B in time within the scope
     * 
     */
    ABORTIVE,

    /**
     * No information
     * 
     */
    UNDEF;

    public String value() {
        return name();
    }

    public static ConnectionReliabilityValueType fromValue(String v) {
        return valueOf(v);
    }

}
