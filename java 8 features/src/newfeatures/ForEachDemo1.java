package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Creating Consumer action
public class ForEachDemo1 {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("John","Mike","Alex");
		
		Consumer<String> convertuppercase=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t.toUpperCase());
			}
		};
		
		// traversing through Consumer Interface Implementation
		names.forEach(convertuppercase);

		Consumer<Integer> display= a->System.out.println(a);
		
		//implement display using accept
		display.accept(10);
		
	}
	
}
