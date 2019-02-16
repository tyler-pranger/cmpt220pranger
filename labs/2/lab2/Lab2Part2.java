package lab2;

import java.util.Scanner;

public class Lab2Part2 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
     // first number to compare
        int number1; 
        
     // prompt user for an integer
        System.out.print( "Input an integer between 1 and 12: " ); 
     // read number from user
        number1 = input.nextInt(); 
        
     // Compare the number to the months
        if ( number1 == 1 )
        	System.out.println("January");
        else if ( number1 == 2 )
        	System.out.println("February");
        else if ( number1 == 3 )
        	System.out.println("March");
        else if ( number1 == 4 )
        	System.out.println("April");
        else if ( number1 == 5 )
        	System.out.println("May");
        else if ( number1 == 6 )
        	System.out.println("June");
        else if ( number1 == 7 )
        	System.out.println("July");
        else if ( number1 == 8 )
        	System.out.println("August");
        else if ( number1 == 9 )
        	System.out.println("September");
        else if ( number1 == 10 )
        	System.out.println("October");
        else if ( number1 == 11 )
        	System.out.println("November");
        else if ( number1 == 12 )
        	System.out.println("December");
        else
        	System.out.println("Unknown month");		
	}
}
