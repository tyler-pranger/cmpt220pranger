package lab5;

import java.util.Scanner;

public class Lab5Part1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		// Create array of length 10
		double[] numbers = new double[10]; 

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Display the minimum value
		System.out.println("The maximum number is: " + max(numbers));
	}

	// Method max returns the smallest element in an array of double values
	public static double max(double[] array) {
		double max = array[0];	// The minimum value
		for (double i: array) {
			if (i > max)
				max = i;
		}
		return max;
	}
}