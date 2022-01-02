
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This program demonstrates how to input from a file.
public class InputFileProcessing  
{

//	Step 0: add throws IOException after main's header
	public static void main(String[] args) throws IOException 
	{
		//step 1: Define a File object
		String fileName = "input.txt";
		File myInputFile = new File(fileName);
		
		// Step 2: make sure the file opened properly
		if( ! myInputFile.exists())
		{
			System.out.println("Could not open file" + fileName);
			System.exit(1);
		}
		
		// Step 3: Attach the file to a Scanner object
		Scanner fileReader = new Scanner(myInputFile);
		
//		Treat fileReader the same way as keyboard, a Scanner attached to the keyboard
		
//		Step 4: Read input values
		while(fileReader.hasNextInt())
		{
			int x = fileReader.nextInt();
			System.out.println(x);
			
		}
		
		// Step 5:lose the logical file
		fileReader.close();
	}

}

