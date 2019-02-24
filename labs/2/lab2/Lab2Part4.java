package lab2;

import java.util.Scanner;

public class Lab2Part4 {

private static Scanner input;

public static void main(String[] args) {
		        
	input = new Scanner(System.in);
    // first number to compare
       char result1;
       char result2;
       
    // prompt user for a character
       System.out.print( "Input a character: " ); 
    // read first number from user
       result1 = (char) input.next().charAt(0);
    // prompt the user for a second character
       System.out.print( "Input second character: ");
       result2 = (char) input.next().charAt(0);
	
		char ch = (char) result1;
		char ch2 = (char) result2;
		int i = ch;
		int j = ch2;
		System.out.println("Ascii value of " + ch + " and " + ch2 + " = " + (i + j));
		    }	        
	}

