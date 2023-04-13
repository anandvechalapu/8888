package com.sacral.SC-66.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.SC-66.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByAccountNumber(String accountNumber);
    Order findByOrderReferenceNumber(String orderReferenceNumber);
    Order findByOrderDate(String orderDate);
    Order findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail(String fromDate, String toDate, String product, String country, String status, String exportDate, String exportNumber, String orderReference, String date, String time, String buyerIPAddress, String buyerName, String buyerEmail);
    void save(Order order);
    void delete(Order order);
    void deleteAll();
}