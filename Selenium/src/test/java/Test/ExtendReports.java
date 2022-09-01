package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReports {

	public static void main(String[] args) {
		//ExtentHtmlReporter htmlreporter =new ExtentHtmlReporter("extendreports.html");

		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(spark);
      //  ExtentTest test = extent.createTest();
       // test.pass("Pass");
	}

}
