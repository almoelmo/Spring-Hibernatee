package org.example.accounting.dao;

import org.example.accounting.model.Accounting;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface AccountingDao {
    Accounting findById(long id);
    void save(Accounting accounting);
    void update(Accounting accounting);
    void delete(Accounting accounting);
    List<Accounting> findAll();
}
