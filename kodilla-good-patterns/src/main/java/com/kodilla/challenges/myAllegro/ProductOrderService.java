package com.kodilla.challenges.myAllegro;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Seller seller, final Product product) {
        System.out.println("Buying products by: " + user.getUserName() + "" + user.getUserLastName() +
                "\n Seller: " + seller.getSellerFirstName() + " " + seller.getSellerLastName() +
                "\n Products: " + product.getProductName() + " Quantity: " + product.getProductQuantity());

         return true;
    }

}
