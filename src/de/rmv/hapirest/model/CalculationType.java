
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CalculationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INITIAL"/&gt;
 *     &lt;enumeration value="RETRY_SHARP"/&gt;
 *     &lt;enumeration value="RETRY_UNSHARP"/&gt;
 *     &lt;enumeration value="RETRY_DOUBLE_RADIUS"/&gt;
 *     &lt;enumeration value="RETRY_UNSHARP_NEW_RADIUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculationType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum CalculationType {


    /**
     * The connection was computed during the initial request execution with the
     * 					original parameters.
     * 
     */
    INITIAL,

    /**
     * The connection was found using a sharp search that was performed after an
     * 					unsharp search failed.
     * 
     */
    RETRY_SHARP,

    /**
     * The connection was found using an unsharp search that was performed after
     * 					a sharp search failed.
     * 
     */
    RETRY_UNSHARP,

    /**
     * The connection was found only after the original GIS radiuses for
     * 					front/back were doubled at least once.
     * 
     */
    RETRY_DOUBLE_RADIUS,

    /**
     * The connection was found using an additional unsharp search that was
     * 					performed with an increased footpath distance.
     * 
     */
    RETRY_UNSHARP_NEW_RADIUS;

    public String value() {
        return name();
    }

    public static CalculationType fromValue(String v) {
        return valueOf(v);
    }

}
