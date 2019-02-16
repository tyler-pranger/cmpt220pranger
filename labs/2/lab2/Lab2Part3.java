package lab2;

import java.util.Scanner;

public class Lab2Part3 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
	     // first number to compare
	        int number1;
	     // second number to compare
	        int number2;
	        
	     // prompt user for the limits
	        System.out.print( "Input a lower limit integer: " ); 
	     // read first number from user
	        number1 = input.nextInt();    	 
	     // prompt the user for an upper limit
	        System.out.print( "Input an upper limit integer: " ); 
	     // read second number from user
	        number2 = input.nextInt();
	        
	     // Generate 3 numbers within the range
	        int num1 = (int)(Math.random() * number2 + number1);
	        	System.out.println(num1);
	        int num2 = (int)(Math.random() * number2 + number1);
	        	System.out.println(num2);
	        int num3 = (int)(Math.random() * number2 + number1);
	        	System.out.println(num3);
	        
	}

}
