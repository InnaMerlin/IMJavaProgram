package com.java.class11;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print its table: ");
        int num = sc.nextInt();
        int i = 1;

        while (i*num <= num * 10) {
            System.out.println(i * num);
            i++;
        }
    }
}
