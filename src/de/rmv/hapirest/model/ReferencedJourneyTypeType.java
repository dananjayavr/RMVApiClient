
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencedJourneyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReferencedJourneyTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNDEF"/&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="IST_ERSATZFAHRT"/&gt;
 *     &lt;enumeration value="IST_VERSTAERKERFAHRT"/&gt;
 *     &lt;enumeration value="IST_FORTFUEHRUNG"/&gt;
 *     &lt;enumeration value="IST_TRENNUNG"/&gt;
 *     &lt;enumeration value="IST_FORTFUEHRUNG_VON_TRENNUNG"/&gt;
 *     &lt;enumeration value="IST_ZUSAMMENFUEHRUNG"/&gt;
 *     &lt;enumeration value="IST_FORTFUEHRUNG_DURCH_ZUSAMMENFUEHRUNG"/&gt;
 *     &lt;enumeration value="IST_ENTLASTUNG"/&gt;
 *     &lt;enumeration value="DEFAULT_R"/&gt;
 *     &lt;enumeration value="HAT_ERSATZFAHRT"/&gt;
 *     &lt;enumeration value="HAT_VERSTAERKERFAHRT"/&gt;
 *     &lt;enumeration value="HAT_FORTFUEHRUNG"/&gt;
 *     &lt;enumeration value="HAT_TRENNUNG"/&gt;
 *     &lt;enumeration value="HAT_FORTFUEHRUNG_VON_TRENNUNG"/&gt;
 *     &lt;enumeration value="HAT_ZUSAMMENFUEHRUNG"/&gt;
 *     &lt;enumeration value="HAT_FORTFUEHRUNG_DURCH_ZUSAMMENFUEHRUNG"/&gt;
 *     &lt;enumeration value="HAT_ENTLASTUNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferencedJourneyTypeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum ReferencedJourneyTypeType {

    UNDEF,
    DEFAULT,
    IST_ERSATZFAHRT,
    IST_VERSTAERKERFAHRT,
    IST_FORTFUEHRUNG,
    IST_TRENNUNG,
    IST_FORTFUEHRUNG_VON_TRENNUNG,
    IST_ZUSAMMENFUEHRUNG,
    IST_FORTFUEHRUNG_DURCH_ZUSAMMENFUEHRUNG,
    IST_ENTLASTUNG,
    DEFAULT_R,
    HAT_ERSATZFAHRT,
    HAT_VERSTAERKERFAHRT,
    HAT_FORTFUEHRUNG,
    HAT_TRENNUNG,
    HAT_FORTFUEHRUNG_VON_TRENNUNG,
    HAT_ZUSAMMENFUEHRUNG,
    HAT_FORTFUEHRUNG_DURCH_ZUSAMMENFUEHRUNG,
    HAT_ENTLASTUNG;

    public String value() {
        return name();
    }

    public static ReferencedJourneyTypeType fromValue(String v) {
        return valueOf(v);
    }

}
