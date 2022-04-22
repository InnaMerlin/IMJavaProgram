package com.java.homework;

import java.util.Scanner;

public class DivisibleFiveThree {
    public static void main(String[] args) {
        // Write a program to take number from user and check if it's divisible by 5 or 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to know if it's divisible by 5 or 3: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by 5 & 3");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else{
            System.out.println("Divisible neither by 5 nor by 3");

        }
    }
}