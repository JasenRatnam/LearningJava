
 import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//This program demonstrates how to output to a file.
public class OutputFileProcessing {

//	Step 0: add throws IOException after main's header
	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		//step 1: Define a File object
		String fileName = "output.txt";
		File myOutputFile = new File(fileName);

		
		// Step 2: make sure we are not overwriting without permission
		if(  myOutputFile.exists())
		{
			System.out.println("This file already exists" + fileName);
			System.out.print("Do you want to overwrite it (yes/no)?");
			if( ! keyboard.next().trim().equalsIgnoreCase("yes") )
			{
				System.out.print("Ok. Please try again and specify another file name");
				System.exit(1);
			}
		}
		
		// Step 3: Define an object of class PrintWriter
		PrintWriter pw = new PrintWriter(myOutputFile);

		// use pw the same way as System.out
		pw.println("Dear friend");
		pw.println("This is my first lesson in writing to a file in Java");
		pw.println("Bye for now");
		
		// when done, close the file
		pw.close();

	}

}