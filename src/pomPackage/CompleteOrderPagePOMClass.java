package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteOrderPagePOMClass 
{
	WebDriver driver;
	@FindBy(xpath="//button[text()='Back Home']") WebElement backHomeButton;
	public void clickBackHomeButton()
	{
		backHomeButton.click();
	}
	
	public CompleteOrderPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
