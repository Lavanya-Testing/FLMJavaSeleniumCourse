package testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import basepage.BasePage;
import pages.LoginPage;
import pages.SearchHotelPage;

public class ValidateLoginusingPOM extends BaseTest
{

	@Test
	public void validateLoginTest() throws InterruptedException
	{
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.userNameTextBox("RadhaReddy425");
		
		loginPage.passwordTextBox("Radha@425");
		
		 LoginPage.screenShot();
		
		loginPage.loginButton();
		
		Thread.sleep(3000);
		
		 SearchHotelPage searchHotelPage=PageFactory.initElements(driver, SearchHotelPage.class);
		 
		 searchHotelPage.validateTitle("Adactin.com - Search Hotel");
		 
		 SearchHotelPage.screenShot();
	}
}
