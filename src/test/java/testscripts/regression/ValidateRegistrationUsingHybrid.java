package testscripts.regression;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeyWords;
import utils.UtilKit;


public class ValidateRegistrationUsingHybrid extends BaseTest
{
@Test(dataProvider="getData")
public void validateRegistrationTest(HashMap<String,String> dataMap)
{
	ApplicationKeyWords ap=new ApplicationKeyWords();
	
	//To open the browser
	
	ap.openBrowser();
	
	//To launch the application
	
	ap.launchApp();
	
	//To click on New User Register Link
	
	ap.click("newUserRegister_linktext");
	
	//ap.validateTitle(dataMap.get("Expected Title"));
	
	ap.type("newregister_username", dataMap.get("Username"));
	ap.type("newregister_password", dataMap.get("Password"));
	ap.type("newregiser_confirmpassword", dataMap.get("Confirm Password"));
	ap.type("newregister_fullname", dataMap.get("Full Name"));
	ap.type("newregister_emailid", dataMap.get("Email  Address"));
	ap.type("newregister_captcha", dataMap.get("Captcha Text"));
	ap.click("newregister_terms");
	ap.click("register_button");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ap.close();
	//Assert.assertTrue(false);	
	/*newUserRegister_linktext=New User Register Here
newregister_username=//input[@id='username']
newregister_password=//input[@id='password']
newregiser_confirmpassword=//input[@id='re_password']
newregister_fullname=//input[@id='full_name']
newregister_emailid=//input[@id='email_add']
newregister_captcha=//input[@id='captcha-form']
*/
	
	
	
}
@DataProvider
public  Object[][] getData()
{
	 Object [][] data=new Object[1][1];
	 data[0][0]=UtilKit.getTestData("TC001");
	 
	 return data;
	
}
	 
	 

}
