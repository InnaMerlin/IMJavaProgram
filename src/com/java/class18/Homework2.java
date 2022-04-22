package com.java.class18;

public class Homework2 {


    //Write a program to print all even numbers which are divisible by 6 from 1 to 50

    public static void main(String[] args) {

        for (int num = 1; num <= 50; num++) {
            if (evenDivisibleBy6(num) == true) {
                System.out.println(num);
            }

        }
    }

    static boolean evenDivisibleBy6(int i) {


               if (i % 2 == 0 &&  i % 6 == 0) {

            return true;
        } else {


        }
        return false;
    }
}







