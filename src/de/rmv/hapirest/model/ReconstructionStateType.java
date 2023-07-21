
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconstructionStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReconstructionStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconstructionStateType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ReconstructionStateType {


    /**
     * Reconstruction state not set. Original connection or section.
     * 
     */
    U,

    /**
     * Connection or section was successfully reconstructed completely.
     * 
     */
    C,

    /**
     * Connection was partially reconstructed and might contain dummy sections filled with data from the input reconstruction context, if enabled in the request.
     * 
     */
    P,

    /**
     * Connection or section was not reconstructable. In case of section, the section might be filled with data from the input reconstruction context, if enabled in the request.
     * 
     */
    N,

    /**
     * Original connection or section from a trip search.
     * 
     */
    O;

    public String value() {
        return name();
    }

    public static ReconstructionStateType fromValue(String v) {
        return valueOf(v);
    }

}
