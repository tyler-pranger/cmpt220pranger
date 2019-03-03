// import java.util.Scanner;

public class Lab4Part1 {

	// private static Scanner input;

	public static void main(String[] args) {
		// input = new Scanner(System.in);

        // System.out.print("Input a value for inch: ");
        // double inch = input.nextDouble();
        double convert = 0;
        double convert2 = 0;
        
        
        System.out.println("in    cm     |     cm    in");
        System.out.println("---------------------------");
        
        for (int i = 0; i <= 50; i++) {
        	convert = i * 2.54;
        	for (int c = 0; c <= 50; c++) { // JA: Why is this an inner loop?
        	convert2 = c * 0.39;
        }
        	System.out.println(i + " " + " " + " " + convert + " " + "|" + " " + convert2 + " " + " " + " " + i);
        }
        
        

	}
}
