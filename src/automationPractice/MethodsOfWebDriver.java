package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Thread.sLeep(5000);
		
		//maximize Chaining method
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String webTitle=driver.getTitle();
		System.out.println(webTitle);
		
		//driver.close();
		
		driver.quit();
		
		
	}

}
