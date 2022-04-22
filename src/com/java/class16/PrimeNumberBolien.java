package com.java.class16;

import java.util.Scanner;

public class PrimeNumberBolien {
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
