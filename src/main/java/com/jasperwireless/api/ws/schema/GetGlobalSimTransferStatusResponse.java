
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
 *         &lt;element name="primaryIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetPartnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalAllianceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalSimTransferType" type="{http://api.jasperwireless.com/ws/schema}GlobalSimTransferType"/>
 *         &lt;element name="status" type="{http://api.jasperwireless.com/ws/schema}GlobalSimTransferStatusType"/>
 *         &lt;element name="statusDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSimSubscriptionInfo" type="{http://api.jasperwireless.com/ws/schema}GlobalSimSubscriptionInfoType" minOccurs="0"/>
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
    "primaryIccid",
    "targetPartnerName",
    "globalAllianceName",
    "globalSimTransferType",
    "status",
    "statusDetails",
    "errorCode",
    "errorDetails",
    "targetSimSubscriptionInfo"
})
@XmlRootElement(name = "GetGlobalSimTransferStatusResponse")
public class GetGlobalSimTransferStatusResponse
    extends ResponseType
{

    @XmlElement(required = true)
    protected String primaryIccid;
    @XmlElement(required = true)
    protected String targetPartnerName;
    @XmlElement(required = true)
    protected String globalAllianceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GlobalSimTransferType globalSimTransferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GlobalSimTransferStatusType status;
    @XmlElement(required = true)
    protected String statusDetails;
    protected String errorCode;
    protected String errorDetails;
    protected GlobalSimSubscriptionInfoType targetSimSubscriptionInfo;

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

    /**
     * Gets the value of the targetPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPartnerName() {
        return targetPartnerName;
    }

    /**
     * Sets the value of the targetPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPartnerName(String value) {
        this.targetPartnerName = value;
    }

    /**
     * Gets the value of the globalAllianceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAllianceName() {
        return globalAllianceName;
    }

    /**
     * Sets the value of the globalAllianceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAllianceName(String value) {
        this.globalAllianceName = value;
    }

    /**
     * Gets the value of the globalSimTransferType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSimTransferType }
     *     
     */
    public GlobalSimTransferType getGlobalSimTransferType() {
        return globalSimTransferType;
    }

    /**
     * Sets the value of the globalSimTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSimTransferType }
     *     
     */
    public void setGlobalSimTransferType(GlobalSimTransferType value) {
        this.globalSimTransferType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSimTransferStatusType }
     *     
     */
    public GlobalSimTransferStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSimTransferStatusType }
     *     
     */
    public void setStatus(GlobalSimTransferStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetails(String value) {
        this.statusDetails = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDetails(String value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the targetSimSubscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSimSubscriptionInfoType }
     *     
     */
    public GlobalSimSubscriptionInfoType getTargetSimSubscriptionInfo() {
        return targetSimSubscriptionInfo;
    }

    /**
     * Sets the value of the targetSimSubscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSimSubscriptionInfoType }
     *     
     */
    public void setTargetSimSubscriptionInfo(GlobalSimSubscriptionInfoType value) {
        this.targetSimSubscriptionInfo = value;
    }

}
