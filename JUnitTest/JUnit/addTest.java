package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	public void addTestCase() 
	{
		MyJUnit junit = new MyJUnit();
		
		int result = junit.add(85,15);
		assertEquals(100, result);
	}
}
