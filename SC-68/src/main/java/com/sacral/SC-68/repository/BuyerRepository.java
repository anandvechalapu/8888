package com.sacral.SC-68.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.SC-68.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
	
	@Query("SELECT b FROM Buyer b WHERE b.accountNumber = :accountNumber")
	public Buyer findByAccountNumber(String accountNumber);
	
	@Query("SELECT b FROM Buyer b WHERE b.loginId = :loginId")
	public Buyer findByLoginId(String loginId);
	
	@Query("SELECT b FROM Buyer b WHERE b.retailerName = :retailerName")
	public Buyer findByRetailerName(String retailerName);
	
	@Query("SELECT b FROM Buyer b WHERE b.emailAddress = :emailAddress")
	public Buyer findByEmailAddress(String emailAddress);
	
	@Query("SELECT b FROM Buyer b WHERE b.firstName = :firstName AND b.lastName = :lastName")
	public Buyer findByFirstNameAndLastName(String firstName, String lastName);
	
	public Buyer save(Buyer buyer);
	
	public void delete(Buyer buyer);
}