package com.java.homework;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {

        String userName = "InnaMerlin";
        String passWord = "Newton2009";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName1 = sc.nextLine();
        System.out.println("Enter password: ");
        String passWord1 = sc.nextLine();

        if (userName1.equals(userName) && passWord1.equals(passWord)) {
            System.out.println("Login successful");
        } else if (!userName1.equals(userName) && passWord1.equals(passWord)) {
            System.out.println("Invalid username");
        } else if (userName1.equals(userName) && !passWord1.equals(passWord)) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Login unsuccessful");


        }
    }

}