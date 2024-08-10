package filereadconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\Selenium\\SeleniumFileReadPractice\\Book1.xlsx");//This is code to read any kind of file through java code
		XSSFWorkbook wb=new  XSSFWorkbook(file);// we need to tell the workbook
		XSSFSheet ws=wb.getSheet("Sheet1");
		System.out.println(ws.getLastRowNum());
		System.out.println(ws.getPhysicalNumberOfRows());
		// cells present in rows right
		// we need to create the object for rows
		// then we can access the cells
		System.out.println(ws.getRow(0).getLastCellNum());
		System.out.println(ws.getRow(0).getPhysicalNumberOfCells());
        Row row =null;
        Cell cell=null;
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
			   cell=row.getCell(j);
			   if(cell==null) {
				   continue;    // if the cell is having null we can write like this
			   }
			  if( cell.getCellType()==CellType.STRING)
			  {
				 System.out.println(cell.getStringCellValue());
			  }
			  if( cell.getCellType()==CellType.NUMERIC)
			  {
				 System.out.println(cell.getNumericCellValue());
			  }
			  if( cell.getCellType()==CellType.BOOLEAN)
			  {
				 System.out.println(cell.getBooleanCellValue());
			  }
			}
		}
		 
		 

	}

}
