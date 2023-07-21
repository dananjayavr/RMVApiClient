
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationPreselectionStrategyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationPreselectionStrategyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONE_TO_N_SELECTION"/&gt;
 *     &lt;enumeration value="N_TO_ONE_SELECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationPreselectionStrategyType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum LocationPreselectionStrategyType {


    /**
     * Indicates that we are searching locations for 1:n.
     * 
     */
    ONE_TO_N_SELECTION,

    /**
     * Indicates that we are searching locations for n:1.
     * 
     */
    N_TO_ONE_SELECTION;

    public String value() {
        return name();
    }

    public static LocationPreselectionStrategyType fromValue(String v) {
        return valueOf(v);
    }

}
