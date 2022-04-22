package com.java.class18;
//Write a program to print all numbers from 1 to 50 which has more than 5 divisor

public class Homework1 {
    public static void main(String[] args) {

        for (int num = 1; num <= 50; num++) {
            if (moreFiveDivisors(num) == true) {
                System.out.println(num);
            }

        }
    }

    static boolean moreFiveDivisors(int i) {

        int count = 0;


        for (int divisor = 1; divisor <= i; divisor++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        if (count >= 6) {
            return true;
        } else {


        }
        return false;
    }
}





