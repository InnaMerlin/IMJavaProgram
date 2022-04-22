package com.java.class16;

import java.util.Scanner;

public class FindOccuranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any statement: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);

    }
}
