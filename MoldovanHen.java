package com.company.lection5.homework;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" My country: Moldova. I made: "+getCountOfEggsPerMonth()+" eggs per month.";
    }
}
