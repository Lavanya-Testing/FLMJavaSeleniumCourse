package fileconcept;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException 
	{
	// Java .io package
	 
		 File fil=new File("E:\\test.txt");// this will create a test file in heap area
		 //But we have to create the file hard disk that's why we use the createnewfile method
		 System.out.println(fil.createNewFile());//return type is boolean
		 // if the file is already created in the folder it wil not throw any error just it will return false
 
		 System.out.println("End of the program");
	}

}
