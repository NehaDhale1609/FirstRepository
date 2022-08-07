package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	WebDriver driver;
	
//	userName
//	WebElement userName=driver.findElement(By.xpath("//form//div[1]//input"));	
//	userName.clear();
//	userName.sendKeys("standard_user");
	
	@FindBy(xpath="//form//div[1]//input") WebElement userName;
	public void sendUserName()
	{
		userName.sendKeys("standard_user");
	}
	
	//passWord
	@FindBy(xpath="//form//div[2]//input") WebElement passWord;
	public void sendPassWord()
	{
		passWord.sendKeys("secret_sauce");
	}
	
	//loginButton
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input") WebElement loginButton;
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
