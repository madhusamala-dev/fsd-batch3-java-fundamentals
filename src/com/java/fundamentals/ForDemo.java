package com.java.fundamentals;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scanner.nextInt();
        for(int number = 1; number <= n; number++){
            if(number % 2 != 0)
                System.out.println(number);
        }
    }
}
