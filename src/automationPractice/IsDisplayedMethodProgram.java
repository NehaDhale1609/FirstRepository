package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodProgram
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
//		WebElement hideButton=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		hideButton.click();
//		Thread.sleep(3000);
//		
//		Boolean result=textBox.isDisplayed();
//		System.out.println(result);
//		Thread.sleep(3000);
//		
//		WebElement showButton=driver.findElement(By.xpath("//input[@id='show-textbox']"));
//		showButton.click();
//		Thread.sleep(3000);
//		
//		boolean result1=showButton.isDisplayed();
//		System.out.println("After clicking on show button,result is "+result1);
//		Thread.sleep(3000);
//		
//		if(result1==true)
//		{
//			textBox.sendKeys("India");
//		}
//		else
//		{
//			showButton.click();
//			textBox.sendKeys("India");
//		}
		
//		WebElement showButton=driver.findElement(By.xpath("//input[@id='show-textbox']"));
//		Boolean result=showButton.isEnabled();
//		System.out.println(result);
//		
//		WebElement textBox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
//
//		
//		if(result==true)
//		{
//			textBox.sendKeys("Neha");
//		}
//		else
//		{
//			System.out.println("We cannot enter value in textbox");
//		}
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='Radio1']"));
		Boolean result=radioButton.isSelected();
		System.out.println(result);
		
		if(result==false)
		{
			radioButton.click();
			boolean result1=radioButton.isSelected();
			System.out.println("After clicking the radio button, result is "+result1);
		}
		else
		{
			System.out.println("Radio button is already selected.");
		}
		
	}

}
