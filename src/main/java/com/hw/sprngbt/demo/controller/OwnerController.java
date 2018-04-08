package com.hw.sprngbt.demo.controller;

import com.hw.sprngbt.demo.domain.Account;
import com.hw.sprngbt.demo.domain.Owner;
import com.hw.sprngbt.demo.service.AccountService;
import com.hw.sprngbt.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @Autowired
    AccountService accountService;

    @GetMapping("/all")
    public List<Owner> findAll() {
        return ownerService.getAll();
    }

    @GetMapping("/{id}")
    public Owner findById(@PathVariable("id") Long id) {
        return ownerService.getById(id);
    }

    @PostMapping("/save")
    public Owner save(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }

    @GetMapping("/{id}/accounts")
    public List<Account> findAccountsByOwnerId(@PathVariable("id") Long id) {
        return accountService.getAllByOwnerId(id);
    }
}
