// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 2_A
// Program 2: BMI
/* Purpose: Write a Java program that prompts the user to enter
the height and weight of a person, and then reports the BMI and
weight status of that person.*/

import java.util.Scanner;
public class BodyMassIndex
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a person's information: ");

		System.out.print("Height (in inches)?");  // Input the height of the subject
		double height = input.nextInt();
		if (height < 0)
			{
				System.out.println("Invalid value for height: " + height);
				System.out.println("You should enter a positive value.");
				System.out.println("Try again later.");
				System.out.println("goodbye.");
			}

		System.out.print("Weight (in pounds)?");  // Input the weight of the subject
		double weight = input.nextInt();
		if (weight < 0)
			{
				System.out.println("Invalid value for weight: " + weight);
				System.out.println("You should enter a positive value.");
				System.out.println("Try again later.");
				System.out.println("goodbye.");
			}

				System.out.println(); // leave space
				System.out.println(); // leave space

		//calculation
		double bmi = (703 * weight) / (height * height);

		// display result
		System.out.println("Body mass index: " + bmi);

		//weight status:
		if (bmi < 16.0)
			{
				System.out.println("Weight status: seriously Underweight");
			}

		else if ( bmi < 18.5)	  //if (16.0 <= bmi && bmi < 18.5)
			{
				System.out.println("Weight status: Underweight");
			}

		else if (bmi < 25.0)      //if (18.5 <= bmi && bmi < 25.0)
			{
				System.out.println("Weight status: Normal");
			}

		else if (bmi < 30.0)     //if (25.0 <= bmi && bmi < 30.0)
			{
				System.out.println("Weight status: Overweight");
			}

		else if (bmi < 35.0)     //if (30.0 <= bmi && bmi < 35.0)
			{
				System.out.println("Weight status: seriously Overerweight");
			}

		else                    //if (35.0 <= bmi)
			{
				System.out.println("Weight status: Obese");
			}
	}
}


