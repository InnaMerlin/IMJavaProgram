package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {
        // int i = 1; //initialization

        //    while(i<=5) { //condition
        //      System.out.println(i); //body
        //       i++; //increment / decrement

        for (int i = 1; i <= 10; i++) { //condition
            if (i % 2 == 0) {
                System.out.println(i); //body
            }

            for (int b = 2; i <= 10; i = i + 2) { //condition
                System.out.println(b); //body
            }
        }
    }
}