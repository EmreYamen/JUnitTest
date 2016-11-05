import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void ConcatTest() {
		//ConCat
		TestMe test = new TestMe();
		String stringResult = test.testStrings("hi", 1);
		assertEquals("hi", stringResult);
	}

}
