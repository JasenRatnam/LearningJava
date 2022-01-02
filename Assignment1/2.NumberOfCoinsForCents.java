// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 1
// Program 2: Integer Division
/* Purpose: Prompt a user for a positive number of cents and convert to dollars,
             quarters, dimes, nickels, and pennies.*/

import java.util.Scanner;
public class IntegerDivision
{
	public static void main(String[] args)

	{
		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter change in cents:  ");  // Input change in cents.
		int cents = input.nextInt(); // Save change in cents
		System.out.println();

		//calculate total amount coins


		int numToonies = cents/200;  // Find amount of Toonies
		int centsLeft = cents%200;   // Used for next calculation

		int numLoonies = centsLeft/100; // Find amount of Loonies
		centsLeft = centsLeft%100;   // Used for next calculation

		int numQuarters = centsLeft/25; // Find amount of Quarters
		centsLeft = centsLeft%25;   // Used for next calculation

		int numDimes = centsLeft/10; // Find amount of Dimes
		centsLeft = centsLeft%10;  // Used for next calculation

		int numNickels = centsLeft/5; // Find amount of Nickels
		centsLeft = centsLeft%5;  // Find amount of Cents
		int total = numToonies + numLoonies + numQuarters + numDimes + numNickels + centsLeft;
		// Find amount of total coins.

		// Dispaly results

		 System.out.println("A minimum of " + total + " coins to make change for "+ cents + " cents");
		 System.out.println("Toonies = " + numToonies);
		 System.out.println("Loonies = " + numLoonies);
		 System.out.println("Quarters = " + numQuarters);
		 System.out.println("Dimes = " + numDimes);
      	 System.out.println("Nickels = " + numNickels);
      	 System.out.println("pennies = " + centsLeft);



	}
}


