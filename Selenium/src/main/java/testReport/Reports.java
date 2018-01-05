package testReport;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	public static void main(String[] args) {
		ExtentReports report=new ExtentReports("./reports/result.html",false);
		report.loadConfig(new File("E:\\Workspace\\Selenium\\extentconfig.xml"));
		ExtentTest test=report.startTest("Create Lead", "Create a new lead");
		test.assignAuthor("Yogesh");
		test.assignCategory("Regression");
		test.log(LogStatus.PASS, "Launch Browser", "Browser launched successfully");
		test.log(LogStatus.FAIL, "Invalid Test Data", "The test data given is not valid");
		test.log(LogStatus.WARNING, "Title", "Title doesn't match");
		report.endTest(test);
		report.flush();
		
		
		

	}

}
