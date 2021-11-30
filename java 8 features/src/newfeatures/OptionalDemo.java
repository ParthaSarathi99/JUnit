package newfeatures;

import java.util.Optional;

public class OptionalDemo 
{
	public static void main(String[] args) {
		
//		String s=null;
//		Integer a=null;
//		
//		System.out.println(s.length()); // Null pointer Exception
		
		
//		String s="Hello World";
		String s=null;
//		Optional Object is a container for not null object
		Optional<String> chkNull=Optional.ofNullable(s);
		
		if(chkNull.isPresent())
		{
			System.out.println("Length of a String is: "+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(chkNull.get());
		}
		else
		{
			System.out.println("String is not Present");
		}
		
	}
}
