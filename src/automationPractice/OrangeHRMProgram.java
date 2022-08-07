package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
//		//username
//		WebElement userName=driver.findElement(By.id("txtUsername"));
//		userName.sendKeys("Admin");
//		Thread.sleep(2000);
		
//		//username
		WebElement userName=driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		Thread.sleep(2000);
				
		//password
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
//		//password
//		WebElement password=driver.findElement(By.name("txtPassword"));
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
		
//		//password
//		WebElement password=driver.findElement(By.linkText("Password"));
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
		
		
		//login
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
	}

}
