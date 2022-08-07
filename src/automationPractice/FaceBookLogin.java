package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//username
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("nehadhale16@yahoo.com");
		
		//password
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("NehaDhale#16");
		
		//login
		WebElement loginButton=driver.findElement(By.id("u_0_5_eH"));
		loginButton.click();
		
		
	}

}
