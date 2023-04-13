package com.sacral.SC-72.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SC-72.model.Account;
import com.sacral.SC-72.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    
    @Autowired
    private AccountService accountService;

    @GetMapping("/name/{name}")
    public Optional<Account> getAccountByName(@PathVariable String name) {
        return accountService.findByName(name);
    }

    @GetMapping("/email/{email}")
    public Optional<Account> getAccountByEmail(@PathVariable String email) {
        return accountService.findByEmail(email);
    }

    @GetMapping("/phone/{phoneNumber}")
    public Optional<Account> getAccountByPhoneNumber(@PathVariable String phoneNumber) {
        return accountService.findByPhoneNumber(phoneNumber);
    }

    @GetMapping("/accountNumber/{accountNumber}")
    public Optional<Account> getAccountByAccountNumber(@PathVariable String accountNumber) {
        return accountService.findByAccountNumber(accountNumber);
    }

    @PutMapping("/update")
    public void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }

    @PostMapping("/delete/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.delete(id);
    }

    @PutMapping("/logout")
    public void logOut() {
        accountService.logOut();
    }
}