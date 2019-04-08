package lab7;

import java.util.Scanner;

public class Lab7Part2 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Input a value: ");
		int num = input.nextInt();
		StackOfIntegers stack = new StackOfIntegers();
		findFactors(num,stack);
		int size = stack.getSize();
		for( int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static void findFactors(int num, StackOfIntegers stack) {
		for (int k = 2; k <= num; k++) { // JA
			while (num % k == 0) {
				stack.push(k);
				num = num/k;
			}
		}
		
	}

}
