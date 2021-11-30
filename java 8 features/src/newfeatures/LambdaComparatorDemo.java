package newfeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, 
//filter and fetch data.
public class LambdaComparatorDemo 
{
	public static void main(String[] args) {
		
		Student s1=new Student(101, "Ram", 78.00);
		Student s2=new Student(102, "Raj", 55.00);
		Student s3=new Student(103, "Vikas", 33.00);
		Student s4=new Student(104, "Yogesh", 77.00);
		Student s5=new Student(105, "Tanuj", 99.00);
		
		
		// Add students to arrayList
		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		
		System.out.println("Sort Students based on Names: ");
		
		// implement lambda expression to sort User define object using comparator interface
//		comparaTo() method
		
		Collections.sort(sList,(st1,st2)->{
			return st1.name.compareTo(st2.name);
		});
		for(Student s:sList)
		{
			System.out.println(s.rollNumber+" "+s.name+" "+s.marks);
		}
		
		
//		Sort based on descending order based on marks of a student 
		System.out.println("***************** Descending order based on marks: ******************");
		Collections.sort(sList,(st1,st2)->{
			return st2.marks.compareTo(st1.marks);
		});
		
		// foreach() loop
		sList.forEach(s -> System.out.println(s.rollNumber+" "+s.name+" "+s.marks));
		
	}
}
