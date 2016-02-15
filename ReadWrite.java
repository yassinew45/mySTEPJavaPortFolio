package helloworld;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.*;

public class ReadWrite {

	public static void main(String[] args) {
		
		//String allText="";
		/*
		try{
			// create a File object and assign a text file to it
			File f = new File("C:\\Users\\Student_09\\somedata.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				allText += sc.nextLine() + "\n";
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exist!");
		}
		
		System.out.println("The whole text is: \n" + allText);
		*/
		
		try{
			Formatter x = new Formatter("C:\\Users\\Student_09\\moredata.txt");
			System.out.println("File created\n");
			x.format("%s ", "I'm writing stuff\n");
			x.format("%s ", "I'm writing more stuff\n");
			x.close();
		}
		catch(Exception e){
			System.out.println("Error!");
		}
		
		
		
		
		
		
		
		/*
		// verify whether the text actually exists
		if (f.exists())
			System.out.println(f.getName() + " exists!");
		else
			System.out.println("File does not exist!");		
		*/


	}

}
