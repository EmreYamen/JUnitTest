
public class TestMe {
	int testNumber;
	String testString;
	TestMe()
	{
		testNumber = 10;
	}
	int testdouble(int number)
	{
		return 2* number;
	}
	int testhalve(int number)
	{
		return number /2 ;
	}
	String testStrings(String text, int multi)
	{
		String temp = "";
		for(int i = 0; i < multi; i++)
		{
			temp += text;
		}
		return temp;
	}
	TestMe returnObject(TestMe object)
	{
		object.testNumber++;
		return object;
	}
}
