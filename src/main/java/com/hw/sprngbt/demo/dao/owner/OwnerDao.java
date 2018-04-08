package com.hw.sprngbt.demo.dao.owner;

import com.hw.sprngbt.demo.dao.Dao;
import com.hw.sprngbt.demo.domain.Owner;

import java.util.List;

public interface OwnerDao extends Dao<Owner> {

    List<Owner> getAllByCompanyId(Long companyId);

}
