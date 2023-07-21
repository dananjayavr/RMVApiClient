
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GisEdgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GisEdgeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="edgeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="graphId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisEdgeType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class GisEdgeType {

    @XmlAttribute(name = "edgeId")
    protected String edgeId;
    @XmlAttribute(name = "graphId")
    protected String graphId;

    /**
     * Gets the value of the edgeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeId() {
        return edgeId;
    }

    /**
     * Sets the value of the edgeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeId(String value) {
        this.edgeId = value;
    }

    /**
     * Gets the value of the graphId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphId() {
        return graphId;
    }

    /**
     * Sets the value of the graphId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphId(String value) {
        this.graphId = value;
    }

}
