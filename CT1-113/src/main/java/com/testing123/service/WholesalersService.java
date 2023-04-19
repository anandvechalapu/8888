@Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.dateCreated = :dateCreated")
    Wholesalers findByNameAndDateCreated(@Param("name") String name, @Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.lastModified = :lastModified")
    Wholesalers findByNameAndLastModified(@Param("name") String name, @Param("lastModified") Date lastModified);
}

package com.testing123.service;

import com.testing123.repository.WholesalersRepository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WholesalersService {
   
    @Autowired
    private WholesalersRepository wholesalersRepository;
    
    public Wholesalers getWholesalersByName(String name) {
        return wholesalersRepository.findByName(name);
    }
    
    public Wholesalers getWholesalersByNumber(String number) {
        return wholesalersRepository.findByNumber(number);
    }
    
    public Wholesalers getWholesalersByType(String type) {
        return wholesalersRepository.findByType(type);
    }
    
    public Wholesalers getWholesalersByContactName(String contactName) {
        return wholesalersRepository.findByContactName(contactName);
    }
    
    public Wholesalers getWholesalersByEmailAddress(String emailAddress) {
        return wholesalersRepository.findByEmailAddress(emailAddress);
    }
    
    public Wholesalers getWholesalersByActive(Boolean active) {
        return wholesalersRepository.findByActive(active);
    }
    
    public Wholesalers getWholesalersByDateCreated(Date dateCreated) {
        return wholesalersRepository.findByDateCreated(dateCreated);
    }
    
    public Wholesalers getWholesalersByLastModified(Date lastModified) {
        return wholesalersRepository.findByLastModified(lastModified);
    }
    
    public Wholesalers getWholesalersByNameAndNumber(String name, String number) {
        return wholesalersRepository.findByNameAndNumber(name, number);
    }
    
    public Wholesalers getWholesalersByNameAndType(String name, String type) {
        return wholesalersRepository.findByNameAndType(name, type);
    }
    
    public Wholesalers getWholesalersByNameAndContactName(String name, String contactName) {
        return wholesalersRepository.findByNameAndContactName(name, contactName);
    }
    
    public Wholesalers getWholesalersByNameAndEmailAddress(String name, String emailAddress) {
        return wholesalersRepository.findByNameAndEmailAddress(name, emailAddress);
    }
    
    public Wholesalers getWholesalersByNameAndActive(String name, Boolean active) {
        return wholesalersRepository.findByNameAndActive(name, active);
    }
    
    public Wholesalers getWholesalersByNameAndDateCreated(String name, Date dateCreated) {
        return wholesalersRepository.findByNameAndDateCreated(name, dateCreated);
    }
    
    public Wholesalers getWholesalersByNameAndLastModified(String name, Date lastModified) {
        return wholesalersRepository.findByNameAndLastModified(name, lastModified);
    }
    
    public void accessWholesalersFunctionality() {
        // Access the Wholesalers functionality
    }
    
    public void accessSubScreens() {
        // Access the sub screens like edit, view and download
    }
    
    public void downloadBranchesAsCSVFile() {
        // Download the branches as format of .csv file
    }
    
    public void findSubFunctionalities() {
