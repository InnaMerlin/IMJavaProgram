package com.java.class14;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";
        //1. We want to check equality of two Strings

        System.out.println("1. Equality " + str1.equals(str2));
        //2. We want to check equality of two Strings ignoring case
        System.out.println("1. Equality ignoring case " + str1.equalsIgnoreCase(str2));
        //3. Check one String contains another String

        // Contains will check
        System.out.println("3. Contains "+ str3.contains(str1));
        System.out.println(str3.toLowerCase());
        System.out.println(str2.toLowerCase());
        //System.out.println("3. Contains "+str3.toLowerCase.contains(str2.toLowerCase));
        //4. Changing the case of String
        System.out.println("4. Upper case " + str3.toUpperCase());
        System.out.println("4. Lower case " + str3.toLowerCase());

        //5. Find the index of charter
        System.out.println("5. Index of Char " + str1.indexOf('W') );
        System.out.println("5. Last Index of Char " + str3.lastIndexOf('W') );
        //6.Find character in index
        System.out.println("5. Index of Char " + str1.charAt(0) );

        //7. Length of String
        System.out.println("7. Length of String " + str1.length());
        System.out.println("7. Length of String " + str3.length());

        //8. Length of String

        str1 = "               ";
        str3 = "";
        System.out.println("8. Empty " + str1.isEmpty());
        System.out.println("8. Empty " + str3.isEmpty());
    }
}
