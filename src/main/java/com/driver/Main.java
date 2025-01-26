package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an object of the Product class
        Product p = new Product();

        // Call the method to calculate the product of 2 integers
        System.out.println("Product of 2 integers: " + p.product(4, 5));

        // Call the method to calculate the product of 3 integers
        System.out.println("Product of 3 integers: " + p.product(2, 2, 10));

        // Call the method to calculate the product of 2 doubles
        System.out.println("Product of 2 doubles: " + p.product(5.5, 4.4));
    }
}