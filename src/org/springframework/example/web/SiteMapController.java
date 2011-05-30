/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.web;

import com.wh.sitemap.schema.ExternalAdType;
import com.wh.sitemap.schema.ImageType;
import com.wh.sitemap.schema.LinkType;
import com.wh.sitemap.schema.NewestJobsType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.example.dao.BasicDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.*;
import javax.xml.bind.*;
import java.io.*;
import java.util.*;

/**
 * User: nawaraj
 * Date: 5/20/11
 */
@Controller
 @RequestMapping(value = "/sitemap/*")
public class SiteMapController {
  private BasicDAO basicDAO;

  public void setBasicDAO(BasicDAO basicDAO) {
    this.basicDAO = basicDAO;
  }

  private String template;
  private VelocityEngine velocityEngine;

  public void setVelocityEngine(VelocityEngine velocityEngine) {
    this.velocityEngine = velocityEngine;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   @RequestMapping(value = "sitemap", method = RequestMethod.GET)
   public String generateContent(Map<String, Object> model){
     model.put("persons", "hello world");
     return "sitemap";
   }

  @RequestMapping(value = "newestjob.xml")

  public @ResponseBody void generateSiteMapForNewestJob(HttpServletResponse response, HttpServletRequest request) throws IOException {
    response.setContentType("application/xml");
    String out = "no";
    Map<String, Object> map = new Hashtable<String, Object>();
    map.put("persons", basicDAO.findAllPerson());
    try {
     out = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "tpl.vm", map);
    }catch (Exception e) {
      e.printStackTrace();
    }
    //response.getWriter().write(out);
   // return "tpl";
    //return out;
    /* try {
      JAXBContext jc = JAXBContext.newInstance("com.wh.sitemap.schema");
      Marshaller marshaller = jc.createMarshaller();
      marshaller.marshal(createJobs("headLine", "imageTypeValue", "linkSource", "linkValue"), response.getOutputStream());
    } catch (JAXBException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }*/
    //return "main";
  }

  private NewestJobsType createJobs(String headline, String imageTypeValue, String linkSource, String linkValue){
    NewestJobsType newestJobsType = new NewestJobsType();
    ExternalAdType externalAdType = createExternalAdType(headline, createLinkType(linkSource, linkValue), createImageType(imageTypeValue));
    newestJobsType.setExternalAd(externalAdType);
    return newestJobsType;
  }

  private ExternalAdType createExternalAdType(String headLine, LinkType linkType, ImageType imageType){
    ExternalAdType externalAdType = new ExternalAdType();
    externalAdType.setLink(linkType);
    externalAdType.setHeadline(headLine);
    externalAdType.setImage(imageType);
    return externalAdType;
  }
  private ImageType createImageType(String imageTypeValue){
    ImageType imageType = new ImageType();
    imageType.setValue(imageTypeValue);
    //TODO: set other value
    return imageType;
  }
  private LinkType createLinkType(String linkSource, String linkValue){
    LinkType linkType = new LinkType();
    linkType.setValue(linkValue);
    linkType.setSource(linkSource);
    return linkType;
  }
}
