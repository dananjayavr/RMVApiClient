
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconShapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IconShapeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IconShapeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum IconShapeType {


    /**
     * Unknown shape
     * 
     */
    U,

    /**
     * Rectangle
     * 
     */
    R,

    /**
     * Circle
     * 
     */
    C,

    /**
     * Use shape described in @shapeRes
     * 
     */
    RES;

    public String value() {
        return name();
    }

    public static IconShapeType fromValue(String v) {
        return valueOf(v);
    }

}
