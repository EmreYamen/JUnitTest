import static org.junit.Assert.*;

import org.junit.Test;

public class NotNullTest {

	@Test
	public void test() {
		TestMe test = new TestMe();
		TestMe object = test.returnObject(test);
		assertNotNull(object);
	}

}
