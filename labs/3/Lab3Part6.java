import java.util.Scanner;

public class Lab3Part6 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    {
		    	// Prompt the user for an input
		        in = new Scanner(System.in);
		        System.out.print("Input the string: ");
		        String str = in.nextLine();

		        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");}
	}
		 		// Function for counting the number of vowels in the string
		        public static int count_Vowels(String str)
		    {
		        int count = 0;
		        for (int i = 0; i < str.length(); i++)
		        {
		            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
		                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		            {
		                count++;
		            }
		        }
		        return count;
		    }
		}
