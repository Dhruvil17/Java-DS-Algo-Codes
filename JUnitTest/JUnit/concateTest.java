package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concateTest {

	@Test
	void stringConcateTest()
	{
		MyJUnit junit = new MyJUnit();
		
		String result = junit.concate("Dhruvil"," Soni");
		assertEquals("Dhruvil Soni", result);		
	}
}
