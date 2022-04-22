package com.java.homework;

import java.util.Scanner;

public class ScannerYear {
    public static void main(String[] args) {

        System.out.println("Enter any year");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 4 == 0) {
            System.out.println("It is a Leap Year");
        }else {
            System.out.println("It not is a Leap Year");
        }
    }
}
