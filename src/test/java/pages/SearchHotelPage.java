package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basepage.BasePage;

public class SearchHotelPage extends BasePage {
	
	@FindBy(xpath="//input[@id='Submit']")
	WebElement submittButton;
	
	@FindBy(xpath="//input[id='Reset']")
	WebElement resetButton;
	
	
	
	

}
