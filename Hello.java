package helloworld;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String myName;
		
		System.out.print("Enter your full name: ");
		myName = sc.nextLine();
		
		for(int i=0; i<myName.length(); i++){
			System.out.print(myName.charAt(i) + " ");
			System.out.println(myName);
		}
		
		String FirstLetter = myName.substring(0, 1);
		//String FirstLetter = myName.charAt(0) + "\0";
		System.out.println(FirstLetter);
		String myName1 = myName.substring(1);
		myName1 += FirstLetter;
		System.out.println(myName1);
		
		String revName = "";
		for(int  i=myName.length()-1; i>=0; i--){
			revName += myName.charAt(i);
		}
		
		System.out.println(revName);
		
		sc.close();

	}

}
