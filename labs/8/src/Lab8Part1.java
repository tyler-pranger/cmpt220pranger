import java.util.Scanner;

public class Lab8Part1 {

	private static Scanner input;
	private static double side1;
	private static double side2;
	private static double side3;
	private static String color;
	private static String filled;
	public static void main(String[]args) {
		input = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle:");
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();

        System.out.println("Enter the color of the Triangle:");
        color = input.next();

        System.out.println(" Is the Triangle filled? Reply with 'True' or 'False': ");
        filled = input.next(); 
    }
	 {
		 double side1 = 1.0;
		 double side2 = 1.0;
		 double side3 = 1.0;
		 boolean filled = false;
		 String color = null;
		 Triangle triangle = new Triangle(side1, side2, side3);
		 
		triangle.setFilled(filled);
		 
		triangle.setColor(color);
		 
		 System.out.println("The Triangle Sides are side 1: " 
			       + triangle.getSide1() + " Side 2: " + triangle.getSide2() 
			       + " Side 3: " + triangle.getSide3());

			System.out.println("The Triangle's Area is " + triangle.getArea());

			System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());

			System.out.println("The Triangle's Color is " + triangle.getColor());
			System.out.println("Is the Triangle filled? " + triangle.isFilled());

	    }
}
