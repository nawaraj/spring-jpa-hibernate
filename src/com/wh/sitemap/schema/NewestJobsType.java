
package com.wh.sitemap.schema;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for NewestJobsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewestJobsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalAd" type="{}ExternalAdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewestJobsType", propOrder = {
    "externalAd"
})
@XmlRootElement
public class NewestJobsType {

    @XmlElement(name = "ExternalAd", required = true)
    protected ExternalAdType externalAd;

    /**
     * Gets the value of the externalAd property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAdType }
     *     
     */
    public ExternalAdType getExternalAd() {
        return externalAd;
    }

    /**
     * Sets the value of the externalAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAdType }
     *     
     */
    public void setExternalAd(ExternalAdType value) {
        this.externalAd = value;
    }

}
