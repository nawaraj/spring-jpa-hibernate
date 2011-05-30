package org.springframework.example.web;

import org.springframework.example.dao.BasicDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class ExampleController {

  private BasicDAO basicDAO;

  public void setBasicDAO(BasicDAO basicDAO) {
    this.basicDAO = basicDAO;
  }

  @RequestMapping(value = "/")
  public String main(Map<String, Object> viewModel) {
    List contacts = basicDAO.findAllContacts();
    viewModel.put("contacts", contacts);
    return "main";
  }

}
