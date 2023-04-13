// Generated Spring boot Entity/Model
package com.sacral.SC-73.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "titles")
public class Titles {

    private Long id;
    private String title;
    private String barcode;
    private String publicationCode;
    private String onSaleDate;
    private float rrp;
    private float vatRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getPublicationCode() {
        return publicationCode;
    }

    public void setPublicationCode(String publicationCode) {
        this.publicationCode = publicationCode;
    }

    public String getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(String onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public float getRRP() {
        return rrp;
    }

    public void setRRP(float rrp) {
        this.rrp = rrp;
    }

    public float getVatRate() {
        return vatRate;
    }

    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    // Reset Title
    public void resetTitle() {
        this.title = null;
    }

    // Check Current Publication Price
    public float checkCurrentPublicationPrice() {
        return this.rrp * (1 + this.vatRate);
    }

    // Request Supply Quantity
    public void requestSupplyQuantity(int quantity) {
        // TODO: Request supply quantity
    }
}