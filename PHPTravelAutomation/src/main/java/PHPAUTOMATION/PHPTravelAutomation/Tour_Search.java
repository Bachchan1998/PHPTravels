package PHPAUTOMATION.PHPTravelAutomation;

import org.openqa.selenium.By;

	public class Tour_Search extends Base
{
	
	static By Tour=By.xpath("//div[@id='body-section']//li[3]//a[1]");
	static By Tour_Search=By.xpath("//*[@id=\"s2id_autogen3\"]/a");
	static By Select_City=By.xpath("//div[contains(text(),'Old and New Delhi City Tour')]");
	static By Check_In=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	static By Month=By.xpath("//div[11]//div[1]//tr[1]//th[2]");
	static By Move=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
	//static By Date=By.xpath("/html/body/div[11]/div[1]/table/tbody/tr/td[@class='day '][contains(text(),"+prop.getProperty("TourDate")+")]");
	static By Guest=By.xpath("//*[@id=\"adults\"]");
	static By No_Of_Guest=By.xpath("//*[@id=\"adults\"]/option[4]");
	static By Tour_Type=By.xpath("//select[@id='tourtype']");
	static By Select_Type=By.xpath("//option[contains(text(),'Couples')]");
	static By Search_Button=By.xpath("//*[@id=\"tours\"]/form/div[5]/button");
	

	
		public static void TourSearch() throws Exception
	{
		//driver.get(prop.getProperty("URL"));  
			driver.findElement(Tour).click();
		
// CITY NAME FIELD
	    Thread.sleep(1000);
	       driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	       driver.findElement(Tour_Search).click();
	       driver.findElement(Select_City).click();
	       
// CHECK IN DATE FIELD
	       Thread.sleep(1000);
	       driver.findElement(Check_In).click();
	       
	       		while(true)
	       {
	    	   	String str=driver.findElement(Month).getText();
	    	   	if(str.equals(prop.getProperty("TourMonth"))) 
	    	  {
	    	   	break;
	    	  }
	    	   	else
	    	  {
	    	   	driver.findElement(Move).click();
	    	  }
	      }
	       		driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr/td[@class='day '][contains(text(),"+prop.getProperty("TourDate")+")]")).click();


// NO OF GUEST FIELD
	       		
	       	    Thread.sleep(1000);		
	       driver.findElement(Guest).click();
	       driver.findElement(No_Of_Guest).click();
	       
// TOUR TYPE FIELD
	       Thread.sleep(1000);
	       driver.findElement(Tour_Type).click();
	       driver.findElement(Select_Type).click();
	       driver.findElement(Search_Button).click();
	       
	        //File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot5.png"));

}


		public static void main(String args[]) throws Exception
	{
		Browser();
		TourSearch();
	}
	
	
}
