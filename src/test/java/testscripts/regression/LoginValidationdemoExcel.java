package testscripts.regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.UtilKit;

public class LoginValidationdemoExcel extends BaseTest {
	
	
	@Test(dataProvider="getData")
	
	public void loginValidation(HashMap<String,String> dataMap) 
	{
		
		//Valid username and valid pwd
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(dataMap.get("username"));
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(dataMap.get("password"));
         driver.findElement(By.xpath("//input[@id='login']")).click();
         Assert.assertEquals(driver.getTitle(), dataMap.get("expectedTitle"));
	

		
	}
	//Instead  of hardcoading the values directly we use data parameteriazation concept
	//by using @DataProvider Annotation 
	
	@DataProvider
	public  Object[][] getData()
	{
		 Object [][] data=new Object[1][1];
		 data[0][0]=UtilKit.getTestData("TC100");
		 
		 return data;
		
	}
	

		
	
		 
	

}
