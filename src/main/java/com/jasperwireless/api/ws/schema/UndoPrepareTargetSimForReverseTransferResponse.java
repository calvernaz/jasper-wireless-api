
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
 *         &lt;element name="simTransferWorkflowId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="targetIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetSimState" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "simTransferWorkflowId",
    "targetIccid",
    "targetSimState"
})
@XmlRootElement(name = "UndoPrepareTargetSimForReverseTransferResponse")
public class UndoPrepareTargetSimForReverseTransferResponse
    extends ResponseType
{

    protected long simTransferWorkflowId;
    @XmlElement(required = true)
    protected String targetIccid;
    @XmlElement(required = true)
    protected String targetSimState;

    /**
     * Gets the value of the simTransferWorkflowId property.
     * 
     */
    public long getSimTransferWorkflowId() {
        return simTransferWorkflowId;
    }

    /**
     * Sets the value of the simTransferWorkflowId property.
     * 
     */
    public void setSimTransferWorkflowId(long value) {
        this.simTransferWorkflowId = value;
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

    /**
     * Gets the value of the targetSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSimState() {
        return targetSimState;
    }

    /**
     * Sets the value of the targetSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSimState(String value) {
        this.targetSimState = value;
    }

}
