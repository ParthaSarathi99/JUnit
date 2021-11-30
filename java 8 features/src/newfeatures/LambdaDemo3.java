package newfeatures;

// block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString reversestr=(str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
			{
				result+=str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reversestr.myStringFunction("Hello World"));
	
		// lambda expression with single parameter
		MyString myName=(name) -> { return "Hello "+name; };
		System.out.println(myName.myStringFunction("Vikas"));

		// lambda expression with single parameter with no parameter
		MyString myName1=name -> { return "Hello "+name; };
		System.out.println(myName.myStringFunction("Vikas"));
	}
	
}
