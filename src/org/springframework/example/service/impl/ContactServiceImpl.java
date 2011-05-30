package org.springframework.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.example.dao.ContactDao;
import org.springframework.example.dao.GenericDao;
import org.springframework.example.domain.Contact;
import org.springframework.example.service.ContactService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 2:57:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactServiceImpl implements ContactService{    @Autowired
    ContactDao contactDao;
    @Override
    public List<Contact> getAllContacts() {
        return contactDao.getAll();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
