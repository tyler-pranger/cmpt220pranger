package lab7;

public class Lab7Part1 {

	public static void main(String[] args) {
		MyLong val = new MyLong(30);
		
		System.out.println("Is the value even? " + val.isEven());
		System.out.println("Is the value odd? " + val.isOdd());
		System.out.println("Is the value prime? " + val.isPrime());
	}

}
