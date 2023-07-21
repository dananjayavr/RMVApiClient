
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrognosisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrognosisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROGNOSED"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="REPORTED"/&gt;
 *     &lt;enumeration value="CORRECTED"/&gt;
 *     &lt;enumeration value="CALCULATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrognosisType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum PrognosisType {


    /**
     * Prognosis was reported from an external provider as a prognosis for the future.
     * 					
     * 
     */
    PROGNOSED,

    /**
     * Prognosis was reported from an external provider from a manual entry.
     * 					
     * 
     */
    MANUAL,

    /**
     * Prognosis was reported from an external provider as a delay for previously passed
     * 						stations.
     * 					
     * 
     */
    REPORTED,

    /**
     * Prognosis was corrected by the system to adjust the prognoses over the train's
     * 						journey to ensure
     * 						proper continuation.
     * 					
     * 
     */
    CORRECTED,

    /**
     * Prognosis was calculated by the system for upcoming stations or to fill gaps for
     * 						previously
     * 						passed stations where no delay was reported.
     * 					
     * 
     */
    CALCULATED;

    public String value() {
        return name();
    }

    public static PrognosisType fromValue(String v) {
        return valueOf(v);
    }

}
