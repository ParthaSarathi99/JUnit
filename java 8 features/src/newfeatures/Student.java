package newfeatures;

public class Student 
{

	int rollNumber;
	
	String name;
	
	Double marks;

	public Student(int rollNumber, String name, Double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	
	
}
