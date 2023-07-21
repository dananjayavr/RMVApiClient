
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}ArrivalBoard" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}DepartureBoard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrivalBoardAndDepartureBoard"
})
@XmlRootElement(name = "MultiBoard", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class MultiBoard {

    @XmlElements({
        @XmlElement(name = "ArrivalBoard", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = ArrivalBoard.class),
        @XmlElement(name = "DepartureBoard", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", type = DepartureBoard.class)
    })
    protected List<CommonResponseType> arrivalBoardAndDepartureBoard;

    /**
     * Gets the value of the arrivalBoardAndDepartureBoard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalBoardAndDepartureBoard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalBoardAndDepartureBoard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalBoard }
     * {@link DepartureBoard }
     * 
     * 
     */
    public List<CommonResponseType> getArrivalBoardAndDepartureBoard() {
        if (arrivalBoardAndDepartureBoard == null) {
            arrivalBoardAndDepartureBoard = new ArrayList<CommonResponseType>();
        }
        return this.arrivalBoardAndDepartureBoard;
    }

}
