Ability to access the Wholesalers functionality.
               Ability to access the sub screens like edit, view and download.
               Ability to download the branches as format of .csv file
               User able to find the sub functionalities when he clicks user’s functionality.
               User able to access the sub functionalities like edit, view and download.
               If user has access then user able to access this page.
               If user didn’t have access then redirect to login page.
               User name should not be empty; username should be unique.
               Number should not be empty and should be number "/^\d+$/" and should be unique.
               Clicking on Download Data will allow User to view the results in Excel format.
               User have the option of filtering the data using the drop down menu
               Type - This drop down menu will allowing User to select the type User wish to add/edit.
               The Submit and Reset buttons are given on this screen.
               Once User have made User selections click on Submit it will add/edit the wholesaler, or click on Reset to reset the selections to the last search.

package com.testing123.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WholesalersRepository extends JpaRepository<Wholesalers, Long> {
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name")
    Wholesalers findByName(@Param("name") String name);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number")
    Wholesalers findByNumber(@Param("number") String number);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type")
    Wholesalers findByType(@Param("type") String type);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.contactName = :contactName")
    Wholesalers findByContactName(@Param("contactName") String contactName);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.emailAddress = :emailAddress")
    Wholesalers findByEmailAddress(@Param("emailAddress") String emailAddress);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.active = :active")
    Wholesalers findByActive(@Param("active") Boolean active);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.dateCreated = :dateCreated")
    Wholesalers findByDateCreated(@Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.lastModified = :lastModified")
    Wholesalers findByLastModified(@Param("lastModified") Date lastModified);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.number = :number")
    Wholesalers findByNameAndNumber(@Param("name") String name, @Param("number") String number);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.type = :type")
    Wholesalers findByNameAndType(@Param("name") String name, @Param("type") String type);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.contactName = :contactName")
    Wholesalers findByNameAndContactName(@Param("name") String name, @Param("contactName") String contactName);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.emailAddress = :emailAddress")
    Wholesalers findByNameAndEmailAddress(@Param("name") String name, @Param("emailAddress") String emailAddress);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.active = :active")
    Wholesalers findByNameAndActive(@Param("name") String name, @Param("active") Boolean active);
 
   