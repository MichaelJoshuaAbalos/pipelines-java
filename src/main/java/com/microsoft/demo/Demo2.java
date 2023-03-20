package com.microsoft.demo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("This is another file");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a message");
        String message = sc.nextLine();
        System.out.println(message);
    }
    
}
