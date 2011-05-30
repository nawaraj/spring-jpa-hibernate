/* Copyright (c) 2006 celumsolutions. All Rights Reserved. */
package org.springframework.example.domain;

import javax.persistence.*;
import java.util.*;

/**
 * User: nawaraj
 * Date: 5/2/11
 */
@Entity
@Table(name = "users")
@NamedQueries(
    @NamedQuery(name = "findAll", query = "select p from Principal p where p.enabled = false")
)
public class Principal {
  /*@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer Id;*/
  @Id
  private String username;
  private String password;
  private Boolean enabled;
  private ROLE role;

 /* public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }*/

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Enumerated(EnumType.STRING)
  @Column(name = "role")
  public ROLE getRole() {
    return role;
  }

  public void setRole(ROLE role) {
    this.role = role;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
}