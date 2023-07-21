
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RtModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RtModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERVER_DEFAULT"/&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="INFOS"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="REALTIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RtModeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
@XmlEnum
public enum RtModeType {


    /**
     * One of the following modes is configured in the HAFAS server back end.
     * 
     */
    SERVER_DEFAULT,

    /**
     * Search on planned data, ignore real-time information completely: Connections are
     * 					computed on the basis of planned data. No real-time information is shown.
     * 
     */
    OFF,

    /**
     * Search on planned data, use real-time information for display only: Connections are
     * 					computed on the basis of planned data. Delays and feasibility of the connections are integrated into
     * 					the result. Note that additional trains (supplied via realtime feed) will not be part of the resulting
     * 					connections.
     * 
     */
    INFOS,

    /**
     * Combined search on planned and real-time data. This search consists of two steps: i. Search
     * 					on scheduled data, ii. If the result of step (i) contains a non-feasible connection, a search on real-time
     * 					data is performed and all results are combined.
     * 
     */
    FULL,

    /**
     * Search on real-time data: Connections are computed on the basis of real-time data,
     * 					using planned schedule only whenever no real-time data is available. All connections computed are
     * 					feasible with respect to the currently known real-time situation.
     * 
     * 					Additional trains (supplied via real-time feed) will be found if these are part of a fast, comfortable,
     * 					or direct connection (or economic connection, if economic search is activated).
     * 
     */
    REALTIME;

    public String value() {
        return name();
    }

    public static RtModeType fromValue(String v) {
        return valueOf(v);
    }

}
