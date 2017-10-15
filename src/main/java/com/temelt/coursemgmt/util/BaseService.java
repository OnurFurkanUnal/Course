/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.util;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */
public class BaseService {

    public Object save(Object object) {
        Session session = getSession();
        Transaction trans = session.beginTransaction();
        session.save(object);
        trans.commit();
        session.close();
        return object;
    }

    public Object update(Object object) {
        Session session = getSession();
        Transaction trans = session.beginTransaction();
        session.update(object);
        trans.commit();
        session.close();
        return object;
    }

    public Boolean delete(Object object) {
        Session session = getSession();
        Transaction trans = session.beginTransaction();
        session.delete(object);
        trans.commit();
        session.close();
        return Boolean.TRUE;
    }

    public List getAll(Class cls) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(cls);
        List list = criteria.list();
        session.close();
        return list;
    }

    public Session getSession() {
        return CourseHibernateUtil.getSessionFactory().openSession();
    }

}
