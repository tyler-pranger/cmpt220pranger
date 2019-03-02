import java.util.Scanner;

// simple java program to remove duplicates in an array

public class Lab4Part8 {
	private static Scanner input;

	public static void main(String[] args) {
	      
        double[] numbers;  // An array for storing the input values.
        int numCt;         // The number of numbers saved in the array.
        double num;        // One of the numbers input by the user.
      
        numbers = new double[100];   // Space for 100 numbers.
        numCt = 0;                   // No numbers have been saved yet.
        input = new Scanner(System.in);
        System.out.print("Enter up to 100 positive numbers; Enter 0 to end: ");
      
        while (true) {   // Get the numbers and put them in the array.
           num = input.nextInt();
           if (num <= 0)
              break;
           numbers[numCt] = num;
           numCt++;
        }
        
        selectionSort(numbers, numCt);  // Sort the numbers.
      
        System.out.println("\nYour numbers in sorted order are:\n");
      
        for (int i = 0; i < numCt; i++) {
            System.out.println( numbers[i] );
        }
      
     } // end main();
     
     /**
      * Sort the numbers in A[0], A[1], ..., A[count-1] into
      * increasing order using Selection Sort.
      */
     static void selectionSort(double[] A, int count) {
        for ( int lastPlace = count - 1; lastPlace > 0; lastPlace-- ) {
           int maxLoc = 0;
           for (int j = 1; j <= lastPlace; j++) {
              if (A[j] > A[maxLoc]) {
                 maxLoc = j;
              }
           }
           double temp = A[maxLoc];
           A[maxLoc] = A[lastPlace];
           A[lastPlace] = temp;
        }
     }

	}
