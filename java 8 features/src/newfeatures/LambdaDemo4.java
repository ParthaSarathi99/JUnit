package newfeatures;

// perform arithmetic operation using lambda
public class LambdaDemo4 
{
	public static void main(String[] args) {
		
//		type is not mandatory
		
		Addition op1=(a,b) -> (a+b);
		System.out.println("Addition of 2 numbers: "+op1.calculate(200, 155));
		
		Addition op2=(a,b) -> (a-b);
		System.out.println("Substract of 2 numbers: "+op2.calculate(200, 155));
		
		Addition op3=(a,b) -> (a*b);
		System.out.println("Multiple of 2 numbers: "+op3.calculate(200, 155));
		
		Addition op4=(a,b) -> (a/b);
		System.out.println("Division of 2 numbers: "+op4.calculate(200, 155));
		
	}
}
