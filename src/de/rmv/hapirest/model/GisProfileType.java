
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GisProfileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GisProfileType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GisProfileType {


    /**
     * Foot
     * 
     */
    F,

    /**
     * Bike
     * 
     */
    B,

    /**
     * Car to Parking / Park'n'Ride
     * 
     */
    P,

    /**
     * Car / Kiss'n'Ride
     * 
     */
    K,

    /**
     * Taxi
     * 
     */
    T,

    /**
     * Taxistand
     * 
     */
    TE;

    public String value() {
        return name();
    }

    public static GisProfileType fromValue(String v) {
        return valueOf(v);
    }

}
