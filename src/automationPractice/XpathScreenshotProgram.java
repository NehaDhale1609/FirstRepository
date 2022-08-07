	package automationPractice;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	public class XpathScreenshotProgram 
	{
	
		public static void main(String[] args) throws IOException, InterruptedException  
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nehad\\Downloads\\Selenium\\Selenium1\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourceFile=ts.getScreenshotAs(OutputType.FILE);
			File destfile=new File("\"C:\\Users\\nehad\\Downloads\\Screenshots\\saucedemo.pdf");
			FileHandler.copy(sourceFile, destfile);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement userName=driver.findElement(By.xpath("//form//div[1]//input"));
			userName.clear();
			userName.sendKeys("standard_user");
			
			WebElement password=driver.findElement(By.xpath("//form//div[2]//input"));
			password.clear();
			password.sendKeys("secret_sauce");
			
			WebElement loginButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
			loginButton.click();
			
		}

	}

	

