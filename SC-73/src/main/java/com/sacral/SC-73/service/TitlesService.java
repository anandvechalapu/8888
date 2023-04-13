package com.sacral.SC-73.service;

import com.sacral.SC-73.repository.TitlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitlesService {

    @Autowired
    TitlesRepository titlesRepository;

    public Titles findByTitle(String title) {
        return titlesRepository.findByTitle(title);
    }

    public Titles findByBarcode(String barcode) {
        return titlesRepository.findByBarcode(barcode);
    }

    public Titles findByPublicationCode(String publicationCode) {
        return titlesRepository.findByPublicationCode(publicationCode);
    }

    public String getOnSaleDate() {
        return titlesRepository.getOnSaleDate();
    }

    public String getBarcode() {
        return titlesRepository.getBarcode();
    }

    public float getRRP() {
        return titlesRepository.getRRP();
    }

    public float getVatRate() {
        return titlesRepository.getVatRate();
    }

    public void resetTitle() {
        titlesRepository.resetTitle();
    }

    public float checkCurrentPublicationPrice() {
        return titlesRepository.checkCurrentPublicationPrice();
    }

    public void requestSupplyQuantity(int quantity) {
        titlesRepository.requestSupplyQuantity(quantity);
    }
}