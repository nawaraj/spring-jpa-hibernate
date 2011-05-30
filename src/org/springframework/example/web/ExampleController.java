package org.springframework.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.example.dao.BasicDAO;
import org.springframework.example.domain.Person;
import org.springframework.example.domain.PersonList;
import org.springframework.example.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.*;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 7:01:15 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ExampleController {
    //@Autowired
    private BasicDAO basicDAO;

  public void setBasicDAO(BasicDAO basicDAO) {
    this.basicDAO = basicDAO;
  }

  @RequestMapping(value = "/main")
    public @ResponseBody PersonList main(HttpServletResponse response){
        List persons = basicDAO.findAllPerson();
        //viewModel.put("persons", persons);
      PersonList personList = new PersonList(persons);
        return personList;
    }
  @RequestMapping(value = "/")
    public String main(Map<String, Object> viewModel){
        List persons = basicDAO.findAllPerson();
        viewModel.put("persons", persons);
      //PersonList personList = new PersonList(persons);
        return "main";
    }

}
