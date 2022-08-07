package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMxpathbytext 
{
	public static class OrangeHRM 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			
			//xpath by text
			//userName
			WebElement userName=driver.findElement(By.xpath("///span[text()='Username']"));
		    userName.sendKeys("Admin");
		    Thread.sleep(2000);
			
		    
			//password
			WebElement password=driver.findElement(By.xpath("//span[text()='Password']"));
			password.sendKeys("admin123");
			Thread.sleep(2000);
			
			
			//login button
			WebElement loginButton=driver.findElement(By.xpath("//div[@id='divLoginButton']"));
			loginButton.click();
			Thread.sleep(2000);
			
			//forgot password
			WebElement forgotPassword=driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
			forgotPassword.click();
			
		}

	}


}
