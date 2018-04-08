package com.hw.sprngbt.demo.service;

import com.hw.sprngbt.demo.dao.owner.OwnerDao;
import com.hw.sprngbt.demo.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OwnerService {

    @Autowired
    OwnerDao ownerDao;

    public List<Owner> getAll() {
        return ownerDao.getAll();
    }

    public Owner save(Owner owner) {
        if (ownerDao.getById(owner.getId()) != null) {
            return ownerDao.update(owner);
        } else {
            return ownerDao.insert(owner);
        }
    }

    public Owner getById(Long id) {
        return ownerDao.getById(id);
    }

    public List<Owner> getAllByCompanyId(Long companyId) {
        return ownerDao.getAllByCompanyId(companyId);
    }
}
