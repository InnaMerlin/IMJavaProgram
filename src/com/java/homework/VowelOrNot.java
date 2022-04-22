package com.java.homework;
import java.util.Scanner;
//Write a program to check given character is Vowel or Not
//   Vowel characters are - 'a','e','i','o','u'
//   (If you're not using scanner class it's fine you can directly take char value in program)
public class VowelOrNot {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any character to check if vowel or not");
        char c = reader.next().charAt(0);

        if (c == 'a') {
            System.out.println("Vowel");
        }else if (c == 'e') {
            System.out.println("Vowel");
        }else if (c == 'i') {
            System.out.println("Vowel");
        }else if (c == 'o') {
            System.out.println("Vowel");
        }else if (c == 'u') {
            System.out.println("Vowel");
        }else{

            System.out.println("Not vowel");

        }
    }
}