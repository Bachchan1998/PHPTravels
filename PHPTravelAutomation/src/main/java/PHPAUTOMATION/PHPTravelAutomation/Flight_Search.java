package PHPAUTOMATION.PHPTravelAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Flight_Search extends Base{
	
	static By Flight=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a");
	static By location=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
	static By Enter_Loc1=By.xpath("//*[@id=\"select2-drop\"]/div/input");
	static By Destination=By.xpath("//*[@id=\"s2id_destination\"]/a");
	
	static By Departure=By.xpath("//*[@id=\"departure\"]");
	static By Next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
	
	static By Passanger=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
	static By PopUp_Adult=By.xpath("//select[@id='madult']");
	static By PopUp_Child=By.xpath("//select[@id='mchildren']");
	


	public void Flight_Search() throws Exception 
	{
		//driver.get(prop.getProperty("URL"));
		driver.findElement(Flight).click();

// SEARCH FLIGHT FIELD
		Thread.sleep(2000);
		driver.findElement(location).click();
		driver.findElement(Enter_Loc1).sendKeys(prop.getProperty("FLoc"));
		driver.findElement(Enter_Loc1).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(Enter_Loc1).sendKeys(Keys.ENTER);
			
// DESTINATION FIELD
		driver.findElement(Destination).click();
		driver.findElement(Enter_Loc1).sendKeys(prop.getProperty("DLoc"));
		Thread.sleep(3000);
		driver.findElement(Enter_Loc1).sendKeys(Keys.ENTER);
		
		
		
// DEPARTURE DATE FIELD
		
driver.findElement(Departure).click();
		
		while(true)
	{
			
			String str=driver.findElement(By.xpath("/html/body/div[16]/div[1]/table/thead/tr[1]/th[2]")).getText();
			
			//Thread.sleep(3000);
			if(str.equals(prop.getProperty("Month"))) 
			{
				break;
			}
			else
			{
				driver.findElement(Next).click();
				//str=driver.findElement(By.xpath("/html/body/div[16]/div[1]/table/thead/tr[1]/th[2]")).getText();
			}
			
	}	
		//driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("Day")+")]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/table[1]/tbody[1]/tr/td[@class='day '][contains(text(),\"16\")]")).click();
								
		
		
	driver.findElement(Passanger).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//select[@id='madult']")).click();
	driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),"+prop.getProperty("No_Of_Adults")+")]")).click();
	driver.findElement(By.xpath("//select[@id='mchildren']")).click();
	driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),"+prop.getProperty("No_Of_child")+")]")).click();
	//driver.findElement(By.xpath("//select[@id='minfant']")).click();
	//driver.findElement(By.xpath("//select[@id='minfant']//option[contains(text(),"+prop.getProperty("infant")+")]")).click();
	driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
	//driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	driver.findElement(By.xpath("//*[@id=\"thflights\"]/div[6]/button")).click();
	
	}	
}

