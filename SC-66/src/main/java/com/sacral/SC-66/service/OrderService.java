package com.sacral.SC-66.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sacral.SC-66.model.Order;
import com.sacral.SC-66.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order findByAccountNumber(String accountNumber) {
        return orderRepository.findByAccountNumber(accountNumber);
    }

    public Order findByOrderReferenceNumber(String orderReferenceNumber) {
        return orderRepository.findByOrderReferenceNumber(orderReferenceNumber);
    }

    public Order findByOrderDate(String orderDate) {
        return orderRepository.findByOrderDate(orderDate);
    }

    public Order findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail(String fromDate,String toDate,String product,String country,String status,String exportDate,String exportNumber,String orderReference,String date,String time,String buyerIPAddress,String buyerName,String buyerEmail){
        return orderRepository.findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail(fromDate,toDate,product,country,status,exportDate,exportNumber,orderReference,date,time,buyerIPAddress,buyerName,buyerEmail);
    }

    public void save(Order order) {
        orderRepository.save(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }

    public void deleteAll() {
        orderRepository.deleteAll();
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}