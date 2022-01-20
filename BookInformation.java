package com.company.lection7.homework;

public class BookInformation {

    private static class Book{
        private String Name;
        private String Author;
        private String Publisher;
        private double Price;

        public Book(String Name, String Author, String Publisher, double Price) {
            this.Name = Name;
            this.Author = Author;
            this.Publisher = Publisher;
            this.Price = Price;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }

        public String getPublisher() {
            return Publisher;
        }

        public void setPublisher(String Publisher) {
            this.Publisher = Publisher;
        }

        public double getPrice() {
            if (Price >= 10) {
                return Price;
            }
            else {
                System.out.println(getName()+": Price must be over then or equals 10!");
            }
            return 10;
        }

        public void setPrice(double Price) {
            this.Price = Price;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Witcher", "Kipling", "Poland", 10);
        Book book2 = new Book("Garry Potter", "Oruell", "UK", 12);
        Book book3 = new Book("Idiot", "Dostoevskiy", "Russia", 8);
        String soutBook1 = book1.getName() + " " + book1.getAuthor() + " " + book1.getPublisher() + " " + book1.getPrice();
        String soutBook2 = book2.getName() + " " + book2.getAuthor() + " " + book2.getPublisher() + " " + book2.getPrice();
        String soutBook3 = book3.getName() + " " + book3.getAuthor() + " " + book3.getPublisher() + " " + book3.getPrice();
        System.out.println(soutBook1);
        System.out.println(soutBook2);
        System.out.println(soutBook3);
    }
}
