package com.company.lection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork5 {
        public static void main(String[] args) {
            List < String > words = new ArrayList();
            words.add("rabbit");
            words.add("bribe");
            words.add("dog");
            System.out.print("The given strings are: ");
            for (int i = 0; i < words.size(); i++) {
                System.out.print(words.get(i) + " ");
            }
            Scanner scanner = new Scanner(System.in);
            String vvod = scanner.next();
            System.out.println("The given word is: " +vvod);
            System.out.println("The result strings: ");
            for (int j = 0; j < words.size(); j++) {
                containWords(words.get(j), vvod);
            }
        }
            static void containWords(String s1, String s2) {
                int check1 = 0;
                char check2 = ' ';
                int[] a = new int[Character.MAX_VALUE + 1];

                for (int i = 0; i < s1.length(); i++) {
                    check2 = s1.charAt(i);
                    ++a[check2];
                }
                for (int i = 0; i < s2.length(); i++) {
                    check2 = s2.charAt(i);
                    if (a[check2] >= 1)
                        check1 = 1;
                }
                if (check1 == 1)
                    System.out.println(s1);
            }
}
