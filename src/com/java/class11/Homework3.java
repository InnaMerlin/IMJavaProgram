package com.java.class11;

public class Homework3 {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 50) {
            if (a % 3 != 0 && a % 7 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
