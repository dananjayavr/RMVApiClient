
package de.rmv.hapirest.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="timeDiffCritical" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultStatusType", namespace = "http://hacon.de/hafas/proxy/hafas-proxy")
public class ResultStatusType {

    @XmlAttribute(name = "timeDiffCritical")
    protected Boolean timeDiffCritical;

    /**
     * Gets the value of the timeDiffCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTimeDiffCritical() {
        if (timeDiffCritical == null) {
            return false;
        } else {
            return timeDiffCritical;
        }
    }

    /**
     * Sets the value of the timeDiffCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDiffCritical(Boolean value) {
        this.timeDiffCritical = value;
    }

}
