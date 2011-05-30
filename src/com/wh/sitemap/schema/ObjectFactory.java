
package com.wh.sitemap.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wh.sitemap.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewestJobs_QNAME = new QName("", "NewestJobs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wh.sitemap.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewestJobsType }
     * 
     */
    public NewestJobsType createNewestJobsType() {
        return new NewestJobsType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link ExternalAdType }
     * 
     */
    public ExternalAdType createExternalAdType() {
        return new ExternalAdType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewestJobsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NewestJobs")
    public JAXBElement<NewestJobsType> createNewestJobs(NewestJobsType value) {
        return new JAXBElement<NewestJobsType>(_NewestJobs_QNAME, NewestJobsType.class, null, value);
    }

}
