package automationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Set size of browser
		Dimension d=new Dimension(500,300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		//Position of browser
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
	}

}
