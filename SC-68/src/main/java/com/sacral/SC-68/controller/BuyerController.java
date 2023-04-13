package com.sacral.SC-68.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SC-68.entity.Buyer;
import com.sacral.SC-68.service.BuyerService;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;
	
	@GetMapping("/account/{accountNumber}")
	public Buyer findByAccountNumber(@PathVariable String accountNumber) {
		return buyerService.findByAccountNumber(accountNumber);
	}
	
	@GetMapping("/login/{loginId}")
	public Buyer findByLoginId(@PathVariable String loginId) {
		return buyerService.findByLoginId(loginId);
	}
	
	@GetMapping("/retailer/{retailerName}")
	public Buyer findByRetailerName(@PathVariable String retailerName) {
		return buyerService.findByRetailerName(retailerName);
	}
	
	@GetMapping("/email/{emailAddress}")
	public Buyer findByEmailAddress(@PathVariable String emailAddress) {
		return buyerService.findByEmailAddress(emailAddress);
	}
	
	@GetMapping("/name/{firstName}/{lastName}")
	public Buyer findByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
		return buyerService.findByFirstNameAndLastName(firstName, lastName);
	}
	
	@PostMapping
	public Buyer save(@RequestBody Buyer buyer) {
		return buyerService.save(buyer);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Buyer buyer) {
		buyerService.delete(buyer);
	}
	
	@GetMapping
	public List<Buyer> findAll(){
		return buyerService.findAll();
	}
	
}