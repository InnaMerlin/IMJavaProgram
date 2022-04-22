package com.java.homework;

public class Factorial {
    public static void main(String[] args) {
        int i, factorial = 1;
        for (i = 1; i <=5; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
