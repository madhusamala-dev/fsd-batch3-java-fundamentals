package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
        byte age; // age is variable ( variable declaration)
        age = 34;
        System.out.println(age);
        System.out.println("Age : " + age);
        /*  ctrl + shift + /*/

        /*short currentYear = 2026;
        short manufacturedYear = 2024;
        */
        short currentYear, manufacturedYear;
        currentYear = 2026;
        manufacturedYear = 2024;
       /* System.out.println("Current Year : " + currentYear);
        System.out.println("Manufactured Year: " + manufacturedYear);*/
        System.out.println("Current Year : " + currentYear + " , Manufactured year: " + manufacturedYear);

        int salary, annualIncome;
        salary = 2342323;
        annualIncome = 324252323;
        System.out.println("My Monthly Salary : " + salary + " and Annual Income : " + annualIncome);

        long companyAnnualIncome, countryGdp;
        companyAnnualIncome = 2342342342323243L;
        countryGdp = 2342342342342342343L;

        System.out.println("Company Annual Income : " + companyAnnualIncome +" , My Country GDP : " + countryGdp);

        //Real Numbers
        float discountPercentage;
        discountPercentage = 6.5F;
        double averagePrice;
        averagePrice = 234234.324;
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Average Price : " + averagePrice);

        char gender, membership;
        gender = 'M'; //maps to ascii code 77
        membership = 'G'; //maps to ascii code 71

        System.out.println("Gender : " + gender);
        System.out.println("Membership: " + membership);

        char ch = 97; //allowed since directly assigning ascii code
        System.out.println(ch);

        char ch1 = 1;
        char ch2 = '1';
        System.out.println(ch1);
        System.out.println(ch2);

        boolean isLoggedIn; //true/false ( BUSY, MEETING, AWAY, AVAILABLE)
        isLoggedIn = true;
    }
}
