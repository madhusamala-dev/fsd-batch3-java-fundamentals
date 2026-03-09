package com.java.fundamentals;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        //Arithmetic Operators
        /*
        integer (/) integer -> int
        integer (/) real -> double
        real (/) integer -> double
        real (/) real -> double
         */
        System.out.println(10 + 20.0); //30
        System.out.println(10 - 20.0); //-10
        System.out.println(10 * 20.0); //200
        System.out.println(10 / 20.0); //0 not 0.5
        System.out.println(10 % 20.0);

        //Operator Precedence
        /*
         * / and % have higher precedence than + and -
         */
        int res = 10 + 20 - 30 * 40 / 50 % 60;

        System.out.println(res);

        //compound assignment operators
        int salary = 2342342;
        salary += 10000;
        System.out.println(salary);

        //increment and decrement operators
        //++ and --
        //Pre-increment and Post-increment
        //Pre-decrement and Post-decrement

        int no = 10;
        System.out.println(++no);

        int no1 = 20;
        System.out.println(no1--);

        //1. calcuate student total marks and average marks
        //2. Product ( maxRetailPrice, discountPercentage)
        //3. calcuate product discount amount
        //4. Price after discount
        //5. final price => based on the tax ( centralTax 2.5%, stateTax 2.5%)

        /*
        1000, 10.0
        100.0
        900.0
        900 * 2.5% = 22.5 centralTax
        900 * 2.5% = 22.5 stateTax
        final Price = 900 + 22.5 + 22.5 = 1050
         */

        //Logical Operators & Relational operators

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter Membership :");
        char membership = sc.next().charAt(0);


        System.out.println(membership == 'G' || age >= 50);




    }
}
