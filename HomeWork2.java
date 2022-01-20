package com.company.lection2;

import java.util.Scanner;

public class HomeWork2
{
    public static void main(String[] args) {
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<=3;i++){
        String name = scanner.next();
        if (name.equalsIgnoreCase("Троллейбус")) {
            System.out.println("Правильно!");
            break;
        }
        else if (name.equalsIgnoreCase("Сдаюсь")){
            System.out.println("Правильный ответ: Троллейбус");
            break;
        }
        else if(i==3){
            System.out.println("Попытки закончились.");
        }
        else{
                System.out.println("Подумайте ещё...");
            }
        }
    }
}
