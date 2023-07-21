
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconstructionSectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReconstructionSectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JNY"/&gt;
 *     &lt;enumeration value="WALK"/&gt;
 *     &lt;enumeration value="TRSF"/&gt;
 *     &lt;enumeration value="DEVI"/&gt;
 *     &lt;enumeration value="GIS_FOOT"/&gt;
 *     &lt;enumeration value="GIS_BIKE"/&gt;
 *     &lt;enumeration value="GIS_PARK"/&gt;
 *     &lt;enumeration value="GIS_KISS"/&gt;
 *     &lt;enumeration value="GIS_TAXI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconstructionSectionType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ReconstructionSectionType {

    JNY,
    WALK,

    /**
     * Transfer
     * 
     */
    TRSF,

    /**
     * Deviation
     * 
     */
    DEVI,

    /**
     * On foot (based on GIS)
     * 
     */
    GIS_FOOT,

    /**
     * Bike (based on GIS)
     * 
     */
    GIS_BIKE,

    /**
     * Park & Ride (based on GIS)
     * 
     */
    GIS_PARK,

    /**
     * Kiss & Ride (based on GIS)
     * 
     */
    GIS_KISS,

    /**
     * Taxi (based on GIS)
     * 
     */
    GIS_TAXI;

    public String value() {
        return name();
    }

    public static ReconstructionSectionType fromValue(String v) {
        return valueOf(v);
    }

}
