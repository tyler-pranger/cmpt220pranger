package lab7;

public class Lab7Part3 {

	public static void main(String[] args) {
		Course crs1 = new Course("Programming");
		crs1.addStudent("John");
		crs1.addStudent("Joe");
		crs1.addStudent("Jack");
		crs1.dropStudent("Joe");
		for (String stud : crs1.getStudents())
			if (stud != null)
				System.out.println(stud);
		
	}

}
