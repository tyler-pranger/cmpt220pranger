// This program was made to solve the ANother Birck inthe Wall project

import java.util.Scanner;

public class Proj1 {
	
	private static Scanner in;
	private static Object w;
	private static Scanner input;
	private static double sum;
	
	// This function would ask the user for the three values for the wall and the number of bricks
	public static void main(String[] args, int n, Object i) {
		in = new Scanner(System.in);
		
		int h = 0;
		// Prompt the user for the data values for the wall and bricks
		while ((h >= 1) || (h <= 100)) {
			System.out.println("Enter value for height of wall: ");
			h = in.nextInt();
		
		int w = 0;
		while((w >= 1) || (w <= 100)) {
			System.out.println("Enter value for width of wall: ");
			w = in.nextInt();
		
	
		while((n >= 2) || (n <= 10000)) {
			System.out.println("Enter number of bricks you have: ");
			n = in.nextInt();
			
		}
		}
		}
		// Uses brickLength to see if the brick lengths added up equal the width of the wall
		System.out.println("Will Lars complete his wall?");
		// If statement for checking the bricks
		if (getSum() <= w) {
			brickLength(h);
			System.out.println("Yes.");
		}
		else
			System.out.println("No.");
		
		}
		
		// Private method to get the lengths of the bricks, put them into an array, and add them up
		// for the sum of the width of the wall
		private static void brickLength(int n) {
		    input = new Scanner(System.in);
		    // I wanted the number that the user sets for the number of bricks they have to be how long the array is
		    double[] numbers = new double[n];
		    setSum(0);
		    for (int i1 = 0; i1 < numbers.length; i1++)
		    {
		    	// Input statement for obtaining the brick lengths
		        System.out.println("Please enter the lengths of your bricks: ");
		        numbers[i1] = input.nextDouble();
		        setSum(getSum() + numbers[i1]);
		    }
		}

		// Method to have the sum be turned into a value to be passed onto the main function
		public static double getSum() {
			sum = getSum();
			return sum;
		}

		// Method to set the sum into a value
		public static void setSum(double d) {
			Proj1.sum = d;
		}
			
		

	}
		

