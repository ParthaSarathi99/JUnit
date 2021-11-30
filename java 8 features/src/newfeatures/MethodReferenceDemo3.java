package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {
	public static void main(String[] args) {
		
		Order ord1=new Order(10000, "Good.NG", 12000.10, Order.Side.BUY);
		Order ord2=new Order(5000, "LG.NG", 13000.20, Order.Side.SELL);

		List<Order> orderBook=new ArrayList<Order>();
		
		orderBook.add(ord1);
		orderBook.add(ord2);
		
//		Sort all orders based on quantity using lambda 
		System.out.println("Before Sorting: "+orderBook);// invoke toString() method
		
		Collections.sort(orderBook,(a,b) -> Order.compareByQuantity(a, b));
		System.out.println("After Sorting: "+orderBook);// after sorting 
		
		
//		sort all order based on quality using method reference By Static Method
		Collections.sort(orderBook,Order::compareByQuantity);
		System.out.println("After Sorting: "+orderBook);// after method reference 
		
		
//		sort all order based on price using method reference By Static Method
		Order order=orderBook.get(0);// we require reference of Object
		
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("Order Book after Sorting by Price: "+orderBook);
		
		
//		method reference example for Arbitrary Object of a particular type
		
		String[] symbols= {"GOOGLE","amazon","microsoft","APPLE"};
		Arrays.sort(symbols,String::compareToIgnoreCase);
		for(String a:symbols)
		{
			System.out.println(a);	
		}
		
		
		
	}
}