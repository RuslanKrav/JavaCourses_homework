package com.company.lection9.homework;

public class WeekdayRunner {
    public static void main(String[] args) {
        Weekday[] days = Weekday.values();
        for (Weekday wd  : days){
            if (wd.isHoliday() == true){
            System.out.println(wd + " is Holiday");}
            else {
                System.out.println(wd + " is Weekday");
            }
        }
    }
}
