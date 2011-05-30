/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.web;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.example.dao.BasicDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.*;
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


  @RequestMapping(value = "newestjob.xml")
  public @ResponseBody void generateSiteMapForNewestJob(HttpServletResponse response, HttpServletRequest request) throws IOException {
    response.setContentType("application/xml");
    String out = "no";
    Map<String, Object> map = new Hashtable<String, Object>();
    map.put("contacts", basicDAO.findAllContacts());
    try {
     out = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "tpl.vm", map);
    }catch (Exception e) {
      e.printStackTrace();
    }
  }

}
