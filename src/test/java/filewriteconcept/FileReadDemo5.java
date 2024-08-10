package filewriteconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadDemo5 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  input=new FileInputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet  ws=wb.getSheet("Sheet1");
		// To read data from all the files 
		//by using Iterator concept
		
		// we have two iterators 
		
		Iterator<Row> row=ws.rowIterator();
		Row rows=null;
		Cell cells=null;
		
		
		while(row.hasNext())
		{
			rows=row.next();
			Iterator<Cell>  cell=rows.cellIterator();
			while(cell.hasNext())
			{
				cells=cell.next();
				if(cells.getCellType()==CellType.STRING)
				{
					System.out.println(cells.getStringCellValue());
				}
				if(cells.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cells.getBooleanCellValue());
				}
				if(cells.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cells.getNumericCellValue());
				}
			}
			
		}

	}

}
