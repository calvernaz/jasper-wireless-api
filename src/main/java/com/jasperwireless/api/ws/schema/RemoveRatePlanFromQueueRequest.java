
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
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queuePosition" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ratePlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "iccid",
    "queuePosition",
    "ratePlan"
})
@XmlRootElement(name = "RemoveRatePlanFromQueueRequest")
public class RemoveRatePlanFromQueueRequest
    extends RequestType
{

    @XmlElement(required = true)
    protected String iccid;
    protected long queuePosition;
    @XmlElement(required = true)
    protected String ratePlan;

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the queuePosition property.
     * 
     */
    public long getQueuePosition() {
        return queuePosition;
    }

    /**
     * Sets the value of the queuePosition property.
     * 
     */
    public void setQueuePosition(long value) {
        this.queuePosition = value;
    }

    /**
     * Gets the value of the ratePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlan() {
        return ratePlan;
    }

    /**
     * Sets the value of the ratePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlan(String value) {
        this.ratePlan = value;
    }

}
