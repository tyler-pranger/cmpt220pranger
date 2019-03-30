package Lab6;

public class Lab6Part2 {
	public static void main(String[]args) {
		Bond bond = new Bond(500,100,.05,10000);
		System.out.println("The price of the bond is: " + bond.getPrice());
	}
}
