package PHPAUTOMATION.PHPTravelAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

	public class hotels1 extends Base
{

	static By Hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	static By Srch_by_hotel=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Entr_value=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");   
	static By Select=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div/span");   
	
	static By Checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	static By Next=By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]");
	
	static By Checkout=By.xpath("//input[@placeholder='Check out']");
	static By Next1=By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[3]");
	
	static By Guest=By.xpath("//input[@id='htravellersInput']");
	static By Adult=By.xpath("//input[@id='hadultInput']");
	static By Child=By.xpath("//input[@id='hchildInput']");
	
	static By Click_Search=By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
	
	
	public static void HotelSearch() throws Exception
{
//driver.get(prop.getProperty("URL"));
		driver.findElement(Hotel).click();
		
// SEARCH HOTEL FIELD		
		driver.findElement(Srch_by_hotel).click();
		Thread.sleep(2000);
		driver.findElement(Entr_value).sendKeys(prop.getProperty("cityName"));
		driver.findElement(Entr_value).sendKeys((Keys.DOWN));
		Thread.sleep(3000);
		driver.findElement(Select).click();
		
// CHECK IN FIELD		
		driver.findElement(Checkin).click();
		Thread.sleep(2000);
		while(true)
	{
			String str=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();
			//Thread.sleep(3000);
			if(str.equals(prop.getProperty("C_In_Month")))
			{
				break;
			}
			else
			{
				driver.findElement(Next).click();
			}
			
	}
		driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody/tr/td[contains(text(),"+prop.getProperty("C_In_Day")+")]")).click();
		
		
// CHECK OUT FIELD
	
			//driver.findElement(Checkout).click();
			String Month="December 2019";
			Thread.sleep(2000);
				
				while(true) 	
		{
				String str=driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[2]")).getText();
				

				if(str.equals(Month))
			
			{
				break;
			}
				
				else
			{
				
				driver.findElement(Next1).click();
				
				
			}
		}
			driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr/td[contains(text(),"+prop.getProperty("C_Out_Day")+")]")).click(); 
		
			                      	
// NUMBER OF GUESTS
			
			driver.findElement(Guest).click();
			driver.findElement(Adult).sendKeys(Keys.BACK_SPACE);
			driver.findElement(Adult).sendKeys(prop.getProperty("adult"));
			driver.findElement(Child).sendKeys(Keys.BACK_SPACE);
			driver.findElement(Child).sendKeys(prop.getProperty("child"));
					
		
// SEARCH BUTTON
			
			driver.findElement(Click_Search).click();

		
}
	
		public static void main(String args[]) throws Exception
	{
		Browser();
		HotelSearch();		
	}

}

	
