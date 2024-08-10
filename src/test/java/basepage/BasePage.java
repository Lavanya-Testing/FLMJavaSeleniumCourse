package basepage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest
{
public  static void validateTitle(String expectedTitle)
{
	Assert.assertEquals(driver.getTitle(), expectedTitle);
}

public static String screenShot()
{
	 String screenShotsFolderPath=System.getProperty("user.dir")+"//screenshots";
	 File screenShotsFolder=new File (screenShotsFolderPath);
	 screenShotsFolder.mkdir();
	 
	 String pattern="yy-MM-dd HH:mm:mm ";
	 SimpleDateFormat simpledateformat=new SimpleDateFormat(pattern);
	 String date=simpledateformat.format(new Date());
	 date= date.replace(":","/");
	 
	 String screenShotFileName=screenShotsFolderPath+"\\"+date+".png";
     File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     try {
		FileUtils.copyFile(srcFile, new File(screenShotFileName));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return screenShotFileName;
}


}
