package testscripts.regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginValidationdemo extends BaseTest {
	
	
	@Test
	
	public void loginValidation() 
	{
		
		//Valid username and valid pwd
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RadhaReddy425");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Radha@425");
         driver.findElement(By.xpath("//input[@type='Submit']")).click();
         Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
	

		
	}
	
	@Test
	public void loginValidation2() 
	{
		//Valid username and invalid pwd
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RadhaReddy425");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Radha");
         driver.findElement(By.xpath("//input[@type='Submit']")).click();
         Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	

		
	}
	@Test
	public void loginValidation3() 
	{
		//InValid username and valid pwd
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Reddy425");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Radha@425");
         driver.findElement(By.xpath("//input[@type='Submit']")).click();
         Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	

		
	}
	@Test
	public void loginValidation4() 
	{
		//InValid username and invalid pwd
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Radha425");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Radha");
         driver.findElement(By.xpath("//input[@type='Submit']")).click();
         Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	

		
	}
		 
	

}
