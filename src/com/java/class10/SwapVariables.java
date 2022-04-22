package com.java.class10;

public class SwapVariables{
    public static void main(String[] args) {
        int a=10, b=20;
int c;

        a=b-a;
        b=b-a;
        a=b+a;

        //a=c;
       // a=b;
        //b=c;

        a=a*b;
        b=a/b;
        a=a/b;


        System.out.println(a);
        System.out.println(b);
    }
}
