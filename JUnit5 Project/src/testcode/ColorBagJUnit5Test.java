package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

/*
 * The @BeforeEach annotation denotes that the annotated method should be executed before each @Test, 
 * @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class. It is executed only once.
 */

class ColorBagJUnit5Test {

	private ColorBag colorBag;

	@BeforeEach
	void setUp() throws Exception {
		colorBag=new ColorBag();
		
		colorBag.add("red");
		colorBag.add("green");
		colorBag.add("Yellow");
		colorBag.add("blue");
		colorBag.add("magenta");
		colorBag.add("brown");
	}

	@Test
	@DisplayName("Added color should be in Bag")
	void testAdd() {
		var newColor="pink";
		colorBag.add(newColor);
		System.out.println(colorBag.colors);
		assertEquals(colorBag.contains(newColor), "failure");
	}

	@Test
	@DisplayName("Remove color should not be in the bag")
	void testRemove() {
		var color="green";
		colorBag.remove(color);
		assertEquals(colorBag.contains(color), "failure");
	}

	@Test
	@DisplayName("Color Bag set should be transform into a list")
	void testToList() {
		var myList=Arrays.asList("red","green","yellow","blue","magenta","brown");
		var colorList=colorBag.toList();
		Collections.sort(myList);
		Collections.sort(colorList);
		
		assertEquals(colorList, myList,"failure");
	}

	@Test
	void testSize() {
		int bSize=colorBag.size();
		assertEquals(6, bSize,"failure");
	}

}
