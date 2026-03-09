package com.java.fundamentals;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        char choice = 'Y';
        do{
            System.out.println(" Hey, Welcome to E-Commerce app");
        /*
        1. Men
        2. Women
        3. Kids
         */
            System.out.println("1. Men");
            System.out.println("2. Women");
            System.out.println("3. Kids");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select your category : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("You have selected Men category");
                    System.out.println("1. T-shirt");
                    System.out.println("2. Jeans");
                    System.out.println("3. Shoes");
                    System.out.println("Enter your category :");

                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("You have selected T-shirt");
                            break;
                        case 2:
                            System.out.println("You have selected Jeans");
                            break;
                        case 3:
                            System.out.println("You have selected Shoes");
                            break;
                        default:
                            System.out.println("Invalid Category");
                    }
                    break;
                case 2:
                    System.out.println("You have selected Women category");
                    break;
                case 3:
                    System.out.println("You have selected Kids category");
                    break;
                default:
                    System.out.println("Invalid Category");
            }

            System.out.println("Thank you for shopping with us");
            System.out.println("Do You want to continue shopping ? (Y/N)");
            choice = sc.next().charAt(0);
        } while(choice == 'Y');
    }
}
