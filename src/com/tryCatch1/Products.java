package com.tryCatch1;

public class Products {
    private String name;
    private String description;
    private double price;
    private int quanity;

    public Products(String name, String description, double price, int quanity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quanity = quanity;
    }

    public Products(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quanity = 0;
    }



    public void myToString(){
        System.out.println("Product: " + this.name + " -> Price: " + this.price);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }
}
