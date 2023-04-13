@Repository
package com.sacral.SC-73.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitlesRepository extends JpaRepository<Titles, Long> {

    // Find Titles by Title
    Titles findByTitle(String title);

    // Find Titles by Barcode
    Titles findByBarcode(String barcode);

    // Find Titles by Publication Code
    Titles findByPublicationCode(String publicationCode);
    
    // Get On Sale Date
    String getOnSaleDate();

    // Get Barcode
    String getBarcode();

    // Get Recommended Retail Price
    float getRRP();

    // Get Vat Rate
    float getVatRate();

    // Reset Title
    void resetTitle();

    // Check Current Publication Price
    float checkCurrentPublicationPrice();

    // Request Supply Quantity
    void requestSupplyQuantity(int quantity);

}