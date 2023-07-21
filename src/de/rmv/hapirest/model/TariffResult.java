
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}fareSetItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clickout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalContent" type="{http://hacon.de/hafas/proxy/hafas-proxy}ExternalContentType" minOccurs="0"/&gt;
 *         &lt;element name="param" type="{http://hacon.de/hafas/proxy/hafas-proxy}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "fareSetItem",
    "clickout",
    "externalContent",
    "param"
})
@XmlRootElement(name = "TariffResult", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class TariffResult {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<FareSetItem> fareSetItem;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected String clickout;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected ExternalContentType externalContent;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<KVType> param;

    /**
     * Gets the value of the fareSetItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fareSetItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareSetItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSetItem }
     * 
     * 
     */
    public List<FareSetItem> getFareSetItem() {
        if (fareSetItem == null) {
            fareSetItem = new ArrayList<FareSetItem>();
        }
        return this.fareSetItem;
    }

    /**
     * Gets the value of the clickout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickout() {
        return clickout;
    }

    /**
     * Sets the value of the clickout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickout(String value) {
        this.clickout = value;
    }

    /**
     * Gets the value of the externalContent property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalContentType }
     *     
     */
    public ExternalContentType getExternalContent() {
        return externalContent;
    }

    /**
     * Sets the value of the externalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalContentType }
     *     
     */
    public void setExternalContent(ExternalContentType value) {
        this.externalContent = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     * 
     * 
     */
    public List<KVType> getParam() {
        if (param == null) {
            param = new ArrayList<KVType>();
        }
        return this.param;
    }

}
