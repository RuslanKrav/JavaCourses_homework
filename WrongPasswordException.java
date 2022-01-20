package com.company.lection10.homework;

public class WrongPasswordException extends Exception {
    private String s;

    public WrongPasswordException() {
        s = "Invalid password!";
    }

    public WrongPasswordException(String text) {
        super(text);
        s = text;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + s;
    }
}