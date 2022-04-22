package com.java.class16;

import java.util.Scanner;

public class FindDivisor {

    // Find divisor of given number (Input - 6, output will be 1 2 3 6)
    //  Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();

        for (int divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}