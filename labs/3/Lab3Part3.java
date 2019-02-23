
public class Lab3Part3 {
	
	public static void main(String[] args) {		
		final int CHARACTERS_PER_LINE = 20;
		int count = 0;
		
		for (char i=1; i<101; i++) {
			count++;
				if (count % CHARACTERS_PER_LINE == 0) 
					extracted(i);
				else
					System.out.print(i + " ");	
				System.out.print(i + " ");
			// System.out.print(" ");
		
		}			
							
		}

	private static void extracted(char i) {
		System.out.println(i);
	}
	}


