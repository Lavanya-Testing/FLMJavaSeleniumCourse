package filewriteconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWriteDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  input=new FileInputStream("E:\\Selenium\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
        // Case 1: Modifying existing cell data in the row
		
		ws.getRow(1).getCell(3).setCellValue("1234");// This will temporarily modifying the data
		
		// to store the data permanently we have to use File output stream
		
		FileOutputStream fos=new FileOutputStream("E:\\Selenium\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("End of the program");
		
		//Case2: Add the new cell in the existing row
		
		//ws.getRow(2).createCell(3).setCellValue("5678");
		/*FileOutputStream fos=new FileOutputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("End of the program");*/
		
		
		//Case3: Create the new row and create the within it
		
		/*ws.createRow(3).createCell(0).setCellValue("AJMAL");
		FileOutputStream fos=new FileOutputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("End of the program");*/
	}

}
