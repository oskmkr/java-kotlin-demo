package com.example.javakotlindemo.app;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(sum(3,4), 2));

        final int a;
        a= 0;
        System.out.println(a);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

}
