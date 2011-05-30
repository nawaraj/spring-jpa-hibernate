package org.springframework.example.domain;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.xml.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 2:58:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "persons")
/*@NamedQueries(
        @NamedQuery(name = "findAllPerson", query = "select * from Pesrons p where p.deleted = false")
)*/
@XmlRootElement(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "deleted")
    private boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
