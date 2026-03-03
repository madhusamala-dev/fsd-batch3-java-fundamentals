package com.java.fundamentals;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Discount Percentage :");
        byte discountPercentage;
        discountPercentage = scanner.nextByte();
        System.out.println("Enter Manufactured Year: ");
        short manufacturedYear = scanner.nextShort();
        System.out.println("Enter Max Retail Price : ");
        int maxRetailPrice = scanner.nextInt();
        System.out.println("Total Order Value: ");
        long totalOrderValue = scanner.nextLong();
        System.out.println("Enter Average Rating: ");
        float averageRating = scanner.nextFloat();
        System.out.println("Enter Average Price :");
        double averagePrice = scanner.nextDouble();
        System.out.println("Enter Membership : ");
        char membership = scanner.next().charAt(0);
        System.out.println("Is Product Available");
        boolean isAvailable = scanner.nextBoolean();

        System.out.println("Product Name : " + name);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Manufactured Year: " + manufacturedYear);
        System.out.println("Max Retail Price : " + maxRetailPrice);
        System.out.println("Total Ordered Value: " + totalOrderValue);
        System.out.println("Average Rating: " + averageRating);
        System.out.println("Average Price : " + averagePrice);
        System.out.println("Membership : " + membership);
        System.out.println("Is Product In stock : " + isAvailable);
        scanner.close();
    }
}
