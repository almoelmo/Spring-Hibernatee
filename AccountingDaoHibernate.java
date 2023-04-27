package org.example.accounting.dao;

import org.example.accounting.model.Accounting;
import org.example.accounting.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountingDaoHibernate implements AccountingDao{

    public Accounting findById(long id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Accounting.class, id);
    }

    public void save(Accounting accounting) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(accounting);
        tx1.commit();
        session.close();
    }

    public void update(Accounting accounting) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(accounting);
        tx1.commit();
        session.close();
    }

    public void delete(Accounting accounting) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(accounting);
        tx1.commit();
        session.close();
    }


    public List<Accounting> findAll() {
        return (List<Accounting>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from accounting").list();
    }
}
