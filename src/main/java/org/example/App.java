/*
 *  UCF COP3330 Fall 2021 Assignment 1.20 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.text.NumberFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the order amount? "); //Asking for user input
        double order = x.nextDouble(); //Storing user input
        Scanner y = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        String state = y.nextLine();

        double tax = 0;
        double total = 0;
        double tax_total = 0;

        if(state.equals("Wisconsin")){
            System.out.println("What county do you live in? ");
            String county = y.nextLine();
            tax = 0.05;

            if (county.equals("Eau Claire")){
                tax = tax + 0.005;
            }
            if (county.equals("Dunn")){
                tax = tax + 0.004;
            }
            else{
                tax = tax;
            }
            tax_total = tax * order;
            order = order + tax_total;
        }

        else if(state.equals("Illinois")){
            tax = 0.08;
            tax_total = tax * order;
            order = order + tax_total;

        }

        double roundedtotal = Math.round(total * 100)/100.0; //rounding to the nearest penny
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Formats into currency

        System.out.println("The tax is " +currency.format(tax_total)+ ".\nThe total is " +currency.format(order)+ ".");
    }
}