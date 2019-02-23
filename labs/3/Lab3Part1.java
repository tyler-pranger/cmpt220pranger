import java.util.Scanner;

public class Lab3Part1 {

 private static Scanner in;

public static void main(String[] args) {

    int counter = 0;
    double even = 0;
    double odd = 0;
    double sum = 0;
    int input = 0;

    double average;

    System.out.print("Enter a series of values (0 to stop): ");
    in = new Scanner(System.in);

    while ((input = in.nextInt()) != 0) {

        if (input != 0)
            sum = input + sum;
            counter++;

        if (input % 2 == 0)
            even = even + 1;
        else
            odd = odd + 1;

        }

    if (counter > 0) {

        average = sum / counter;
        
        System.out.println("The mumber of even numbers: " + even);
        System.out.println("The total sum: " + sum);
        System.out.println("The average is: " + average);
    } else {

            System.out.println("No data was entered.");
        }

    }
}



