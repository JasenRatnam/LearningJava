// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 2_A
// Program 1: UPC
/* Purpose: Write a Java program that Implements A UPC scanner
   using both strategies above for Stem 1 of the algorithm.*/

import java.util.Scanner;
public class UniversalProductCode
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter strategy number (1 or 2) :");  // Input strategy number.

		// Save files for futur reference

		int strategynum = input.nextInt(); // Save strategy number.
		int d0; // save digit # 1
		int d1; // save digit # 2
		int d2; // save digit # 3
		int d3; // save digit # 4
		int d4; // save digit # 5
		int d5; // save digit # 6
		int d6; // save digit # 7
		int d7; // save digit # 8
		int d8; // save digit # 9
		int d9; // save digit # 10
		int d10; // save digit # 11
		int d11; // save digit # 12
		long longBarcode; // save barcode in strategy 2
		long longBarcodeleft; // save rest of barcode during calculation
		String strBarcode;  // save barcode in stratgey 1
		int reald11; //save the real value of d11

	if(strategynum == 1) // strategy 1
		{
			System.out.println("Enter a 12-digit bar code: "); // Make the user input a 12-digit bar code.
			 strBarcode = input.next(); //save input

			if( strBarcode.length() != 12 ) // if the inputed string is longer then 12 digits:
			{
				System.out.println("Invalid character! A bar code consists of exactly 12 digits. ");
				System.out.println("Try again later. Bye.");
				System.exit (1);

			}
			else // if the inputed is 12 digits long:
			{

				char c0 = strBarcode.charAt(0); // extract the first character
				if ( c0 < '0' || c0 > '9') // if c0 is not a digit
				{
					System.out.println("Invalid character " + c0 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c0 is a digit character
				 d0 = c0 - '0'; // convert the digit character c0 to digit integer d0


				char c1 = strBarcode.charAt(1); // extract the second character
				if ( c1 < '0' || c1 > '9') // if c1 is not a digit
				{
					System.out.println("Invalid character " + c1 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c1 is a digit character
				 d1 = c1 - '0'; // convert the digit character c1 to digit integer d1


				char c2 = strBarcode.charAt(2); // extract the third character
				if ( c2 < '0' || c2 > '9') // if c2 is not a digit
				{
					System.out.println("Invalid character " + c2 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c2 is a digit character
				 d2 = c2 - '0'; // convert the digit character c2 to digit integer d2


				char c3 = strBarcode.charAt(3); // extract the fourth character
				if ( c3 < '0' || c3 > '9') // if c3 is not a digit
				{
					System.out.println("Invalid character " + c3 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c3 is a digit character
				 d3 = c3 - '0'; // convert the digit character c3 to digit integer d3


				char c4 = strBarcode.charAt(4); // extract the fifth character
				if ( c4 < '0' || c4 > '9') // if c4 is not a digit
				{
					System.out.println("Invalid character " + c4 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c4 is a digit character
				 d4 = c4 - '0'; // convert the digit character c4 to digit integer d4


				char c5 = strBarcode.charAt(5); // extract the sixth character
				if ( c5 < '0' || c5 > '9') // if c5 is not a digit
				{
					System.out.println("Invalid character " + c5 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c5 is a digit character
				 d5 = c5 - '0'; // convert the digit character c5 to digit integer d5



				char c6 = strBarcode.charAt(6); // extract the seventh character
				if ( c6 < '0' || c6 > '9') // if c6 is not a digit
				{
					System.out.println("Invalid character " + c6 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c6 is a digit character
				 d6 = c6 - '0'; // convert the digit character c6 to digit integer d6


				char c7 = strBarcode.charAt(7); // extract the eight character
				if ( c7 < '0' || c7 > '9') // if c7 is not a digit
				{
					System.out.println("Invalid character " + c7 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c7 is a digit character
				 d7 = c7 - '0'; // convert the digit character c7 to digit integer d7



				char c8 = strBarcode.charAt(8); // extract the nineth character
				if ( c8 < '0' || c8 > '9') // if c8 is not a digit
				{
					System.out.println("Invalid character " + c8 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c8 is a digit character
				 d8 = c8 - '0'; // convert the digit character c8 to digit integer d8



				char c9 = strBarcode.charAt(9); // extract the tenth character
				if ( c9 < '0' || c9 > '9') // if c9 is not a digit
				{
					System.out.println("Invalid character " + c9 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c9 is a digit character
				 d9 = c9 - '0'; // convert the digit character c9 to digit integer d9



				char c10 = strBarcode.charAt(10); // extract the eleventh character
				if ( c10 < '0' || c10 > '9') // if c10 is not a digit
				{
					System.out.println("Invalid character " + c10 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c10 is a digit character
				 d10 = c10 - '0'; // convert the digit character c10 to digit integer d10



				char c11 = strBarcode.charAt(11); // extract the last character
				if ( c11 < '0' || c11 > '9') // if c11 is not a digit
				{
					System.out.println("Invalid character " + c11 + " in " + strBarcode);
					System.out.println("A bar code consists of exactly 12 digits ");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				// if c11 is a digit character
				 d11 = c11 - '0'; // convert the digit character c11 to digit integer d11

				 // Display results
				 System.out.println();
				 System.out.println("Anatomy of Your UPC Bar Code");
				 System.out.println("==================================");
				 System.out.println("UPC                 : " + strBarcode);
				 System.out.println("NSC                 : " + d0);
				 System.out.println("Manufacturer Number : " + d1 + d2 + d3 + d4 + d5);
				 System.out.println("Product Code        : " + d6 + d7 + d8 + d9 + d10);
				 System.out.println("Family Code         : " + d6 + d7 + d8);
				 System.out.println("Value Code          : " + d9 + d10);
				 System.out.println("Scanned Check Digit : " + d10);
				 System.out.println("Computed Check Digit: " + d11);

				 // find real d11
				 int x = 3 * (d0 + d2 + d4 + d6 + d8 + d10) + (d1 + d3 + d5 + d7 + d9);
				 int y = x / 10;

				 if (y == 0)
				 {
					 reald11 = 0;
				}

				 else
				 {
					reald11 = (10 - y);
				 }
				 // display if d11 is valid or not
				 if (reald11 == d11)

				 	System.out.println("Validity status     : valid");


				 else

				 	System.out.println("Validity status     : invalid");


			}
		}

	else if(strategynum == 2)// strategy 2
		{
			System.out.println("Enter a 12-digit bar code: "); // Make the user input a 12-digit bar code.
			//make sure that the user has entered a number

			if (! input.hasNextLong())
			{
				// extract the bad bar code as a string : if user inputed letters.
				String badLongBarcode = input.next();
				System.out.println("Invalid bar code : " + badLongBarcode);
				System.out.println("A bar code consists of exactly 12 digits.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}
			else
			{

				// if we have a 12-digit bar code
				longBarcode = input.nextLong();

				// make sure longBarcode is positive
				if (  longBarcode < 0)
				{
					System.out.println("Invalid bar code.");
					System.out.println("A bar code has to be positive.");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
				/*// make sure longBarcode has no more than 12 digits.
				else if (  longBarcode / 10 == )
				{
					System.out.println("Invalid bar code.");
					System.out.println("A bar code consists of exactly 12 digits.");
					System.out.println("Try again later. Bye.");
					System.exit (1);
				}
*/

				// start extracting bar code's digits right to left

				d11 = (int) (longBarcode % 10);    	     // extract the rightmost digit/ digit #11.
				longBarcodeleft = longBarcode / 10 ;     // drop the rightmost digit

				d10 = (int) (longBarcodeleft % 10);      // extract the rightmost digit/ digit #10.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #10

				d9 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #9.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #9

				d8 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #8.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #8

				d7 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #7.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #7

				d6 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #6.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #6

				d5 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #5.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #5

				d4 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #4.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #4

				d3 = (int) (longBarcodeleft % 10); // extract the rightmost digit/ digit #3.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #3

				d2 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #2.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #2

				d1 = (int) (longBarcodeleft % 10);       // extract the rightmost digit/ digit #1.
				longBarcodeleft = longBarcodeleft / 10 ; // drop digit #1

				d0 = (int) (longBarcodeleft); 			 // extract the rightmost digit/ digit #0.


			    // Display results
			    System.out.println();
			    System.out.println("Anatomy of Your UPC Bar Code");
			    System.out.println("==================================");
			    System.out.println("UPC                 : " + longBarcode);
			    System.out.println("NSC                 : " + d0);
			    System.out.println("Manufacturer Number : " + d1 + d2 + d3 + d4 + d5);
			    System.out.println("Product Code        : " + d6 + d7 + d8 + d9 + d10);
			    System.out.println("Family Code         : " + d6 + d7 + d8);
			    System.out.println("Value Code          : " + d9 + d10);
			    System.out.println("Scanned Check Digit : " + d10);
			    System.out.println("Computed Check Digit: " + d11);

			    // find real d11
			    int x = 3 * (d0 + d2 + d4 + d6 + d8 + d10) + (d1 + d3 + d5 + d7 + d9);
			    int y = x / 10;

			    if (y == 0)
			    {
				    reald11 = 0;
			    }

			    else
			    {
					reald11 = (10 - y);
			    }

                // display if d11 is valid or not
			    if (reald11 == d11)
			    {
					System.out.println("Validity status     : valid");
			    }

			    else
			    {
					System.out.println("Validity status     : invalid");
			    }

			}
		}
			else
			{
				System.out.println("Invalid strategy number.");
				System.out.println("the strategy number as to be either 1 or 2.");
				System.out.println("Try again later. Bye.");
				System.exit (1);
			}


						 /*   // Display results
						    System.out.println();
						    System.out.println("Anatomy of Your UPC Bar Code");
						    System.out.println("==================================");
						    System.out.println("UPC                 : " + longBarcode);
						    System.out.println("NSC                 : " + d0);
						    System.out.println("Manufacturer Number : " + d1 + d2 + d3 + d4 + d5);
						    System.out.println("Product Code        : " + d6 + d7 + d8 + d9 + d10);
						    System.out.println("Family Code         : " + d6 + d7 + d8);
						    System.out.println("Value Code          : " + d9 + d10);
						    System.out.println("Scanned Check Digit : " + d10);
						    System.out.println("Computed Check Digit: " + d11);

						    // find real d11
						    int x = 3 * (d0 + d2 + d4 + d6 + d8 + d10) + (d1 + d3 + d5 + d7 + d9);
						    int y = x / 10;

						    if (y == 0)
						    {
							    reald11 = 0;
						    }

						    else
						    {
								reald11 = (10 - y);
						    }

			                // display if d11 is valid or not
						    if (reald11 == d11)
						    {
								System.out.println("Validity status     : valid");
						    }

						    else
						    {
								System.out.println("Validity status     : invalid");
			   				}*/

	}
}




