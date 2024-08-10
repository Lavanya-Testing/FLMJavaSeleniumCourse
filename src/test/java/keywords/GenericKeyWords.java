package keywords;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeyWords extends BaseTest 
{
  public void openBrowser()
	{
	
			String b=pr.getProperty("browser");			
			if(b.equalsIgnoreCase("chrome"))
			{
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
				 
				 
			}
			else
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				 
			}
			
		
	}
	
	public void launchApp()
	{
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr.getProperty("implicitwait"))));
	}
	
	public WebElement getElement(String locatorkey)
	{
		WebElement element=null;
		element=driver.findElement(getlocator(locatorkey));
		return element;
		
	}
	
	public By getlocator(String locatorkey)
	{
		By by=null;
		if(locatorkey.endsWith("_id"))
		{
			by=By.id(lp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_name"))
		{
			by=By.name(lp.getProperty(locatorkey));
		}
		else if (locatorkey.endsWith("_linktext"))
		{
			by=By.linkText(lp.getProperty(locatorkey));
		}
		else
		{
			by=By.xpath(lp.getProperty(locatorkey));
		}
			
		return by;
		
	}
	public void clear(String locatorkey)
	{
		getElement(locatorkey).clear();
	}
	public void click(String locatorkey)
	{
		getElement(locatorkey).click();
	}
	public void close()
	{
		driver.quit();
	}
	public void type(String locatorkey,String text)
	{
		getElement(locatorkey).sendKeys(text);
	}
	public void selectOptionFromDropdown(String locatorKey, String option)
	{
		new Select(getElement(locatorKey)).selectByVisibleText(option);
	}
	//revision
	/*public  WebElement getElement(String locatorkey)
	{
		WebElement element=null;
		element=driver.findElement(getLocator(locatorkey));
		return element;
		
	}
	public By getLocator(String locatorkey)
	{
		By by=null;
		if(locatorkey.endsWith("_id"))
		{
			by=By.id(lp.getProperty(locatorkey));
		}
		else if (locatorkey.endsWith("_name"))
		{
			by=By.name(lp.getProperty(locatorkey));
		}
		return by;
		
	}
	public void click(String locatorkey)
	{
		getElement(locatorkey).click();
	}*/
	
}
