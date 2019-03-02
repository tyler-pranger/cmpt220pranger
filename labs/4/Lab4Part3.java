import java.util.Scanner;

public class Lab4Part3 {

	    private static Scanner sc;

		public static boolean isPalindrome(String s) {
	        if(s.length() == 0 || s.length() == 1)
	            // if length = 0 OR 1 then it is
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	            // check for first and last char of String:
	            // if they are same then do the same thing for a substring 
	        	// with first and last char removed. and carry on this
	            // until you string completes or condition fails
	            return isPalindrome(s.substring(1, s.length()-1));

	        // if it's not the case than string is not a palindrome.
	        return false;
	    }

	    public static void main(String[]args)
	    {
	        sc = new Scanner(System.in);
	        System.out.println("Type a word to check if its a palindrome or not: ");
	        String x = sc.nextLine();
	        if(isPalindrome(x))
	            System.out.println(x + " is a palindrome.");
	        else
	            System.out.println(x + " is not a palindrome.");
	    }
	}
