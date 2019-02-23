
public class Lab3Part2 {

	public static void main(String[] args) {
			// Display 10 numbers per line
			final int NUMBERS_PER_LINE = 10;	 
			// Count the number of numbers divisible by 5 or 7
			int count = 0;	

			// Test all numbers from 100 to 500
			for (int i = 100; i <= 500; i++) {
			// Test if number is divisible by 5 and 7
			if (i % 5 == 0 || i % 7 == 0) {
				// increment count
				count++;	
				// Test if numbers per line is 10 
				if (count % NUMBERS_PER_LINE == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
					}
				}
			}

	}
