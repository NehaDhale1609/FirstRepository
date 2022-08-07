package automationPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement alertButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		
		Alert alt=driver.switchTo().alert();
		String alertMessage=alt.getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		
		WebElement alertButton2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertButton2.click();
	
		System.out.println("End of program");
		
		
		
	}

}
