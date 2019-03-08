package lab5;

import java.util.Scanner;

public class Lab5Part3 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter number of students, then their name followed by their grade: ");
		int numOfStu = input.nextInt();

		int[] grades = new int[numOfStu];

		String[] names = new String[numOfStu];

		for (int i = 0; i < numOfStu; i++) {
			String name = input.next();
			int grade = input.nextInt();
			names[i] = name;
			grades[i] = grade;
			System.out.println("");
			}

	for (int i = grades.length - 1; i > 0; i--) {
	//resets both to 0 to start at the beginning of the array
		int currentMax = grades[0];
		int currentMaxIndex = 0;
	//finds largest number out of all up to back-limit
		for (int k = 1; k <= i; k++) {
			if (currentMax < grades[k]) {
				currentMax = grades[k];
				currentMaxIndex = k;
			}
		}
	//After largest number is found, assign that number to i
	//each time it runs, i-- second highest max number
	//gets put in front of the all time highest number
		grades[currentMaxIndex] = grades[i];
		grades[i] = currentMax;
		String tempName = names[currentMaxIndex];
		names[currentMaxIndex] = names[i];
		names[i] = tempName;
		}

	for(int i=0; i<grades.length; i++)
		System.out.println(names[i] + " " + grades[i]);

	}

	public static int[] reverseInt(int[] array) {
		int[] a = new int[array.length];
		for (int i = 0, j = a.length - 1; i < array.length; i++, j--) {
			a[j] = array[i];

	}

	return a;

	}

	public static String[] reverseString(String[] array) {
		String[] a = new String[array.length];
		for (int i = 0, j = a.length - 1; i < array.length; i++, j--) {
			a[j] = array[i];
	}

	return a;

	}

}