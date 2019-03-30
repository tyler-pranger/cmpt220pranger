package Lab6;

public class Lab6Part1 {
	
	public static void main(String[]args) {
	
		Square sq1 = new Square(40);
		Square sq2 = new Square(35.9);
	
		System.out.println("Square1 width = " + sq1.width);
		System.out.println("Square1 area = " + sq1.getArea());
		System.out.println("Square1 perimeter = " + sq1.getPerimeter());
		System.out.println("Square2 width = " + sq2.width);
		System.out.println("Square2 area = " + sq2.getArea());
		System.out.println("Square2 perimeter = " + sq2.getPerimeter());
			
	}
}

