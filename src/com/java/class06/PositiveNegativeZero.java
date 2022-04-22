package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("This number is positive");
        } else if (num < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This is zero");
        }
    }
}
