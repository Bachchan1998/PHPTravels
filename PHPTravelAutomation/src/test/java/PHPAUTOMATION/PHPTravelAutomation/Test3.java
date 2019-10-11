package PHPAUTOMATION.PHPTravelAutomation;
import org.testng.annotations.Test;

public class Test3 extends hotels1 {
	Base b3=new Base();
	@Test
	public void test1() throws Exception
	{
		b3.Browser();
		HotelSearch();

}
}
