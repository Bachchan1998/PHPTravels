package PHPAUTOMATION.PHPTravelAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class Reg_Page extends Base 

{
	static By my_account =	By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	static By sign_up    = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	static By Fname =  By.xpath("//input[@placeholder='First Name']");
	static By Lname =  By.xpath("//input[@placeholder='Last Name']");
	static By M_Number = By.xpath("//input[@placeholder='Mobile Number']");
	static By Email = By.xpath("//input[@placeholder='Email']");
	static By Password = By.xpath("//input[@placeholder='Password']");
	static By C_Password = By.xpath("//input[@placeholder='Confirm Password']");
	static By SignUp_Button=By.xpath("//*[@id=\"headersignupform\"]/div[9]/button");
	
	

	public static void Register() throws Exception
 {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.findElement(my_account).click();
		driver.findElement(sign_up).click();
		driver.findElement(Fname).sendKeys(prop.getProperty("Fn"));
		driver.findElement(Lname).sendKeys(prop.getProperty("Ln"));
		driver.findElement(M_Number).sendKeys(prop.getProperty("Mnum"));
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Password).sendKeys(prop.getProperty("Pwd"));
		driver.findElement(C_Password).sendKeys(prop.getProperty("Cpwd"));
		driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(SignUp_Button).click();
		
		
 }
	
	
	

}
