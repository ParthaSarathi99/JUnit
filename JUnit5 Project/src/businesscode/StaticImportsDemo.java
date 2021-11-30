package businesscode;

import static java.lang.Math.*;
import static java.lang.System.*;

//In Java, static import concept is introduced in 1.5 version. With the help of static import, 
//we can access the static members of a class directly without class name or any object.

public class StaticImportsDemo {

	public static void main(String[] args) {
		
//		without static import
//		System.out.println(Math.sqrt(55));
//		System.out.println(Math.pow(55.3, 3));
//		System.out.println(Math.PI);

//		with static import
		out.println(sqrt(55));
		out.println(pow(55.3, 3));
		out.println(PI);
		
		
	}
	
}
