package com.company.lection5.homework;

public class UkrainianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }
    @Override
    String getDescription(){
     return super.getDescription()+" My country: Ukraine. I made: "+getCountOfEggsPerMonth()+" eggs per month.";
    }
}
