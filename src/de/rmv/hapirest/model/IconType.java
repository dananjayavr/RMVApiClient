
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IconType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foregroundColor" type="{http://hacon.de/hafas/proxy/hafas-proxy}RGBAColorType" minOccurs="0"/&gt;
 *         &lt;element name="backgroundColor" type="{http://hacon.de/hafas/proxy/hafas-proxy}RGBAColorType" minOccurs="0"/&gt;
 *         &lt;element name="borderColor" type="{http://hacon.de/hafas/proxy/hafas-proxy}RGBAColorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="res" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="txt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="txtS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="style" type="{http://hacon.de/hafas/proxy/hafas-proxy}IconStyleType" default="U" /&gt;
 *       &lt;attribute name="shape" type="{http://hacon.de/hafas/proxy/hafas-proxy}IconShapeType" default="U" /&gt;
 *       &lt;attribute name="shapeRes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IconType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "foregroundColor",
    "backgroundColor",
    "borderColor"
})
public class IconType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected RGBAColorType foregroundColor;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected RGBAColorType backgroundColor;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected RGBAColorType borderColor;
    @XmlAttribute(name = "res")
    protected String res;
    @XmlAttribute(name = "txt")
    protected String txt;
    @XmlAttribute(name = "txtS")
    protected String txtS;
    @XmlAttribute(name = "style")
    protected IconStyleType style;
    @XmlAttribute(name = "shape")
    protected IconShapeType shape;
    @XmlAttribute(name = "shapeRes")
    protected String shapeRes;

    /**
     * Gets the value of the foregroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBAColorType }
     *     
     */
    public RGBAColorType getForegroundColor() {
        return foregroundColor;
    }

    /**
     * Sets the value of the foregroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBAColorType }
     *     
     */
    public void setForegroundColor(RGBAColorType value) {
        this.foregroundColor = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBAColorType }
     *     
     */
    public RGBAColorType getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBAColorType }
     *     
     */
    public void setBackgroundColor(RGBAColorType value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBAColorType }
     *     
     */
    public RGBAColorType getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBAColorType }
     *     
     */
    public void setBorderColor(RGBAColorType value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the res property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes() {
        return res;
    }

    /**
     * Sets the value of the res property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes(String value) {
        this.res = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the txtS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtS() {
        return txtS;
    }

    /**
     * Sets the value of the txtS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtS(String value) {
        this.txtS = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link IconStyleType }
     *     
     */
    public IconStyleType getStyle() {
        if (style == null) {
            return IconStyleType.U;
        } else {
            return style;
        }
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconStyleType }
     *     
     */
    public void setStyle(IconStyleType value) {
        this.style = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link IconShapeType }
     *     
     */
    public IconShapeType getShape() {
        if (shape == null) {
            return IconShapeType.U;
        } else {
            return shape;
        }
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconShapeType }
     *     
     */
    public void setShape(IconShapeType value) {
        this.shape = value;
    }

    /**
     * Gets the value of the shapeRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapeRes() {
        return shapeRes;
    }

    /**
     * Sets the value of the shapeRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapeRes(String value) {
        this.shapeRes = value;
    }

}
