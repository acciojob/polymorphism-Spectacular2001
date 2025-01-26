package com.driver;

public class Product {
    // Method to calculate the product of two integers
    public int product(int x, int y) {
        return x * y;
    }

    // Overloaded method to calculate the product of three integers
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Overloaded method to calculate the product of two doubles
    public double product(double x, double y) {
        return x * y;
    }
}