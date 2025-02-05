package com.driver;

public class Main { 
    public class Product { 
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
        Main outer = new Main(); 
        Product p = outer.new Product(); 

        // पद्धती कॉल करणे
        System.out.println(p.product(4, 5)); 
        System.out.println(p.product(4, 5, 6)); 
        System.out.println(p.product(4.0, 5.0)); 
    }
}
