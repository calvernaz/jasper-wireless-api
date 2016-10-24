
package com.jasperwireless.api.ws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RogersSIMActivationSIMResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RogersSIMActivationSIMResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="batchUpdateId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalSimQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="simTransferSuccessQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RogersSIMActivationFailureList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RogersSIMActivationFailureItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RogersSIMActivationSIMResponseType", propOrder = {

})
@XmlSeeAlso({
    RogersSIMActivationSIMResponse.class
})
public class RogersSIMActivationSIMResponseType {

    @XmlElement(required = true)
    protected String fileName;
    protected long orderId;
    protected long accountId;
    protected long batchUpdateId;
    protected long totalSimQuantity;
    protected long simTransferSuccessQuantity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTimeStamp;
    @XmlElement(name = "RogersSIMActivationFailureList")
    protected RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList rogersSIMActivationFailureList;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the batchUpdateId property.
     * 
     */
    public long getBatchUpdateId() {
        return batchUpdateId;
    }

    /**
     * Sets the value of the batchUpdateId property.
     * 
     */
    public void setBatchUpdateId(long value) {
        this.batchUpdateId = value;
    }

    /**
     * Gets the value of the totalSimQuantity property.
     * 
     */
    public long getTotalSimQuantity() {
        return totalSimQuantity;
    }

    /**
     * Sets the value of the totalSimQuantity property.
     * 
     */
    public void setTotalSimQuantity(long value) {
        this.totalSimQuantity = value;
    }

    /**
     * Gets the value of the simTransferSuccessQuantity property.
     * 
     */
    public long getSimTransferSuccessQuantity() {
        return simTransferSuccessQuantity;
    }

    /**
     * Sets the value of the simTransferSuccessQuantity property.
     * 
     */
    public void setSimTransferSuccessQuantity(long value) {
        this.simTransferSuccessQuantity = value;
    }

    /**
     * Gets the value of the eventTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTimeStamp() {
        return eventTimeStamp;
    }

    /**
     * Sets the value of the eventTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTimeStamp(XMLGregorianCalendar value) {
        this.eventTimeStamp = value;
    }

    /**
     * Gets the value of the rogersSIMActivationFailureList property.
     * 
     * @return
     *     possible object is
     *     {@link RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList }
     *     
     */
    public RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList getRogersSIMActivationFailureList() {
        return rogersSIMActivationFailureList;
    }

    /**
     * Sets the value of the rogersSIMActivationFailureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList }
     *     
     */
    public void setRogersSIMActivationFailureList(RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList value) {
        this.rogersSIMActivationFailureList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RogersSIMActivationFailureItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rogersSIMActivationFailureItem"
    })
    public static class RogersSIMActivationFailureList {

        @XmlElement(name = "RogersSIMActivationFailureItem", required = true)
        protected List<RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList.RogersSIMActivationFailureItem> rogersSIMActivationFailureItem;

        /**
         * Gets the value of the rogersSIMActivationFailureItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rogersSIMActivationFailureItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRogersSIMActivationFailureItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList.RogersSIMActivationFailureItem }
         * 
         * 
         */
        public List<RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList.RogersSIMActivationFailureItem> getRogersSIMActivationFailureItem() {
            if (rogersSIMActivationFailureItem == null) {
                rogersSIMActivationFailureItem = new ArrayList<RogersSIMActivationSIMResponseType.RogersSIMActivationFailureList.RogersSIMActivationFailureItem>();
            }
            return this.rogersSIMActivationFailureItem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "iccid",
            "errorCode",
            "errorDescription"
        })
        public static class RogersSIMActivationFailureItem {

            @XmlElement(required = true)
            protected String iccid;
            protected String errorCode;
            protected String errorDescription;

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
             * Gets the value of the errorDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorDescription() {
                return errorDescription;
            }

            /**
             * Sets the value of the errorDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorDescription(String value) {
                this.errorDescription = value;
            }

        }

    }

}
