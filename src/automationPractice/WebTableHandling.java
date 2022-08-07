package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//		//single element
//	WebElement header1 = driver.findElement(By.xpath("//th[text()='Instructor']"));
//		String result = header1.getText();
//		System.out.println(result);
		
List<WebElement> columnsHeaders = driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		//headers=columns = 3
        System.out.println("column size- "+columnsHeaders.size());
		


	}

}
