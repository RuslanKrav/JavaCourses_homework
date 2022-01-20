package com.company.lection5.homework;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" My country: Russia. I made: "+getCountOfEggsPerMonth()+" eggs per month.";
    }
}
