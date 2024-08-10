package filewriteconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadDemo6 {

	public static void main(String[] args) throws IOException {
	// create new excel file
    // and create rows and cells with in it
		
	File fil=new File("E:\\SeleniumFileReadPractice\\Book2.xlsx");
	fil.createNewFile();
	 FileInputStream input=new  FileInputStream(fil);
	 XSSFWorkbook wb= new  XSSFWorkbook(input);
	  
	 XSSFSheet ws= wb.getSheet("Sheet3");
	 
	// Add the rows and cells within it
	 
	 ws.createRow(0).createCell(0).setCellValue("12345");
	 ws.createRow(0).createCell(1).setCellValue("TRUE");
	 ws.createRow(0).createCell(2).setCellValue("LAVANYA");
	 ws.createRow(0).createCell(3).setCellValue("8907");
	 ws.createRow(0).createCell(4).setCellValue("FALSE");
	 
	 //Store permanently
	 
	  FileOutputStream fos= new FileOutputStream(fil);
	  wb.write(fos);
	  wb.close();

	 System.out.println("end of the program");
	}

}
