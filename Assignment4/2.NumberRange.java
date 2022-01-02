// Programer: Jasen Ratnam
// Date: 2016-10-04
// Assignment 3_A
// Program 2
/* Purpose: write a program that prompts the user to enter three integers,
            say, n, x, and y, and then prints the range of all integers
            starting at x and ending at y, n numbers per line*/

import java.util.Scanner;
public class  NumberRange
{
	public static void main(String[] args)
	{
		int countNum = 0;         // save total number of digits
		String order;             // save order
		int firstRange = 0;       // save inputed range 1 of user
		int secondRange = 0;      // save inputed range 2 of user
		int range1 = 0;           // final order of range 1
		int range2 = 0;           // final order of range 2
		int numLine = 0;          // save number of digits per line
		int x = 0;                // save number to be displayed in the loop
		int count = 0;            // save number of time loop is repeated
		String divider = "-----"; // divider for one value.


		Scanner input = new Scanner(System.in);
		System.out.println("Given two integers x and y in the range [-99, +99] and a" +    // explain program to user
		" positive\ninteger n, this program prints all integers from x through y,\nn" +
		" numbers per line. The program ends when the user enters a\nnegative value" +
		" or zero for n.");
		System.out.println();

		System.out.print("How many numbers per line? "); // prompt user for max numbers per line

		if (!input.hasNextInt()) // if inputed number per line value is not an int
		{
			String badInput = input.next();
			System.out.println("Error: invalid number per line value: " + badInput);
			System.out.println("Error: number per line value must be a positive integer.");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}
		else
		{
			numLine = input.nextInt();  // save number of digits per line.
		}

		while( numLine >= 0) //start loop
		{
			System.out.println();
			System.out.print("Enters two integers in the range [-99, +99]: "); // prompt user for a range of numbers.

			if (!input.hasNextInt()) // if inputed range value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid first range number: " + badInput);
				System.out.println("Error: first range number must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				firstRange = input.nextInt();  //save first inputed range number
			}

			if (!input.hasNextInt()) // if inputed range value is not an int
			{
				String badInput = input.next();
				System.out.println("Error: invalid second range number: " + badInput);
				System.out.println("Error: second range number must be a positive integer.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{
				secondRange = input.nextInt(); //save second inputed range number

			}

			if (firstRange < -99 || firstRange > 99 || secondRange > 99 || secondRange < -99 )
			{
				if (firstRange < -99 || firstRange > 99 ) // if number of first input is under -99 or over 99
				{
					System.out.println("Error: Your first number " + firstRange + " is out of range"); // show error message
				}

				if (secondRange > 99 || secondRange < -99) // if number of second input is over 99 or under -99
				{
					System.out.println("Error: Your second number " + secondRange + " is out of range"); // show error message
				}
			}

			else
			{

				if ( firstRange > secondRange) // if first input is bigger than the second
				{
					range1 = secondRange; // make the seconde input the first number of range
					range2 = firstRange;  // make the first input the second number of range
					order = "Decreasing"; // name order of number
				}

				else // if first input is smaller than the second
				{
					range1 = firstRange; //keep the first input as the first number of range
					range2 = secondRange;//keep the second input as the second number of range
					order = "Increasing";// name order of numbers
				}

				// claculate totale digits to display
				countNum = range2 - range1 + 1; //add 1 to toatal number of digits to display


				// display results
				System.out.println();
				System.out.println("Range:   [ " + range1 + ", " + range2 + " ]"); // display range of number with the lowest first.
				System.out.println("Size:    " + countNum);  // display total number of digits.
				System.out.println("Columns: " + numLine);   // display total number of numbers per line.
				System.out.println("Order:   " + order);     // display if number is increasing or decreasing.

				for (int y = 1; y <= numLine; y++)
				{
					System.out.printf("%s", divider); //print divider line

				}
				System.out.println();
				if(firstRange <= secondRange)
				{
					for (x = firstRange; x <= secondRange; x++) // start loop to display all digits.
					{
						System.out.printf("%4d ", x);           // display all digits
						++count;
						if( count % numLine == 0)               // change line after max number of digits per line
						System.out.println();

					}
					if( !(count % numLine == 0))
					{
						System.out.println();  //change line after max number per line
					}

				}
				else
				{
					for (x = firstRange; x >= secondRange; x--) // start loop to display all digits.
					{
						System.out.printf("%4d ", x);           // display all digits
						++count;
						if( count % numLine == 0)                // change line after max number of digits per line
						System.out.println();
					}
					if( !(count % numLine == 0))
					{
						System.out.println();                    //change line after max number per line
					}
				}

				for (int y = 1; y <= numLine; y++)
				{
					System.out.printf("%s", divider);   //print dividing line
				}
				System.out.println(); //leave space
				System.out.println(); //leave space

				System.out.print("How many numbers per line? "); // prompt user for max number  per line.

				if (!input.hasNextInt()) // if inputed number per line value is not an int
				{
					String badInput = input.next();
					System.out.println("Error: invalid number per line value: " + badInput);
					System.out.println("Error: number per line value must be a positive integer.");
					System.out.println("Try again later. Bye.");
					System.exit (1);

				}
				else
				{
					numLine = input.nextInt();  // save number of digits per line.
				}
			}
		}

		System.out.println("goodbye!"); // quit loop after user inputs a negative number per line.
		return;
	}
}