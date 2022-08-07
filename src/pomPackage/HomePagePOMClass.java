package pomPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
	WebDriver driver;
	//Single Add to Cart Buttons
	@FindBy(xpath="//button[text()='Add to cart'][1]") WebElement addToCartBagProduct;
	
	public void clickAddToCartBag()
	{
		addToCartBagProduct.click();
	}
	
	//All 6 Add to Cart Buttons
	@FindBy(xpath="//button[text()='Add to cart']") List<WebElement> addToCartButtons;
	public void clickAddToCartButtons()
	{
		for(WebElement i:addToCartButtons)
		{
			i.click();
		}
	}
	
	//Menu Button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") WebElement menuButton;
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	//All Items Button
	@FindBy(xpath="//a[text()='All Items']") WebElement allItemsButton;
	public void clickAllItemsButton()
	{
		allItemsButton.click();
	}
	
	//About Button
	@FindBy(xpath="//a[text()='About']") WebElement aboutButton;
	public void clickAboutButton()
	{
		aboutButton.click();
	}
	
	//backButton
	public void backButton()
	{
		driver.navigate().back();
	}
	
	//LogOut Button
	@FindBy(xpath="//a[text()='Logout']") WebElement logoutButton;
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
