/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question5;

/**
 *
 * @author EK
 */
import java.util.Scanner;

public class InvestmentSystemForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        int years = scanner.nextInt();

        scanner.close();

        double totalAmount = principal;
        for (int i = 0; i < years; i++) {
            totalAmount *= (1 + interestRate / 100);
        }

        System.out.println("Total investment value after " + years + " years: " + totalAmount);
    }
}

