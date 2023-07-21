
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficMessageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficMessageTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="RCLM"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="TRAFFIC_JAM"/&gt;
 *     &lt;enumeration value="DELAY"/&gt;
 *     &lt;enumeration value="ROAD_CLOSED"/&gt;
 *     &lt;enumeration value="JUNCTION_CLOSED"/&gt;
 *     &lt;enumeration value="LANE_CLOSED"/&gt;
 *     &lt;enumeration value="BURNING_VEHICLE"/&gt;
 *     &lt;enumeration value="ACCIDENT"/&gt;
 *     &lt;enumeration value="DANGER"/&gt;
 *     &lt;enumeration value="OBSTRUCTION"/&gt;
 *     &lt;enumeration value="RAIL_ROAD_CROSSING"/&gt;
 *     &lt;enumeration value="TRAFFIC_LIGHTS_DEFECT"/&gt;
 *     &lt;enumeration value="WEATHER"/&gt;
 *     &lt;enumeration value="WEATHER_ICE"/&gt;
 *     &lt;enumeration value="WEATHER_SNOW"/&gt;
 *     &lt;enumeration value="WEATHER_POOR_VISIBILITY"/&gt;
 *     &lt;enumeration value="WEATHER_HAIL"/&gt;
 *     &lt;enumeration value="WEATHER_WIND"/&gt;
 *     &lt;enumeration value="CONSTRUCTION_SITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficMessageTypeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum TrafficMessageTypeType {


    /**
     * Unknown
     * 
     */
    U,

    /**
     * maintenance work
     * 
     */
    RCLM,

    /**
     * accident
     * 
     */
    AC,

    /**
     * construction work
     * 
     */
    RW,

    /**
     * high traffic volume
     * 
     */
    AT,

    /**
     * other circumstances
     * 
     */
    CO,

    /**
     * traffic jam
     * 
     */
    TRAFFIC_JAM,

    /**
     * delay
     * 
     */
    DELAY,

    /**
     * road closed
     * 
     */
    ROAD_CLOSED,

    /**
     * junction closed
     * 
     */
    JUNCTION_CLOSED,

    /**
     * lane closed
     * 
     */
    LANE_CLOSED,

    /**
     * burning vehicle
     * 
     */
    BURNING_VEHICLE,

    /**
     * accident
     * 
     */
    ACCIDENT,

    /**
     * danger
     * 
     */
    DANGER,

    /**
     * obstruction
     * 
     */
    OBSTRUCTION,

    /**
     * railroad crossing
     * 
     */
    RAIL_ROAD_CROSSING,

    /**
     * traffic lights defect
     * 
     */
    TRAFFIC_LIGHTS_DEFECT,

    /**
     * generic weather event
     * 
     */
    WEATHER,

    /**
     * ice
     * 
     */
    WEATHER_ICE,

    /**
     * snow
     * 
     */
    WEATHER_SNOW,

    /**
     * poor visibility
     * 
     */
    WEATHER_POOR_VISIBILITY,

    /**
     * hail
     * 
     */
    WEATHER_HAIL,

    /**
     * wind
     * 
     */
    WEATHER_WIND,

    /**
     * construction site
     * 
     */
    CONSTRUCTION_SITE;

    public String value() {
        return name();
    }

    public static TrafficMessageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
