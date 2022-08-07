package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentSyntaxes 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new WebDriver(); //not possible
		ChromeDriver driver=new ChromeDriver();//possible but we don't use generally
		driver.get("https://www.facebook.com");
		
		
		
	}

}
