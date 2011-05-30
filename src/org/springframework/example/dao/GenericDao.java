package org.springframework.example.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zephyr
 * Date: May 8, 2011
 * Time: 2:48:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDao<T> {
    List<T> getAll();
    T findById(Long id);
}
