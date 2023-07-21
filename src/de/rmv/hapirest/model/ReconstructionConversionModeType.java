
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconstructionConversionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReconstructionConversionModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TO_CGI_LEGACY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconstructionConversionModeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ReconstructionConversionModeType {


    /**
     * Convert to version 1.
     * 
     */
    TO_CGI_LEGACY;

    public String value() {
        return name();
    }

    public static ReconstructionConversionModeType fromValue(String v) {
        return valueOf(v);
    }

}
