
package com.jasperwireless.api.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Get_SIM_StatusResult" type="{http://api.jasperwireless.com/ws/schema}SimStatus" minOccurs="0"/>
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
    "getSIMStatusResult"
})
@XmlRootElement(name = "GetSimStatusResponse")
public class GetSimStatusResponse
    extends ResponseType
{

    @XmlElement(name = "Get_SIM_StatusResult")
    protected SimStatus getSIMStatusResult;

    /**
     * Gets the value of the getSIMStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SimStatus }
     *     
     */
    public SimStatus getGetSIMStatusResult() {
        return getSIMStatusResult;
    }

    /**
     * Sets the value of the getSIMStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimStatus }
     *     
     */
    public void setGetSIMStatusResult(SimStatus value) {
        this.getSIMStatusResult = value;
    }

}
