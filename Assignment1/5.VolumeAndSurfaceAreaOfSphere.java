// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 1
// Program 5: Floating-Point Operations
// Purpose: Recall the volume and surface area of a sphere

import java.util.Scanner;
public class FloatingPointOperations
{
	public static void main(String[] args)
	{



		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of a sphere:  "); // Input Radius.
		double radius = input.nextDouble(); // Save Radius
		System.out.println();

		//calculate result

		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);  // Find Volume. (4/3)
		double surfacearea = 4.0 * Math.PI * Math.pow(radius, 2) ;  // Find Surface area


		// Dispaly results
		System.out.println("Sphere radius :" + radius );
		System.out.println("Volume :" + (int)( volume * 100) / 100.0);
		System.out.println("Surface area :" + (int)( surfacearea * 100) / 100.0);

	}
}


