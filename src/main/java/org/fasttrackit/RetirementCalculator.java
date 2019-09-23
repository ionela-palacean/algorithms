package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {

        System.out.println("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();

        System.out.println("At what age would you like to retire? ");
        int retirementAge=scanner.nextInt();

        LocalDate currentDate=LocalDate.now();

       int remainingyears= retirementAge-age;

        System.out.println("You have  "+ remainingyears+" years left until retirement");
        System.out.println("It's"+currentDate.getYear()+" so you can retire in"+
                (currentDate.getYear()+remainingyears) );


    }
}
