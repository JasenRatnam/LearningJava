// programer: Ratnam Jasen
// Date: 2016-08-25
// Assignment 2_B
// Program 1: Day of year to Date
/* Purpose: write a program that prompt for and reads
   a year followed by a day number in that year.
   Convert the given year and day numbers to a date.*/

import java.util.Scanner;
public class  DayOfYearToDate
{
	public static void main(String[] args)
	{

		// prompt user

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year and a day number in that year : ");  // Input a year and a day number.

		//check if year number is an integer

		if (!input.hasNextInt()) // if input is not an int
		{
			String badInput = input.next();
			System.out.println("Error: invalid year: " + badInput);
			System.out.println("Error: year value must be a positive integer beyond 1582.");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}


		// Save data in :
		int yearNum = input.nextInt();  // save year

		//check if year number is an integer

		if (!input.hasNextInt()) // if input is not an int
		{
			String badInput = input.next();
			System.out.println("Error: invalid daynumber: " + badInput);
			System.out.println("Error: Day value must be a positive integer <= 365 for a non-Leap year and <= 366 for a leap year");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}

		int dayNum = input.nextInt();   //save day of the year
		int month;                      //save number of month
		int day ;                       // save day in the month
		String monthName ;              // save name of the month
		String dayOfWeek ;              // save day of the week
		final int JAN = 31;
		final int FEB;
		final int MAR = 31;
		final int APR = 30;
		final int MAY = 31;
		final int JUN = 30;
		final int JUL = 31;
		final int AUG = 31;
		final int SEP = 30;
		final int OCT = 31;
		final int NOV = 30;
		final int DEC = 31;
		final int MAX_DAYS;

		// check if year number is beyond 1582
		if (yearNum < 1582) // if number is under 1582
		{
			System.out.println("Error: Invalid year." + yearNum);
			System.out.println("Error: Year value must be a positive integer beyond 1582.");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}



		// find if year is leap year.
		if (yearNum % 4 == 0 && yearNum % 100 != 0 || yearNum % 400 == 0) // year is a leap
		{ // find month and day of month in each month

			FEB = 29;
			MAX_DAYS = 366;
		}
		else //if not leap year.
		{
			FEB = 28;
			MAX_DAYS = 365;
		}

		if (dayNum < 1 || dayNum > MAX_DAYS ) // if number is invallud.
		{
			System.out.println("Error: Invalid day number " + dayNum);
			System.out.println("Error: Day value must be a positive integer <= 365 for a non-Leap year and <= " + MAX_DAYS +" for a leap year");
			System.out.println("Try again later. Bye.");
			System.exit (1);
		}

		if (dayNum <= JAN)
		{
			month = 1;
			day = dayNum;		                                                                                 // JAN - (JAN - dayNum);
			monthName = "January";
		}

		else if (dayNum <= (JAN + FEB))
		{
			month = 2;
			day = dayNum - JAN;			                                                                   // FEB - ((JAN + FEB) - dayNum);
			monthName = "February";
		}

		else if (dayNum <= (JAN + FEB + MAR))
		{
			month = 3;
			day = dayNum - (JAN + FEB);			                                                       //MAR - ((JAN + FEB + MAR) - dayNum);
			monthName = "March";
		}

		else if (dayNum <= (JAN + FEB + MAR + APR))
		{
			month = 4;
			day = dayNum - (JAN + FEB + MAR);                                                        //APR - ((JAN + FEB + MAR + APR) - dayNum); // dayNum -(JAN + FEB + MAR)
			monthName = "April";
		}

		else if (dayNum <= (JAN + FEB + MAR + APR + MAY))
		{
			month = 5;
			day = dayNum - (JAN + FEB + MAR + APR);                                                  //MAY - ((JAN + FEB + MAR + APR + MAY) - dayNum);
			monthName = "May";
		}

		else if (dayNum <= (JAN + FEB + MAR + APR + MAY + JUN))
		{
			month = 6;
			day = dayNum - (JAN + FEB + MAR + APR + MAY);                                           //JUN - ((JAN + FEB + MAR + APR + MAY + JUN) - dayNum);
			monthName = "June";
		}

		else if (dayNum <= (JAN + FEB + MAR + JUL))
		{
			month = 7;
			day = dayNum - (JAN + FEB + MAR + APR + MAY + JUN );                                    //JUL - ((JAN + FEB + MAR + APR + MAY + JUN + JUL) - dayNum);
			monthName = "July";
		}

		else if (dayNum <= (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG))
		{
			month = 8;
			day = dayNum - (JAN + FEB + MAR + APR + MAY + JUN + JUL);                               //AUG - ((JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG) - dayNum);
			monthName = "August";
		}
		else if (dayNum <= (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP))
		{
			month = 9;
			day = dayNum - (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG);                        //SEP - ((JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP) - dayNum);
			monthName = "September";
		}
		else if (dayNum <= (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT))
		{
			month = 10;
			day = dayNum - (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP);                 //OCT - ((JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT) - dayNum);
			monthName = "October";
		}
		else if (dayNum <= (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT + NOV))
		{
			month = 11;
			day = dayNum - (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT);            // NOV - ((JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT + NOV) - dayNum);
			monthName = "November";
		}
		else
		{
			month = 12;
			day =  dayNum - (JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT + NOV);     //DEC - (MAX_DAYS - dayNum);
			monthName = "December";
		}

		// find day of the week
			int w = (14 - month) / 12;
			int m = month + 12*w;
			int x = yearNum - w;
			int y = x % 100;
			int c = x / 100;
			int d = day;
			int z = (d + (26 * ( m + 1 )) / 10 + y + y / 4 + c / 4 + 5 * c)% 7;

			switch (z)
			{
				case 0:  dayOfWeek = "Saturday";
						 break;
				case 1:  dayOfWeek = "Sunday";
						 break;
				case 2:  dayOfWeek = "Monday";
						 break;
				case 3:  dayOfWeek = "Tuesday";
						 break;
				case 4:  dayOfWeek = "Wednesday";
						 break;
				case 5:  dayOfWeek = "Thursday";
						 break;
				case 6:  dayOfWeek = "Firday";
						 break;
				default: dayOfWeek = "Invalid day Of the week";
						 break;
			}
	//display results
		System.out.println();
		System.out.println(dayOfWeek + ", " + monthName + " " + day + ", " + yearNum + " is day " + dayNum);
		System.out.println();

	}

}


		/*else // if year is not leap
		{ // find month and day of month in each month
			FEB = 28;
			MAX_DAYS = 365;
			if (dayNum <= 31)
			{
				month = 1;
				day = 31 - (31 - dayNum);
				monthName = "January";
			}

			else if (dayNum <= 59)
			{
				month = 2;
				day = 28 - (59 - dayNum);
				monthName = "February";
			}

			else if (dayNum <= 90)
			{
				month = 3;
				day = 31 - (90 - dayNum);
				monthName = "March";
			}

			else if (dayNum <= 120)
			{
				month = 4;
				day = 30 - (120 - dayNum);
				monthName = "April";
			}

			else if (dayNum <= 151)
			{
				month = 5;
				day = 31 - (151 - dayNum);
				monthName = "May";
			}

			else if (dayNum <= 181)
			{
				month = 6;
				day = 30 - (181 - dayNum);
				monthName = "June";
			}

			else if (dayNum <= 212)
			{
				month = 7;
				day = 31 - (212 - dayNum);
				monthName = "July";
			}

			else if (dayNum <= 243)
			{
				month = 8;
				day = 31 - (243 - dayNum);
				monthName = "August";
			}
			else if (dayNum <= 273)
			{
				month = 9;
				day = 30 - (273 - dayNum);
				monthName = "September";
			}
			else if (dayNum <= 304)
			{
				month = 10;
				day = 31 - (304 - dayNum);
				monthName = "October";
			}
			else if (dayNum <= 334)
			{
				month = 11;
				day = 30 - (334 - dayNum);
				monthName = "November";
			}
			else
			{
				month = 12;
				day = 31 - (365 - dayNum);
				monthName = "December";
			}

		}*/





		/*

		if ( z == 0)
		{
			dayOfWeek = "Saturday";
		}

		else if ( z == 1)
		{
			dayOfWeek = "Sunday";
		}

		else if ( z == 2)
		{
			dayOfWeek = "Monday";
		}

		else if ( z == 3)
		{
			dayOfWeek = "Tuesday";
		}

		else if ( z == 4)
		{
			dayOfWeek = "Wednesday";
		}

		else if ( z == 5)
		{
			dayOfWeek = "Thursday";
		}

		else
		{
			dayOfWeek = "Firday";
		}*/















