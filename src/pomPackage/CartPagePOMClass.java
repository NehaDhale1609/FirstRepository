package pomPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") WebElement cartButton;
	public void clickCartButton()
	{
		cartButton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']") WebElement continueShoppingButton;
	public void clickContinueShoppingButton()
	{
		continueShoppingButton.click();
	}
	
	@FindBy(xpath="//button[text()='Remove']") List<WebElement> removeButtons;
	public void clickRemoveButtons()
	{
		for(WebElement i:removeButtons)
		{
			i.click();
		}
	}
	
	@FindBy(xpath="//button[text()='Checkout']") WebElement checkOutButton;
	public void clickCheckOutButton()
	{
		checkOutButton.click();
	}
	
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
