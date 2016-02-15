package helloworld;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO: Write an app that for each of the numbers between 1 and 100,
		// prints the number to console. 
		// if the number is divisible by 3, print "fizz"
		// if the number is divisible by 5, print "buzz"
		// if the number is divisible by both 3 and 5, print "fizzbuzz"
		
		for(int i=1; i<=100; i++){
			System.out.print(i);
			if(i % 3 == 0 && i % 5 == 0) 
				System.out.println(" FizzBuzz");
			else if(i % 3 == 0) 
				System.out.println(" Fizz");
			else if(i % 5 == 0) 
				System.out.println(" Buzz");
			else 
				System.out.println();
		}

	}

}
