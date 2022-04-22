package com.java.class08;

// Take single char in the program & check weather given char is vowel or not
// Vowel char are: a, e, i, o, u
public class CheckCharisVowel {
    public static void main(String[] args) {
        char c = 'b';

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        }else{
            System.out.println("Not Vowel");
        }

    }
}
