package newfeatures;

import java.time.LocalDate;

// java 8 allows to add functionality interfaces 
interface Parser
{	
	default void parse()
	{
		System.out.println("default Parsing logic");
	} 
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser
{
//	inherit default implementation of parse
	
	void display()
	{
		System.out.println("Hello text parser");
	}
	
}

class XMLParser implements Parser
{
//	overridden method
	public void parse()
	{
		System.out.println("Parsing XML Files");
	}
}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		
		Parser p=new TextParser(); // upcasting 
		p.parse(); // invoking default method in interface
		
		TextParser p1=new TextParser(); //reference child class TextParser
		
		p=new XMLParser(); // reference child class XMLParser
		
		p.parse(); // invoking overridden method
		
		System.out.println("Program execute at: ");
		Parser.displayDate(); // invoke static method in interface
	}
	
}
