package lab1;

import java.util.Scanner;

public class Lab1part3 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		// TODO Auto-generated method stub
		// Prompt the user for an amount of ounces
		System.out.print("Enter an amount of ounces to convert to grams: ");
		double ounces = input.nextDouble();
		
		// Compute the amount of grams
		double grams = ounces * 28.3495;
		
		// Display results
		System.out.println(ounces + " ounces is equal to " + grams + " grams.");

	}

}
