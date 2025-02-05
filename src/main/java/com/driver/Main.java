package com.driver;

public class Main { // मुख्य वर्ग
    public static class Product { // स्थिर उपवर्ग
        public int product(int x, int y) { // दोन पूर्णांकांचा गुणाकार
            return x * y;
        }
        public int product(int x, int y, int z) { // तीन पूर्णांकांचा गुणाकार
            return x * y * z;
        }
        public double product(double x, double y) { // दोन दशांश संख्या गुणाकार
            return x * y;
        }
    }

    public static void main(String[] args) { // मुख्य पद्धत
        Product p = new Product(); // Product वर्गाचा ऑब्जेक्ट तयार

        // पद्धती कॉल करणे
        System.out.println(p.product(4, 5)); // गुणाकार 4 आणि 5 -> 20
        System.out.println(p.product(4, 5, 6)); // गुणाकार 4, 5 आणि 6 -> 120
        System.out.println(p.product(4.0, 5.0)); // गुणाकार 4.0 आणि 5.0 -> 20.0
    }
}
