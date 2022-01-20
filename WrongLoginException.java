package com.company.lection10.homework;

public class WrongLoginException extends Exception {
    private String s;

    public WrongLoginException() {
        s = "Invalid login";
    }

    public WrongLoginException(String text) {
        super(text);
        s = text;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + s;
    }
}