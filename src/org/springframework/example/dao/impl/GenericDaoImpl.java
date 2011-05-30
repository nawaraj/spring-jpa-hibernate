package org.springframework.example.dao.impl;

import org.springframework.example.dao.GenericDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 2:51:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class GenericDaoImpl<T> /*extends HibernateDaoSupport*/ implements GenericDao<T>{
    Class<T> entitiClass;
    List<T> contacts = new ArrayList<T>(0);
    public GenericDaoImpl(){
        //TODO set the class
        //this.entitiClass = ;
    }
    @Override
    public List<T> getAll() {
        return contacts;/*getHibernateTemplate().loadAll(entitiClass);*/  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T findById(Long id) {
        return contacts.get(0); /*getHibernateTemplate().load(this.entitiClass, id);*/  //To change body of implemented methods use File | Settings | File Templates.
    }
}
