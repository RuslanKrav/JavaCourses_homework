package com.company.lection7.homework;

import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {
        Users user1 = new Users("Slide", "Qwerty123");
        Scanner input = new Scanner(System.in);
        String getLog = user1.getLogin();
        String getPass = user1.getPassword();
        System.out.println("Input a login: ");
        String Username = input.nextLine();
        System.out.println("Input a password: ");
        String Password = input.nextLine();
        if(Username.equalsIgnoreCase(getLog) && Password.equals(getPass)){
            System.out.println("Successful login!");
        } else {
            System.out.println("Unknown login or password.");
        }
    }
}

class Users{
    private String Login;
    private String Password;

    public Users(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public void Login(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

