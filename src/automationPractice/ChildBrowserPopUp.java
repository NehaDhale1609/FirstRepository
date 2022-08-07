package automationPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String mainPageAddress=driver.getWindowHandle();
		System.out.println("Main page address is "+mainPageAddress);
		
		WebElement startSeleniumPractice=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		startSeleniumPractice.click();
		
		//In Set, Index concept is not followed
//		Set<String> allPageAddresses=driver.getWindowHandles();
//		System.out.println(allPageAddresses);
		
		//In List, Index concept is followed
		List<String> allPageAddresses=new ArrayList<String>(driver.getWindowHandles());	
		System.out.println(allPageAddresses);
		
		driver.switchTo().window(allPageAddresses.get(1));
		WebElement textBox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textBox.sendKeys("India");
		
		
		
		
		
		
		
		
	}

}
