
public class Lab3Part4 {

		public static int largestPrimeFactor(long number) {
	        int i;
	        // Calculation to test for prime numbers
	        for (i = 2; i <= number; i++) {
	            if (number % i == 0) {
	                number /= i;
	                i--;
	            }
	        }
	        return i;
	    }
		// Call largestPrimeFactor function for 15000
		public static void main(String[] args) {
			System.out.println(Lab3Part4.largestPrimeFactor(15000));
		}
	}


