package com.company.lection6.homework;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        System.out.print("Input a Celsium temperature: ");
        Scanner scanner = new Scanner(System.in);
        int inputCelsium = scanner.nextInt();
        System.out.println("Fahrenheit: "+convertFahrenheit(inputCelsium));
        System.out.println("Calvin: "+convertCalvin(inputCelsium));
    }
    public static double convertFahrenheit(int inputCelsium){
        double toFahrenheit = (inputCelsium * 1.8) + 32;
        return toFahrenheit;
    }
    public static double convertCalvin(int inputCelsium){
        double toCalvin = inputCelsium + 273.15;
        return toCalvin;
    }
}
