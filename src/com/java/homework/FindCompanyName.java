package com.java.homework;

import java.util.Scanner;

//Write a java program to Find Company name from the given product
//   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
//   Possible Outputs = {google, facebook, microsoft}

public class FindCompanyName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of application to find the parent company: ");
        String product = sc.nextLine();

        switch (product) {
            case "gmail":
            case "Gmail":
            case "youtube":
            case "YouTube":
            case "Hangouts":
            case "hangouts":
                System.out.println("Google");
                break;
            case "whatsapp":
            case "WhatsApp":
                System.out.println("Facebook");
                break;
            case "Skype":
            case "skype":
            case "outlook":
            case "Outlook":
                System.out.println("Microsoft");
                break;
            default:
                System.out.println("Please check the spelling");
        }
    }
}
