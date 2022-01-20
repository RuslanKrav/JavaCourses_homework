package com.company.lection3;

public class HomeWork4 {
    public static void main(String[] args) {
        String input = "test string";
        String fullInput = input.replaceAll("\\s","");
        String result = new String();
        char[] mass = fullInput.toCharArray();
        for (int i = 0; i < mass.length; i++){
           if (i % 2 == 0){
              result = result+mass[i];
           }
        }
        System.out.println(result);
    }
}
