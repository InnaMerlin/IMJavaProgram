package com.java.class15;
import java.util.Scanner;
public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(length / 2));
        }else{
            System.out.println(str.substring(length / 2 +1));

        }
    }
}