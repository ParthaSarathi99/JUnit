package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceJUniy5Test {

//	assuming current time zone is IST. then only test should continue 
	@Test
	void testDoSchedule() {
		TimeZone tZone=TimeZone.getDefault();
		assumeTrue(tZone.getDisplayName().equals("India Standard Time"));
		
//		test do schedule method
		ScheduleService ss=new ScheduleService();
		assertTrue(ss.doSchedule());
		
	}
	
	@Test
	public void doScheduleLocaleNonUS() {

		// Assume that the current locale is US
		Locale currentLocale = Locale.getDefault();
		assumeFalse(currentLocale.equals(Locale.US));
	
		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.doSchedule());

	}

	@Test
	void testBackupCalendar() {
		
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));
		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());

	}

}
