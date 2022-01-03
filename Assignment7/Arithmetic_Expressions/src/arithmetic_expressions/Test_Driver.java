/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic_expressions;

import java.util.Scanner;

/**
 * Calculate infix expressions with integer operands.
 * Using only one of / % * + - binary operators in the expressions.
 * this is the driver for the expression class.
 * Assignment 4
 * Date : 2017-05-01
 * @author Jasen Ratnam
 */
public class Test_Driver 
{

    /**
     * Run the program.
     * Gives the rules to respect to run the program.
     * Reads the input from the user and saves it.
     * If the user enters "bye", the program breaks and stops.
     * Else, evaluate the expression and return the answer. 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner keyboardScan = new Scanner(System.in);
        System.out.println("This program calculate infix expressions with integer operands");
        System.out.println("Use only one of / % * + - binary operators in our expressions");
        System.out.println("Enter bye to quit");
        
        Expression expr = new Expression(); // expr = 0
        while (true)
        {
            System.out.print("? ");
            String infix = keyboardScan.nextLine();
            if(infix.equalsIgnoreCase("bye"))
            {
                break;
            }
            expr.reset(infix);
            Integer result = expr.eval();
            System.out.println(": " + expr + "\n= " + result); 
        }
    }
    
}