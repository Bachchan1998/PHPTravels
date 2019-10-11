package PHPAUTOMATION.PHPTravelAutomation;

import org.testng.annotations.Test;

public class Test2 extends Login_Page {
	
	
	Base b2=new Base();
	@Test
	public void test1() throws Exception
{
	b2.Browser();
	login();
	
	}

}
