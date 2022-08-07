package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPOMClass 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='first-name']") WebElement firstNameTextBox;
	public void sendFirstName()
	{
		firstNameTextBox.sendKeys("Neha");
	}
	
	@FindBy(xpath="//input[@id='last-name']") WebElement lastNameTextBox;
	public void sendLastName()
	{
		lastNameTextBox.sendKeys("Dhale");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")WebElement postalCodeTextBox;
	public void sendPostalCode()
	{
		postalCodeTextBox.sendKeys("445304");
	}
	
	@FindBy(xpath="//input[@id='continue']") WebElement continueButton; 
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	public CustomerInfoPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
