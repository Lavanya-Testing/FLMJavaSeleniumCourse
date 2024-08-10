package filewriteconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesconcept {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream input=new FileInputStream("properties\\config.properties");
		 Properties pr=	 new Properties();
	     pr.load(input);
	     //If we  want to get that value we need to use get property method
	     
	    /*System.out.println(pr.get("browser"));
	    System.out.println( pr.get("url"));*/
	   System.out.println(pr.getProperty("browser"));
	    System.out.println(pr.getProperty("url"));
		

	}

}
