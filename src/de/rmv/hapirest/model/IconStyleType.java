
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconStyleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IconStyleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IconStyleType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum IconStyleType {


    /**
     * Unknown text style
     * 
     */
    U,

    /**
     * Normal
     * 
     */
    N,

    /**
     * Bold
     * 
     */
    B,

    /**
     * Italic
     * 
     */
    I,

    /**
     * Bold Italic
     * 
     */
    BI;

    public String value() {
        return name();
    }

    public static IconStyleType fromValue(String v) {
        return valueOf(v);
    }

}
