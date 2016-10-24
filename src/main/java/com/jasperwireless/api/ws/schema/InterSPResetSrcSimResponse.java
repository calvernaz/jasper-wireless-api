
package com.jasperwireless.api.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.jasperwireless.com/ws/schema}ResponseType">
 *       &lt;sequence>
 *         &lt;element name="previousSourceSimState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSimState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "previousSourceSimState",
    "sourceSimState"
})
@XmlRootElement(name = "InterSPResetSrcSimResponse")
public class InterSPResetSrcSimResponse
    extends ResponseType
{

    protected String previousSourceSimState;
    protected String sourceSimState;

    /**
     * Gets the value of the previousSourceSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSourceSimState() {
        return previousSourceSimState;
    }

    /**
     * Sets the value of the previousSourceSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSourceSimState(String value) {
        this.previousSourceSimState = value;
    }

    /**
     * Gets the value of the sourceSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSimState() {
        return sourceSimState;
    }

    /**
     * Sets the value of the sourceSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSimState(String value) {
        this.sourceSimState = value;
    }

}
