package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import basepage.BasePage;
import pages.LoginPage;
import pages.SearchHotelPage;
import utils.UtilKit;

public class ValidateLoginusingPOM2 extends BaseTest
{

	@Test(dataProvider="getData")
	public void validateLoginTest(HashMap<String, String> dataMap) throws InterruptedException
	{
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.userNameTextBox(dataMap.get("username"));
		
		loginPage.passwordTextBox("password");
		
		 LoginPage.screenShot();
		
		loginPage.loginButton();
		
		Thread.sleep(3000);
		
		 SearchHotelPage searchHotelPage=PageFactory.initElements(driver, SearchHotelPage.class);
		 
		 searchHotelPage.validateTitle(dataMap.get("expectedTitle"));
		 
		 SearchHotelPage.screenShot();
	}
		 
	@DataProvider
	
		 public  Object[][] getData()
			{
				 Object [][] data=new Object[1][1];
				 data[0][0]=UtilKit.getTestData("TC100");
				 
				 return data;
				
			}
	
}
