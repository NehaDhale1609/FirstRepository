package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMProgram1 
{
	public static void main(String[] args) throws InterruptedException 
	{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	
//	//xpath by attribute
//	WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
//	userName.sendKeys("Admin");
//	Thread.sleep(2000);
//	
//	WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
//	password.sendKeys("admin123");
//	Thread.sleep(2000);
//	
//	WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
//	loginButton.click();
//	Thread.sleep(2000);
	
	//xpath by contains
	//contains by attribute
	WebElement userName=driver.findElement(By.xpath("//input[contains@id,'txtUsername']"));
	userName.sendKeys("Admin");
	
	WebElement password=driver.findElement(By.xpath("//input[contains@id,'txtPassword']"));
	password.sendKeys("admin123");
	
	WebElement loginButton=driver.findElement(By.xpath("//input[contains@id,'btnLogin']"));
	loginButton.click();
	
	//contains by text
	WebElement forgotPassword=driver.findElement(By.xpath("//a[contains(text(),'Forgot your password']"));
	forgotPassword.click();
			
	
	
	}
}
