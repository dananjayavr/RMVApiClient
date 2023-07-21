
package de.rmv.hapirest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisRouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GisRouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seg" type="{http://hacon.de/hafas/proxy/hafas-proxy}GisRouteSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://hacon.de/hafas/proxy/hafas-proxy}Notes" minOccurs="0"/&gt;
 *         &lt;element name="polyline" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="polylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element name="altPolyline" type="{http://hacon.de/hafas/proxy/hafas-proxy}Polyline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altPolylineGroup" type="{http://hacon.de/hafas/proxy/hafas-proxy}PolylineGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="durS" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durR" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durST" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durW2C" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durW2D" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="dirTxt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dirGeo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="edgeHashS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="edgeHashR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="totUphill" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="totDownhill" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisRouteType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy", propOrder = {
    "seg",
    "notes",
    "polyline",
    "polylineGroup",
    "altPolyline",
    "altPolylineGroup"
})
public class GisRouteType {

    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<GisRouteSegment> seg;
    @XmlElement(name = "Notes", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Notes notes;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected Polyline polyline;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected PolylineGroup polylineGroup;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<Polyline> altPolyline;
    @XmlElement(namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
    protected List<PolylineGroup> altPolylineGroup;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "durS")
    protected Duration durS;
    @XmlAttribute(name = "durR")
    protected Duration durR;
    @XmlAttribute(name = "durST")
    protected Duration durST;
    @XmlAttribute(name = "durW2C")
    protected Duration durW2C;
    @XmlAttribute(name = "durW2D")
    protected Duration durW2D;
    @XmlAttribute(name = "dirTxt")
    protected String dirTxt;
    @XmlAttribute(name = "dirGeo")
    protected Integer dirGeo;
    @XmlAttribute(name = "edgeHashS")
    protected String edgeHashS;
    @XmlAttribute(name = "edgeHashR")
    protected String edgeHashR;
    @XmlAttribute(name = "totUphill")
    protected Double totUphill;
    @XmlAttribute(name = "totDownhill")
    protected Double totDownhill;

    /**
     * Gets the value of the seg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the seg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GisRouteSegment }
     * 
     * 
     */
    public List<GisRouteSegment> getSeg() {
        if (seg == null) {
            seg = new ArrayList<GisRouteSegment>();
        }
        return this.seg;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the polyline property.
     * 
     * @return
     *     possible object is
     *     {@link Polyline }
     *     
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * Sets the value of the polyline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polyline }
     *     
     */
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * Gets the value of the polylineGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PolylineGroup }
     *     
     */
    public PolylineGroup getPolylineGroup() {
        return polylineGroup;
    }

    /**
     * Sets the value of the polylineGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolylineGroup }
     *     
     */
    public void setPolylineGroup(PolylineGroup value) {
        this.polylineGroup = value;
    }

    /**
     * Gets the value of the altPolyline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the altPolyline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPolyline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     * 
     * 
     */
    public List<Polyline> getAltPolyline() {
        if (altPolyline == null) {
            altPolyline = new ArrayList<Polyline>();
        }
        return this.altPolyline;
    }

    /**
     * Gets the value of the altPolylineGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the altPolylineGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPolylineGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolylineGroup }
     * 
     * 
     */
    public List<PolylineGroup> getAltPolylineGroup() {
        if (altPolylineGroup == null) {
            altPolylineGroup = new ArrayList<PolylineGroup>();
        }
        return this.altPolylineGroup;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDist(Integer value) {
        this.dist = value;
    }

    /**
     * Gets the value of the durS property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurS() {
        return durS;
    }

    /**
     * Sets the value of the durS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurS(Duration value) {
        this.durS = value;
    }

    /**
     * Gets the value of the durR property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurR() {
        return durR;
    }

    /**
     * Sets the value of the durR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurR(Duration value) {
        this.durR = value;
    }

    /**
     * Gets the value of the durST property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurST() {
        return durST;
    }

    /**
     * Sets the value of the durST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurST(Duration value) {
        this.durST = value;
    }

    /**
     * Gets the value of the durW2C property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurW2C() {
        return durW2C;
    }

    /**
     * Sets the value of the durW2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurW2C(Duration value) {
        this.durW2C = value;
    }

    /**
     * Gets the value of the durW2D property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurW2D() {
        return durW2D;
    }

    /**
     * Sets the value of the durW2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurW2D(Duration value) {
        this.durW2D = value;
    }

    /**
     * Gets the value of the dirTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirTxt() {
        return dirTxt;
    }

    /**
     * Sets the value of the dirTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirTxt(String value) {
        this.dirTxt = value;
    }

    /**
     * Gets the value of the dirGeo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirGeo() {
        return dirGeo;
    }

    /**
     * Sets the value of the dirGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirGeo(Integer value) {
        this.dirGeo = value;
    }

    /**
     * Gets the value of the edgeHashS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeHashS() {
        return edgeHashS;
    }

    /**
     * Sets the value of the edgeHashS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeHashS(String value) {
        this.edgeHashS = value;
    }

    /**
     * Gets the value of the edgeHashR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeHashR() {
        return edgeHashR;
    }

    /**
     * Sets the value of the edgeHashR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeHashR(String value) {
        this.edgeHashR = value;
    }

    /**
     * Gets the value of the totUphill property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotUphill() {
        return totUphill;
    }

    /**
     * Sets the value of the totUphill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotUphill(Double value) {
        this.totUphill = value;
    }

    /**
     * Gets the value of the totDownhill property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotDownhill() {
        return totDownhill;
    }

    /**
     * Sets the value of the totDownhill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotDownhill(Double value) {
        this.totDownhill = value;
    }

}
