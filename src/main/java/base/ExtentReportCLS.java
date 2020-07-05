package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportCLS {

	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	public static ExtentReports getReportObject(){
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Reports");
		reporter.config().setDocumentTitle("Web Automation Testing");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Mehul Thakar");
		extent.getStats();
		
		return extent;		
	}
	
	
	
}
