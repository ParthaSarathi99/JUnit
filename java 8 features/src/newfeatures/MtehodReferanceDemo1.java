package newfeatures;

// Method reference - Shorthand of lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod();
}
class Test
{
	void display()
	{
		System.out.println("I am a instance method");
	}
}

public class MtehodReferanceDemo1 {
	
	public static void main(String[] args) {
		
		// traditional approach
		Test t1=new Test();
		
		t1.display();

		
//		java 8 method reference approach
		MyInterface m1= t1::display; // method reference to instance method of a object
		
//		Call method of FI
		m1.myMethod();
		
//		Lambda -> FI
//		Method reference -> Shorthand of lambda
//		Method reference -> FI
	}

}
