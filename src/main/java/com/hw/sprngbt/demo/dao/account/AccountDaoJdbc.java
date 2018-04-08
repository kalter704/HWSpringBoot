package com.hw.sprngbt.demo.dao.account;

import com.hw.sprngbt.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDaoJdbc implements AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Account getById(Long id) {
        List<Account> accounts = jdbcTemplate.query("SELECT * FROM account WHERE id=?", new AccountRowMapper(), id);
        if (accounts.size() != 0) {
            return accounts.get(0);
        }
        return null;
    }

    @Override
    public List<Account> getAll() {
        return jdbcTemplate.query("SELECT * FROM account", new AccountRowMapper());
    }

    @Override
    public List<Account> getAllByOwnerId(Long ownerId) {
        return jdbcTemplate.query("SELECT * FROM account WHERE ownerId=?", new AccountRowMapper(), ownerId);
    }

    @Override
    public Account insert(Account account) {
        int insert = jdbcTemplate.update(
                "INSERT INTO account(id, ownerId, name, rate) VALUES (?, ?, ?, ?);",
                account.getId(),
                account.getOwnerId(),
                account.getName(),
                account.getRate()
        );
        if (insert == 1) {
            return account;
        }
        return null;
    }

    @Override
    public Account update(Account account) {
        int update = jdbcTemplate.update(
                "UPDATE account SET ownerId=?, name=?, rate=? WHERE id=?",
                account.getOwnerId(),
                account.getName(),
                account.getRate(),
                account.getId()
        );
        if (update == 1) {
            return account;
        }
        return null;
    }
}
