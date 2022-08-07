package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		WebElement userName=driver.findElement(By.xpath("//form//div[1]//input"));
		userName.clear();
		userName.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//form//div[2]//input"));
		password.clear();
		password.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginButton.click();
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is "+actualTitle);
	
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("We have successfully logged in SauceDemo");
			System.out.println("Test case is passed.");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//driver.close();
	}

}
