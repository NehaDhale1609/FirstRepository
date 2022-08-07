package pomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass 
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
		
		//HomePage Functionalities
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		//hp.clickAddToCartBag();
		hp.clickAddToCartButtons();
		hp.clickMenuButton();
		hp.clickAllItemsButton();
		hp.clickAboutButton();
		hp.backButton();
		hp.clickMenuButton();
		
		//LogOut Functionality
		//hp.clickLogoutButton();
	
		//CartPageFuctionalities
		CartPagePOMClass cp=new CartPagePOMClass(driver);
		cp.clickCartButton();
		//cp.clickContinueShoppingButton();
		
		//cp.clickRemoveButtons();
		cp.clickCheckOutButton();
		
		//CustomerInfo Functionalities
		CustomerInfoPOMClass ci=new CustomerInfoPOMClass(driver);
		ci.sendFirstName();
		ci.sendLastName();
		ci.sendPostalCode();
		ci.clickContinueButton();
		
		//Billing Page Functionalities
		BillingPagePOMClass bp=new BillingPagePOMClass(driver);
		//bp.clickCancelbButton();
		bp.clickFinishButton();
		
		CompleteOrderPagePOMClass op=new CompleteOrderPagePOMClass(driver);
		op.clickBackHomeButton();
		cp
		
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
