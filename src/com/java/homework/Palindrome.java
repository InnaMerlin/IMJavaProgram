package com.java.homework;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = sc.nextLine();
        int length = original.length();
        int i;
        for (i = (length - 1); i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

    }
}
