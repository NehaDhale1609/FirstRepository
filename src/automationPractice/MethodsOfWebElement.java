package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		WebElement userName=driver.findElement(By.xpath("//form//div[1]//input"));
		String attributeValue=userName.getAttribute("id");
		System.out.println("Attibute valud of id is "+attributeValue);
	
		String htmlText=userName.getText();
		System.out.println("HTML text is "+htmlText);
		
		String tagName=userName.getTagName();
		System.out.println("TagName is "+tagName);
	}

}
