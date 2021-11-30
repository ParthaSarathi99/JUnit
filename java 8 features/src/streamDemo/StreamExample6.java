package streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Java program to  group and Partition Collectors
/*
 * The Collectors class in Java 8 provides methods for grouping and partitioning data stored in collections.
 * Grouping permits you to organize data that shares a common field value, e.g. department. Partitioning allows 
 * you to divide the data into two categories, or partitions.
 * One partition satisfies the partitioning criteria whereas the other partition does not.
 * For example, we might separate sales data into a partition that met or exceeded a sales goal and a partition that did not.
 * 
 */
public class StreamExample6 {

	private static List<MusicalInstruement> musicalInstruments=new ArrayList<>();
	static {
		musicalInstruments.add(new MusicalInstruement("Trumpet","brass",299.99));
		musicalInstruments.add(new MusicalInstruement("Tuba","brass",1149.0));
		musicalInstruments.add(new MusicalInstruement("Timpani","percussion",2339.0));
		musicalInstruments.add(new MusicalInstruement("Snare drum","percussion",325.00));
		musicalInstruments.add(new MusicalInstruement("Piano","keyboard",5179.99));
		musicalInstruments.add(new MusicalInstruement("Trombone","brass",775.79));
	}
	
	public static void main(String[] args) {

		System.out.println("********** Musical Instruments in Collection ***************");
		musicalInstruments.stream().forEach(i -> System.out.println(i.getName()+" "+i.getPrice()+" "+i.getType()));
		
		System.out.println("Group Instruments Type: ");
		
		Map<String, List<MusicalInstruement>> typeMap=musicalInstruments.stream().collect(Collectors.groupingBy(MusicalInstruement::getType));
		
		typeMap.forEach((key,value) -> {
			System.out.println(key+" ----");
			value.forEach(System.out::println);
		});
		
		
		System.out.println("********** Partition Instruments in Price ***************");
		
		Map<Boolean, List<MusicalInstruement>> priceMap=musicalInstruments.stream().collect(Collectors.partitioningBy(mi -> mi.getPrice() > 500.0));

		priceMap.forEach((key,value) -> {
			System.out.println((key ? "Expensive":"Affordable"));
			value.forEach(i -> System.out.println(i.getName()+" "+i.getPrice()+" "+i.getType()));
		});
	}
	
}
