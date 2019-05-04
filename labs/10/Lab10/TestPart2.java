package Lab10;

public class TestPart2 {
	public static void main(String args[]) {
		Employee vec[] = {
			new Manager("John", 52, 104),
			new Clerk("Daniel", 26, 110),
			new Manager("Steve", 42, 120),
			new Manager("Stacey", 34, 120)};
		 	double hours[] = {140,150,130,180};
		 	double total = 0;
		 	for (int index = 0; index < vec.length; index++){
		 		total += vec[index].salary(hours[index]);
		 		System.out.println(vec[index]);
		 		}
		 	System.out.println("The total payment of the employees is " + total);
		 	}
}
