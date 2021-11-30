package newfeatures;

// Java program to use Method Reference to a Constructor
interface IMsg
{
	ConstructorReferrnce getMessage(String msg);
}

class ConstructorReferrnce
{
	ConstructorReferrnce(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
}

public class MethodReferenceDemo4 {
	
	public static void main(String[] args) {
		
		IMsg hello=ConstructorReferrnce::new;
		hello.getMessage("Method Reference to Constructor");
		
	}
	
}
