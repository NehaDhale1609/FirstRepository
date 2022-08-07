package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	//username
	WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys("standard_user");
	Thread.sleep(2000);
	
	//password
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	//login button
	WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();
	
	
	}
			
			
			
			
}
