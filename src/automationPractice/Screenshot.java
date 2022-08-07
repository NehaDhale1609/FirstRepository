package automationPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(sourceFile);
		File destFile=new File("C:\\Users\\nehad\\Downloads\\Screenshots\\saucedemo.jpg");
		FileHandler.copy(sourceFile, destFile);
	}

}
