package com.testing123.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testing123.model.Wholesalers;
import com.testing123.service.WholesalersService;

@RestController
@RequestMapping("/wholesalers")
@CrossOrigin(origins = "http://localhost:4200")
public class WholesalersController {
  
  @Autowired
  private WholesalersService wholesalersService;
  
  @GetMapping
  public List<Wholesalers> getAllWholesalers(){
    return wholesalersService.getAllWholesalers();
  }
  
  @GetMapping("/{id}")
  public Wholesalers getWholesalersById(@PathVariable Long id) {
    return wholesalersService.getWholesalersById(id);
  }
  
  @GetMapping("/name")
  public List<Wholesalers> getWholesalersByName(@RequestParam String name){
    return wholesalersService.getWholesalersByName(name);
  }
  
  @GetMapping("/number")
  public List<Wholesalers> getWholesalersByNumber(@RequestParam Long number) {
    return wholesalersService.getWholesalersByNumber(number);
  }
  
  @GetMapping("/type")
  public List<Wholesalers> getWholesalersByType(@RequestParam String type) {
    return wholesalersService.getWholesalersByType(type);
  }
  
  @GetMapping("/contactName")
  public List<Wholesalers> getWholesalersByContactName(@RequestParam String contactName) {
    return wholesalersService.getWholesalersByContactName(contactName);
  }
  
  @GetMapping("/emailAddress")
  public List<Wholesalers> getWholesalersByEmailAddress(@RequestParam String emailAddress) {
    return wholesalersService.getWholesalersByEmailAddress(emailAddress);
  }
  
  @GetMapping("/active")
  public List<Wholesalers> getWholesalersByActive(@RequestParam Boolean active) {
    return wholesalersService.getWholesalersByActive(active);
  }
  
  @GetMapping("/dateCreated")
  public List<Wholesalers> getWholesalersByDateCreated(@RequestParam Date dateCreated) {
    return wholesalersService.getWholesalersByDateCreated(dateCreated);
  }
  
  @GetMapping("/lastModified")
  public List<Wholesalers> getWholesalersByLastModified(@RequestParam Date lastModified) {
    return wholesalersService.getWholesalersByLastModified(lastModified);
  }
  
  @PostMapping
  public void saveWholesalers(@RequestBody Wholesalers wholesalers) {
    wholesalersService.saveWholesalers(wholesalers);
  }
  
  @DeleteMapping
  public void deleteWholesalers(@RequestBody Wholesalers wholesalers) {
    wholesalersService.deleteWholesalers(wholesalers);
  }
  
  @GetMapping("/download")
  public List<Wholesalers> downloadWholesalersAsCSV() {
    return wholesalersService