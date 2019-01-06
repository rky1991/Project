import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("C:\\Users\\Rahul\\git\\Project\\Project\\ExtentReport\\firstRep.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest log=extent.createTest("main");
		log.log(Status.INFO, "test is running");
		log.log(Status.ERROR, "error due to some reason");
		log.log(Status.WARNING, "worning");
		
		log.addScreenCaptureFromPath("C:\\Users\\Rahul\\Desktop\\screenshots\\fs.png");
		log.fail("failed due to some reason", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Rahul\\Desktop\\screenshots\\fs.png").build());
		log.log(Status.FAIL, "failed");
		extent.flush();
		System.out.println("done");

	}

}
