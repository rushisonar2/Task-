package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReports {

	
	ExtentReports extents;
	ExtentSparkReporter spark;
	
	public void setupReport() {
		
		extents =new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.htmal");
		extents.attachReporter(spark);
	}
	
	public void teatDown() {
		
		extents.flush();
	}
	
	
}
