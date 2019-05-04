package Lab10;

public class Manager extends Employee{
	   public Manager(String name, double age, double hourRate) {
	       super(name, age, hourRate);
	   }
	   @Override
	   public double salary(double hours) {
	       return hourRate*hours;
	   }
}
