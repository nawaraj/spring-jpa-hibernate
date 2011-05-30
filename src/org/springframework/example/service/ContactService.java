package org.springframework.example.service;

import org.springframework.example.domain.Contact;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 2:48:19 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContactService {
    List<Contact> getAllContacts();
}
