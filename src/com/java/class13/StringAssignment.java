package com.java.class13;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Tom";
        String str2 = "Tom";
        String str3 = sc.nextLine();

        if (str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("False");
        }if(str2==str3){
            System.out.println("str2==str3");
        } else {
            System.out.println("False");
        } if(str1.equals(str3)){
            System.out.println("str1.equals(str3)");
        } else {
            System.out.println("False");

        }
    }
}