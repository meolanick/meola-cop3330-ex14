/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int orderAmount;
        double subTotal;
        double tax;
        double total;

        System.out.println("What is the order amount?");
        orderAmount = scan.nextInt();

        System.out.println("What is the state?");
        String state = scan.next();

        subTotal = orderAmount;
        tax = 0.00;
        total = subTotal + tax;

        if( state.equals("WN"))
        {
            tax = orderAmount * 0.055;
            total = subTotal + tax;
            System.out.println("The subtotal is: $" + subTotal );
            System.out.println("The tax is: $" + tax );
            System.out.println("The total is: $" + total );
        }
        if( !state.equals("WN"))
        {
            System.out.println("The total is: $" + total);
        }

    }
}
