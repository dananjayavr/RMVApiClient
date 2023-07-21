
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplyToType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ApplyToType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="FB"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="FBT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplyToType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ApplyToType {


    /**
     * First mile
     * 
     */
    F,

    /**
     * Last mile
     * 
     */
    B,

    /**
     * First and last mile
     * 
     */
    FB,

    /**
     * Total
     * 
     */
    T,

    /**
     * First mile, last mile and total
     * 
     */
    FBT;

    public String value() {
        return name();
    }

    public static ApplyToType fromValue(String v) {
        return valueOf(v);
    }

}
