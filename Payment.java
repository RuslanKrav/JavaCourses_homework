package com.company.lection8.homework;
import java.io.IOException;
import java.util.Scanner;

public class Payment {
    private String name;
    private Product [] productArray;
    private int price;
    private class Product {
        private String productName;
        private int productPrice;
        public Product() {
            super(); productName = "";
            productPrice = 0;
        }

        public Product(String productName, int productPrice) {
            super();
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public String getProductName() {
            return this.productName;
        }
        public int getProductPrice() {
            return this.productPrice;
        }
    }

    public Payment() {
        super();
        this.name = "";
        this.price = 0;
    }

    public Payment(String name) {
        super();
        this.name = name;
    }

    public void setPayment() throws IOException {
        this.price = 0;
        System.out.print("Set a count of products would you want to buy: ");
        Scanner setCount = new Scanner(System.in);
        int count = setCount.nextInt();
        productArray = new Product[count];
        for(int i = 0; i < count; i++) {
            System.out.println("Product " + (i+1) + ": ");
            System.out.print("Name: ");
            String prodName = setCount.next();
            System.out.print("Price: ");
            int prodPrice = setCount.nextInt();
            productArray[i] = new Product(prodName, prodPrice);
            this.price = this.price + productArray[i].productPrice;
        }
    }

    public void printCheck() throws IOException {
        try {
            if(this.productArray.length != 0) {
                System.out.println(" " + this.name);
                for(int i = 0; i < this.productArray.length; i++)
                {
                    System.out.printf("%3d", i+1); System.out.printf("%15s",
                        this.productArray[i].productName); System.out.printf("%10d",
                        this.productArray[i].productPrice); System.out.println();
                }
                System.out.print("Full price: ");
                System.out.printf("%11d", this.price);
                System.out.println();
            }
            else {
                System.out.println(); System.out.println("Unidentified array");
            }
        }
        catch(NullPointerException e) {
            System.out.println(); System.out.println("Unidentified array");
        }
    }
}