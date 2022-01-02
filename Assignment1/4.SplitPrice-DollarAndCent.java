// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 1
// Program 4: double to int Conversion
// Purpose: pratice type casting in Java.

import java.util.Scanner;
public class doubletointConversion
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a price: "); // Input Price
		double totalprice = input.nextDouble();  // Save Price

		System.out.println();


		//calculate result
		int dolors = (int) totalprice; //Find Dolors
		int cents = (int)(totalprice * 100)- (dolors * 100); // Find cents

		// Dispaly results
		System.out.println("The price is " + dolors + " dolors and " + cents + " cents" );

	}

}

