package com.driver; // Ensure this matches the directory structure

public class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Product of 2 integers: " + p.product(5, 4));
        System.out.println("Product of 3 integers: " + p.product(5, 4, 2));
        System.out.println("Product of 2 doubles: " + p.product(5.5, 4.4));
    }
}
