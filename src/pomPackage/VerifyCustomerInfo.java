package pomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCustomerInfo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login Functionality
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		lp.sendUserName();
		lp.sendPassWord();
		lp.clickLoginButton();
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		//hp.clickAddToCartBag();
		hp.clickAddToCartButtons();
		
		//CartPageFuctionalities
		CartPagePOMClass cp=new CartPagePOMClass(driver);
		cp.clickCartButton();
	
		cp.clickCheckOutButton();
		
		//CustomerInfo Functionalities
		CustomerInfoPOMClass ci=new CustomerInfoPOMClass(driver);
		ci.sendFirstName();
		ci.sendLastName();
		ci.sendPostalCode();
		ci.clickContinueButton();
		
	}	

}
