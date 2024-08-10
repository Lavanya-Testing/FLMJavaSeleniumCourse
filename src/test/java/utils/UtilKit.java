package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
	
	 static FileInputStream fis;
	public static HashMap<String,String> getTestData(String testcase) 
	{
		  try {
			fis=new  FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata2.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   XSSFWorkbook wb=null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   XSSFSheet ws= wb.getSheet("sheet1");
		    ArrayList<Row>data=getRows(ws,testcase);
		    
		   
		HashMap<String,String> testdata =new HashMap<String,String>();
		for(int i=0;i<=data.size();i++)
		{
			 int cells=data.get(0).getLastCellNum();
			for(int j=1;j<cells;j++)
			{
				testdata.put(data.get(0).getCell(j).getStringCellValue(), data.get(1).getCell(j).getStringCellValue());
			}
		}
		
		return testdata;
	}
	
	//get all the rows from the excel sheet
	 public static ArrayList<Row> getRows(XSSFSheet ws,String testcase)
	{
		
		 ArrayList<Row> allRows=new ArrayList<Row>();
		 for(int i=0;i<=ws.getLastRowNum();i++)
		 {
			 if(ws.getRow(i)!=null)
			 {
				 allRows.add(ws.getRow(i));
			 }
		 }
		 
		 //to get particular rows from all the rows
		 
		 //System.out.println(allRows.size());//to know the size of the array
		 
		 ArrayList<Row> testcaseRows=new ArrayList<Row>();
		 for(int i=0;i<allRows.size();i++)
		 {
			 if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcase))
			 {
				 testcaseRows.add(allRows.get(i));
			 }
				 
				 
		 }
		return allRows;
		
	}
	
	

}
