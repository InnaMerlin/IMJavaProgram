package com.java.class16;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        String str = "This is my java program";
        char c = 'a';
        int count = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);

    }
}
