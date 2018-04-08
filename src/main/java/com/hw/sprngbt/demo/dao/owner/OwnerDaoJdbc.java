package com.hw.sprngbt.demo.dao.owner;

import com.hw.sprngbt.demo.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OwnerDaoJdbc implements OwnerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Owner getById(Long id) {
        List<Owner> owners = jdbcTemplate.query("SELECT * FROM owner WHERE id=?", new OwnerRowMapper(), id);
        if (owners.size() != 0) {
            return owners.get(0);
        }
        return null;
    }

    @Override
    public List<Owner> getAll() {
        return jdbcTemplate.query("SELECT * FROM owner", new OwnerRowMapper());
    }

    @Override
    public List<Owner> getAllByCompanyId(Long companyId) {
        return jdbcTemplate.query("SELECT * FROM owner WHERE companyId=?", new OwnerRowMapper(), companyId);
    }

    @Override
    public Owner insert(Owner owner) {
        int insert = jdbcTemplate.update(
                "INSERT INTO owner(id, companyId, firstName, secondName) VALUES (?, ?, ?, ?)",
                owner.getId(),
                owner.getCompanyId(),
                owner.getFirstName(),
                owner.getSecondName()
        );
        if (insert == 1) {
            return owner;
        }
        return null;
    }

    @Override
    public Owner update(Owner owner) {
        int update = jdbcTemplate.update(
                "UPDATE owner SET companyId=?, firstName=?, secondName=? WHERE id=?",
                owner.getCompanyId(),
                owner.getFirstName(),
                owner.getSecondName(),
                owner.getId()
        );
        if (update == 1) {
            return owner;
        }
        return null;
    }

}
