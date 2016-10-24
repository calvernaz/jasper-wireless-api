
package com.jasperwireless.api.ws.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 *         Detailed information about Account Transfer
 *     
 * 
 * <p>Java class for AccountTransferInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTransferInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previousSimState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newSimState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previousAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deferActionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deferActionPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTransferInfoType", propOrder = {
    "iccid",
    "msisdn",
    "imei",
    "imsi",
    "previousSimState",
    "newSimState",
    "previousAccountId",
    "newAccountId",
    "previousAccountName",
    "newAccountName",
    "dateChanged",
    "shippedDate",
    "deferActionStartDate",
    "deferActionPeriod",
    "any"
})
@XmlSeeAlso({
    AccountTransfer.class
})
public class AccountTransferInfoType {

    @XmlElement(required = true)
    protected String iccid;
    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected String imei;
    @XmlElement(required = true)
    protected String imsi;
    @XmlElement(required = true)
    protected String previousSimState;
    @XmlElement(required = true)
    protected String newSimState;
    protected long previousAccountId;
    protected long newAccountId;
    @XmlElement(required = true)
    protected String previousAccountName;
    @XmlElement(required = true)
    protected String newAccountName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateChanged;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deferActionStartDate;
    protected int deferActionPeriod;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the previousSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSimState() {
        return previousSimState;
    }

    /**
     * Sets the value of the previousSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSimState(String value) {
        this.previousSimState = value;
    }

    /**
     * Gets the value of the newSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSimState() {
        return newSimState;
    }

    /**
     * Sets the value of the newSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSimState(String value) {
        this.newSimState = value;
    }

    /**
     * Gets the value of the previousAccountId property.
     * 
     */
    public long getPreviousAccountId() {
        return previousAccountId;
    }

    /**
     * Sets the value of the previousAccountId property.
     * 
     */
    public void setPreviousAccountId(long value) {
        this.previousAccountId = value;
    }

    /**
     * Gets the value of the newAccountId property.
     * 
     */
    public long getNewAccountId() {
        return newAccountId;
    }

    /**
     * Sets the value of the newAccountId property.
     * 
     */
    public void setNewAccountId(long value) {
        this.newAccountId = value;
    }

    /**
     * Gets the value of the previousAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousAccountName() {
        return previousAccountName;
    }

    /**
     * Sets the value of the previousAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousAccountName(String value) {
        this.previousAccountName = value;
    }

    /**
     * Gets the value of the newAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccountName() {
        return newAccountName;
    }

    /**
     * Sets the value of the newAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccountName(String value) {
        this.newAccountName = value;
    }

    /**
     * Gets the value of the dateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateChanged() {
        return dateChanged;
    }

    /**
     * Sets the value of the dateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateChanged(XMLGregorianCalendar value) {
        this.dateChanged = value;
    }

    /**
     * Gets the value of the shippedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippedDate() {
        return shippedDate;
    }

    /**
     * Sets the value of the shippedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippedDate(XMLGregorianCalendar value) {
        this.shippedDate = value;
    }

    /**
     * Gets the value of the deferActionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeferActionStartDate() {
        return deferActionStartDate;
    }

    /**
     * Sets the value of the deferActionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeferActionStartDate(XMLGregorianCalendar value) {
        this.deferActionStartDate = value;
    }

    /**
     * Gets the value of the deferActionPeriod property.
     * 
     */
    public int getDeferActionPeriod() {
        return deferActionPeriod;
    }

    /**
     * Sets the value of the deferActionPeriod property.
     * 
     */
    public void setDeferActionPeriod(int value) {
        this.deferActionPeriod = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
