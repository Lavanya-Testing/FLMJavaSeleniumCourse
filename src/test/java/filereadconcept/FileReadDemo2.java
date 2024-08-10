package filereadconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=	new FileInputStream("E:\\SeleniumFileReadPractice\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		System.out.println(ws.getLastRowNum());// last row index //4
		System.out.println(ws.getPhysicalNumberOfRows()); // it will give physical number of rows// 3(ans)
		System.out.println(ws.getRow(0).getLastCellNum());// for counting it will start the index from 1 //5// including null cell also
		System.out.println(ws.getRow(0).getPhysicalNumberOfCells());// it will not account the null cell//4
		
		//get all the cells data by using for loop
		Row row =null;
		Cell cell=null;
		for (int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING)
					
				{
					System.out.println(cell.getStringCellValue());
				}
				else if (cell.getCellType()==CellType.NUMERIC)
					
				{
					System.out.println(cell.getNumericCellValue());
				}
				else if (cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue());
				}
			}
		}
		
		
		}
		 
		 

	

}
