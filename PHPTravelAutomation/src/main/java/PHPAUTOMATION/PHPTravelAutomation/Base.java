package PHPAUTOMATION.PHPTravelAutomation;




import java.io.FileInputStream;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Base
{


	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	
/*	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Browser();

		//Reg_Page.Register();
		//Login_Page.login();
		//hotels1.HotelSearch();
	}
*/
				

	public static  void Browser() throws Exception
		{
			System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			FileInputStream f1=new FileInputStream("C:\\PHPTravelAutomation\\PHPTravelAutomation\\attribute.properties");
			
			prop.load(f1);
			driver.get(prop.getProperty("URL"));	
			
		}
	
}
