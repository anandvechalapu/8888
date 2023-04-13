package com.sacral.SC-66.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SC-66.model.Order;
import com.sacral.SC-66.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/findByAccountNumber")
    public Order findByAccountNumber(@RequestParam String accountNumber) {
        return orderService.findByAccountNumber(accountNumber);
    }

    @GetMapping("/findByOrderReferenceNumber")
    public Order findByOrderReferenceNumber(@RequestParam String orderReferenceNumber) {
        return orderService.findByOrderReferenceNumber(orderReferenceNumber);
    }

    @GetMapping("/findByOrderDate")
    public Order findByOrderDate(@RequestParam String orderDate) {
        return orderService.findByOrderDate(orderDate);
    }

    @GetMapping("/findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail")
    public Order findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail(@RequestParam String fromDate,@RequestParam String toDate,@RequestParam String product,@RequestParam String country,@RequestParam String status,@RequestParam String exportDate,@RequestParam String exportNumber,@RequestParam String orderReference,@RequestParam String date,@RequestParam String time,@RequestParam String buyerIPAddress,@RequestParam String buyerName,@RequestParam String buyerEmail){
        return orderService.findByFromDateAndToDateAndProductAndCountryAndStatusAndExportDateAndExportNumberAndOrderReferenceAndDateAndTimeAndBuyerIPAddressAndBuyerNameAndBuyerEmail(fromDate,toDate,product,country,status,exportDate,exportNumber,orderReference,date,time,buyerIPAddress,buyerName,buyerEmail);
    }

    @PostMapping("/save")
    public void save(@RequestBody Order order) {
        orderService.save(order);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Order order) {
        orderService.delete(order);
    }

    @PostMapping("/deleteAll")
    public void deleteAll() {
        orderService.deleteAll();
    }

    @GetMapping("/findAll")
    public List<Order> findAll() {
        return orderService.findAll();
    }
}