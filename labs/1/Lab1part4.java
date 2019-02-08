package lab1;

import java.util.Scanner;

public class Lab1part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt the user for an amount of ounces
		System.out.print("Enter a mass in kilograms to find its energy: ");
		double mass = input.nextDouble();
				
		// Compute the energy
		double energy = mass * 299972458 * 299972458;
				
		// Display results
		System.out.println(mass + " kilograms has " + energy + " joules of energy.");

	}

}
