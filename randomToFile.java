package helloworld;

import java.io.File;
import java.util.*;

public class randomToFile {

	/* Assignment:
	 * 1. Generate 10 random numbers of 8 digits. For each number, add a random number of leading spaces (1-5)
	 * 2. write the output to a file.
	 * 3. read the numbers from the file and remove the leading spaces. display results on console.
	 */
	
	public static void main(String[] args) {
		
		//1. Let's get those 10 (SIZE) random 8-digit numbers and store them in a file
		Random rand = new Random();
		// rand.nextInt(10) produces a random value between 0 and 9
		
		
		final int SIZE = 10;
		String randomNumbers[] = new String[SIZE];
		int n;
		
		
		for(int i=0; i<SIZE; i++){ 			// iterates for 10 times to generate 10 numbers, one per line
			n = rand.nextInt(5)+ 1; 		// generates a random value between 1 and 5
			
			randomNumbers[i] = "";		 		// initialize next string number
			for(int j=0; j<n; j++) 			// add a random number (n) of leading spaces
				randomNumbers[i] += " ";
			
			// Now, we add the 8-digit random number
			int min = 10000000, max = 99999999;
			randomNumbers[i] += (rand.nextInt(max-min +1) + min); // range: min ~ max
			// System.out.print(randomNumbers);	// COMMENT TO SELF: for debugging purposes
		}
		
		// 2. Now, we write our random numbers to the file moredata.txt
		try{
			Formatter x = new Formatter("C:\\Users\\Student_09\\moredata.txt");
			System.out.println("File created successfully\n");
			for(int i=0; i<SIZE; i++)
				x.format("%s %n", randomNumbers[i]);
			x.close();
		}
		catch(Exception e){
			System.out.println("Error!");
		}
		
		// 3. read the numbers from the file and remove the leading spaces. display results on console
		String allText="";
		try{
			// create a File object and assign a text file to it
			File f = new File("C:\\Users\\Student_09\\moredata.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				allText += sc.nextLine() + "\n";
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("File does not exist!");
		}
		
		System.out.println("The text file reads: \n" + allText);
		
		// Let's now remove those spaces:
		for(int i=0; i<SIZE; i++)
			randomNumbers[i] = remLeadingSpaces(randomNumbers[i]);
		
		// print out the results: 
		System.out.println("After removing the leading spaces: ");
		for(int i=0; i<SIZE; i++)
			System.out.println(randomNumbers[i]);
		

	}
	
	
	public static String remLeadingSpaces(String s){
		
		int i;
		
		for(i=0; i<s.length(); i++)
			if(s.charAt(i) != ' ') 
				break;
		
		s = s.substring(i);
		// System.out.println("s == " + s);  // COMMENT TO SELF: for debugging purposes
		return s;
	}

}