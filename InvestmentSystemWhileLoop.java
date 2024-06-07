/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question5;

/**
 *
 * @author EK
 */
import java.util.Scanner;

public class InvestmentSystemWhileLoop {
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
        int i = 0;
        while (i < years) {
            totalAmount *= (1 + interestRate / 100);
            i++;
        }

        System.out.println("Total investment value after " + years + " years: " + totalAmount);
    }
}
