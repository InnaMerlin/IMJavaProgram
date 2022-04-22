package com.java.class07;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 9 to get it in text format: ");
        int num = sc.nextInt();

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Please enter from 0-9");
        }
    }
}
