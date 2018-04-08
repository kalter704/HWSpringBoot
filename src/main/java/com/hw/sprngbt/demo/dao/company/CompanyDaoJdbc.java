package com.hw.sprngbt.demo.dao.company;

import com.hw.sprngbt.demo.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyDaoJdbc implements CompanyDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Company getById(Long id) {
        List<Company> companies = jdbcTemplate.query("SELECT * FROM company WHERE id=?", new CompanyRowMapper(), id);
        if (companies.size() != 0) {
            return companies.get(0);
        }
        return null;
    }

    @Override
    public List<Company> getAll() {
        return jdbcTemplate.query("SELECT * FROM company", new CompanyRowMapper());
    }

    @Override
    public Company insert(Company company) {
        int insert = jdbcTemplate.update(
                "INSERT INTO company(id, title) VALUES (?, ?)",
                company.getId(),
                company.getTitle()
        );
        if (insert == 1) {
            return company;
        }
        return null;
    }

    @Override
    public Company update(Company company) {
        int update = jdbcTemplate.update(
                "UPDATE company SET title=? WHERE id=?",
                company.getTitle(),
                company.getId()
        );
        if (update == 1) {
            return company;
        }
        return null;
    }
}
