package com.tryCatch1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Products> vendor1 = new ArrayList<Products>();
        ArrayList<Products> vendor2 = new ArrayList<Products>();
        ArrayList<Products> vendor3 = new ArrayList<Products>();

        // Create a array list that contains the vendors
        ArrayList<ArrayList<Products>> vendorList = new ArrayList<ArrayList<Products>>();
        vendorList.add(vendor1);
        vendorList.add(vendor2);
        vendorList.add(vendor3);

        Products soap = new Products("Soap", "One bar of soap", 1.50d, 2);
        Products broom = new Products("Broom", "One bristle broom", 9.50d);
        Products bucket = new Products("Bucket", "One metal bucket", 12d, 7);
        Products cup = new Products("Cup", "10 pack of cups", 4d);
        Products phone = new Products("Phone", "one landline phone", 40d);
        Products[] productList1 = {soap, broom, bucket, phone, cup};

        for (Products product : productList1) {
            if (product.getQuanity() > 0) {
                vendor1.add(product);
                System.out.println(product.toString());
            }
        }

        Products marker = new Products("Marker", "Magic Marker", 3d);
        Products pen = new Products("Pen", "12 ball point pens", 6.5d, 3);
        Products pencil = new Products("Pencil", "number 2 pencil, 10 pack", 5.45d);
        Products table = new Products("Table", "one folding table", 45.5d);
        Products chair = new Products("Chair", "one folding chair", 19.99d);
        Products[] productList2 = {marker, pen, pencil, table, chair};
        for (Products product : productList2) {
            if (product.getQuanity() > 0) {
                vendor2.add(product);
                System.out.println(product.toString());
            }
        }
        Products shirt = new Products("Shirt", "button up shirt", 7.49d);
        Products pants = new Products("Pants", "old Dockers", 8.24d, 7);
        Products belt = new Products("Belt", "brown leather belt", 4.87d);
        Products shoes = new Products("Shoes", "beat up sperrys", 8d);
        Products hat = new Products("Hat", "90s revival bucket hat", 6.45d);
        Products[] productList3 = {shirt, pants, belt, shoes, hat};
        for (Products product : productList3) {
            if (product.getQuanity() > 0) {
                vendor3.add(product);
                System.out.println(product.toString());
            }

        }

        Cart myCart = new Cart();
        myCart.addToCart(pants, 2);
        System.out.println(myCart.getNumberOfProduct(pants));
    }
}
