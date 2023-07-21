
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageBaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessageBaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNDEF"/&gt;
 *     &lt;enumeration value="GLOBAL"/&gt;
 *     &lt;enumeration value="INFRASTRUCTURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageBaseType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum MessageBaseType {


    /**
     * A more precise classification is not possible.
     * 
     */
    UNDEF,

    /**
     * The HIM message is a global message.
     * 
     */
    GLOBAL,

    /**
     * The HIM message is an infrastructural message.
     * 
     */
    INFRASTRUCTURE;

    public String value() {
        return name();
    }

    public static MessageBaseType fromValue(String v) {
        return valueOf(v);
    }

}
