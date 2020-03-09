package com.kodilla.challenges.myAllegro;

import java.util.List;

public interface ProductRepoInterface {

    public void addSellerWithProductList(Seller seller, List<Product> productListSeller);
    public void removeSellerWithProductList(Seller seller, List<Product> productListSeller);
    public void showSellersAndTheirsProducts();

}
