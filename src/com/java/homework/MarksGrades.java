package com.java.homework;

import java.util.Scanner;

public class MarksGrades {

    //Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
    //If marks are from 90 to 100 Print A
    //If marks are from 80 to 89 Print B
    //If marks are from 70 to 79 Print C
    //If marks are from 60 to 69 Print D
    //If marks are from 50 to 59 Print E
    //If marks are from 0 to 49 Print Fail

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark to get your grade: ");
        int mark = sc.nextInt();
        if (mark > 89 && mark < 101) {
            System.out.println("A");
        } else if (mark > 79 && mark < 90) {
            System.out.println("B");
        } else if (mark > 69 && mark < 80) {
            System.out.println("C");
        } else if (mark > 59 && mark < 70) {
            System.out.println("D");
        } else if (mark > 49 && mark < 60) {
            System.out.println("E");
        } else {
            System.out.println("Fail");


        }
    }
}
