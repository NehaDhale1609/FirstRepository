package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAutomationProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//get method
		driver.get("https://www.facebook.com");
		
		//Thread.sleep(5000);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		driver.manage().window().minimize();
		
		//driver.close();
		//driver.quit();
		
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}

}
