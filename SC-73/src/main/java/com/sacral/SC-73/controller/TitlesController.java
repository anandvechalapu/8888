package com.sacral.SC-73.controller;

import com.sacral.SC-73.service.TitlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitlesController {

    @Autowired
    TitlesService titlesService;

    @GetMapping("/titles/title")
    public Titles findByTitle(@RequestParam String title) {
        return titlesService.findByTitle(title);
    }

    @GetMapping("/titles/barcode")
    public Titles findByBarcode(@RequestParam String barcode) {
        return titlesService.findByBarcode(barcode);
    }

    @GetMapping("/titles/publicationCode")
    public Titles findByPublicationCode(@RequestParam String publicationCode) {
        return titlesService.findByPublicationCode(publicationCode);
    }

    @GetMapping("/titles/onSaleDate")
    public String getOnSaleDate() {
        return titlesService.getOnSaleDate();
    }

    @GetMapping("/titles/barcode")
    public String getBarcode() {
        return titlesService.getBarcode();
    }

    @GetMapping("/titles/rrp")
    public float getRRP() {
        return titlesService.getRRP();
    }

    @GetMapping("/titles/vatRate")
    public float getVatRate() {
        return titlesService.getVatRate();
    }

    @GetMapping("/titles/reset")
    public void resetTitle() {
        titlesService.resetTitle();
    }

    @GetMapping("/titles/price")
    public float checkCurrentPublicationPrice() {
        return titlesService.checkCurrentPublicationPrice();
    }

    @GetMapping("/titles/supplyQuantity")
    public void requestSupplyQuantity(@RequestParam int quantity) {
        titlesService.requestSupplyQuantity(quantity);
    }
}