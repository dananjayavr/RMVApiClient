
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NoteType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="ED"/&gt;
 *     &lt;enumeration value="TAR"/&gt;
 *     &lt;enumeration value="FN"/&gt;
 *     &lt;enumeration value="TLN"/&gt;
 *     &lt;enumeration value="LNC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NoteType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum NoteType {


    /**
     * Unknown
     * 
     */
    U,

    /**
     * Attribute
     * 
     */
    A,

    /**
     * Infotext
     * 
     */
    I,

    /**
     * Realtime
     * 
     */
    R,

    /**
     * Hint
     * 
     */
    H,

    /**
     * HIM-Message
     * 
     */
    M,

    /**
     * State of connection
     * 
     */
    C,

    /**
     * Reason for delay
     * 
     */
    D,

    /**
     * Through-connection
     * 
     */
    B,

    /**
     * Freetext
     * 
     */
    Q,

    /**
     * Reference train
     * 
     */
    L,

    /**
     * Connection specific realtime message
     * 
     */
    N,

    /**
     * Stop specific realtime message
     * 
     */
    O,

    /**
     * Train cancellation
     * 
     */
    P,

    /**
     * Change of train
     * 
     */
    S,

    /**
     * Change of product
     * 
     */
    V,

    /**
     * Extended platform change (e.g. change to different part of a station)
     * 
     */
    X,

    /**
     * Change in itinerary (e.g. because of new or canceled stop)
     * 
     */
    Z,

    /**
     * Deviating origin or destination because of partial cancelation at start or end
     * 
     */
    Y,

    /**
     * One entry of XI infotext
     * 
     */
    K,

    /**
     * Platform change
     * 
     */
    G,

    /**
     * Contains URL linking to a webview
     * 
     */
    W,

    /**
     * DELFI/EU-SPIRIT: contains link to URL with additional information.
     * 
     */
    ED,

    /**
     * Tariff specific hint
     * 
     */
    TAR,

    /**
     * Product name based on raw data format
     * 
     */
    FN,

    /**
     * Is typed location name
     * 
     */
    TLN,

    /**
     * Remark contains a component of the location name as defined in station raw data
     * 
     */
    LNC;

    public String value() {
        return name();
    }

    public static NoteType fromValue(String v) {
        return valueOf(v);
    }

}
