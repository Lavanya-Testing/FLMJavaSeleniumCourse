package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basepage.BasePage;

public class LoginPage  extends BasePage
{
   @FindBy(xpath="//input[@id='username']")
   WebElement userNameTextBox;
   
   @FindBy(xpath="//input[@id='password']")
   WebElement passwordTextBox;
   
   @FindBy(xpath="//input[@id='login']")
   WebElement loginButton;
   
   @FindBy(xpath="//a[text()='New User Register Here']")
   WebElement newUserRegistration;
   
   
   public void userNameTextBox( String text)
   {
	   userNameTextBox.sendKeys(text); 
   }
   
   public void passwordTextBox(String text)
   {
	   
	   passwordTextBox.sendKeys(text);
   }
   
   public void loginButton()
   {
	   loginButton.click();
   }
   
   public void newUserRegistration()
   {
 	  newUserRegistration.click();
   }
}
