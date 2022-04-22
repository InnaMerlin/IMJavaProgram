package com.java.homework;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {

        // Write a program to take username and password from user and print appropriate message
        //based on below conditions
        //	1. If username correct and password correct ---> Login successful
        //	2. If username correct and password incorrect --> Invalid password
        //	3. If username incorrect and password correct --> Invalid username
        //	2. If username incorrect and password incorrect --> Login unsuccessful

        // String userName = "InnaMerlin";
        //   String passWord = "Newton2009";
        // Input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        System.out.println("Enter password: ");
        String passWord = sc.nextLine();
        String expUsername = "Devx", expPassword = "Spring2022";

        //Output
        // Approach 1
        if (userName == expUsername && passWord == expPassword) {
            System.out.println("Login successful");
        } else if (userName == expUsername && passWord != expPassword) {
            System.out.println("Invalid password");
        } else if (userName != expUsername && passWord == expPassword) {
            System.out.println("Invalid username");
        } else if (userName != expUsername && passWord != expPassword) {
            System.out.println("Login unsuccessful");

            // Approach 2
            if (userName == expUsername) {
                if (passWord == expPassword) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Invalid password");
                }
            } else if (passWord == expPassword) {
                System.out.println("Invalid username");
            } else {
                System.out.println("Login unsuccessful");
            }

            // Approach 3
            if (userName == expUsername) {
                if (passWord == expPassword) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                if (passWord == expPassword) {
                    System.out.println("Invalid username");
                } else {
                    System.out.println("Login unsuccessful");
                }
            }
        }
    }
}