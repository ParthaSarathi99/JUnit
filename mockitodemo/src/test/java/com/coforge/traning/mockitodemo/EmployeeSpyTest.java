package com.coforge.traning.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

// @Spy is used to create a spy instance. 
// We can use it instead spy(Object) method.
//Mockito provides option to create spy on real objects. When spy is called, then actual method of real object is called.

@RunWith(MockitoJUnitRunner.class)
public class EmployeeSpyTest {
	
	private Employee spyEmp;
	private Employee emp;
	
	private static final String FIRST_NAME = "Joe";
	private static final String LAST_NAME = "M";
	private static final int AGE = 35;
	
	
	@Before
	public void buildSpy() {
		emp = new Employee(FIRST_NAME, LAST_NAME, AGE);
		spyEmp = spy(emp); // created a spy object of Employee using static 
	}

	@Test
	public void verifySpyEffectOnRealInstance() {
		spyEmp.setAge(20);
		assertFalse(emp.getAge() == spyEmp.getAge());
	}
	
	@Test
	public void fullname()
	{
		String fName=spyEmp.getFullName();
		System.out.println("Full Name: "+fName);
		assertEquals(FIRST_NAME + " "+LAST_NAME, spyEmp.getFullName());
	}
	
	@Test
	public void firstname()
	{
		String fName=spyEmp.getFirstName();
//		System.out.println(fName);
		assertEquals(FIRST_NAME, spyEmp.getFirstName());
	}
	
	@Test
	public void lastname()
	{
		String fName=spyEmp.getLastName();
		assertEquals(LAST_NAME, spyEmp.getLastName());
	}
	
}
