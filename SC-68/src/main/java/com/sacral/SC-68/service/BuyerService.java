package com.sacral.SC-68.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SC-68.entity.Buyer;
import com.sacral.SC-68.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
	private BuyerRepository buyerRepository;
	
	public Buyer findByAccountNumber(String accountNumber) {
		return buyerRepository.findByAccountNumber(accountNumber);
	}
	
	public Buyer findByLoginId(String loginId) {
		return buyerRepository.findByLoginId(loginId);
	}
	
	public Buyer findByRetailerName(String retailerName) {
		return buyerRepository.findByRetailerName(retailerName);
	}
	
	public Buyer findByEmailAddress(String emailAddress) {
		return buyerRepository.findByEmailAddress(emailAddress);
	}
	
	public Buyer findByFirstNameAndLastName(String firstName, String lastName) {
		return buyerRepository.findByFirstNameAndLastName(firstName, lastName);
	}
	
	public Buyer save(Buyer buyer) {
		return buyerRepository.save(buyer);
	}
	
	public void delete(Buyer buyer) {
		buyerRepository.delete(buyer);
	}
	
	public List<Buyer> findAll(){
		return buyerRepository.findAll();
	}
	
}