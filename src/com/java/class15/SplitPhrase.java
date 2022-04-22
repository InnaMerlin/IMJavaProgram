package com.java.class15;

public class SplitPhrase {
    public static void main(String[] args) {

        String str1 = "Don't worry Be happy";
        String[] words = str1.split(" ");
        System.out.println(words.length);
        for (int i = 0; i <= words.length; i++) {
            System.out.println(words[i]);
        }
    }

    }

