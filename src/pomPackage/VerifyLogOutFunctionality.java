package pomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogOutFunctionality
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
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickMenuButton();
		hp.clickLogoutButton();
		
	}
		

}
