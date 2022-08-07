package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChaining
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
//		String s=driver.getTitle();
		
//		Options o=driver.manage();
//		Window w=o.window();
//		w.maximize();
		
		driver.manage().window().maximize();
		
//		Navigation n=driver.navigate();
//		n.refresh();
		
		driver.navigate().refresh();		
	}

}
