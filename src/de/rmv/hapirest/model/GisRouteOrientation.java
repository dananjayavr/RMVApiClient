
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisRouteOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GisRouteOrientation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GisRouteOrientation", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum GisRouteOrientation {


    /**
     * Unknown
     * 
     */
    U,

    /**
     * North
     * 
     */
    N,

    /**
     * South
     * 
     */
    S,

    /**
     * East
     * 
     */
    E,

    /**
     * West
     * 
     */
    W,

    /**
     * Northeast
     * 
     */
    NE,

    /**
     * Southeast
     * 
     */
    SE,

    /**
     * Northwest
     * 
     */
    NW,

    /**
     * Southwest
     * 
     */
    SW;

    public String value() {
        return name();
    }

    public static GisRouteOrientation fromValue(String v) {
        return valueOf(v);
    }

}
