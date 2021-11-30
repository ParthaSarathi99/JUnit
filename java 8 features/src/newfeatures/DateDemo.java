package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;



//Java 8 introduces a new date-time API under the package java.time.
//It simply change the way we have been handling dates in java applications.Important classes introduced 
//in java.time packageLocal − Simplified date-time API with no complexity of timezone handling.Zoned − Specialized 
//date-time API to deal with various timezones.


public class DateDemo {
	
	public static void main(String[] args) {
		
//		legacy class to deal with date and time which is now deprecated
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getTime());
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		
		
//		Calendar Class
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
		System.out.println("************* Java 8 Date & Time Class **********");
		
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		
		LocalDateTime dt =LocalDateTime.now();
		
		System.out.println("Date Time is: "+d+" --> "+ t);
		System.out.println("Before Formatting"+dt);
		
		DateTimeFormatter formate=DateTimeFormatter.ofPattern("EEEE dd-MMM-yyy HH:mm:ss");
		String dt1=dt.format(formate);
		
		System.out.println("After Formatting: "+dt1);
		
		LocalDateTime dt2 =dt.minusDays(100);
		
		System.out.println("Minus Days 100: "+dt2);
		
		LocalDateTime dt3 =dt.plusDays(50);
		
		System.out.println("Plus Days 50: "+dt3);
		
		//Java Clock class is used to provide an access to the current, date and time using a time zone.
		
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		c1=Clock.systemUTC();
		System.out.println(c1.instant());
		
		
//		Zoned Date Time to deal with various Time Zones
		ZoneId z1=ZoneId.of("Asia/Tokyo");
		LocalTime t1=LocalTime.now(z1);
		System.out.println("Japan Time is: "+ t1);
		
		ZonedDateTime z2=ZonedDateTime.now();
		System.out.println(z2.getZone()+ " "+ z2.getDayOfWeek());
		
		System.out.println(z2);
		
	}
	
}
