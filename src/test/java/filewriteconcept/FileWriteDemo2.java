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

public class FileWriteDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  input=new FileInputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet  ws=wb.getSheet("Sheet1");
	    //To remove the cells
		// to remove the rows
		
		// case: To remove the cell
		
		//ws.getRow(3).removeCell(ws.getRow(3).getCell(0));// we need to pass the cell object
		// we need to create the cell object by using row 
		/*FileOutputStream fos=new FileOutputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("End of the program");*/
		
		// To remove the row:
		
		ws.removeRow(ws.getRow(3));// we need to pass the row object
		FileOutputStream fos=new FileOutputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("End of the program");
		
		
	}

}
