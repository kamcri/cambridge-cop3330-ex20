/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is the order amount?");
        float orderAmount = sc.nextFloat();
        System.out.println("What state do you live in?");
        String state = sc2.nextLine();
        if (state.equals("Wisconsin") || state.equals("wisconsin"))
        {
            System.out.println("What county do you live in?");
            String county = sc2.nextLine();

            double tax = orderAmount * 0.05;

            if (county.equals("Eau Claire") || county.equals("eua claire"))
            {
                tax = tax + (0.005 * orderAmount);
                tax = Math.round(tax);
            }
            if(county.equals("Dunn") || county.equals("dunn"))
            {
                tax = tax + (0.004 * orderAmount);
                tax = Math.round(tax);
            }
            double total = orderAmount + tax;
            System.out.printf("The tax is $%.2f\n", tax);
            System.out.printf("The total is $%.2f\n", total);
        }
        else if (state.equals("Illinois") || state.equals("illinois"))
        {
            double tax = orderAmount * 0.08;
            double total = orderAmount + tax;
            System.out.printf("The tax is $%.2f\n", tax);
            System.out.printf("The total is $%.2f\n", total);
        }
        else
        {
            System.out.printf("The total is $%.2f", orderAmount);
        }
    }
}
