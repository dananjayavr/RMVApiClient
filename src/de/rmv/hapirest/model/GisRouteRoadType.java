
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisRouteRoadType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GisRouteRoadType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="T4L"/&gt;
 *     &lt;enumeration value="T2L"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="NT"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="CW"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GisRouteRoadType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GisRouteRoadType {


    /**
     * Unknown
     * 
     */
    U("U"),

    /**
     * Motorway
     * 
     */
    M("M"),

    /**
     * Highway
     * 
     */
    H("H"),

    /**
     * Trunk road
     * 
     */
    T("T"),

    /**
     * Trunk road with four lanes
     * 
     */
    @XmlEnumValue("T4L")
    T_4_L("T4L"),

    /**
     * Trunk road with two lanes
     * 
     */
    @XmlEnumValue("T2L")
    T_2_L("T2L"),

    /**
     * Country road
     * 
     */
    TR("TR"),

    /**
     * County road
     * 
     */
    NT("NT"),

    /**
     * City road
     * 
     */
    CT("CT"),

    /**
     * Residential road
     * 
     */
    R("R"),

    /**
     * Blocked road
     * 
     */
    B("B"),

    /**
     * Combined cycle and walkway
     * 
     */
    CW("CW"),

    /**
     * Cycleway
     * 
     */
    C("C"),

    /**
     * Walkway
     * 
     */
    W("W"),

    /**
     * Ferry
     * 
     */
    F("F");
    private final String value;

    GisRouteRoadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GisRouteRoadType fromValue(String v) {
        for (GisRouteRoadType c: GisRouteRoadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
