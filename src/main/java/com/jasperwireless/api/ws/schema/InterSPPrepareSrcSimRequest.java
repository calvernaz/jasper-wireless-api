
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
 *         &lt;element name="distributedSimTransferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sourceIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copyAllAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "sourceIccid",
    "copyAllAttributes"
})
@XmlRootElement(name = "InterSPPrepareSrcSimRequest")
public class InterSPPrepareSrcSimRequest
    extends RequestType
{

    protected long distributedSimTransferId;
    @XmlElement(required = true)
    protected String sourceIccid;
    protected Boolean copyAllAttributes;

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
     * Gets the value of the sourceIccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIccid() {
        return sourceIccid;
    }

    /**
     * Sets the value of the sourceIccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIccid(String value) {
        this.sourceIccid = value;
    }

    /**
     * Gets the value of the copyAllAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyAllAttributes() {
        return copyAllAttributes;
    }

    /**
     * Sets the value of the copyAllAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyAllAttributes(Boolean value) {
        this.copyAllAttributes = value;
    }

}
