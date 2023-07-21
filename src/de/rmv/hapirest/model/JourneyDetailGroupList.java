
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
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}JourneyDetailGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "journeyDetailGroup"
})
@XmlRootElement(name = "JourneyDetailGroupList", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class JourneyDetailGroupList
    extends CommonResponseType
{

    @XmlElement(name = "JourneyDetailGroup", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<JourneyDetailGroup> journeyDetailGroup;

    /**
     * Gets the value of the journeyDetailGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the journeyDetailGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyDetailGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyDetailGroup }
     * 
     * 
     */
    public List<JourneyDetailGroup> getJourneyDetailGroup() {
        if (journeyDetailGroup == null) {
            journeyDetailGroup = new ArrayList<JourneyDetailGroup>();
        }
        return this.journeyDetailGroup;
    }

}
