
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Operator" type="{http://hacon.de/hafas/proxy/hafas-proxy}OperatorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategory" type="{http://hacon.de/hafas/proxy/hafas-proxy}ProductCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://hacon.de/hafas/proxy/hafas-proxy}RegionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MapInfo" type="{http://hacon.de/hafas/proxy/hafas-proxy}MapInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="begin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operator",
    "product",
    "productCategory",
    "region",
    "mapInfo"
})
@XmlRootElement(name = "DataInfo", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class DataInfo
    extends CommonResponseType
{

    @XmlElement(name = "Operator", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<OperatorType> operator;
    @XmlElement(name = "Product", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductType> product;
    @XmlElement(name = "ProductCategory", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<ProductCategoryType> productCategory;
    @XmlElement(name = "Region", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<RegionType> region;
    @XmlElement(name = "MapInfo", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<MapInfoType> mapInfo;
    @XmlAttribute(name = "begin")
    protected String begin;
    @XmlAttribute(name = "end")
    protected String end;

    /**
     * Gets the value of the operator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorType }
     * 
     * 
     */
    public List<OperatorType> getOperator() {
        if (operator == null) {
            operator = new ArrayList<OperatorType>();
        }
        return this.operator;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategoryType }
     * 
     * 
     */
    public List<ProductCategoryType> getProductCategory() {
        if (productCategory == null) {
            productCategory = new ArrayList<ProductCategoryType>();
        }
        return this.productCategory;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRegion() {
        if (region == null) {
            region = new ArrayList<RegionType>();
        }
        return this.region;
    }

    /**
     * Gets the value of the mapInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mapInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapInfoType }
     * 
     * 
     */
    public List<MapInfoType> getMapInfo() {
        if (mapInfo == null) {
            mapInfo = new ArrayList<MapInfoType>();
        }
        return this.mapInfo;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

}
