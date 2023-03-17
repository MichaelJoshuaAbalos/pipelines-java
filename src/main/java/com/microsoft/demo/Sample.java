package com.microsoft.demo;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 100;

        for (int i = 1; i <= a; i++) {
            if (i%2 == 0) {
                System.out.println(i + " is an even number" + "\n");
            } else {
                System.out.println(i + " is an odd number" + "\n");
            }
            
        }

    }
    
}
