/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.domain;

import javax.xml.bind.annotation.*;
import java.util.*;

/**
 * User: nawaraj
 * Date: 5/23/11
 */

@XmlRootElement(name = "employees")
public class EmployeeList {

  private int count;
  private List<Employee> employees;

  public EmployeeList() {
  }

  public EmployeeList(List<Employee> employees) {
    this.employees = employees;
    this.count = employees.size();
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @XmlElement(name = "employee")
  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

}
