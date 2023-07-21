
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SotContextLocModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SotContextLocModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="FROM_START"/&gt;
 *     &lt;enumeration value="IN_TRAIN"/&gt;
 *     &lt;enumeration value="AT_PASSED_STOP"/&gt;
 *     &lt;enumeration value="AT_CHANGE_STOP"/&gt;
 *     &lt;enumeration value="BEFORE_TRAVEL"/&gt;
 *     &lt;enumeration value="AT_DESTINATION"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="ERROR_SEARCH_FROM_TRAIN_BEFORE_START"/&gt;
 *     &lt;enumeration value="ERROR_IN_RECONSTRUCTION"/&gt;
 *     &lt;enumeration value="TO_BE_DEFINED_IN_SERVER"/&gt;
 *     &lt;enumeration value="ERROR_TRAIN_CANCELLED"/&gt;
 *     &lt;enumeration value="CHECK_COMPLETE_TRAIN"/&gt;
 *     &lt;enumeration value="AT_LAST_USABLE_STOP"/&gt;
 *     &lt;enumeration value="ERROR_ALL_TRAINS_FILTERED"/&gt;
 *     &lt;enumeration value="ERROR_STAY_IN_CURRENT_CONNECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SotContextLocModeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum SotContextLocModeType {


    /**
     * Position: Location unknown.
     * 
     */
    UNKNOWN,

    /**
     * Position: At start of trip before departure.
     * 
     */
    FROM_START,

    /**
     * Position: In service.
     * 
     */
    IN_TRAIN,

    /**
     * Position: At passed stop.
     * 
     */
    AT_PASSED_STOP,

    /**
     * Position: At interchange location.
     * 
     */
    AT_CHANGE_STOP,

    /**
     * Position: Before start of trip, not at departure stop.
     * 
     */
    BEFORE_TRAVEL,

    /**
     * Position: At destination.
     * 
     */
    AT_DESTINATION,

    /**
     * Common error during calculation of position.
     * 
     */
    ERROR,

    /**
     * Search on trip before departure of service.
     * 
     */
    ERROR_SEARCH_FROM_TRAIN_BEFORE_START,

    /**
     * Error during reconstruction. No postion calculation possible.
     * 
     */
    ERROR_IN_RECONSTRUCTION,

    /**
     * Certain state during calculation.
     * 
     */
    TO_BE_DEFINED_IN_SERVER,

    /**
     * Serice cancelled.
     * 
     */
    ERROR_TRAIN_CANCELLED,

    /**
     * Certain state during calculation.
     * 
     */
    CHECK_COMPLETE_TRAIN,

    /**
     * Position: At last possible start.
     * 
     */
    AT_LAST_USABLE_STOP,

    /**
     * All alternative connections filtered.
     * 
     */
    ERROR_ALL_TRAINS_FILTERED,

    /**
     * Stay in service. No better alternatives found.
     * 
     */
    ERROR_STAY_IN_CURRENT_CONNECTION;

    public String value() {
        return name();
    }

    public static SotContextLocModeType fromValue(String v) {
        return valueOf(v);
    }

}
