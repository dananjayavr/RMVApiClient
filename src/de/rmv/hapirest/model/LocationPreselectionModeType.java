
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationPreselectionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationPreselectionModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ESTIMATE"/&gt;
 *     &lt;enumeration value="ROUTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationPreselectionModeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum LocationPreselectionModeType {


    /**
     * Only perform preselection and do not perform any 1:n routing - the resulting connections will be filled with beeline distance.
     * 
     */
    ESTIMATE,

    /**
     * Perform preselection and perform 1:n routing for all modes - the resulting connections will be filled with routed distance and duration.
     * 
     */
    ROUTE;

    public String value() {
        return name();
    }

    public static LocationPreselectionModeType fromValue(String v) {
        return valueOf(v);
    }

}
