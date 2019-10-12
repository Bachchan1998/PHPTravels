package PHPAUTOMATION.PHPTravelAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Car_Search extends Base{

	static By Car = By.xpath("//div[@id='body-section']//li[4]//a[1]");
	static By PickUp = By.xpath("//div[@id='s2id_carlocations']//span[@class='select2-chosen'][contains(text(),'Location')]");
	static By PickUp_City = By.xpath("//div[contains(text(),'Manchester')]");
	
	static By Departure_Date = By.xpath("//*[@id='departcar']");
	static By Departue_Month = By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[2]");
	static By Next = By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[3]");
	
	static By Return_Date = By.xpath("//input[@id='returncar']");
	static By Return_Month = By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]");
	static By Next1 = By.xpath("//div[13]//div[1]//tr[1]//th[3]");
	
	
	static By Departure_Time = By.xpath("//select[contains(@name,'pickupTime')]");
	static By Return_Time = By.xpath("//select[@name='dropoffTime']");
	
	static By Search_Button = By.xpath("//*[@id=\"cars\"]/form/div[7]/button");
	
	static By Details_Button=By.xpath("//button[@class='btn btn-action loader loader btn-block br25']");
	
	static By BookNow_Button=By.xpath("//button[@class='btn btn-block btn-action btn-lg']");
	
// PERSONAL DETAILS
	
	static By F_Name=By.xpath("//input[@placeholder='First Name']");
	static By L_Name=By.xpath("//input[@placeholder='Last Name']");
	static By EMail=By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']");
	static By Confirm_Mail=By.xpath("//input[@placeholder='Confirm Email']");
	static By Mobile_Number=By.xpath("//input[@placeholder='Contact Number']");
	static By Address=By.xpath("//input[@placeholder='Address']");
	static By County_DDown=By.xpath("//input[@class='select2-input']");
	static By Select_Country=By.xpath("//*[@id='select2-drop']/ul/li[2]/div");
				
	public static void CarSearch() throws Exception 
	
	{
		//driver.get(prop.getProperty("URL"));
		driver.findElement(Car).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(PickUp).click();
		driver.findElement(PickUp_City).click();
		
		
// DEPARTURE DATE FIELD
		
		  
		  driver.findElement(Departure_Date).sendKeys(Keys.TAB);
		  Thread.sleep(2000);
			 
			while(true)
	{
				String str=driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[2]")).getText();
				
			if(str.equals(prop.getProperty("D_Month")))
		{
			break;
		}
				
			else
		{
			//Thread.sleep(2000);	
			driver.findElement(Next).click();
		}
	}

		//driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/tbody/tr/td[contains(text(),"+prop.getProperty("D_Day")+")]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/table[1]/tbody[1]/tr/td[@class='day '][contains(text(),\"16\")]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/table[1]/tbody[1]/tr/td[@class='day '][contains(text(),\"18\")]")).click(); 
// DEPARTURE TIME FIELD
		
				driver.findElement(Departure_Time).click();	
				driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select/option[17]")).click();
		
// RETURN DATE FIELD
		
			
		  driver.findElement(Return_Date).sendKeys(Keys.TAB);
		  //Thread.sleep(2000);	
			 
			while(true)
	{
				String str=driver.findElement(Return_Month).getText();
				
			if(str.equals(prop.getProperty("R_Month")))
		{
			break;
		}
				
			else
		{
			
			driver.findElement(Next1).click();
		}
	
	}
		driver.findElement(By.xpath("/html[1]/body[1]/div[13]/div[1]/table[1]/tbody[1]/tr/td[@class='day '][contains(text(),'22')]")).click();
		
// DEPARTURE TIME FIELD
		
		driver.findElement(Return_Time).click();	
		driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select/option[31]")).click();
		 
		
// SEARCH BUTTON
		
		driver.findElement(Search_Button).click();
		
// DETAILS BUTTON
		
		driver.findElement(Details_Button).click();
		driver.findElement(BookNow_Button).click();
		Thread.sleep(2000);
		driver.findElement(F_Name).click();
		driver.findElement(F_Name).sendKeys(prop.getProperty("FName"));
		driver.findElement(L_Name).click();
		driver.findElement(L_Name).sendKeys(prop.getProperty("LName"));
		driver.findElement(EMail).click();
		driver.findElement(EMail).sendKeys(prop.getProperty("EMail"));
		driver.findElement(Confirm_Mail).click();
		driver.findElement(Confirm_Mail).sendKeys(prop.getProperty("C_Mail"));
		driver.findElement(Mobile_Number).click();
		driver.findElement(Mobile_Number).sendKeys(prop.getProperty("M_Number"));
		//driver.findElement(Address).click();
		//driver.findElement(Address).sendKeys(prop.getProperty("Address"));
		
		driver.findElement(County_DDown).sendKeys(Keys.TAB);
		driver.findElement(County_DDown).sendKeys(prop.getProperty("Country"));
		driver.findElement(Select_Country).sendKeys(Keys.DOWN);
		driver.findElement(Select_Country).click();
		
		
		
		
		
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Browser();
		CarSearch();
	}
}
