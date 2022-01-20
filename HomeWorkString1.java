package com.company.lection3;

import java.util.Scanner;

public class HomeWorkString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuffer revers = new StringBuffer(word).reverse();
        String wordRevers = revers.toString();
        if (word.equalsIgnoreCase(wordRevers)){
            System.out.println(word+" is a palindrome.");
        }
        else{
            System.out.println(word+" is not a palindrome.");
        }
    }
}
