
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisRouteManoeuvre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GisRouteManoeuvre"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="RI"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="HL"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="KHL"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="KSL"/&gt;
 *     &lt;enumeration value="KSR"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="UT"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="SIR"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="EF"/&gt;
 *     &lt;enumeration value="LF"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="COF"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="ELD"/&gt;
 *     &lt;enumeration value="ELU"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="ESD"/&gt;
 *     &lt;enumeration value="ESU"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="STU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GisRouteManoeuvre", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GisRouteManoeuvre {


    /**
     * Not set
     * 
     */
    NO,

    /**
     * From
     * 
     */
    FR,

    /**
     * To
     * 
     */
    TO,

    /**
     * On
     * 
     */
    ON,

    /**
     * Left
     * 
     */
    LE,

    /**
     * Right
     * 
     */
    RI,

    /**
     * Keep left
     * 
     */
    KL,

    /**
     * Keep right
     * 
     */
    KR,

    /**
     * Half left
     * 
     */
    HL,

    /**
     * Half right
     * 
     */
    HR,

    /**
     * Keep half left
     * 
     */
    KHL,

    /**
     * Keep half right
     * 
     */
    KHR,

    /**
     * Sharp left
     * 
     */
    SL,

    /**
     * Sharp right
     * 
     */
    SR,

    /**
     * Keep sharp left
     * 
     */
    KSL,

    /**
     * Keep sharp right
     * 
     */
    KSR,

    /**
     * Straight
     * 
     */
    ST,

    /**
     * U-Turn
     * 
     */
    UT,

    /**
     * Enter
     * 
     */
    EN,

    /**
     * Leave
     * 
     */
    LV,

    /**
     * Enter roundabout
     * 
     */
    ER,

    /**
     * Stay in roundabout
     * 
     */
    SIR,

    /**
     * Leave roundabout
     * 
     */
    LR,

    /**
     * Enter ferry
     * 
     */
    EF,

    /**
     * Leave ferry
     * 
     */
    LF,

    /**
     * Change highway
     * 
     */
    CH,

    /**
     * Check-in ferry
     * 
     */
    CIF,

    /**
     * Check-out ferry
     * 
     */
    COF,

    /**
     * Elevator
     * 
     */
    EL,

    /**
     * Elevator down
     * 
     */
    ELD,

    /**
     * Elevator up
     * 
     */
    ELU,

    /**
     * Escalator
     * 
     */
    ES,

    /**
     * Escalator down
     * 
     */
    ESD,

    /**
     * Escalator up
     * 
     */
    ESU,

    /**
     * Stairs
     * 
     */
    STA,

    /**
     * Stairs down
     * 
     */
    STD,

    /**
     * Stairs up
     * 
     */
    STU;

    public String value() {
        return name();
    }

    public static GisRouteManoeuvre fromValue(String v) {
        return valueOf(v);
    }

}
