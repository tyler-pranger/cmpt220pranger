package lab2;

import java.text.DecimalFormat;
import java.util.Random;

public class Lab2Part6 {

public static void main(String[] args) {

	// Generate random phone number in three parts
	   Random rand = new Random();
	// + 2 insures that the first number will not be a 1 or 0
	   int num1 = (rand.nextInt(10) + 2) * 100;
	   int num2 = rand.nextInt(1000);
	   int num3 = rand.nextInt(10000);

	   DecimalFormat df3 = new DecimalFormat("000");
	   DecimalFormat df4 = new DecimalFormat("0000");

	   String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);

	   System.out.println(phoneNumber);
	}

}
