package com.java.homework;

import java.util.Scanner;

public class SizeInInches {

    public static void main(String[] args) {

        //2.  Write a program to get T-shirt size in inches and print size based on inches
        //If inches is 27 to 30 Print XS
        //If inches is 31 to 34 Print S
        //If inches is 35 to 38 Print L
        //If inches is 39 to 42 Print XL
        //If inches is 45 to 50 Print XXL

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size in inches to know your T-shirt size: ");
        int inchSize = sc.nextInt();
        if (inchSize > 26 && inchSize < 31) {
            System.out.println("XS");
        } else if (inchSize > 30 && inchSize < 35) {
            System.out.println("S");
        } else if (inchSize > 34 && inchSize < 39) {
            System.out.println("L");
        } else if (inchSize > 38 && inchSize < 43) {
            System.out.println("XL");
        } else if (inchSize > 44 && inchSize < 51) {
            System.out.println("XXL");
        }
    }
}
