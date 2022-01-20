package com.company.lection2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /* for (int a=1; a<=5;a++){
            System.out.print(a+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int i=5; i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        int t = 3;
        for (int b=1;b<=10;b++){
            int c = t*b;
            System.out.println("3 * "+ b +" = "+c); */

        /*System.out.println("Draw a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rslt = 0;
        int n = 0;
        for (int p = 1; p <= num; p++) {
            rslt = n += p;
        }
        System.out.println(rslt);*/

        /*int d = 7;
        int s = 0;
        for (int f=1;f<15;f++)
        {
            int rs = (s += d);
            System.out.print(rs +" ")
        }*/

        int s = 2;
        for (int f=0;f<10;f++)
        {
            int rs = (int) Math.pow(s, f);
            System.out.print(rs +" ");
        }
    }

}

