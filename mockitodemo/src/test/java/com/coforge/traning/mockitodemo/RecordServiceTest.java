package com.coforge.traning.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/*
 * @Mock is used for mock creation. It makes the test class more readable.
 * @Spy is used to create a spy instance. We can use it instead spy(Object) method.
 * @InjectMocks is used to instantiate the tested object automatically and inject all the @Mock or @Spy 
 * annotated field dependencies into it (if applicable).
 * @Captor is used to create an argument captor
 * 
 */


//Mockito needs to be initialized, to mock and inject objects marked by Annotations.
//Annotate the test with the @RunWith(MockitoJUnitRunner.class) 
//so that mockito can process the annotations.
@RunWith(MockitoJUnitRunner.class)
public class RecordServiceTest {

	/*
	 * Annotate service field with the @InjectMocks annotation to first instantiate and then inject both mocked dependencies
	 */
	@InjectMocks
	RecordService recordService;
	
//	Create a mock objects od Dependency classess
	@Mock
	DataBaseDao databaseMock;
	
	@Mock
	NetworkDao netowrkMock;
	
	@Test
	public void saveTest()
	{
		boolean saved = recordService.save("Hello.txt"); // call method to be tested.
		assertEquals(true, saved);
		
//		verify that methods in the mock objects have been invoked
		verify(databaseMock,times(1)).save("Hello.txt");
		verify(netowrkMock,times(1)).save("Hello.txt");
		
	}
	
}
