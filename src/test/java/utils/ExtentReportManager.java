package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;// UI of the report
	public ExtentReports  extent; //Populate common info on report
	public ExtentTest test; // make an entry of test cases and update the result of each methods
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/extentreports/Reports.html");	
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("myreports");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		 extent =new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 extent.setSystemInfo("ComputerName", "local host");
		 extent.setSystemInfo("OS", "Windows");
		 extent.setSystemInfo("Username", "lavanya");
		 extent.setSystemInfo("BrowserName", "Chrome");
		 
		 
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());// will create an entry in the report
		test.log(Status.PASS, "Test case is passed:"+result.getName());// will update the result in the report
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is failed "+result.getName());
		test.log(Status.FAIL, "Test case is failed "+result.getThrowable());
	}
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());// will create an entry in the report
		test.log(Status.SKIP, "Test case is passed:"+result.getName());// will update the result in the report
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
}
