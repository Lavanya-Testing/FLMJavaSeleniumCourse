package fileconcept;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		 
		 File folder=new File("E:\\Folder1");
		 System.out.println(folder.mkdir());
		 System.out.println("End of the program");
		
	}

}
