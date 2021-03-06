package com.tryCatch1;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map <String, Integer> cart;

    public Cart() {
        cart = new HashMap<String, Integer>();
    }
    public void addToCart(String product, int numberOfItemsToAdd){
        Integer numberOfItemsInCart = cart.get(product);
        if(numberOfItemsInCart != null){
            if(numberOfItemsInCart > 0){
                cart.replace(product, numberOfItemsToAdd + numberOfItemsInCart);
            } else {
                System.out.println("puttting: " + product);
                cart.put(product, numberOfItemsToAdd);

            }
        } else {
            cart.put(product, numberOfItemsToAdd);
        }
    }

    public void substractToCart(String products, int numberToTakeOut){
        // Get the number of this product in the cart
        Integer numberOfItemsInCart = cart.get(products);
        if(numberOfItemsInCart != null){
            if(numberOfItemsInCart > numberToTakeOut) {
                cart.replace(products, numberOfItemsInCart - numberToTakeOut);
            } else {
                cart.remove(products);
            }
        }
    }

    public int getNumberOfProduct(String product){
        if(cart.containsKey(product)) {
            return cart.get(product);
        }

        return 0;
    }
}
