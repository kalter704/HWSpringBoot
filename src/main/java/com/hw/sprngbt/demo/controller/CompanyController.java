package com.hw.sprngbt.demo.controller;

import com.hw.sprngbt.demo.domain.Company;
import com.hw.sprngbt.demo.domain.Owner;
import com.hw.sprngbt.demo.service.CompanyService;
import com.hw.sprngbt.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    OwnerService ownerService;

    @GetMapping("/all")
    public List<Company> findAll() {
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    public Company findById(@PathVariable("id") Long id) {
        return companyService.getById(id);
    }

    @PostMapping("/save")
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping("/{id}/owners")
    public List<Owner> findOwnersByCompanyId(@PathVariable("id") Long id) {
        return ownerService.getAllByCompanyId(id);
    }
}
