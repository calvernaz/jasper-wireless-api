
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
 *         &lt;element name="operatorAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linePaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "operatorAccountId",
    "linePaymentStatus"
})
@XmlRootElement(name = "EditLinePayStatusPerAcctRequest")
public class EditLinePayStatusPerAcctRequest
    extends RequestType
{

    @XmlElement(required = true)
    protected String operatorAccountId;
    @XmlElement(required = true)
    protected String linePaymentStatus;

    /**
     * Gets the value of the operatorAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorAccountId() {
        return operatorAccountId;
    }

    /**
     * Sets the value of the operatorAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorAccountId(String value) {
        this.operatorAccountId = value;
    }

    /**
     * Gets the value of the linePaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinePaymentStatus() {
        return linePaymentStatus;
    }

    /**
     * Sets the value of the linePaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinePaymentStatus(String value) {
        this.linePaymentStatus = value;
    }

}
