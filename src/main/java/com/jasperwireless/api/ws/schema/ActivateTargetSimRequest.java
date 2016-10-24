
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
 *     &lt;extension base="{http://api.jasperwireless.com/ws/schema}RequestType">
 *       &lt;sequence>
 *         &lt;element name="globalSimTransferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="targetIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetSimState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otaAlgorithmType" type="{http://api.jasperwireless.com/ws/schema}GlobalSimOtaAlgoType" minOccurs="0"/>
 *         &lt;element name="targetRatePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetCommPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalSimTransferId",
    "targetIccid",
    "targetSimState",
    "otaAlgorithmType",
    "targetRatePlan",
    "targetCommPlan"
})
@XmlRootElement(name = "ActivateTargetSimRequest")
public class ActivateTargetSimRequest
    extends RequestType
{

    protected long globalSimTransferId;
    @XmlElement(required = true)
    protected String targetIccid;
    @XmlElement(required = true)
    protected String targetSimState;
    @XmlSchemaType(name = "string")
    protected GlobalSimOtaAlgoType otaAlgorithmType;
    protected String targetRatePlan;
    protected String targetCommPlan;

    /**
     * Gets the value of the globalSimTransferId property.
     * 
     */
    public long getGlobalSimTransferId() {
        return globalSimTransferId;
    }

    /**
     * Sets the value of the globalSimTransferId property.
     * 
     */
    public void setGlobalSimTransferId(long value) {
        this.globalSimTransferId = value;
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

    /**
     * Gets the value of the otaAlgorithmType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSimOtaAlgoType }
     *     
     */
    public GlobalSimOtaAlgoType getOtaAlgorithmType() {
        return otaAlgorithmType;
    }

    /**
     * Sets the value of the otaAlgorithmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSimOtaAlgoType }
     *     
     */
    public void setOtaAlgorithmType(GlobalSimOtaAlgoType value) {
        this.otaAlgorithmType = value;
    }

    /**
     * Gets the value of the targetRatePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRatePlan() {
        return targetRatePlan;
    }

    /**
     * Sets the value of the targetRatePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRatePlan(String value) {
        this.targetRatePlan = value;
    }

    /**
     * Gets the value of the targetCommPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCommPlan() {
        return targetCommPlan;
    }

    /**
     * Sets the value of the targetCommPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCommPlan(String value) {
        this.targetCommPlan = value;
    }

}
