// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 1
// Program 3: Integer Division, Again
/* Purpose: Write a Java program that inputs a ten-digit phone number,
            and then turns that ten-digit phone number into a more readable
            string.*/

import java.util.Scanner;
public class IntegerDivisionAgain
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 10-digit phone numbers:  ");  // Input phone number with no spaces.
		long tendigitphonenumber = input.nextLong(); // Save phone number with no spaces.
		System.out.println();

		//calculate result

		long area = tendigitphonenumber / 10000000; // Find area code
		//long restnumber = tendigitphonenumber % (10000000 * area); // Used for next calculation
		long restnumber = tendigitphonenumber % 10000000; // Used for next calculation
		long prefix = restnumber / 10000; // Find Prefix
		restnumber = restnumber % (10000 * prefix);// Used for next calculation
		long linenumber = restnumber; // Find line number

		// Dispaly results
		System.out.println("area code :" + area);
		System.out.println("prefix :" + prefix);
		System.out.println("line number:" + linenumber);
		System.out.println("phone number: (" + area + ") " + prefix + "-" + linenumber);

	}
}


/*
5417557500 / 10000000 => 541
5417557500 % 10000000 => 7557500


*/