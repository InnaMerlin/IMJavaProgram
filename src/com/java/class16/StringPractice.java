package com.java.class16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter any String:");
            String str = sc.nextLine();
            for (int i = str.length()-1; i>=0; i--) {
                System.out.print(str.charAt(i));

        }
    }
}