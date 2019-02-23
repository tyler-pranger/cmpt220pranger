import java.util.Scanner;

public class Lab3Part5 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    in = new Scanner(System.in);
		    System.out.print("Input the first number: ");
		    double a = in.nextDouble();
		    System.out.print("Input the second number: ");
		    double b = in.nextDouble();
		    System.out.print("Input the third number: ");
		    double c = in.nextDouble();
		    System.out.print("The average value is " + average(a, b, c)+"\n" );
		    }

		    public static double average(double a, double b, double c)
		    {
		        return (a + b + c) / 3;
		    }

	}

