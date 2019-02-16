package lab2;

import java.util.Scanner;

public class Lab2Part5 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String s1, s2;
	      in = new Scanner(System.in);
	   // Ask the user for two strings
	      System.out.println("Enter the first string: ");
	      s1 = in.nextLine();	     
	      System.out.println("Enter the second string: ");
	      s2 = in.nextLine();
	    // Compare each of the strings to each other
	      if (s1.compareTo(s2) > 0)
	         System.out.println("The strings in alphabetical order are " + s2 + " " + s1);
	      else if (s1.compareTo(s2) < 0)
	         System.out.println("The strings in alphabetical order are " + s1 + " " + s2);
	      else  
	         System.out.println("Both the strings are equal.");
	
	}
}

		

