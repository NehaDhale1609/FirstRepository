package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Xpath by Index
		WebElement userName=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		userName.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();
		
	}

}
