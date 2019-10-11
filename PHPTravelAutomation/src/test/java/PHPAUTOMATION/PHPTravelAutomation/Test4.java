package PHPAUTOMATION.PHPTravelAutomation;

import org.testng.annotations.Test;

public class Test4 extends Flight_Search {
	Base b4=new Base();
	@Test
	public void test1() throws Exception
	{
		b4.Browser();
		Flight_Search();
	}
}