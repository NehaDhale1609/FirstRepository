package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipKartProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement userName=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		userName.sendKeys("8806114151");
		
		WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
		passWord.sendKeys("NehaDhale#16");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement electronicsItems=driver.findElement(By.xpath("//img[@class='_396cs4  _3exPp9']"));
		electronicsItems.click();
		
		WebElement electronicsItems1=driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		electronicsItems1.click();
		
		
		}

}
