package com.company.lection8.homework;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class Notepad {
    public Notepad() {
    }

    static void run(){
        Record.fillMap();
        Record.print();
    }

    private static class Record {
        private static HashMap<Date, HashMap<Integer, Record>> notepads = new HashMap<>();
        private String name;
        private String description;

        Record(String name, String description) {
            this.name = name;
            this.description = description;
        }

        static void print() {
            for (Entry<Date, HashMap<Integer, Record>> i: notepads.entrySet()) {
                System.out.println("Date: " + i.getKey());
                for (Entry<Integer, Record> ii: i.getValue().entrySet()) {
                    System.out.println("id = " + ii.getKey() + ", Record: " + ii.getValue().toString());
                }
            }
        }

        static void fillMap() {
            Date currentDate = new Date();
            HashMap<Integer,Record> innerMap = fillInnerMap();
            notepads.put(currentDate, innerMap);
        }

        private static HashMap<Integer, Record> fillInnerMap() {
            HashMap<Integer, Record> innerMap = new HashMap<>();
            return innerMap;
        }

        @Override
        public String toString() {
            return "[name= " + name + ", description= " + description + "]";
        }
    }
}
