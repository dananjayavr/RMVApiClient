
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealtimeDataSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RealtimeDataSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="VDV"/&gt;
 *     &lt;enumeration value="HIM"/&gt;
 *     &lt;enumeration value="HRC"/&gt;
 *     &lt;enumeration value="SIRI"/&gt;
 *     &lt;enumeration value="UIC"/&gt;
 *     &lt;enumeration value="HRX"/&gt;
 *     &lt;enumeration value="GTFS"/&gt;
 *     &lt;enumeration value="FIS"/&gt;
 *     &lt;enumeration value="DDS"/&gt;
 *     &lt;enumeration value="PAISA"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="BLACKLIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealtimeDataSourceType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum RealtimeDataSourceType {


    /**
     * Default source (undefined)
     * 
     */
    DEFAULT,
    VDV,
    HIM,
    HRC,
    SIRI,
    UIC,
    HRX,
    GTFS,
    FIS,

    /**
     * Datendrehscheiben
     * 
     */
    DDS,

    /**
     * PA-ISA
     * 
     */
    PAISA,

    /**
     * FahrtenEditor
     * 
     */
    FE,

    /**
     * List of blacklisted trains
     * 
     */
    BLACKLIST;

    public String value() {
        return name();
    }

    public static RealtimeDataSourceType fromValue(String v) {
        return valueOf(v);
    }

}
