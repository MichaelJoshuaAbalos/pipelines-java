package com.microsoft.demo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("This is another file");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a message");
        String message = sc.nextLine();
        System.out.println(message);


        System.out.println("-----------------------");
        System.out.println("First 100 even numbers are: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
                if (i == 100)
            {
                System.out.println(i + ".");
            }
            }
            
        }

        sc.close();
    }
    
}
