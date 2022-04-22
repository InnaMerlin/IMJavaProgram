package com.java.class07;

// Take a num from user and print discount value based on price

import java.util.Scanner;

//less than 100 then print - No Discount
// //less than 500 then print - 5%
//less than 1000 then print - 10%
//more than 1000 then print - 15%
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the price");
        int num = sc.nextInt();
        if (num < 100) {
            System.out.println("No Discount");
        } else if (num < 500) {
            System.out.println(num * 0.95);
        } else if (num < 1000) {
            System.out.println(num * 0.90);
        } else if (num > 1000) {
            System.out.println(num * 0.85);
        }
    }
}