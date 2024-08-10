package testscripts.regression;

import java.io.FileInputStream;
import java.io.IOException;
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

public class LoginValidationdemo2 extends BaseTest {
	
	
	@Test(dataProvider="getData")
	
	public void loginValidation(String uName, String pWd, String expTitle) 
	{
		
		//Valid username and valid pwd
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(uName);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pWd);
         driver.findElement(By.xpath("//input[@type='Submit']")).click();
         Assert.assertEquals(driver.getTitle(), expTitle);
	

		
	}
	//Instead  of hardcoading the values directly we use data parameteriazation concept
	//by using @DataProvider Annotation 
	
	@DataProvider
	public  Object[][] getData()
	{
		 Object [][] data=new Object[4][3];
		 data[0][0]="RadhaReddy425";
		 data[0][1]="Radha@425";
		 data[0][2]="Adactin.com - Search Hotel";
		 
		 data[1][0]="RadhaReddy425";
		 data[1][1]="Radha";
		 data[1][2]="Adactin.com - Hotel Reservation System";
		 
		 data[2][0]="RadhaReddy";
		 data[2][1]="Radha@425";
		 data[2][2]="Adactin.com - Hotel Reservation System";
		 
		 data[3][0]="RadhaReddy";
		 data[3][1]="Radha";
		 data[3][2]="Adactin.com - Hotel Reservation System";
		 return data;
		
	}
	

		
	
		 
	

}
