package filewriteconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	  FileInputStream fis=new  FileInputStream("properties\\config.properties");
	  Properties pr= new Properties();
	  pr.load(fis);
      String b=pr.getProperty("browser");
      String u=pr.getProperty("url");
      WebDriver driver=null;
      if(b.equals("chrome"))
      {
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    	 driver.get(u);
    	 driver.manage().window().maximize();
    	 Thread.sleep(3000);
    	 driver.quit();
      }
      else if (b.equals("firefox"))
      {
    	 WebDriverManager.firefoxdriver().setup();
    	 driver= new  FirefoxDriver();
    	 driver.get(u);
    	 driver.manage().window().maximize();
      	 Thread.sleep(3000);
      	 driver.quit();
      }
      else if(b.equals("edge"))
      {
     WebDriverManager.edgedriver().setup();
 	 driver= new  EdgeDriver();
 	 driver.get(u);
 	 driver.manage().window().maximize();
   	 Thread.sleep(3000);
   	 driver.quit();
    	  
      }
      System.out.println("End of the program");
      

	}

}
