package org.fasttrackit;

import java.util.Scanner;

public class CozaLozaWoza {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the limit number? ");
        int limitnr = scanner.nextInt();

        for (int i = 1; i <= limitnr; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }

}