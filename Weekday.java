package com.company.lection9.homework;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay(){
        if (this != SATURDAY || this != SUNDAY){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isHoliday(){
        if (this == SATURDAY || this == SUNDAY){
            return true;
        }
        else {
            return false;
        }
    }
}
