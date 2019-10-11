package PHPAUTOMATION.PHPTravelAutomation;



import org.testng.annotations.Test;

public class Test1 extends Reg_Page


{
	Base b1=new Base();
		@Test
		public void test1() throws Exception
	{
		b1.Browser();
		Register();	
	}

}
