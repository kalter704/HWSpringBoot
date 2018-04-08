package com.hw.sprngbt.demo.service;

import com.hw.sprngbt.demo.dao.account.AccountDao;
import com.hw.sprngbt.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    AccountDao accountDao;

    public Account save(Account account) {
        if (accountDao.getById(account.getId()) != null) {
            return accountDao.update(account);
        } else {
            return accountDao.insert(account);
        }
    }

    public Account getById(Long id) {
        return accountDao.getById(id);
    }

    public List<Account> getAll() {
        return accountDao.getAll();
    }

    public List<Account> getAllByOwnerId(Long ownerId) {
        return accountDao.getAllByOwnerId(ownerId);
    }

}
