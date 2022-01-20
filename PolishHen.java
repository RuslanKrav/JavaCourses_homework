package com.company.lection5.homework;

public class PolishHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 60;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" My country: Poland. I made: "+getCountOfEggsPerMonth()+" eggs per month.";
    }
}
