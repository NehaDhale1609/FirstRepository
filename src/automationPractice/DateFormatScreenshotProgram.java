package automationPractice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateFormatScreenshotProgram 
{
	static WebDriver driver;
	public static void screenshotMethod() throws IOException
	{
		//Date and time format code
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date=d1.format(d);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(sourceFile);
		File destFile=new File("C:\\Users\\nehad\\Downloads\\Screenshots\\Screenshot1\\saucedemo"+date+"jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("Loginpage screenshot taken");
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		screenshotMethod();
		
	}

}
