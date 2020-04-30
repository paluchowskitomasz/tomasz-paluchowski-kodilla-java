package com.kodilla.challenges.myAllegro;

import java.util.Objects;

public class Seller {

    private String sellerFirstName;
    private String sellerLastName;
    private String sellerPesel;

    public Seller(String sellerFirstName, String sellerLastName, String sellerPesel) {
        this.sellerFirstName = sellerFirstName;
        this.sellerLastName = sellerLastName;
        this.sellerPesel = sellerPesel;
    }

   public String getSellerFirstName() {

        return sellerFirstName;
    }

    public String getSellerLastName() {
        return sellerLastName;
    }

    public String getSellerPesel() {
        return sellerPesel;
    }

}
