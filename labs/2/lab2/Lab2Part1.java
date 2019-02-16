package lab2;

import java.util.Scanner;

public class Lab2Part1 {

private static Scanner input;

	public static void main( String args[] )    {
        input = new Scanner(System.in);
     // first number to compare
        int number1;
     // second number to compare
        int number2;  
        
     // prompt the user for the first integer
        System.out.print( "Input first integer: " ); 
     // read first number from user
        number1 = input.nextInt();    
 
     // prompt the user for the second integer
        System.out.print( "Input second integer: " ); 
     // read second number from user
        number2 = input.nextInt();                
        
     // Test the integers through each comparison
        if ( number1 < number2 )           
            System.out.println("Is " + number1 + " less than " + number2 + "? True");
        else
        	System.out.println("Is " + number1 + " less than " + number2 + "? False");
        if ( number1 <= number2 )
        	System.out.println("Is " + number1 + " less than or equal to " + number2 + "? True");
        else
        	System.out.println("Is " + number1 + " less than or equal to " + number2 + "? False");
        if ( number1 == number2 )
        	System.out.println("Is " + number1 + " equal to " + number2 + "? True");
        else
        	System.out.println("Is " + number1 + " equal to " + number2 + "? False");
        if ( number1 != number2 )
        	System.out.println("Is " + number1 + " not equal to " + number2 + "? True");
        else 
        	System.out.println("Is " + number1 + " not equal to " + number2 + "? False");
        if ( number1 > number2 )
        	System.out.println("Is " + number1 + " greater than " + number2 + "? True");
        else 
        	System.out.println("Is " + number1 + " greater than " + number2 + "? False");
        if ( number1 >= number2 )
        	System.out.println("Is " + number1 + " greater than or equal to " + number2 + "? True");
        else 
        	System.out.println("Is " + number1 + " greater than or equal to " + number2 + "? False");       
    }
  }
