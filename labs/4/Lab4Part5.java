
public class Lab4Part5 {

	public static void main(String[] args) {
	
		int n = (int)(Math.random() * 1000 + 1);
		double[] numbers = new double[n];
		double sum = n;

		for (int i = 0; i < n; i++) {
			numbers[i] = n;
			sum += numbers[i];	
		}
		
		double average = sum / n;
		
		int count = 0;
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;
		
		int count2 = 0;
		for (int i = 0; i < n; i++)
			if (numbers[i] < average)
				count2++;
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);	
		System.out.println("Number of elements below the average is " + count2);

	}

}
