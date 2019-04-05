package lab7;

public class Course {
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents == students.length) {
			String[] newstudents = new String[students.length + 5];
			for(int i = 0; i < students.length; i++) {
				newstudents[i] = students[i];
			}
			students = newstudents;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+5; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	public void clear() {
		students = new String[5];			
		}

}