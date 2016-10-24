
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 *         The information about SIM CTD Csd Usage in a zone.
 *     
 * 
 * <p>Java class for CtdCsdZUsageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtdCsdZUsageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctdCsdMoUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctdCsdMtUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "CtdCsdZUsageInfoType", propOrder = {
    "iccid",
    "ctdCsdMoUsage",
    "ctdCsdMtUsage",
    "zoneName",
    "any"
})
@XmlSeeAlso({
    CtdCsdZUsage.class
})
public class CtdCsdZUsageInfoType {

    @XmlElement(required = true)
    protected String iccid;
    @XmlElement(required = true)
    protected String ctdCsdMoUsage;
    @XmlElement(required = true)
    protected String ctdCsdMtUsage;
    @XmlElement(required = true)
    protected String zoneName;
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
     * Gets the value of the ctdCsdMoUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtdCsdMoUsage() {
        return ctdCsdMoUsage;
    }

    /**
     * Sets the value of the ctdCsdMoUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtdCsdMoUsage(String value) {
        this.ctdCsdMoUsage = value;
    }

    /**
     * Gets the value of the ctdCsdMtUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtdCsdMtUsage() {
        return ctdCsdMtUsage;
    }

    /**
     * Sets the value of the ctdCsdMtUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtdCsdMtUsage(String value) {
        this.ctdCsdMtUsage = value;
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
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
