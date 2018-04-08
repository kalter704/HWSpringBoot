package com.hw.sprngbt.demo.dao.account;

import com.hw.sprngbt.demo.dao.Dao;
import com.hw.sprngbt.demo.domain.Account;

import java.util.List;

public interface AccountDao extends Dao<Account> {

    List<Account> getAllByOwnerId(Long ownerId);

}
