import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMeTest {

	private TestMe test;

	@Before
	public void setup()
	{
		test = new TestMe();
		
	}
	
	@Test
	public void TestMeTest() {
		int result = test.testdouble(100);
		//Erwartungswerte
		assertEquals(200, result);

	}
	
	/*@Test (expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull()
	{
		test.testStrings("erfadgfb", 100);
	}*/
	
	@After
	public void close()
	{
		test = null;
	}

}
