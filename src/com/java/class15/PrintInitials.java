package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
      /*  System.out.println("Enter your full name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        System.out.println(words[0].substring(0,1));
        System.out.println(words[1].substring(0,1));
        System.out.println(words[2].substring(0,1));*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = sc.nextLine();
        String[] names = fullName.split(" ");
        System.out.println("Your initials is:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].charAt(0) + ".");


        }
    }
}