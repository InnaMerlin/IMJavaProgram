package com.java.homework;
import java.util.Scanner;
public class DaysInMonth {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your month to know the number of days");
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("January - 31 days");
        }else if (month == 2) {
            System.out.println("February - 28/29 days");
        }else if (month == 3) {
            System.out.println("March - 31 days");
        }else if (month == 4) {
            System.out.println("April - 30 days");
        }else if (month == 5) {
            System.out.println("May - 31 days");
        }else if (month == 6) {
            System.out.println("June - 30 days");
        }else if (month == 7) {
            System.out.println("July - 31 days");
        }else if (month == 8) {
            System.out.println("August - 31 days");
        }else if (month == 9) {
            System.out.println("September - 30 days");
        }else if (month == 10) {
            System.out.println("October - 31 days");
        }else if (month == 11) {
            System.out.println("November - 30 days");
        }else if (month == 12) {
            System.out.println("December - 31 days");
        }
    }
}