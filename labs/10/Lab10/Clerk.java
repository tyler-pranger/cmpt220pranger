package Lab10;

public class Clerk extends Employee{
	public Clerk (String name, double age, double hourRate) {
		super(name,age,hourRate);
	}
		@Override
		   public double salary(double hours) {
		       return hourRate*hours;
		   }
}
