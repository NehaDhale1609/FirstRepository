package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagePOMClass 
{
	WebDriver driver;
	@FindBy(xpath="//button[@id='cancel']") WebElement cancelButton;
	public void clickCancelButton()
	{
		cancelButton.click();
	}
	
	@FindBy(xpath="//button[@id='finish']") WebElement finishButton;
	public void clickFinishButton()
	{
		finishButton.click();
	}
	
	public BillingPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
