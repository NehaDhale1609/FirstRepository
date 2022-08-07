package pomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		lp.sendUserName();
		lp.sendPassWord();
		lp.clickLoginButton();
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test case is passed.");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
	}

}
