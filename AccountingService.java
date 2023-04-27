package org.example.accounting.service;

import org.example.accounting.dao.AccountingDao;
import org.example.accounting.dao.AccountingDaoHibernate;
import org.example.accounting.dao.AccountingDaoJdbc;
import org.example.accounting.model.Accounting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AccountingService {

    private AccountingDao dao = new AccountingDaoJdbc();

    public Accounting findAccountingById(long id) {
        return dao.findById(id);
    }

    public void saveAccounting(Accounting accounting) {
        dao.save(accounting);
    }

    public void deleteAccounting(Accounting accounting) {
        dao.delete(accounting);
    }

    public void updateAccounting(Accounting accounting) {
        dao.update(accounting);
    }

    public List<Accounting> findAllAccountings() {
        return dao.findAll();
    }
}
