package newfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * forEach() Method In Iterable Interface
	Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can iterate over the elements in the collection. 
	“forEach” is a default method defined in the Iterable interface. It is used by the Collection classes that extend the Iterable 
	interface to iterate elements.

	The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
*/

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages=new ArrayList<String>(); // declare arraylist
		
		// add elements to list
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		
		System.out.println("*********** Programing Languages ********************");
		languages.forEach(i -> System.out.println(i));
		
		
		System.out.println("****** Print Element using method referance *********");
		languages.forEach(System.out::println);
		
		
		// declare an map of customers
		Map<Integer, String> customer=new HashMap<Integer, String>();
		customer.put(101, "Alex");
		customer.put(102, "Mile");
		customer.put(103, "Mary");
		customer.put(104, "Navin");
		customer.put(105, "Jack");
		
		System.out.println("******************* Customer Account No. & Name ******************");
		customer.forEach((k,v)-> System.out.println("Key: "+k+" ---------->Value: "+v+"\n"));
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		//use lambda expression to print elements of arraylist 
		System.out.println("*********** Array List ********************");
		arrL.forEach(i -> System.out.println(i));
	
		// use lambda expression to print even numbers in array list
		System.out.println("********** Even number in array list ****************");
		arrL.forEach(n->{
			if(n%2==0)
				System.out.println(n);
		});

		
	}
	
}
