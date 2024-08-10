package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	 public  static WebDriver driver;
	 public static FileInputStream fis1;
	 public  static FileInputStream fis2;
	 public  static Properties pr;
	 public static Properties lp;
@BeforeTest
public void startUp() throws IOException
{
	  fis1=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
	  pr=new Properties();
	  pr.load(fis1);
	  fis2=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\locators.properties");
	  lp=new Properties();
	  lp.load(fis2);
}
@BeforeMethod

public void setUp()
{
String b=pr.getProperty("browser");
String u=pr.getProperty("url");

if(b.equalsIgnoreCase("chrome"))
{
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	 driver.get(u);
	 
}
else
{
	WebDriverManager.edgedriver().setup();
	 driver= new EdgeDriver();
	 driver.get(u);
}
}

@AfterMethod
public void teardown() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
	
}
