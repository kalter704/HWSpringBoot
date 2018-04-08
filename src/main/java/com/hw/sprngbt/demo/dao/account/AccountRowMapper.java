package com.hw.sprngbt.demo.dao.account;

import com.hw.sprngbt.demo.domain.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Account(
                resultSet.getLong("id"),
                resultSet.getLong("ownerId"),
                resultSet.getString("name"),
                resultSet.getDouble("rate")
        );
    }
}
