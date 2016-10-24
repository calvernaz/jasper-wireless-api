
package com.jasperwireless.api.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The account-specific response information received from the call to the individual account (on a particular POD)
 *             that should / would be included in the "global" response to the Global API Request
 *         
 * 
 * <p>Java class for AccountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="account" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountResponseType")
@XmlSeeAlso({
    com.jasperwireless.api.ws.schema.GlobalSendSMSResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalGetTerminalLatestRegistrationResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalGetAvailableEventRatePlansResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalActivateTerminalEventRatePlanResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalGetTerminalEventRatePlansResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalEditTerminalResponse.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalAPIFault.AccountResponse.class,
    com.jasperwireless.api.ws.schema.GlobalGetTerminalDetailsResponse.AccountResponse.class
})
public class AccountResponseType {

    @XmlAttribute(name = "account")
    protected String account;
    @XmlAttribute(name = "operator")
    protected String operator;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
