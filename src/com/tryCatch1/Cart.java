package com.tryCatch1;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map < Products, Integer> cart;

    public Cart() {
        cart = new HashMap<Products, Integer>();
    }
    public void addToCart(Products product, int numberOfItams){
        cart.put(product, numberOfItams);
    }

    public int getNumberOfProduct(Products product){
        return cart.get(product);
    }
}
