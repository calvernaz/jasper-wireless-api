
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
 *         &lt;element name="globalSimTransferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sourceIccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceSimState" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sourceIccid",
    "sourceSimState"
})
@XmlRootElement(name = "DeactivateSrcSimResponse")
public class DeactivateSrcSimResponse
    extends ResponseType
{

    protected long globalSimTransferId;
    @XmlElement(required = true)
    protected String sourceIccid;
    @XmlElement(required = true)
    protected String sourceSimState;

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
     * Gets the value of the sourceSimState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSimState() {
        return sourceSimState;
    }

    /**
     * Sets the value of the sourceSimState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSimState(String value) {
        this.sourceSimState = value;
    }

}
