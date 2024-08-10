package reportsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerenceTest {
	
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
	}
	
	@Test(priority=1)
	public void logoTest()
	{
	    boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("lavanyarishi62@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("lavanya@123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
		//Assert.assertEquals(status, true);
		//Assert.fail();
	

	}
	
	@Test(priority=3,dependsOnMethods= {"loginTest"})
	public void logoutTest()
	{
		driver.findElement(By.linkText("Log out")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status,true);
	}

}
