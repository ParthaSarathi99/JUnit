package com.coforge.traning.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;

class MathApplicationTest {

	
	@InjectMocks // its use to create and Inject
	MathApplication mathApplication;
	
	@Mock // -- create a mock object 
	CalculatorService calcService;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mathApplication=new MathApplication();
		
		MockitoAnnotations.initMocks(this);
		
	}

	@Test
	void testAdd() {
		
		//add the behavior of calc service to add two numbers
		when(calcService.add(10.0, 20.0)).thenReturn(30.0);
		
		//test the add functionality
		assertEquals(calcService.add(10.0, 20.0),30.0,0);
   
		//verify the behavior
		verify(calcService).add(10.0, 20.0);
		
	}

	@Test
	void testSubtract() {
		when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);
		
		assertEquals(calcService.subtract(20.0, 10.0), 10.00);
		
		verify(calcService).subtract(20.0, 10.0);
	}

	@Test
	void testMultiply() {

		when(calcService.multiply(10.0, 5.0)).thenReturn(50.0);
		
		assertEquals(calcService.multiply(10.0, 5.0), 50.00);
		
		verify(calcService).multiply(10.0, 5.0);
		
	}

	@Test
	void testDivide() {
		
		when(calcService.divide(10.0, 5.0)).thenReturn(4.0);
		
		assertEquals(calcService.divide(10.0, 5.0), 4.00);
		
		verify(calcService).divide(10.0, 5.0);
	}

}
