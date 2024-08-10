package utils1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
 public static FileInputStream fis;
	public static HashMap<String,String> getData(String testcase) throws FileNotFoundException
	{
		fis=new FileInputStream(System.getProperty("user.dir")+	"src\\test\\resources\\Properties\\config.properties");
		  XSSFWorkbook wb=new XSSFWorkbook();
		  XSSFSheet ws= wb.getSheet("sheet1");
		   ArrayList<Row> testrows = null;
		try {
			testrows = getAllRows(ws,testcase);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  HashMap<String,String> testdata=  new HashMap<String,String>();
		  for(int i=0;i<=testrows.size();i++)
		  {
			   int noOfCells=testrows.get(0).getLastCellNum();
			   for(int j=1;j<noOfCells;j++)
				   
			   {
				   testdata.put(testrows.get(0).getCell(j).getStringCellValue(), testrows.get(0).getCell(j).getStringCellValue());
				   
			   }
		  }
		  
		return testdata;
		
		
	}
	
	//to get all the rows from the sheet
	 public static ArrayList<Row> getAllRows(XSSFSheet ws,String testcase)
	 {
		 ArrayList<Row> allRows=new ArrayList<Row>();
		 for(int i=0;i<=ws.getLastRowNum();i++)
		 {
			 if(ws.getRow(i)!=null)
			 {
				 allRows.add(ws.getRow(i));
			 }
		 }
		
		 
	 
	 //to get particular row from all the rows
	 
	 ArrayList<Row> testcaseRows=new ArrayList<Row>();
	 for( int i=0;i<allRows.size();i++)
	 {
		 if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcase));
		 
		 testcaseRows.add(allRows.get(i));
	 }
	 return testcaseRows;
   }
}

