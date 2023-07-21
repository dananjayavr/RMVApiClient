
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hacon.de/hafas/proxy/hafas-proxy}CommonResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchResult" type="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyTrackMatchResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Diagnostics" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchResult",
    "diagnostics"
})
@XmlRootElement(name = "JourneyTrackMatch", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class JourneyTrackMatch
    extends CommonResponseType
{

    @XmlElement(name = "MatchResult", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyTrackMatchResult> matchResult;
    @XmlElement(name = "Diagnostics", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> diagnostics;

    /**
     * Gets the value of the matchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the matchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyTrackMatchResult }
     * 
     * 
     */
    public List<JourneyTrackMatchResult> getMatchResult() {
        if (matchResult == null) {
            matchResult = new ArrayList<JourneyTrackMatchResult>();
        }
        return this.matchResult;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the diagnostics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnostics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getDiagnostics() {
        if (diagnostics == null) {
            diagnostics = new ArrayList<KVType>();
        }
        return this.diagnostics;
    }

}
