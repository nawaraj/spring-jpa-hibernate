/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.domain;

import javax.xml.bind.annotation.*;
import java.util.*;

/**
 * User: nawaraj
 * Date: 5/23/11
 */
@XmlRootElement(name = "persons")
public class PersonList {

  private int count;
  private List<Person> persons;

  public PersonList() {
  }

  public PersonList(List<Person> persons) {
    this.persons = persons;
    this.count = persons.size();
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @XmlElement(name = "persons")
  public List<Person> getEmployees() {
    return persons;
  }

  public void setEmployees(List<Person> persons) {
    this.persons = persons;
  }
}
