
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParallelJourneyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParallelJourneyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNDEF"/&gt;
 *     &lt;enumeration value="UNION"/&gt;
 *     &lt;enumeration value="THROUGHCOACH"/&gt;
 *     &lt;enumeration value="TIETHROUGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParallelJourneyType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ParallelJourneyType {


    /**
     * Undefined type of parallel journey
     * 
     */
    UNDEF,

    /**
     * Parallel journey of type union
     * 
     */
    UNION,

    /**
     * Parallel journey of type throughcoach
     * 
     */
    THROUGHCOACH,

    /**
     * Parallel journey of type tiethrough
     * 
     */
    TIETHROUGH;

    public String value() {
        return name();
    }

    public static ParallelJourneyType fromValue(String v) {
        return valueOf(v);
    }

}
