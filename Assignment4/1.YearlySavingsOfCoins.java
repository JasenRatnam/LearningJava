// programer: Jasen Ratnam
// Date: 2016-10-03
// Assignment 3_A
// Program 1
/* Purpose: write a program to compute the total number of coins of each
            type and to estimate yearly savings based on the number of
            coins saved in n weeks*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class  YearlySavings
{
public static void main(String[] args)
	{

		final double VALUE_QUARTERS= 0.25;  //value of one quarter
		final double VALUE_DIMES = 0.10;    //value of one dime
		final double VALUE_NICKELS = 0.05;  //value of one nickel
		final double VALUE_PENNIES = 0.01;  //value of one pennie
		final int WEEK_IN_A_YEAR = 52;      //number of weeks in a year.
		int count = 0;                      //save number of time loop is repeated
		int quarters = 0;                   //save amount of quarters inputed for x week
		int dimes = 0;                      //save amount of dimes inputed for x week
		int nickels = 0;                    //save amount of nickels inputed for x week
		int pennies = 0;                    //save amount of pennies inputed for x week
		int totalQuarters = 0;              //save total amount of quarters for total week
		int totalDimes = 0;                 //save total amount of dimes for total week
		int totalNickels = 0;               //save total amount of nickels for total week
		int totalPennies = 0;               //save total amount of pennies for total week


		// describe program
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me your weekly savings of quarters (Q), dimes (D),\n nickels (N)," +
		" and pennies (p) and I estimate your yearly savings.");

		// prompt user
		System.out.println(); //skip line
		System.out.print("How many weeks of coins savings? "); //ask for number of week savings
		System.out.println(); // space

		if (!input.hasNextInt()) // if inputed week number is not an int
		{
			String badInput = input.next();
			System.out.println("Error: invalid weeks of coins savings: " + badInput);
			System.out.println("Error: week value must be a positive integer.");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}

		int weekNum = input.nextInt();  // save number of weeks.

		while( count < weekNum)// continue loop as long as cont number is smaller than weekNum
		{
			++count; // count number of time loop is repeated
			System.out.print("Enter week " + count + " savings of Q D N P: "); //ask for number of Q D N P saving in x week.

			if (!input.hasNextInt()) // if inputed quarter value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid quarter number: " + badInput);
				System.out.println("Error: quarter value must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				quarters = input.nextInt();//save inputed quarters value
			}

			if (!input.hasNextInt()) // if inputed dime value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid dime number: " + badInput);
				System.out.println("Error: dime value must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				dimes = input.nextInt();   //save inputed dimes value
			}
			if (!input.hasNextInt()) // if inputed nickel value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid nickel number: " + badInput);
				System.out.println("Error: nickel value must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				nickels = input.nextInt(); //save inputed nickels value
			}
			if (!input.hasNextInt()) // if inputed pennies value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid pennies number: " + badInput);
				System.out.println("Error: pennies value must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				pennies = input.nextInt(); //save inputed pennies value
			}

			totalQuarters += quarters; // add to total value of quarters
			totalDimes += dimes;       // add to total value of dimes
			totalNickels += nickels;   // add to total value of nickels
			totalPennies += pennies;   // add to total value of pennies
		}



		//Calculation
		double totalWeekSavings = ((totalQuarters * VALUE_QUARTERS) + (totalDimes * VALUE_DIMES) +
		                          (totalNickels * VALUE_NICKELS) +(totalPennies * VALUE_PENNIES)); // Calcualte & save total savings for number of weeks.

		double weekAvg = (totalWeekSavings/weekNum);  // Calcualte & save weekly average savings

		double yearAvg = (weekAvg * WEEK_IN_A_YEAR);     // Calcualte & save estimated yearly savings



		//display results
		String money = "$";
		System.out.println("Your " + weekNum + "-week coin savings");
		System.out.println("------------------------");
		System.out.printf("%-5d %-5s %n", totalQuarters, "quarters");
		System.out.printf("%-5d %-5s %n", totalDimes, "dimes");
		System.out.printf("%-5d %-5s %n", totalNickels, "nickels");
		System.out.printf("%-5d %-5s %n", totalPennies, "pennies");
		System.out.println("------------------------");
		DecimalFormat currency = new DecimalFormat("$0.00");
		System.out.printf("Total " + weekNum + "-week savings: %17s %n",currency.format(totalWeekSavings));
		System.out.printf("Weekly average savings: %15s %n", currency.format(weekAvg));
		//System.out.printf("Estimated yearly savings: %13s %n", currency.format(yearAvg));
		System.out.printf("Estimated yearly savings: $%.2f %n", yearAvg);
		System.out.println("Thank you for using my program !");
		return;
	}
}








