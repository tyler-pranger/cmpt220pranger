package lab7;

public class Lab7Part4 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2,2,5.5);
		System.out.println("The perimeter of the circle is: " + c1.getPerimeter());
		System.out.println("The area of the cirlce is: " + c1.getArea());
		System.out.println("The result of 'c1.contains(3, 3)' is: " + c1.contains(3, 3));
		System.out.println("The result of 'c1.contains(new Circle(4, 5, 10.5))' is: " + c1.contains(new Circle(4, 5, 10.5)));
		System.out.println("The result of 'c1.overlaps(new Circle(3, 5, 2.3))' is: " +  c1.overlaps(new Circle(3, 5, 2.3)));
	}

}
