package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;

//In Junit 5, test classes and test methods can declare custom display names via Junit 5 @DisplayName annotation.
@DisplayName("Calculator Test Case")
class CalaulateJUnit5Test {

//	Create an Object of class to be Tested
	private Calculator calc;
	
	@BeforeEach
	void setUp() throws Exception {
		calc=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
	}

	@Test
	@DisplayName("Calculator add test")
	void testAdd() {
		double result =calc.add(10.50, 10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	@DisplayName("Calculator Substract test")
	void testSubtract() {
		double result =calc.subtract(100.5, 95);
		assertEquals(5.5,result,0);
	}

	@Test
	@DisplayName("Calculator multiply test")
	void testMultiply() {
//		double result =calc.multiply(100, 2.5);
		
		String user="gosling";
		
		assumingThat(user.equals("vikas"), () -> assertEquals(500, calc.multiply(100, 2.5),0));
//		assertEquals(250,result,0);
	}

	@Test
	@DisplayName("Calculator divide test")
	void testDivide() {
		double result =calc.divide(100, 10);
		assertEquals(10,result,0);
	}

}
