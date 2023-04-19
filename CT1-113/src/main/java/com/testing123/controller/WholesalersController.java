// Find the sub functionalities related to the Wholesalers
    }
}

package com.testing123.controller;

import com.testing123.model.Wholesalers;
import com.testing123.service.WholesalersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/wholesalers")
public class WholesalersController {

    @Autowired
    private WholesalersService wholesalersService;

    @GetMapping("/getByName")
    public Wholesalers getWholesalersByName(@RequestParam String name) {
        return wholesalersService.getWholesalersByName(name);
    }

    @GetMapping("/getByNumber")
    public Wholesalers getWholesalersByNumber(@RequestParam String number) {
        return wholesalersService.getWholesalersByNumber(number);
    }

    @GetMapping("/getByType")
    public Wholesalers getWholesalersByType(@RequestParam String type) {
        return wholesalersService.getWholesalersByType(type);
    }

    @GetMapping("/getByContactName")
    public Wholesalers getWholesalersByContactName(@RequestParam String contactName) {
        return wholesalersService.getWholesalersByContactName(contactName);
    }

    @GetMapping("/getByEmailAddress")
    public Wholesalers getWholesalersByEmailAddress(@RequestParam String emailAddress) {
        return wholesalersService.getWholesalersByEmailAddress(emailAddress);
    }

    @GetMapping("/getByActive")
    public Wholesalers getWholesalersByActive(@RequestParam Boolean active) {
        return wholesalersService.getWholesalersByActive(active);
    }

    @GetMapping("/getByDateCreated")
    public Wholesalers getWholesalersByDateCreated(@RequestParam Date dateCreated) {
        return wholesalersService.getWholesalersByDateCreated(dateCreated);
    }

    @GetMapping("/getByLastModified")
    public Wholesalers getWholesalersByLastModified(@RequestParam Date lastModified) {
        return wholesalersService.getWholesalersByLastModified(lastModified);
    }

    @GetMapping("/getByNameAndNumber")
    public Wholesalers getWholesalersByNameAndNumber(@RequestParam String name, @RequestParam String number) {
        return wholesalersService.getWholesalersByNameAndNumber(name, number);
    }

    @GetMapping("/getByNameAndType")
    public Wholesalers getWholesalersByNameAndType(@RequestParam String name, @RequestParam String type) {
        return wholesalersService.getWholesalersByNameAndType(name, type);
    }

    @GetMapping("/getByNameAndContactName")
    public Wholesalers getWholesalersByNameAndContactName(@RequestParam String name, @RequestParam String contactName) {
        return wholesalersService.getWholesalersByNameAndContactName(name, contactName);
    }

    @GetMapping("/getByNameAndEmailAddress")
    public Wholesalers getWholesalersByNameAndEmailAddress(@RequestParam String name, @RequestParam String emailAddress) {
        return wholesalersService.getWholesalersByNameAndEmailAddress(name, emailAddress);
    }

    @GetMapping("/getByNameAndActive")
    public Wholesalers getWholesalersByNameAndActive(@RequestParam String name, @RequestParam Boolean active) {
        return wholesalersService.getWholesalersByNameAndActive(name, active);
    }

   