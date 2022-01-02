// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 1
// Program 6: More Floating-Point Operations
// Purpose: calculate the monthly payment for a loan.

import java.util.Scanner;
public class MoreFloatingPointOperations
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount: "); // Input Loan Amount
		double loanAmount = input.nextDouble();  // Save Loan Amount
		System.out.println();

		System.out.print("Enter term in years: "); // Input Term In Years
		double terminYears = input.nextDouble();  // Save Term In Years
		System.out.println();

		System.out.print("Enter annual interest rate (%): "); // Input Interest Rate
		double annualInterestRate = input.nextDouble();       // Save Interest Rate
		System.out.println();

		//Calculate Result
		double terminMonths = terminYears * 12;    // Caluclate Term in Months
		double monthlyInterestRate = annualInterestRate / 1200;  // // Caluclate Monthly Interest Rate
		double monthlyPayment = (monthlyInterestRate * loanAmount) / (1 - Math.pow((1 + monthlyInterestRate), - terminMonths));
		// Calculate Monthly Payment

		// Dispaly results
		System.out.println("Your Monthly payment: $" + (int)( monthlyPayment * 100.0) / 100.0);

	}

}


