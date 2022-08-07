package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
		
		Select s=new Select(dropDown);
		//s.selectByIndex(1);
		//s.selectByValue("option2");
		
		s.selectByVisibleText("Option3");
		
	}

}
