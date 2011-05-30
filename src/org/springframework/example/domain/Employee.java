/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * User: nawaraj
 * Date: 5/23/11
 */
@XmlRootElement(name="employee")
public class Employee {

	private long id;
	private String name;
	private String email;

	public Employee() {}

	public Employee(long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}