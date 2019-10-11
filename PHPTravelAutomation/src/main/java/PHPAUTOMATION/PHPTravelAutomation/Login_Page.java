package PHPAUTOMATION.PHPTravelAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

	public class Login_Page extends Base 
{
	static By my_account =	By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	static By login    = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	static By email	 =  By.xpath("//input[@placeholder='Email']");
	static By password = By.xpath("//input[@placeholder='Password']");
	static By login_button=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	public static void login() throws IOException, Exception
	{	
		//driver.get(prop.getProperty("URL"));
		driver.findElement(my_account).click();
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(prop.getProperty("Email"));
		driver.findElement(password).sendKeys(prop.getProperty("Pwd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(login_button).click();
		
// SCREEN SHOT
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SCREEENSHOT Automation\\Pic1.png"));
		driver.quit();
		
	}
	
	
}

