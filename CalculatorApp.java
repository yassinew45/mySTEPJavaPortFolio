package helloworld;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO: Write a calculator app.
		// The app should ask what operation to perform, receive the values
		// and give the result. Potentially ask the user if they want to end
		// or perform additional operations (blank slate)
		
		Scanner input = new Scanner(System.in);
		char operation, continua;
		double number1, number2;
		
		do{
			System.out.println("Welcome to the calculator App!");
			System.out.println("Please, select which operation you want to perform: ");
			System.out.print("['+' for addition, '-' for subtraction, '*' for multiplication, '/' for division] :: ");
			operation = input.next().charAt(0);
			
			if (operation != '+' && operation != '-' && operation != '*' && operation != '/')
				System.out.print("Wrong input!");
			
			else{
				System.out.print("Now, provide the two number for the operation (order matters!!): ");
				number1 = input.nextDouble();
				number2 = input.nextDouble();
			
				switch(operation){
					case '+':
						System.out.print(number1 + " + " + number2 + " = " + (number1+number2));
						break;
					
					case '-':
						System.out.print(number1 + " - " + number2 + " = " + (number1-number2));
						break;
						
					case '*':
						System.out.print(number1 + " * " + number2 + " = " + (number1*number2));
						break;
						
					case '/':
						System.out.print(number1 + " / " + number2 + " = " + (number1/number2));
						break;
						
					default:
						System.out.print("Wrong input!");
					
				}
			}
			
			System.out.print("\nEnter 'y' or 'Y' to go again, or any other key to quit: ");
			continua = input.next().charAt(0);
			
		}while(continua == 'y' || continua == 'Y');
		
		input.close();

	}

}
