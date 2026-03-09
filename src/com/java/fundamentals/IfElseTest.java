package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        boolean isStockAvailable = true;
        if(isStockAvailable){
            System.out.println("Product is available");
        }
        System.out.println("hello");
        /*else {
            System.out.println("Product is not available");
        }*/

    }
}
