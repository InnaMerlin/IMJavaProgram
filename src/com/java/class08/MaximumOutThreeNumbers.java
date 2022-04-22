package com.java.class08;

import java.util.Scanner;

// Take three numbers from user and print maximum number out of three numbers
public class MaximumOutThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the greatest number out of them.");
        System.out.println("First number: ");
        int num1 = sc.nextInt();
        System.out.println("Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Third number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1>num3) {
            System.out.println(num1 + " is greatest");
        }else if(num2>num3) {
            System.out.println(num2 + " is greatest");
        }else{
            System.out.println(num3 + " is greatest");
        }


    }
}
