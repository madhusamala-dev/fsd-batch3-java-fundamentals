package com.java.fundamentals;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Subject1 Marks : ");
        int subject1Marks = scanner.nextInt();
        System.out.println("Enter Subject2 Marks : ");
        int subject2Marks = scanner.nextInt();
        System.out.println("Enter Subject3 Marks : ");
        int subject3Marks = scanner.nextInt();
        System.out.println("Enter Subject4 Marks : ");
        int subject4Marks = scanner.nextInt();
        System.out.println("Enter Subject5 Marks : ");
        int subject5Marks = scanner.nextInt();
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;
        System.out.println("Total Marks : " + totalMarks);

        int average = totalMarks / 5;
        System.out.println("Average Marks : " + average);
        //> 70 -> A
        //60 to 70 -> B
        //50 to 60 -> C
        //40 to 50 -> D
        //below 40 -> F
        if(average >= 70) {
            System.out.println("Grade : A");
        } else if(average >= 60) {
            System.out.println("Grade : B");
        } else if(average >= 50) {
            System.out.println("Grade : C");
        } else if(average >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }

    }
}
