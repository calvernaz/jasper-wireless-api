
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
 *     &lt;extension base="{http://api.jasperwireless.com/ws/schema}RequestType">
 *       &lt;sequence>
 *         &lt;element name="primaryIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "primaryIccid"
})
@XmlRootElement(name = "GetGlobalSimTransferStatusRequest")
public class GetGlobalSimTransferStatusRequest
    extends RequestType
{

    @XmlElement(required = true)
    protected String primaryIccid;

    /**
     * Gets the value of the primaryIccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIccid() {
        return primaryIccid;
    }

    /**
     * Sets the value of the primaryIccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIccid(String value) {
        this.primaryIccid = value;
    }

}
