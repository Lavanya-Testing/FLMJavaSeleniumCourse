package testscripts.regression;

import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;


public class ValidateLoginKeyWords extends ApplicationKeyWords
{
@Test
public void validateLoginTest()
{
	ApplicationKeyWords ap=new ApplicationKeyWords();
	//Open the Browser
	ap.openBrowser();
	
	//Launch the App
	
	ap.launchApp();
	
	//Enter username & password
	
	ap.type("username_textbox", "RadhaReddy425");
	ap.type("password_textbox", "Radha@425");
	
	//Click on login submitt
	
	ap.click("submitt_button");
	
	//Validate Title
	ap.validateTitle("Adactin.com - Search Hotel");
	
	//quit the driver
	ap.close();
	
	
	
}
	 
	 

}
