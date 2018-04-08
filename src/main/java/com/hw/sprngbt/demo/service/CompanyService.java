package com.hw.sprngbt.demo.service;

import com.hw.sprngbt.demo.dao.company.CompanyDao;
import com.hw.sprngbt.demo.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyService {

    @Autowired
    CompanyDao companyDao;

    public Company save(Company company) {
        if (companyDao.getById(company.getId()) != null) {
            return companyDao.update(company);
        } else {
            return companyDao.insert(company);
        }
    }

    public Company getById(Long id) {
        return companyDao.getById(id);
    }

    public List<Company> getAll() {
        return companyDao.getAll();
    }

}
