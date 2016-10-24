
package com.jasperwireless.api.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="distributedSimTransferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://api.jasperwireless.com/ws/schema}GetOrCreateSimFromVirtualSubscriptionStatus"/>
 *         &lt;element name="targetIccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "distributedSimTransferId",
    "status",
    "targetIccid"
})
@XmlRootElement(name = "InterSPCreateTargetSimResponse")
public class InterSPCreateTargetSimResponse
    extends ResponseType
{

    protected long distributedSimTransferId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GetOrCreateSimFromVirtualSubscriptionStatus status;
    protected String targetIccid;

    /**
     * Gets the value of the distributedSimTransferId property.
     * 
     */
    public long getDistributedSimTransferId() {
        return distributedSimTransferId;
    }

    /**
     * Sets the value of the distributedSimTransferId property.
     * 
     */
    public void setDistributedSimTransferId(long value) {
        this.distributedSimTransferId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrCreateSimFromVirtualSubscriptionStatus }
     *     
     */
    public GetOrCreateSimFromVirtualSubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrCreateSimFromVirtualSubscriptionStatus }
     *     
     */
    public void setStatus(GetOrCreateSimFromVirtualSubscriptionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the targetIccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetIccid() {
        return targetIccid;
    }

    /**
     * Sets the value of the targetIccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetIccid(String value) {
        this.targetIccid = value;
    }

}
