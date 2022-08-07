package automationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethodProgram
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement userName=driver.findElement(By.xpath("//form//div[1]//input"));
		userName.clear();
		userName.sendKeys("standard_user");
		
		WebElement passWord=driver.findElement(By.xpath("//form//div[2]//input"));
		userName.clear();
		passWord.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginButton.click();
		
		//Homepage...click on single item
//		WebElement addToCartBagButton=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//		addToCartBagButton.click();
		
		//Multiple items
		List<WebElement> addToCartButtons=driver.findElements(By.xpath("//button[text()='Add to cart']"));
//		addToCartButtons.get(0).click();
//		addToCartButtons.get(1).click();
//		addToCartButtons.get(2).click();
//		addToCartButtons.get(3).click();
//		addToCartButtons.get(4).click();
//		addToCartButtons.get(5).click();
		
		for(int i=0;i<addToCartButtons.size();i++)
		{
			addToCartButtons.get(i).click();
		}
	}

}
