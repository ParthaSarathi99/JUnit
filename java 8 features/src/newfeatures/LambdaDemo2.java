package newfeatures;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative=(n) -> (n<0);
		
		System.out.println(isEven.computeTest(7));
		System.out.println(isNegative.computeTest(-55));
		
	}
	
}
