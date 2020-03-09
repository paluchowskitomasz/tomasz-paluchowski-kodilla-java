package com.kodilla.challenges.myAllegro;

import java.util.Objects;

public class Seller {

    String sellerFirstName;
    String sellerLastName;
    String sellerPesel;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller that = (Seller) o;
        return Objects.equals(sellerPesel, that.sellerPesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerPesel);
    }

    @Override
    public String toString() {
        return "ProductOrderSeller{" +
                ", sellerFirstName='" + sellerFirstName + '\'' +
                ", sellerLastName='" + sellerLastName + '\'' +
                ", sellerPesel='" + sellerPesel + '\'' +
                '}';
    }
}
